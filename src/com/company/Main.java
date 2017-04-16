package com.company;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.util.Arrays.*;

public class Main {

    public static void main(String[] args) {
        String promptString="Enter number ";
        int[] numArray = new int[5];
        int counter = 0;
        Scanner s = new Scanner(System.in);
        while (counter < numArray.length)
        {
            System.out.println(promptString+(counter+1)+":");
            numArray[counter]=parseInt(s.nextLine());
            counter++;
        }
        String outString1="Initial array: ";
        for(int x=0;x<numArray.length;x++){
            outString1+= numArray[x]+(x>=numArray.length-1?"":",");
        }
        System.out.println(outString1);
      sort(numArray);
        String outString2="Sorted array: ";
        for(int x=0;x<numArray.length;x++){
            outString2+= numArray[x]+(x>=numArray.length-1?"":",");
        }
        System.out.println(outString2+".");
    }
}
