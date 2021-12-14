package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

        private String name;
        private WorkerLevel level;
        private Double baseSalary;
        private Department department;
        private List<HourContract> contractsList = new ArrayList<>();


        public Worker(){}

        public Worker(String name, WorkerLevel level, double baseSalary, Department department) {
                this.name = name;
                this.level = level;
                this.baseSalary = baseSalary;
                this.department = department;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public WorkerLevel getLevel() {
                return level;
        }

        public void setLevel(WorkerLevel level) {
                this.level = level;
        }

        public double getBaseSalary() {
                return baseSalary;
        }

        public void setBaseSalary(double baseSalary) {
                this.baseSalary = baseSalary;
        }

        public Department getDepartment() {
                return department;
        }

        public void setDepartment(Department department) {
                this.department = department;
        }

        public List<HourContract> getContractsList() {
                return contractsList;
        }

       public void addContract(HourContract contract){
                contractsList.add(contract);
       }
        public void removeContract(HourContract contract){
                contractsList.remove(contract);
        }
        public double income(int year, int month){
                double sum = baseSalary;
                Calendar cal = Calendar.getInstance();
                for (HourContract x : contractsList){
                        cal.setTime(x.getDate());
                        int x_year = cal.get(Calendar.YEAR);
                        int x_month = 1 + cal.get(Calendar.MONTH);
                        if(year == x_year && month == x_month){
                                sum += x.totalValue();
                        }
                }
                return sum;
        }
}
