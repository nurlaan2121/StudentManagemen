package models.service;

import models.DateBaze;
import models.Student;

import java.util.Comparator;
import java.util.LinkedList;

public class StudentImpl implements StudentInterface{


    @Override
    public LinkedList<Student> addStudent(Student student, LinkedList<Student> massive) {
        massive.add(student);
        return massive;
    }

    @Override
    public LinkedList<Student> displayStudents(LinkedList<Student> masive) {
        return masive;
    }

    @Override
    public LinkedList<Student> sortByName(String escorDesc, LinkedList<Student> massive) {
        if (escorDesc.equalsIgnoreCase("esc")){
            LinkedList<Student> newMAssive3 = massive;
            newMAssive3.sort(StudentImpl.soronbyNAme);
            return newMAssive3;
        } else if (escorDesc.equalsIgnoreCase("desc")) {
            LinkedList<Student> newMAssive3 = massive;
            newMAssive3.sort(StudentImpl.soronbyNAme);
            return newMAssive3.reversed();
        }else System.out.println("Write (Esc or Desc)");
        return null;
    }

    @Override
    public LinkedList<Student> sortByAge(LinkedList<Student> massive) {
        LinkedList<Student> newmassive = massive;
        newmassive.sort(StudentImpl.soron);
        return newmassive;
    }

    @Override
    public void sortByAge2(LinkedList<Student> massive) {
        LinkedList<Student> newmassive2 = massive;
        newmassive2.sort(StudentImpl.soron.reversed());
        System.out.println(newmassive2);
    }
    public static Comparator<Student> soron = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getGrade() - o2.getGrade();
        }
    }; public static Comparator<Student> soronbyNAme = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
}
