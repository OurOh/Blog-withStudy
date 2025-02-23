package com.musecom.net.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Board4 {

    private Long id;
    private String title;
    private String content;
    private int countUp;
    private LocalDateTime writeAt;

}
