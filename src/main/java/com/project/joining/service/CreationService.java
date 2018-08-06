package com.project.joining.service;

import com.project.joining.model.Student;
import com.project.joining.model.Subject;
import com.project.joining.model.StudentSubject;

public class CreationService {
    public Student createStudent(final Long id, final String surname, final int year, final int groupId) {
        return Student.builder().id(id).surname(surname).year(year).groupId(groupId).build();
    }

    public Subject createSubject(final Long id, final String name) {
        return Subject.builder().id(id).subject(name).build();
    }

    public StudentSubject createStudentSubject(final Long studentId, final Long subjectId) {
        return StudentSubject.builder().studentId(studentId).subjectId(subjectId).build();
    }
}
