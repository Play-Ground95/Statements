import java.util.Scanner;

public class Demo12 {
     private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Select an option.");
        System.out.println("1. Enter number 1:");
        System.out.println("1. Proceed");
        System.out.println("2.Exit");
        System.out.println("Enter the option");
        int option = scanner.nextInt();
        scanner.nextLine();

        switch(option){
            case 1:
                System.out.println("Select an option.");
                System.out.println("1. Enter number 1:");
                System.out.println("1. Proceed");
                System.out.println("2.Exit");
                System.out.println("Enter the option");
                option = scanner.nextInt();
                scanner.nextLine();

                switch(option){
                    case 1:
                        System.out.println("Enter Your Name Here");
                        String name=scanner.nextLine();
                        if(name.isBlank()){
                            System.out.println("name cant be empty");
                            break;
                        }else System.out.println("welcome"+name);
                        break;
                    case 2:
                    System.out.println("youre are on exit");
                    break;    
                }
                System.out.println("you are about to exit from final");
                break;
                
            case 2:
                System.out.println("About to exit");
                System.exit(0);

        } 
    }
}
