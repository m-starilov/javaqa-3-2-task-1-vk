package ru.netology.domain;

import java.net.CookieManager;
import java.util.Date;

public class Post {
    private String id;
    private Author author;
    private Date postDate;
    private PostMenu postMenu;
    private String postText;
    private Content content;
    private LikesInfo likesInfo;
    private CommentsInfo commentsInfo;
    private RepostInfo repostInfo;
    private long viewCounter;
 }
