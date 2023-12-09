package models.service;

import models.Student;

import java.util.LinkedList;

public interface StudentInterface {
    LinkedList<Student>addStudent(Student student,LinkedList<Student> massive);
    LinkedList<Student>displayStudents(LinkedList<Student> masive);
    LinkedList<Student>sortByName(String escorDesc,LinkedList<Student> massive);
    LinkedList<Student>sortByAge(LinkedList<Student> massive);
    void sortByAge2(LinkedList<Student> massive);

}
