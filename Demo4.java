public class Demo4 {
    public static void main(String[] args) {
        System.out.println("Hello");
        
        myBlock:
        {
            System.out.println("welcome");
            System.out.println("to");
            //break myBlock;
            if (true) break myBlock;
            //System.out.println("DEP-10");
            
        }
        System.out.println("DEP-11");

        //local variable declaration statement
        int x;
        //local constant declaration statement
        final int y;
    }
}
