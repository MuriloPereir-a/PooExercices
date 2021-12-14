package application;

import course.Course;
import course.Student;
import course.Teacher;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course course = new Course();
        Teacher teach = new Teacher();
        System.out.print("Enter course name: ");
        String name = sc.nextLine();
        course.setCourseName(name);
        System.out.print("Enter course time: ");
        String time = sc.nextLine();
        course.setCourseTime(time);
        System.out.print("Who's the teacher?  ");
        String teachsName = sc.nextLine();
        teach.setName(teachsName);
        System.out.print("Enter teacher departament: ");
        String teachDep = sc.nextLine();
        teach.setDepartment(teachDep);
        System.out.print("Enter teacher email: ");
        String email = sc.nextLine();
        teach.setEmail(email);
        course.setTeacher(teach);
        System.out.println("How many students will be added?");
        int quantity = sc.nextInt();
        sc.nextLine();
        System.out.println("---- STUDENTS ----");
        Student[] students = new Student[quantity];
        for(int i = 0; i< students.length; i++){
            System.out.println("Student #"+(i+1)+":");
            System.out.print("Enter student name: ");
            String stuName = sc.nextLine();

                double[] grades = new double[4];
                sc.nextLine();
                for(int j = 0; j< grades.length; j++){
                    System.out.print("Enter grade #"+(j+1)+":");
                    grades[j] = sc.nextDouble();
                }
            Student student = new Student();
            student.setName(stuName);
            student.setGrades(grades);

        }
        course.setStudents(students);

        System.out.println(course);
        System.out.println();


        sc.close();
    }
}
