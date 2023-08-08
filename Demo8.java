import java.util.Scanner;

public class Demo8 {
    private static final Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
        /*Sysntax1
         * if (boolean expression) statement;
         * Syntax2
         * if (boolean expression) statement;
         * 
         * [
         * else  if(boolean expression) statement;
         * else  if(boolean expression) statement;
         * ]
         * [else statement]
         * 
         * Sysntax3
         * if(boolean expression){
         * statement(s);
         * .........
         * }[else  if(boolean expression) {
         * statement(s);
         * }else {
         * 
         * }]
         */
        System.out.print("Enter your name");
        String name=scanner.nextLine();
        if(name.length()>0) System.out.printf("Name : %s \n",name);
        else System.out.println("INVALID NAME GO HELL");
    }
}
