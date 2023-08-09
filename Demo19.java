public class Demo19 {
    public static void main(String[] args) {
        /*
         do{
            statement
            statement
            statement
         }while(boolean expression)
         */
        // int x=0;
        //  do System.out.println("hello"); while(x++ <5);

         /*
          + + + + +
          + + + +
          + + +
          + +
          +
          */

        //   int y=0;
        //   do{
         
        //   int x=0;
        //   do {
        //     System.out.print(x);
       
        //     }while(x++ <4-y);
        //      System.out.println();
          
        // }while(y++ <4);

        ////////////////////////////////////////////////////

            // int x=0;
            // int y=0;
            // do{
            //     System.out.print(x);
            //     x=4-y;
            //     y++;

            // }while(x++ <4); //incorrect
            ///////////////////////////////////////////////
           
            /*
            + + + + +
            + + + +
            + + +
            + +
            +                           
            + +
            + + +
            + + + +
            + + + + +
             */

            int x=1;
            int y=0;

            do{
                System.out.print("+ ");
                if (x%5==0) {
                    System.out.println();
                }

            }while (x++ <45);


    }
}
