package com.fastcampus.projectboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// /articles	GET	게시판 페이지
// /articles/(article-id)	GET	게시글 페이지
// /articles/search	GET	게시판 검색 전용 페이지
// /articles/search-hashtag	GET	게시판 해시태그 검색 전용 페이지


@RequestMapping("/articles")
@Controller
public class ArticleController {
}
