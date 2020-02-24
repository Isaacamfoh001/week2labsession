package com.Icekid;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array \r");
        int size = scan.nextInt();
        int[] myArray = readIntegers(size);
        System.out.println("Enter the key element to be searched for: \r");
        int target = scan.nextInt();
        int result = LinearSearch(myArray , target , size);
        System.out.println(result);
    }

    public static int[] readIntegers(int count)
    {
        int[] capacity = new int[count];
        System.out.println("Enter "+ count + " integer values \r");
        for(int i = 0; i< capacity.length; i++){
            capacity[i] = scan.nextInt();
        }
        return capacity;
    }

    public static int LinearSearch(int[] values, int target, int n)
    {
        for(int i = 0; i < n ; i++)
        {
            if (values[i] == target)
            {
                System.out.println("Key element found at position: " + i );
                return i;
            }
        }
        return -1;
    }
}


