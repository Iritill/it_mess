package org.example.entity.subEntity;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class PhoneNumber {

    @NotEmpty
    private String value;

    @NotEmpty
    private String locale;
}