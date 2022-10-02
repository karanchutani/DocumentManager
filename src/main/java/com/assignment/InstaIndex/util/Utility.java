package com.assignment.InstaIndex.util;

import com.assignment.InstaIndex.exception.InvalidRequestException;
import com.assignment.InstaIndex.model.Document;

/**
 * This is Utility class for some utility methods.
 * @author karan
 */
public class Utility {

    /**
     * This method is used for validating the document's text.
     * @param document field.
     */
    public static void validateDocument(Document document) {

        if(document.getText()==null || document.getText().isBlank()){
            throw new InvalidRequestException(Constant.DOCUMENT_TEXT_EMPTY);
        }

    }

    /**
     * This method is used for validating the query presence.
     * @param query field.
     */
    public static void validateDocumentQuery(String query) {
        if(query==null || query.isBlank()){
            throw new InvalidRequestException(Constant.QUERY_EMPTY);
        }
    }
}
