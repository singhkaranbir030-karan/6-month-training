import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter marks :");
        int marks = sc.nextInt();

        if(marks>=90){
            System.out.println("grade A");
        }else if(marks>=80){
            System.out.println("grade B");
        }else if (marks >=70) {
            System.out.println(" grade C");
            
        } else if (marks>= 60){
            System.out.println("Grade D");
        }else{
            System.out.println("Fail");
        }
        
    }
    
}
