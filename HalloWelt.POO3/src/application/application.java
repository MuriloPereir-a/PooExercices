package application;

import entities.Course;
import entities.Student;
import entities.Teacher;

import java.util.Scanner;

public class application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course course = new Course();
        Teacher teach = new Teacher();
        System.out.println("Enter course name: ");
        String name = sc.nextLine();
        course.setName(name);
        System.out.println("Enter course time: ");
        String time = sc.nextLine();
        course.setTime(time);
        System.out.println("Who's the teacher?: ");
        String teacher = sc.nextLine();
        teach.setName(teacher);
        System.out.println("Which department is he from?");
        String depTeach = sc.nextLine();
        teach.setDepartament(depTeach);
        System.out.println("Enter teacher email: ");
        String email = sc.nextLine();
        teach.setEmail(email);
        course.setTeacher(teach);
        System.out.print("How many students will be registered? ");
        int quantity = sc.nextInt();
        Student[] students = new Student[quantity];
        sc.nextLine();

        for(int i = 0; i< students.length; i++){
            System.out.println("Student #"+(i+1)+":");
            Student stu = new Student();
            System.out.print("Student name: ");
            String stuName = sc.nextLine();
            stu.setName(stuName);
            students[i] = stu;

            double[] grades = new double[4];
                for(int j = 0; j< 4; j++){
                    sc.nextLine();
                    System.out.println("Enter "+(j+1)+"° grade: ");
                    grades[j] = sc.nextDouble();
                }
                stu.setGrade(grades);
        }
        course.setStudent(students);

        System.out.println(course.getInfo());
        sc.close();
    }
}
