package com.example.projectboard.domain;

import java.math.BigInteger;
import java.time.LocalDateTime;

public class ArticleComment {
    private Long id;
    private Article article;    //본문
    private String comment;     //댓글

    //metaData
    private LocalDateTime createdAt;    //생성일시
    private String createdBy;           //생성자
    private LocalDateTime modifiedAt;   //수정일시
    private String modifiedBy;          //수정자

}
