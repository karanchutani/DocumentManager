package com.assignment.InstaIndex.DTO;

public class ResponseDTO {

    private String status;
    private String message;
    private Object response;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    public ResponseDTO(String status, String message, Object response) {
        this.status = status;
        this.message = message;
        this.response = response;
    }

    public ResponseDTO() {
    }
}
