package com.seuapp.repository;
import com.seuapp.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CardRepository extends JpaRepository<Card, Long> {}