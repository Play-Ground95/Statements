public class Demo24 {
    public static void main(String[] args) throws Exception {
        String chars ="|/-\\|/-\\";
        int x=0;
        int y=0;
        int i;
        
                System.out.print("LOADING");
            for(i=0;i<chars.length();i++){
                 
                System.out.print("(");
                 System.out.printf("%s", chars.charAt(i));
                 System.out.print(")");
                 
                 System.out.print("[");
                 //System.out.printf("%s"," ");
                 System.out.print("]");
                 Thread.sleep(500);
                 System.out.print("\b".repeat(5));
                 if((i+1)==chars.length())i=-1;
                    
            }

            // for(y=0;y<20;y++){
            //     System.out.print("[");
            //     System.out.print("]");
            // }

    }
}
