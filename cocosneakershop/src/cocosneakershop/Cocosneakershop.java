/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocosneakershop;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
    

public class Cocosneakershop {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch ;
        manager[] ma = new manager[100];
        seller[] se = new seller[100];

        int i=0,j=0;
        while(1==1){
        System.out.println("1. Add manager");
        System.out.println("2. Add seller");
        System.out.println("3. hiển thị danh sách ra màn hình");
        System.out.println("4. tìm kiếm nhân viên");
        System.out.println("6. tra cứu lương theo id");
        System.out.println("7. xóa nhân viên ");
        //System.out.println("8. chỉnh sửa thông tin");
        System.out.println("5. thoat ra");
        clearScreen();
        do{    
            ch = sc.nextInt();
        }
        while(ch<0 && ch>5);
        if(ch == 5){
            break;
        }
        switch (ch){
            case  1: 
                ma[i] = new manager();
                ma[i].getInformanager();
                    i++;
                break;
            case  2: 

                se[j] = new seller();
                se[j].getinforseller();
                j++;
                break;
            case 3: 
                for(int m =0; m <i;m++){
                    System.out.println(ma[m].toStringmanager());
                }
                for(int s = 0; s<j;s++){
                    System.out.println(se[s].toStringseller());
                }
                break;
            case 4: 
                System.out.println("nhap id:");
                int search = sc.nextInt();
                for(int m = 0; m<i;m++){
                if(se[m].getId() == search ){
                    System.out.println(se[m].toString());
                }
                    }
                for(int m1 = 0; m1<j;m1++){
                if(ma[m1].getId() == search ){
                    System.out.println(ma[m1].toString());
                }
                    }
                break;
            case 5: 
                System.out.println("nhap id:"); 
                int searchsalary = sc.nextInt();
                for(int m = 0; m<i;m++){
                if(se[m].getId() == searchsalary ){
                    System.out.println(se[m].totalsalary());
                        }
                }
                for(int m1 = 0; m1<j;m1++){
                if(ma[m1].getId() == searchsalary ){
                    System.out.println(se[m1].totalsalary());
                    }
                }
                break;
            case 6:
                
                break;
            }
        }  
    }
}
