import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter integer number");
        int a= sc.nextInt();
        System.out.println("your integer value is : " + a);

        System.out.println("enter a double value");
        double b= sc.nextDouble();
        System.out.println("your double value is  : "+ b);

        System.out.println("enter char");
        char c= sc.next().charAt(0);
        System.out.println("your char is  :" + c);

        System.out.println(" enter string ");
        String d =sc.nextLine();
        System.out.println("your string is : " + d);

        System.out.println("enter boolean value (true/false):");
        boolean e= sc.nextBoolean();
        System.out.println("you eneterd :" + e);

        System.out.println("enter your byte");
        byte f= sc.nextByte();
        System.out.println("your byte value is : "+ f);





    }
    
}
