public class Demo15 {
    public static void main(String[] args) {
        /*
         * + + + + +
         * + + + +
         * + + +
         * + +
         * +
         */

        //  int x=0;
        //  int y=0;
        
        //  while(y++ <=4){
        //         while(x++<=5){
        //             System.out.print("+ ");
        //             }
        //         System.out.println();
        //  System.out.print("+ ");
         
        // }
        int count = 5;
        while (count > 0) {
            for (int i = 0; i < count; i++) {
                System.out.print("+");
            }
            System.out.println();
            count--;
        }

        int count1 = 5;
        while (count > 0) {
            int i = 0;
            while (i < count1) {
                System.out.print("+");
                i++;
            }
            System.out.println();
            count1--;

            
        }
        
        
    }

    
        
    }
