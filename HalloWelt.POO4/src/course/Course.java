package course;

import java.util.Arrays;

public class Course {
    private String courseName;
    private String courseTime;
    private Teacher teacher;
    private Student[] students;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;

    }
    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseTime='" + courseTime + '\'' +
                ", teacher=" + teacher +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
