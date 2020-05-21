package clone;
/**
 * 程序克隆了Employee类的一个实例，
 * 然后调用两个更改器方法。
 * raiseSalary方法会改变salary域的值，
 * 而setHireDay方法改变hireDay域的状态。
 * 这两个更改器方法都不会影响原来的对象，
 * 因为clone定义为一个建立一个深拷贝。
 */


 public class CloneTest {
     /**
      * This program demonstrates cloning。
      */
     public static void main(String[] args) {
        try {
            Employee original = new Employee("John Q. Public", 50000);
            original.setHireDay(2000, 1, 1);
            Employee copy=original.clone();
            copy.raiseSalary(10);
            copy.setHireDay(2002, 12, 31);
            System.out.println("original="+original);
            System.out.println("copy="+copy);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }
}