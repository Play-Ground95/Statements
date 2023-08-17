public class Demo24 {
    public static void main(String[] args) throws Exception {
        String chars ="|/-\\|/-\\";
        
        int i;
        int x=0;
        
                System.out.print("LOADING");
            
                for(i=0;i<21;i++){
                 
                System.out.print("(");
                 System.out.printf("%s", chars.repeat(20).charAt(i));
                 System.out.print(")");

                 System.out.print("\b".repeat(20));
                 System.out.print("[");
                 System.out.printf("%s%s%s%s",
                 "\033[42m"," ".repeat(i), "\033[0m",
              " ".repeat(20-i));
                 System.out.print("]");
                 Thread.sleep(500);
                 System.out.print("\b".repeat(5));
                //  if((i+1)==chars.length())i=-1;
                    
            }

            
    }
}
