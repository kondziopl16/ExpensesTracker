package com.konradkalucki.Service;

import com.konradkalucki.Entity.Expense;
import com.konradkalucki.Repository.ExpenseRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {
    private ExpenseRepository repository;

    public ExpenseService(ExpenseRepository repository) {
        this.repository = repository;
    }

    List<Expense> listAllExpenses() {
        System.out.println("pause");
        return repository.findAll();
    }

}
