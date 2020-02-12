package com.bank.test.model;

public class Message {
    private boolean Success;
    private String errorMessage;

    public boolean isSucess() {
        return Success;
    }

    public void setSucess(boolean sucess) {
        this.Success = sucess;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
