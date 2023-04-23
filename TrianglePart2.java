/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

 /*
 Name and surnane: Thandanani Morekhure
 Student Number: St10344391
 Ice task 3
 */

package trianglepart2;
import java.util.Scanner;
/**
 *
 * @author lab_services_student
 */

public class TrianglePart2 {
    private int a;
    private int b;
    private int c;
    private int option;
    
    public TrianglePart2(int a, int b, int c,int option)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.option = option;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
      
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first side of the triangle: ");
            int a = input.nextInt();
           
            System.out.println("Enter the second side of the triangle: ");
            int b = input.nextInt();
                
            System.out.println("Enter the third sides of the triangle: ");
            int c = input.nextInt();
            
            System.out.println("what do you want to do? 1: check If Iss 2: check type");
            int option = input.nextInt();
            
            TrianglePart2 x = new TrianglePart2(a,b,c,option);
          
            /*Checks depending on values given to describe the types of triangles whether is an Isoceles or not */
            switch(option)
            {
                case 1: x.determineTheTypeOfTri();
                break;
                case 2: x.Isosceles();
                break;
                default: System.out.println("wrong one");
                    
            }
            
            
            
            
       
           
            
        
    }
    /*
    Ryan(2020) demonstrates through his code to determine how the type of triangle
    */
    public void determineTheTypeOfTri()
    {
        if(a >= (b+c) || c >= (b+a) || b >= (a+c) ) {
            System.out.println( "Not a Triangle");
        } else if(a==b && b==c) {
            System.out.println( "Equilateral Triangle");
        } else if (((a * a) + (b * b)) == (c * c) || ((a * a) + (c * c)) == (b * b) || ((c * c) + (b * b)) == (a * a)) {
            System.out.println( "Right Triangle");
        } else if (a!=b && b!=c && c!=a) {
            System.out.println( "Scalene Triangle" );
        } 
        }
    
    public void Isosceles()
    {
        if ((a==b && b!=c ) || (a!=b && c==a) || (c==b && c!=a)) 
            System.out.println( "Isosceles Triangle");
        else
            System.out.println("not an Isosceles Triangle");
     
    }
    
}

/* Ryan,2020.Check Triangle Type in Java[Stackoverflow].https://stackoverflow.com/questions/60741872/check-triangle-type-in-java#:~:text=out.-,println(%22Equilateral%20Triangle%22)%3B%20else%20if(((a*,b%20%26%26%20b!%3D (Accessed Sunday 23 2023)  
*/ 

