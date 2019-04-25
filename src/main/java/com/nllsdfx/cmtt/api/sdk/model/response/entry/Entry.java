package com.nllsdfx.cmtt.api.sdk.model.response.entry;

import lombok.Data;
import com.nllsdfx.cmtt.api.sdk.model.*;
import com.nllsdfx.cmtt.api.sdk.model.response.comment.Comment;

import java.util.List;

@Data
public class Entry {

    private String id;
    private String title;
    private String webviewUrl;
    private EntryContent entryContent;
    private long date;
    private String dateRFC;
    private long lastModificationDate;
    private Author author;
    private int type;
    private String intro;
    private Likes likes;
    private long commentsCount;
    private long favoritesCount;
    private boolean isEnabledLikes;
    private boolean isEnabledComments;
    private boolean isEditorial;
    private boolean isPinned;
    private String audioUrl;
    private Cover cover;
    private String introInFeed;
    private List<Similar> similar;
    private long hitsCount;
    private List<Comment> commentsPreview;
    private List<Badge> badges;
    private List<String> commentatorsAvatars;
    private Subsite subsite;



}
