import java.util.Scanner;

public class Demo21 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception{

        System.out.print("Enter a number between (0-100) =>");
            int num= scanner.nextInt();
        if(num<0|num>100){
            System.out.println("Invalid number please try again...!");
        }else System.out.println("Your number is :-"+num);

        System.out.println();
        
        //System.out.println("Select your option here");
        
        
        

        String spaces = "";
        int count = 0;

        do {
            spaces += " ";
            count++;
            System.out.print("\b".repeat(num));
            
            System.out.printf("%s%s%s %s%%s\b", "\033[42m", spaces, "\033[0m", count);
            Thread.sleep(100);

        } while (count++ < num);

        
        
        
    }
}
