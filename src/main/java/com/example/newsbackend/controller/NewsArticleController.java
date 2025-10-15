package com.example.newsbackend.controller;

import com.example.newsbackend.model.NewsArticle;
import com.example.newsbackend.service.NewsArticleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/news")
@CrossOrigin(origins = "*")
public class NewsArticleController {
    private final NewsArticleService service;

    public NewsArticleController(NewsArticleService service) { this.service = service; }

    @GetMapping
    public List<NewsArticle> getAll() { return service.findAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<NewsArticle> getById(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<NewsArticle> create(@Valid @RequestBody NewsArticle article) {
        NewsArticle saved = service.save(article);
        return ResponseEntity.created(URI.create("/api/news/" + saved.getId())).body(saved);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
