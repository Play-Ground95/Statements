import java.util.Scanner;

public class Demo7 {

    private static final Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {

        
        //
        //
        //
    System.out.print("Enter your name");
    String name=scanner.nextLine();
    System.out.printf("Hi! Welcome %s \n",name);

    System.out.print("Enter your age");
    String age =scanner.nextLine();
    System.out.printf("Your age is %s \n",age);
    
    }
}
