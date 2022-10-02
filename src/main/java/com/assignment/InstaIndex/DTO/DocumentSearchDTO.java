package com.assignment.InstaIndex.DTO;

public class DocumentSearchDTO {

    private Integer count;
    private Object documents;

    public DocumentSearchDTO(Integer count, Object documents) {
        this.count = count;
        this.documents = documents;
    }

    public DocumentSearchDTO() {
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Object getDocuments() {
        return documents;
    }

    public void setDocuments(Object documents) {
        this.documents = documents;
    }
}
