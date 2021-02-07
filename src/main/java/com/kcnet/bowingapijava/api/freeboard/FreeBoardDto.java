package com.kcnet.bowingapijava.api.freeboard;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class FreeBoardDto {

	private String id;
	private String number;
	private String title;
	private String date;
	private String authorId;
	private String authorName;
	private String views;
	private String content;
	private String fileId;

}
