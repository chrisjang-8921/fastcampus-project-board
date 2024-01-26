package com.fastcampus.projectboard.domain;

import java.time.LocalDate;

public class Article {

    private Long id;
    private String title; //제목
    private String content; //본문
    private String hashtag; //해시태그

    private LocalDate createdAt; //생성일시
    private LocalDate createdBy; //생성자
    private LocalDate modifiedAt; //수정일시
    private LocalDate modifiedBy; //수정자

}
