package com.sai.commons.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ARegistrationDetails {

    private String name;
    private String email;
    private String phone;
    private String eventId;
    private Map<String, String> custom;
}
