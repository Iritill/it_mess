package org.example.entity.post;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class Author {
    @NotNull
    @Positive
    private Long id;
    @NotNull
    private String name;
}
