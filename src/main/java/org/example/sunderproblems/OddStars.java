package org.example.sunderproblems;

public class OddStars {
    public static void main(String[] args) {
        int n = 5;
//        for (int i = 1; i <= n; i++) {
//           if(i%2!=0) {
//               for (int j = 1; j <= i; j++) {
//                   System.out.print(" * ");
//               }
//
//               System.out.println();
//           }
//        }
        for (int row = 0; row < n + 1; row++) {
            for (int leftspace = n - row - 1; leftspace >= 0; leftspace--) {
                System.out.print(" ");
            }
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }
//            for(int leftspace=0;leftspace<row;leftspace++) {
//                System.out.print(" ");
//            }
            System.out.println();
        }


    }}
