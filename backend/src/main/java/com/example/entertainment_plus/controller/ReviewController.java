package com.example.entertainment_plus.controller;

import com.example.entertainment_plus.model.Review;
import com.example.entertainment_plus.repository.ReviewRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/reviews")
@CrossOrigin(origins = "http://localhost:5173")
public class ReviewController {
    
    private final ReviewRepository repository;

    public ReviewController(ReviewRepository repository) {
        this.repository = repository;
    }
    
    @GetMapping
    public List<Review> getAll(){
        return repository.findAll();
    }

    @PostMapping
    public Review create(@RequestBody Review review) {
        return repository.save(review);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
