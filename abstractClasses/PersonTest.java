package abstractClasses;

/**
 * 定义了抽象超类Person和两个具体子类Employee和student。
 * 下面将雇员和学生对象填充到Person引用数组。
 */

 /**
  * 
  * This program demonstrates abstract classes
  */
public class PersonTest {
public static void main(String[] args) {
    Person[] people =new Person[2];

    //fill the people array with Student and Employee objects
    people[0]= new Employee("Harry Hacker", 50000, 1989, 10, 1);
    people[1]=new Student("Maria Morris", "Computer science");

    //print out names and description of all Person objects
    for (Person p : people) {
        System.out.println(p.getName()+","+p.getDescription());
    }
}
    
}