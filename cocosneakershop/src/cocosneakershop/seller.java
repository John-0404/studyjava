/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocosneakershop;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
class seller extends Stuff{
    private int salaryperh;
    private int hour;
    private String shift;

    public seller() {
    }
    
    public seller(int salaryperh, int hour, String shift, String name, String address, int id, int age) {
        super(name, address, id, age);
        this.salaryperh = salaryperh;
        this.hour = hour;
        this.shift = shift;
    }

    public int getSalaryperh() {
        return salaryperh;
    }

    public int getHour() {
        return hour;
    }

    public String getShift() {
        return shift;
    }

    public void setSalaryperh(int salaryperh) {
        this.salaryperh = salaryperh;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
    public int totalsalary(){
        return hour* salaryperh;
    
    }
            
    public void getinforseller () {
        Scanner sc = new Scanner(System.in);
        super.getInfo();
        System.out.println("Enter Salary per hour: ");
        salaryperh= sc.nextInt();
        System.out.println("Enter hour: ");
        hour = sc.nextInt();
        System.out.println("Enter shift: ");
        shift = sc.next();
    }
    public String toStringseller() {
        return "seller : "  + super.toString()+  ", shift= " + shift + '|';
    }
    
}

