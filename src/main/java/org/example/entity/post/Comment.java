package org.example.entity.post;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.example.entity.user.User;

import java.util.Set;

@Data
public class Comment {
    @NotNull
    @Positive
    private Long id;
    private String content;
    @NotNull
    private Author author;
    private Set<User> likes;
}
