package com.assignment.InstaIndex.service.impl;

import com.assignment.InstaIndex.model.Document;
import com.assignment.InstaIndex.repository.DocumentRepository;
import com.assignment.InstaIndex.service.DocumentService;
import com.assignment.InstaIndex.util.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This is DocumentServiceImpl class for Document's implementation.
 * @author karan
 */
@Service
public class DocumentServiceImpl implements DocumentService {

    /**
     * documentRepository field.
     */
    @Autowired
    private DocumentRepository documentRepository;

    /**
     * This is create() method.
     * @param document field.
     * @return document.
     */
    @Override
    public Document create(Document document) {
        Utility.validateDocument(document);
        return documentRepository.saveAndFlush(document);
    }


    /**
     * This is fetchDocumentsByQuery() method.
     * @param query field.
     * @return list of documents.
     */
    @Override
    public List<Document> fetchDocumentsByQuery(String query) {
        Utility.validateDocumentQuery(query);
        return documentRepository.findByTextContainingIgnoreCaseOrderByText(query);
    }
}
