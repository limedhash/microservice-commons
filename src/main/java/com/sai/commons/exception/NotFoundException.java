package com.sai.commons.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class NotFoundException extends RuntimeException{

    private String item;
    private String message;


}
