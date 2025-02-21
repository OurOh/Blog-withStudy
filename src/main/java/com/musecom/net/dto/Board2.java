package com.musecom.net.dto;

import lombok.*;

import java.time.LocalDateTime;


@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class Board2 {

	private Long id;
	private String title;
	private String content;
	private int readCount;
	private LocalDateTime writeAt;

}
// 연습하기 Model(dto, entity)