package ru.tjournal.api.sdk.model.response.comment;

import lombok.Data;

import java.util.List;

@Data
public class CommentItems {

    private List<Comment> items;

}
