package ru.tjournal.api.sdk.model.response.timeline;

import lombok.Getter;
import ru.tjournal.api.sdk.model.Author;
import ru.tjournal.api.sdk.model.Likes;

@Getter
public class TimelineGetResponse {

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



    @Getter
    public static class EntryContent {
        private String html;
        private String version;
    }
}
