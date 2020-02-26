/**
 * Demo0223
 */
/*
 * Learning to Feb 23th
 */
public class Demo0223 {

   
    public static void main(String[] args) {
        
    }
}

class Employee{
    private String name="";
    private double salary=0;
    private static int nextId;
    // public Employee(String n,double s){
    //     name=n;
    //     salary=s;
    // }
    public  Employee(String aName,double aSalary) {
        name=aName;
        salary=aSalary;
    }
    public Employee(double s)
    {
        //calls Employee(String,double)
        this("Employee #"+nextId,s);
        nextId++;
    }

}

// class Employee{
//     private int id ;
//     private String name;
//     private double salary;
//     private static int nextId;
//     //object initialization block
//     {
//         id=nextId;
//         nextId++;
//     }
//     public Employee(String n,double s){
//         name=n;
//         salary=s;
//     }
   
//     public Employee()
//     {
//         name="";
//         salary=0;
//     }
//     ....

// }