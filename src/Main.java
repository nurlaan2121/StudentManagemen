import models.DateBaze;
import models.Student;
import models.service.StudentImpl;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

//Project аталышы: Student management system
//        Description:
//        Сизге Студенттерди башкаруу системасын иштеп чыгуу милдети жүктөлгөн,
//        ал студенттердин тизмесин алардын аты-жөнү жана группасы боюнча сактап жана иреттей
//        алат.
//        Система студенттерди кошуу, студенттердин тизмесин көрсөтүү жана
//        колдонучунун тандоосу боюнча Comparable же Comparator жардамы менен тизмени
//        сорттоо үчүн функцияларды камсыз кылышы керек.Талаптар:Төмөнкү атрибуттары бар
//        Студент классын түзүңүз: аты, группа жана баасы.
//        StudentService:
//        Студенттердин тизмесин сактоо үчүн ArrayList<Student> түзүңүз.
//        StudentManagementSystem implemets StudentService, StudentManagementSystem классында
//        төмөнкү ыкмаларды ишке ашырыңыз:
//        addStudent(Student student): Тизмеге студентти кошот.
//        displayStudents(): Студенттердин тизмесин көрсөтөт.
//        sortByName(): Collections.sort() жана Салыштырылуучу интерфейстин жардамы менен
//        студенттердин тизмесин алардын аттарынын негизинде иреттейт.
//        sortByGrades(): Collections.sort() жана ыңгайлаштырылган Comparator ишке ашыруу
//        аркылуу окуучулардын тизмесин алардын бааларынын негизинде иреттейт.
//        SortByGrades() методу менен окуучуларды бааларынын негизинде салыштыруу үчүн
//        Comparator интерфейсин ишке ашырыңыз (кемүүчү тартипте).
public class Main {
    public static void main(String[] args) {
        LinkedList<Student> allstudents = new LinkedList<>();
        DateBaze dateBaze = new DateBaze(allstudents);
        Scanner scanner = new Scanner(System.in);
        StudentImpl student = new StudentImpl();
        LOOP:
        while (true){
            System.out.println("""
                    1.Add new student
                    2.Get all students
                    3.Sort by name
                    4.Sort by grade
                    5.Sort by grade reversed
           
                    """);
            try {
                int action = scanner.nextInt();
                switch (action){
                    case 1->{
                        Student student1 = new Student();
                        System.out.println("Write name: ");
                        student1.setName(new Scanner(System.in).nextLine());
                        System.out.println("Write age: ");
                        student1.setAge(new Scanner(System.in).nextInt());
                        System.out.println("Write grade: ");
                        student1.setGrade(new Scanner(System.in).nextInt());
                        System.out.println("Success!");
                        dateBaze.allStudents = student.addStudent(student1,dateBaze.allStudents);
                    }case 2->{
                        System.out.println(student.displayStudents(dateBaze.allStudents));
                    }case 3->{
                        System.out.println("Write (Esc or Desc)");
                        System.out.println(student.sortByName(new Scanner(System.in).nextLine(), dateBaze.allStudents));
                    }case 4->{
                        System.out.println(student.sortByAge(dateBaze.allStudents));
                    }case 5->{
                        student.sortByAge2(dateBaze.allStudents);
                    }case 6->{
                        break LOOP;
                    }
                }
            }catch (InputMismatchException exception){
                System.out.println("Write number please!");
                scanner.next();
            }
        }

    }
}