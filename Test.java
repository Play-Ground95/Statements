public class Test{
    public static void main(String[] args) throws Exception {
        
        System.out.printf("|%S| \n","TRAFFIC LIGHT SYSTEM");
        String spaces = "";
        int i = 0;
        int green=50;

        do {
            spaces += " ";
            i++;
            
            System.out.print("\b".repeat(green));
            
            System.out.printf("%s%s%s \b", "\033[42m", spaces, "\033[0m", i);
            
            Thread.sleep(50);

        } while (i++ < green);

        String space2="";
        int j=51;
        int yellow=101;
        
        do{
            space2 += " ";
            j++;
            
            System.out.print("\b".repeat(yellow));
            
            System.out.printf("%s%s%s \b", "\033[43m", space2, "\033[0m", j);
            
            Thread.sleep(50);

        } while (j++ < yellow);


        String space3="";
        int k=100;
        int red=150;
        
        do{
            space3 += " ";
            k++;
            
            System.out.print("\b".repeat(red));
            
            System.out.printf("%s%s%s \b", "\033[41m", space3, "\033[0m", k);
            
            Thread.sleep(50);

        } while (k++ < red);
        System.out.println();

        

    }
}