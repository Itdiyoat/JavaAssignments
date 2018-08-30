/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author Itdiyoat
 */
public class NewClass {
    //variable declaration
    int rollno,markone,marktwo,markthree;
    String name,deprtmnt;
    float avg;
    //Static variables
    static String dept;
    static int count=1;
    //Creating a method
    public void getinput(){
            //Using scanner function
            Scanner sc=new Scanner(System.in); 
            System.out.println("Enter your name");  
            name=sc.next();  
            System.out.println("Enter your mark 1");
            markone=sc.nextInt();
            System.out.println("Enter your mark 2");  
            marktwo=sc.nextInt();
            System.out.println("Enter your mark 3");  
            markthree=sc.nextInt();
            //Setting rollno automatically
            rollno=cnt();
        }
    public NewClass()
    {
        
    }
    public NewClass(int rollno,String name,int markone,int marktwo,int markthree,String deprtmnt)
    {
        this.rollno=rollno;
        this.name=name;
        this.markone=markone;
        this.marktwo=marktwo;
        this.markthree=markthree;
        this.deprtmnt=deprtmnt; 
    }
    //Static method
    public static void department(String a){
        dept=a;
    }
    //Assaigning unique roll no
    static int cnt(){
        count++;
        return count;
    }
    public void show(){
        //Printing values
        System.out.println("Rollno:\t"+rollno+"\nname:\t"+name+"\nMark 1:\t"+markone+"\nMark 2:\t"+marktwo+"\nMark 3:\t"+markthree+"\nDepartment:\t"+dept);
    }
    public float compute(){
        //Computing average
        avg=(markone+marktwo+markthree)/3;
        return avg;//Returning
    }
}
