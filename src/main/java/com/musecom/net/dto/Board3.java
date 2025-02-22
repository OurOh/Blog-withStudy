package com.musecom.net.dto;


import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Board3 {

    private Long id;
    private String title;
    private String content;
    private int readCount;
    private LocalDateTime writeAt;

}
