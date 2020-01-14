/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayofobject;

import java.util.Scanner;

/**
 *
 * @author karan
 */
public class printdetails2 
{
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        Model ob=new Model();
        Model ob1=new Model();
        Model ob2=new Model();
        Model ob3=new Model();
        
        System.out.println("Enter slary");
        double a=n.nextDouble();
        System.out.println("Enter hour");
        double hour=n.nextDouble();
        
         System.out.println("Enter slary");
        double a1=n.nextDouble();
        System.out.println("Enter hour");
        double hour1=n.nextDouble();
        
         System.out.println("Enter slary");
        double a2=n.nextDouble();
        System.out.println("Enter hour");
        double hour2=n.nextDouble();
        
         System.out.println("Enter slary");
        double a3=n.nextDouble();
        System.out.println("Enter hour");
        double hour3=n.nextDouble();
        
        ob.setSalry(a);
        ob1.setSalry(a1);
        ob2.setSalry(a2);
        ob3.setSalry(a3);
        ob.setWhour(hour);
        ob1.setWhour(hour1);
        ob2.setWhour(hour2);
        ob3.setWhour(hour3);
        
        Model[] list=new Model[4];
        list[0]=ob;
        list[1]=ob1;
        list[2]=ob2;
        list[3]=ob3;
        
        for(int i=0;i<list.length;i++)
        {
            System.out.println("No of hours is " + list[i].getSalry() + " working hour is " + list[i].getWhour() + "  salary is " + list[i].toString());
        }
        
        
    }
}
