package com.konradkalucki.Controller;

import com.konradkalucki.Repository.ExpenseRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RepositoryRestController
public class ExpenseController {
    private ExpenseRepository repository;

    public ExpenseController(ExpenseRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/Expenses")
    ResponseEntity<?> readAllExpanses() {
        return ResponseEntity.ok(repository.findAll());
    }
}
