package ru.tjournal.api.sdk.model.response.comment;

import lombok.Data;

import java.util.List;

@Data
public class CommentsLoadMore {

    private List<String> ids;
    private int count;
    private List<String> avatars;

}
