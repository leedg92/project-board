package com.example.projectboard.domain;

import java.math.BigInteger;
import java.time.LocalDateTime;

public class ArticleComment {
    private Long id;
    private Article article;
    private String comment;

    //metaData
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;

}
