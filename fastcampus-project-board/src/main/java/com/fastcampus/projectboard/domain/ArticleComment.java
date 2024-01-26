package com.fastcampus.projectboard.domain;

import java.time.LocalDate;

public class ArticleComment {

    private Long id;
    private Article article; //게시글 (ID)
    private String content; // 본문

    private LocalDate createdAt; //생성일시
    private LocalDate createdBy; //생성자
    private LocalDate modifiedAt; //수정일시
    private LocalDate modifiedBy; //수정자 

}
