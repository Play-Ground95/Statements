import java.util.Scanner;

public class Demo9 {
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        //byte,short,char,int
        //Byte,Short,Character,Integer
        //String,Enum
        //switch ->If =>OK
        //If->switch => Not Ok

        /*
        switch lables should be a constant expression or enum member
         * switch(expression){
         * switchLable1:
         * switchLable2:
         * switchLable3:
         * }
         */
        /*
         * A= DP
         * B=CP
         * C=P
         * W=Fail
         */
        System.out.print("Enter Your Grade:");
        char grade =scanner.nextLine().strip().charAt(0);
        // if(grade=='A'){
        //     System.out.println("DP");
        // }
        // else if(grade=='B') System.out.println("CP");
        // else if(grade=='C')System.out.println("C");
        // else if(grade=='W')System.out.println("Fail");
        // else System.out.println("Invalid.......");

        switch (grade) {
            case'A': //cant used the variable for switch label
                System.out.println("DP");
                break;
            case'B':
                System.out.println("CP");
                break;
            case'C' :
                System.out.println("C");
                break;
            case'W':
                System.out.println("Fail");
                break;
            default :
                System.out.println("Invalid......."); //that is for best practice only
                
            
        }
    }
}
