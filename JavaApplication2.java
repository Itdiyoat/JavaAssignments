//A student application which gets name and marks from user and automatically assigns roll no
//Creating my own package
package javaapplication2;
//Importing pre defined package
import java.util.Scanner;
//Importing user defined package
import newpackage.NewClass;
/*
 * Naveenkumar S
 * 2017103028
 */
//Creating class
public class JavaApplication2 {
    
        public static void main(String[] args) {
        float average;
        int n;
        System.out.println("Enter no of Students\n");
        Scanner sc=new Scanner(System.in); 
        n=sc.nextInt();
        //Parametrized constructor
        NewClass s3=new NewClass(1,"Default",99,99,99,"CSE");
        NewClass.department("CSE");
        //Object creation
        NewClass[] obj=new NewClass[n];
        for(int i=0;i<obj.length;i++)
        {
            obj[i]=new NewClass();    
        }
        //Calling the methods
        for(int i=0;i<n;i++)
        {
            obj[i].getinput();
        }
        s3.show();
        average=s3.compute();
        System.out.println("average=\t"+average);
        for(int i=0;i<n;i++)
        {
            obj[i].show();
            average=obj[i].compute();
            System.out.println("average=\t"+average);
        }     
    }
    
}
