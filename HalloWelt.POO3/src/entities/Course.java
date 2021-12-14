package entities;

public class Course {
    private String name;
    private String time;
    private Teacher teacher;
    private Student[] students;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public entities.Student[] getStudents() {
        return students;
    }

    public void setStudent(entities.Student[] students) {
        students = students;
    }
    public String getInfo(){
        String info = "Course: " + name;
        info += ". Time: " + time +"hours."+ "\n";
        if(teacher != null) {
            info += "Teacher: " + teacher.getInfo();
        }

            System.out.println("---- Students ---- ");
            for(Student student : students){
                info = student.getInfo();
                info += "\n";
            }
            info += "\nAverage class: "+ getAvgClass();

        return info;
    }
    public double getAvgClass(){
        double sum = 0;
        for(Student student: students){
                sum += student.getAverage();
        }
        return sum/ students.length;
    }
}
