package com.musecom.net.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Board {
	private Long id;
	private String title;
	private String content;
	private int readCount;
	private LocalDateTime writeAt;
	
	
}
