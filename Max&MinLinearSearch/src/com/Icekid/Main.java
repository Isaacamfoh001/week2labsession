package com.Icekid;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array \r");
        int size = scan.nextInt();

        int[] myArray= readIntegers(size);
        MinAndMax(myArray);

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


    public static void MinAndMax(int[] arr)
    {
        int[] FindMin = new int[arr.length];
        for(int i = 0; i< arr.length; i++){
            FindMin[i] = arr[i];
        }
        int temp;
        boolean flag = true ;
        while (flag){
            flag = false;
            for(int i = 0 ; i < FindMin.length -1 ; i++ ){
                if(FindMin[i] > FindMin[i+1]){
                    temp = FindMin[i];
                    FindMin[i] = FindMin[i + 1];
                    FindMin[i + 1] = temp;
                    flag = true;
                }

            }

        }
        System.out.println("The min is : "+ FindMin[0]);
        System.out.println("The Max is : "+ FindMin[FindMin.length - 1]);

    }

}
