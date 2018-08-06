package com.project.joining.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentSubject {
    private Long studentId;
    private Long subjectId;
}
