package com.kcnet.bowingapijava.api.freeboard;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FreeBoardController {

	@GetMapping("/freeboard/{id}")
	public FreeBoardDto getFreeBoard() {
		return FreeBoardDto.builder().id("001")
			.authorName("관리자")
			.content("자유게시판입니다.")
			.date("2021-01-01")
			.title("[공지사항]욕설금지합니다.")
			.build();
	}

	@GetMapping("/freeboards")
	public List<FreeBoardDto> getFreeBoards() {

		return Arrays.asList(
			FreeBoardDto.builder().id("001")
				.authorName("관리자")
				.content("자유게시판입니다.")
				.date("2021-01-01")
				.title("[공지사항]욕설금지합니다.")
				.build(),
			FreeBoardDto.builder().id("002")
				.authorName("김미란")
				.content("반갑습니다.가입인사 드려요")
				.date("2021-01-02")
				.title("가입인사 드려요")
				.build()
		);
	}

}
