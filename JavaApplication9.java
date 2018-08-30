/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

/**
 * 
 * @author Itdiyoat
 * 
 **/

interface Course {
    int elective();
}


class Students implements Course {
    //variable declaration
    int rollno,markone,marktwo,markthree,course_count;
    String name,deprtmnt;
    float avg;
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
            System.out.println("Enter no of electives");
            course_count=sc.nextInt();
            //Setting rollno automatically
            rollno=cnt();
        }
    public Students()
    {
        
    }
    public Students(int rollno,String name,int markone,int marktwo,int markthree,String deprtmnt)
    {
        this.rollno=rollno;
        this.name=name;
        this.markone=markone;
        this.marktwo=marktwo;
        this.markthree=markthree;
        this.deprtmnt=deprtmnt; 
    }
    //Assaigning unique roll no
    static int cnt(){
        count++;
        return count;
    }
    
    public float compute(){
        //Computing average
        avg=(markone+marktwo+markthree)/3;
        return avg;//Returning
    }
    @Override
    public int elective() {
        return 6+course_count;
    }
}


class Cse extends Students {
    //Static variables
    static String dept;
    Cse() {
    }
    public Cse(int rollno,String name,int markone,int marktwo,int markthree,String deprtmnt)
    {
       super(rollno,name,markone,marktwo,markthree,deprtmnt);
    }
     //Static method
    public static void department(String a){
        dept=a;
    }
    public void show(){
        //Printing values
        System.out.println("Rollno:\t"+rollno+"\nname:\t"+name+"\nMark 1:\t"+markone+"\nMark 2:\t"+marktwo+"\nMark 3:\t"+markthree+"\nDepartment:\t"+dept);
    }
}


class Ece extends Students {
    //Static variables
    static String dept;
    Ece() {
    }
    public Ece(int rollno,String name,int markone,int marktwo,int markthree,String deprtmnt)
    {
       super(rollno,name,markone,marktwo,markthree,deprtmnt);
    }
     //Static method
    public static void department(String a){
        dept=a;
    }
    public void show(){
        //Printing values
        System.out.println("Rollno:\t"+rollno+"\nname:\t"+name+"\nMark 1:\t"+markone+"\nMark 2:\t"+marktwo+"\nMark 3:\t"+markthree+"\nDepartment:\t"+dept);
    }
}


class Eee extends Students {
    //Static variables
    static String dept;
    Eee() {
    }
    public Eee(int rollno,String name,int markone,int marktwo,int markthree,String deprtmnt)
    {
        super(rollno,name,markone,marktwo,markthree,deprtmnt);
    }
     //Static method
    public static void department(String a){
        dept=a;
    }
    public void show(){
        //Printing values
        System.out.println("Rollno:\t"+rollno+"\nname:\t"+name+"\nMark 1:\t"+markone+"\nMark 2:\t"+marktwo+"\nMark 3:\t"+markthree+"\nDepartment:\t"+dept);
    }
}


public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        float average;
        int n,m,o;
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter no of CSE Students");
        n=sc.nextInt();
        System.out.println("\nEnter no of ECE Students"); 
        m=sc.nextInt();
        System.out.println("\nEnter no of EEE Students");
        o=sc.nextInt();
        //Parametrized constructor
        Cse s1=new Cse(1,"Default",99,99,99,"CSE");
        Cse.department("CSE");
        Ece s2=new Ece(1,"Default",99,99,99,"ECE");
        Ece.department("ECE");
        Eee s3=new Eee(1,"Default",99,99,99,"EEE");
        Eee.department("EEE");
        
        //obj1ect creation
        Cse[] obj1=new Cse[n];
        Ece[] obj2=new Ece[m];
        Eee[] obj3=new Eee[o];
        
        System.out.println("\nEnter the Details of CSE Students\n");
        for(int i=0;i<obj1.length;i++)
        {
            obj1[i]=new Cse();    
        }
        //Calling the methods
        for(int i=0;i<n;i++)
        {
            obj1[i].getinput();
        }
        
        System.out.println("\nEnter the Details of ECE Students\n");
        for(int i=0;i<obj2.length;i++)
        {
            obj2[i]=new Ece();    
        }
        //Calling the methods
        for(int i=0;i<m;i++)
        {
            obj2[i].getinput();
        }
        
        System.out.println("\nEnter the Details of EEE Students\n");
        for(int i=0;i<obj3.length;i++)
        {
            obj3[i]=new Eee();    
        }
        //Calling the methods
        for(int i=0;i<o;i++)
        {
            obj3[i].getinput();
        }
        
        System.out.println("\nDepartment of Computer Science and Engineering\n");
        s1.show();
        average=s1.compute();
        System.out.println("average=\t"+average+"\n");
        for(int i=0;i<n;i++)
        {
            obj1[i].show();
            average=obj1[i].compute();
            System.out.println("average=\t"+average);
            System.out.println("Total courses without elective\t"+6);
            System.out.println("Total courses including elective\t"+obj1[i].elective()+"\n");
        }
        
        System.out.println("\nDepartment of Electronics and Communication Engineering\n");
        s2.show();
        average=s2.compute();
        System.out.println("average=\t"+average+"\n");
        for(int i=0;i<m;i++)
        {
            obj2[i].show();
            average=obj2[i].compute();
            System.out.println("average=\t"+average);
            System.out.println("Total courses without elective\t"+6);
            System.out.println("Total courses including elective\t"+obj2[i].elective()+"\n");
        }
        
        System.out.println("\nDepartment of Electricals and Electronics Engineering\n");
        s3.show();
        average=s3.compute();
        System.out.println("average=\t"+average+"\n");
        for(int i=0;i<o;i++)
        {
            obj3[i].show();
            average=obj3[i].compute();
            System.out.println("average=\t"+average);
            System.out.println("Total courses without elective\t"+6);
            System.out.println("Total courses including elective\t"+obj3[i].elective()+"\n");
        }
    }
}
