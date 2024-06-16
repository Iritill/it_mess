package org.example.entity.post;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Data
public class Post {
    @NotNull
    @Positive
    private Long id;
    private String title;
    private String content;
    @NotNull
    private Author author;
    private LocalDate releaseDate;
    private Set<Comment> comments;
}
