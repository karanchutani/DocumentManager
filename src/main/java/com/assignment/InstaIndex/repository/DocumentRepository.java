package com.assignment.InstaIndex.repository;

import com.assignment.InstaIndex.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DocumentRepository extends JpaRepository<Document, Long> {

    List<Document> findByTextContainingIgnoreCaseOrderByText(String query);
}
