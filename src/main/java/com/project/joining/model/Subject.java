package com.project.joining.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Subject {
    private Long id;
    private String subject;
}