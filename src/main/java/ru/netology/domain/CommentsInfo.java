package ru.netology.domain;

import java.util.Date;

public class CommentsInfo {
    private String id;
    private String parentId;
    private String ownerId;
    private Date commentDate;
    private Author author;
    private String commentText;
    private LikesInfo likesInfo;
}
