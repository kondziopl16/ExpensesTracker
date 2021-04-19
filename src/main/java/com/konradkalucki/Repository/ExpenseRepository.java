package com.konradkalucki.Repository;

import com.konradkalucki.Entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ExpenseRepository extends JpaRepository<Expense, Integer> {
    List<Expense> findAll();
}
