package com.example.api_demo.repository;


import com.example.api_demo.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AccountRepository extends JpaRepository<Account, String> {
    @Query("select a from Account a where a.userId = ?1")
    Account findByUserId(String userId);
}
