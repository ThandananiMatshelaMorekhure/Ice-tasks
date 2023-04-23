/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

 /* 
 Thandanani Morekhure 
 St10344391
 Ice task 2

 */
package studentdetails;
import java.util.Scanner;

public class StudentDetails {
    private int age ;
    private String Name;
    private String StudentNumber;
   
    
    public StudentDetails (String Name,int age,String StudentNumber){
    this.Name = Name;
    this.age = age;
    this.StudentNumber = StudentNumber;
}

    public static void main(String[] args) {
        // TODO code application logic here
        
        /* takes input of students details */

        Scanner inputInfo = new Scanner(System.in);
        System.out.println("Enter Students details:");
        
        System.out.println("Enter your Student Number: ");
        String StudentNumber = inputInfo.nextLine();
        
        System.out.println("Enter your name:  ");
        String Name = inputInfo.nextLine();
        
        System.out.println("Enter your Age: ");
        int age = inputInfo.nextInt();
        
        System.out.println("///////////");
        
       
        
        
        
        StudentDetails displayStudentInfo = new StudentDetails(Name,age,StudentNumber);
        
        displayStudentInfo.CheckAge();
        /* Prompts out the name age and student number of the student*/
        System.out.println(Name + " is " + age + " Years old and their registered student number is " + StudentNumber +".");
    }
    


    public void CheckAge(){
        /* this if statements checks the students age as mature or not*/
        if (age < 25)
        System.out.println("Not consider as mature");
        
        else
            System.out.println(""+Name+"is Mature");
        
    }
     
}

/* 
BIBILOGRAPHY:
/* Referencing/ Bibilography 
     Code: 
     Joyce,F.2016.Java programming. 8th edition.Boston:Cengage learning.

*/ 

*/

