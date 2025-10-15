package com.example.newsbackend.service;

import com.example.newsbackend.model.NewsArticle;
import com.example.newsbackend.repository.NewsArticleRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class NewsArticleService {
    private final NewsArticleRepository repo;

    public NewsArticleService(NewsArticleRepository repo) {
        this.repo = repo;
    }

    public List<NewsArticle> findAll() { return repo.findAll(); }
    public Optional<NewsArticle> findById(Long id) { return repo.findById(id); }
    public NewsArticle save(NewsArticle article) { return repo.save(article); }
    public void deleteById(Long id) { repo.deleteById(id); }
}
