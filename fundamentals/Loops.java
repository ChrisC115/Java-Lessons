public class Loops {
    

    public static void main(String[] args) {



        // break
        // continue
        // return
        for (int i = 0; i < 5; i += 1) {
            for (int j = 0; j < 5; j++) {
                
                    System.out.print(j);
                

            }
            System.out.print('\n');








        }




        // for (int i = 0; i < 5 || j == 5; i++)
        
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        
        }

        boolean isContinuing = true;
        int z = 0;
        
        while (isContinuing) {
            z++;
            if (z == 20) {
                isContinuing = false;
            }
            System.out.println(z);
        }





        // Foobar
        // 1 to 100
        // i % 3 foo,
        // if i is divisble by 5 bar
        // if both divisble by 3 and 5 print foobar
        

        
    }
}
// Challenge 1
// class Foobar {
//     public static void main(String[] args) {
//         for(int i = 0; i <= 101; i ++) 
//             if ((i % 3) == 0) {
//                 System.out.println(i);
//                 System.out.println("Foo");
//             }
//             else if ((i % 5) == 0) {
//                 System.out.println(i);
//                 System.out.println("bar");
//             }
//             else if (((i % 3) == 0) && ((i % 5) == 0)) {
//                 System.out.println(i);
//                 System.out.println("Foobar");
//             }
//     }

// }

// Challenge 2
// class multi {
//     public static void main(String[] args) {
//         for(int i = 0; i<= 12; i ++) {
//             for(int j = 0; j<=12; j++) {
//                 int k = j * i;
//                 System.out.println(i + " * " + j + " = " + (k));
//             }
//         }
//     }
// }

// Challenge 3
