import java.util.Scanner;

public class Demo20 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String name="";
        String marks;
        
        do{
        System.out.print("Enter your name :");
        name =scanner.nextLine();
         if(name.isBlank()){
            System.out.println("Name can't be empty");
        }else System.out.println("your name is "+name);
        
        int x=0;
        while(x++ <3){
        System.out.print("Enter your marks for sub :"+ x+"");
            marks=scanner.nextLine();
            
            if(marks.isBlank()){
                System.out.println("Marks can't be empty");
            }
            
        }
            
        
       
    }while(name.isBlank());
    
    }
}
