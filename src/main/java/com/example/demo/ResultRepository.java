package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

public interface ResultRepository extends JpaRepository<Result,Integer> {
    Result findById(int id);

    @Query(
            value = "select * from result",
            nativeQuery = true)
    Collection<Result> selectCountIdFromResults();

    int countAllBy();
}
