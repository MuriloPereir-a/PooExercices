package course;

public class Student {
    private String name;
    private double[] grades;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }
    public String getInfo(){
        StringBuilder info = new StringBuilder("Student: " + name + ";");
        info.append("Grades: ");
        double sum = 0, avg = sum/4;
        for(double grade:grades){
            sum += grade;
            info.append(grade);
        }
        info.append("\n" + "Average: ").append(avg);
        if(avg >= 7){
            info.append("Passed!");
        }else{
            info.append("Failed");
        }
        return info.toString();
    }
}
