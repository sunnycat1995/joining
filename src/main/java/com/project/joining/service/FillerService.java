package com.project.joining.service;

import com.project.joining.model.Student;
import com.project.joining.model.Subject;
import com.project.joining.model.StudentSubject;

import java.util.ArrayList;
import java.util.List;

public class FillerService {
    private final CreationService service = new CreationService();

    public List<Subject> fillSubjects() {
        final List<Subject> subjects = new ArrayList<>();
        subjects.add(service.createSubject(1L, "Math"));
        subjects.add(service.createSubject(2L, "CS"));
        return subjects;
    }

    public List<StudentSubject> fillStudentsSubjects() {
        final List<StudentSubject> studentSubject = new ArrayList<>();
        studentSubject.add(service.createStudentSubject(1L, 1L));
        studentSubject.add(service.createStudentSubject(2L, 1L));
        studentSubject.add(service.createStudentSubject(2L, 2L));
        studentSubject.add(service.createStudentSubject(3L, 2L));
        return studentSubject;
    }

    public List<Student> fillStudents() {
        final List<Student> students = new ArrayList<>();
        students.add(service.createStudent(1L, "Ivanov", 1998, 6));
        students.add(service.createStudent(2L, "Petrov", 1997, 7));
        students.add(service.createStudent(3L, "Sidorov", 1996, 8));
        return students;
    }
}
