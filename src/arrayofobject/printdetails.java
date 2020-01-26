/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayofobject;

/**
 *
 * @author karan
 */
public class printdetails 
{
    public static void main(String[] args) 
    {
        Student[] list=new Student[3];// array of object declaration
      Student s1=new Student();//an object for student class
      s1.setName("karanveer singh");
      s1.setId(45);
       Student s2=new Student();//an object for student class
      s2.setName("ksksks singh");
      s2.setId(45);
       Student s3=new Student();//an object for student class
      s3.setName("ssscscsccs singh");
      s3.setId(45);
      
      list[0]=s1; //storing thr object in array
      list[1]=s2;
      list[2]=s3;
                System.out.println("this js fetch and mergwe das das d asd as");
//these are comments
      for(int i=0;i<3;i++)
      {
          System.out.println("name is " + list[i].getName() + " id is " + list[i].getId());
      }
//        System.out.println("name is " + s1.getName() + " id is " + s1.getId());
        
      
    }
}
