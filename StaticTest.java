// /**
//  * StaticTest Feb 22th
//  */
// /* *包含了Employee类的一个简单版本，
// *其中有一个静态域nextId和静态方法getNextId。
// *这里将三个Employee对象写入数组，然后打印雇员信息。
// *最后打印出下一个可用的员工标识码来展示静态方法
//  */
// /**
//  * This program demonstrates static methods.
//  */
// /**
//  * TODO error for build
//  */
// public class StaticTest {
//     public static void main(String[] args) {
//         // fill the staff array with three Employee objects
//         Employee[] staff = new Employee[3];
        
//         staff[0] = new Employee("Tom", 40000);
//         staff[1] = new Employee("Dick", 60000);
//         staff[2] = new Employee("Harry", 65000);

//         //print out information about all Employee
//         for (Employee e : staff) {
//             e.setId();
//             System.out.println("name="+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
//         }
//         int n=Employee.getNextId();
//         System.out.println("Next available id="+n);
//     }
// }

//     class Employee {
//         private static int  nextId=1;

//         private String name;
//         private double salary;
//         private int id;

//         public Employee(String n, double s) {
//             name = n;
//             salary = s;
//             id = 0;
//         }

//         public String getName() {
//             return name;
//         }

//         public double getSalary() {
//             return salary;
//         }

//         public int getId() {
//             return id;
//         }
//         public void setId(){
//             id=nextId;//set id to next available id
//             nextId++;
//         }
//         public static int getNextId() {
//             return nextId;//return static field
//         }
//         public static void main(String[] args) {//unit test
//             Employee e=new Employee("Harry", 50000);
//             System.out.println(e.getName()+" "+e.getSalary());
//         }
//     }
