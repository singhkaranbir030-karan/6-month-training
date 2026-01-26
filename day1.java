
import java.util.Scanner;
class day1 {
    public static void main(String[] args) {
        System.out.println("karanbir singh");
        System.out.println("age is 23");
        System.out.println("noida ");
        
        //  question 2
         int marks = 56;
        double cgpa = 8.7;

        System.out.println("Marks = " + marks);
        System.out.println("CGPA = " + cgpa);
    
        // question 3
        Scanner sc=  new Scanner(System.in );
        System.out.println("enter first number");
        int a= sc.nextInt();
        System.out.println("enter second number");
        int b= sc.nextInt();
        int sum=a+b;
        System.out.println("the sum of these number is = 12" + sum);
        
    //  print spring boot 10 times!
        for(int i=0;i<=10;i++){
        System.out.println("Spring boot Ready");

        }
        // loops question
        int i,j;
        for ( i = 1; i <= 3; i++) {
            for(j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        // fotmatted messge

        System.out.println("Student Name = john");
        System.out.println("Age = 22");
}}