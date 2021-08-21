package cocosneakershop;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class manager extends Stuff {

    private int salarypermonth;
    private int bounus;
    private int totalsellingpoint;

    public manager() {
        super();

    }

    public manager(int salarypermonth, int bounus, int totalsellingpoint, String name, String address, int id, int age) {
        super(name, address, id, age);
        this.salarypermonth = salarypermonth;
        this.bounus = bounus;
        this.totalsellingpoint = totalsellingpoint;

    }

    public int getSalarypermonth() {
        return salarypermonth;
    }

    public int getBounus() {
        return bounus;
    }

    public int getTotalsellingpoint() {
        return totalsellingpoint;
    }

    public void setSalarypermonth(int salarypermonth) {
        this.salarypermonth = salarypermonth;
    }

    public void setBounus(int bounus) {
        this.bounus = bounus;
    }

    public void setTotalsellingpoint(int totalsellingpoint) {
        this.totalsellingpoint = totalsellingpoint;
    }

    public int getTotalsalary() {
        return salarypermonth + bounus * totalsellingpoint;
    }

    public void getInformanager() {
        Scanner sc = new Scanner(System.in);
        super.getInfo();
        System.out.print("Enter Salary per month: ");
        salarypermonth = sc.nextInt();
        System.out.print("Enter bounus: ");
        bounus = sc.nextInt();
        System.out.print("Enter total selling point: ");
        totalsellingpoint = sc.nextInt();
        
    }

    public String toStringmanager() {
        return  "manager :" + super.toString() + "salarypermonth= " + getTotalsalary() + '|';
    }
}
