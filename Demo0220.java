/**
 * Demo0220
 */
public class Demo0220 {

    // public static void AboutParameter() {
        int  salary=10;//outside参数 
    public void raiseSalary(double byPercent)
    {//this 关键字不能在static方法使用
        double raise=this.salary*byPercent/100;
        this.salary+=raise;//在这里面调用的salary属于在outside的salary，属于隐式参数
    }
    // }
    public static void main(String[] args) {
        
            
    }
}