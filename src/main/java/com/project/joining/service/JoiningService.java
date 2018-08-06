package com.project.joining.service;

import com.project.joining.model.Student;
import com.project.joining.model.StudentSubject;
import com.project.joining.model.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningService {
    private final List<Student> students;
    private final List<StudentSubject> studentSubject;
    private final List<Subject> subjects;

    public JoiningService() {
        final FillerService service = new FillerService();

        students = service.fillStudents();
        studentSubject = service.fillStudentsSubjects();
        subjects = service.fillSubjects();
    }

    public void join() {
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
