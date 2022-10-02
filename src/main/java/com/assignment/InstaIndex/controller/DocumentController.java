package com.assignment.InstaIndex.controller;

import com.assignment.InstaIndex.DTO.DocumentSearchDTO;
import com.assignment.InstaIndex.DTO.ResponseDTO;
import com.assignment.InstaIndex.model.Document;
import com.assignment.InstaIndex.service.DocumentService;
import com.assignment.InstaIndex.service.impl.DocumentServiceImpl;
import com.assignment.InstaIndex.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * This is Document Controller class for managing documets.
 * @author karan
 */
@RestController
@RequestMapping("/document")
public class DocumentController {

    /**
     * documentService field.
     */
    @Autowired
    private DocumentService documentService;


    /**
     * This is createDocument() method for creating documents.
     * @param document field.
     * @return reponseDTO.
     */
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> createDocument(@RequestBody Document document){
        final Document resultDoc = documentService.create(document);
        final ResponseDTO responseDTO = new ResponseDTO(Constant.SUCCESS,
                Constant.CREATE_DOC_MESSAGE, resultDoc);

        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }

    /**
     * This is searchDocuments() method for searching documents by given query.
     * @param query field.
     * @return reponseDTO.
     */
    @GetMapping(value = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> searchDocuments(@RequestParam(value = "query",required = false) String query){
        final List<Document> resultDocs = documentService.fetchDocumentsByQuery(query);
        final ResponseDTO responseDTO = new ResponseDTO(Constant.SUCCESS,
                Constant.DOCUMENTS_FETCH_SUCCESS, new DocumentSearchDTO(resultDocs.size(), resultDocs));

        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
}
