package entities;

public class Student {
    private String name;
    private String register;
    private double[] grade;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public double[] getGrade() {
        return grade;
    }

    public void setGrade(double[] grade) {
        this.grade = grade;
    }

    public String getInfo() {

        String info = "Student: " + name;
        info += "Register: " + register;
        info += "Grades: ";

        double sum = 0;
        for (double grade : grade) {
            sum += grade;
            info += grade + " ";
        }
        double avg = sum / 4;
        info += "Average: " + avg + " - ";
        if (avg >= 7) {
            info += "Passed";
        } else {
            info += "Failed";
        }
    return info;
    }
    public double getAverage(){
        double sum = 0;
        for(double grade: grade) {
            sum += grade;
        }
        return sum / 4;
    }

}
