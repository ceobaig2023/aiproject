package org.example.sunderproblems;

public class Main {
    public static void main(String[] args) {
        int array[]={2,4,6,2,3,5};
        int odd,even;
        for(int i=0; i<array.length; i++) {
            if(i%2==0 || i==0) { even= i;
            for ( int j=0; j<array[even];j++ ) {
                int c=i+1;
                System.out.print(array[c]);
            }}

        }
        System.out.println("Hello world!");
    }
}