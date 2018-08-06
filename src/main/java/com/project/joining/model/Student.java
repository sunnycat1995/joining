package com.project.joining.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {
    private Long id;
    private String surname;
    private int year;
    private int groupId;
}