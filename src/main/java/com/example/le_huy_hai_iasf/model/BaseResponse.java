package com.example.le_huy_hai_iasf.model;

public class BaseResponse<T> {
    public int status = 200;
    public String reasonPhrase = "";
    public T data;
}
