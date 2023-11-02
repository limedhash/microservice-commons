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
public class AEventDetails {
    private String name;
    private String description;
    private int limit=-1;
    private Map<String, String> custom;
}
