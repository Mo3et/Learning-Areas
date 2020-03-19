package equals;

import java.time.LocalDate;

/**
 * Employee
 */
public class Employee {

    private String name;
    private double salary;
    private LocalDate hireDay;
    public Employee(String name,double salary,int year,int month,int day){
        this.name=name;
        this.salary=salary;
        this.hireDay=LocalDate.of(year, month, day);
    }
        public String getName(){
            return name;
        }
        public double getSalary(){
            return salary;
        }
         public LocalDate getHireDay(){
             return hireDay;
         }   
}