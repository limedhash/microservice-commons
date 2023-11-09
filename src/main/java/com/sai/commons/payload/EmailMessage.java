package com.sai.commons.payload;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmailMessage {
    private String to;
    private String from;
    private String subject;
    private String body;
    private String template;
}
