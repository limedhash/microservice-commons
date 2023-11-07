package com.sai.commons.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class AEventList {
    List<AEventDetails> eventDetailsList;

    public AEventList(List<AEventDetails> eventDetailsList){
        this.eventDetailsList = eventDetailsList;
    }
}
