package com.project.joining.service;

import com.project.joining.model.Student;
import com.project.joining.model.StudentSubject;
import com.project.joining.model.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningService {
    private final FillerService service = new FillerService();

    public void join() {
        final List<Student> students = service.fillStudents();
        final List<StudentSubject> studentSubject = service.fillStudentsSubjects();
        final List<Subject> subjects = service.fillSubjects();

        final List<Object> allOptions = new ArrayList<>();
        studentSubject.forEach(s -> {
            students.stream().filter(student -> student.getId().equals(s.getStudentId())).findFirst().ifPresent(c1 -> {
                subjects.stream().filter(subject -> subject.getId().equals(s.getSubjectId())).findFirst().ifPresent(c2 -> {
                    allOptions.add(Stream.of(c1, c2).collect(Collectors.toList()));
                });
            });
        });

        System.out.println(allOptions);
    }
}
