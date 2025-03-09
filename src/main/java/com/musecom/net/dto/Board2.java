package com.musecom.net.dto;

import lombok.*;

import java.time.LocalDateTime;



@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
//게시판
public class Board2 {

	private Long id;
	private String title;
	private String content;
	private int readCount;
	private LocalDateTime writeAt;

}

// 연습하기 Model(dto, entity)

// 게시판 ERD/ DB설계
// entity와 Reposiotry,service 만들기