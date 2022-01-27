

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class HarryEx7 {
    public static void main(String[] args)
    {
// Question 1. Create an array of 5 floats and calculate their sum.

    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the number of array you want to print : ");
    //     int n;
    //     n = sc.nextInt();
    //     int[] arr = new int[n];
    //     System.out.print("Enter array elements: ");
    //    int sum = 0;
    //     for(int i =0; i<arr.length; i++)
    //     {
      
    //         arr[i] = sc.nextInt();
    //         System.out.print(arr[i] + " ");
            
    //         sum = sum + arr[i];
    //     }
    //     System.out.println("Sum of the array elements is : " + sum);
        
// Question 2. Write a program to find out whether a given integer is present in an array or not.
    // float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
    // float num = 45.57f;
    // boolean isInArray = false;
    // for(float element:marks){
    //     if(num==element){
    //         isInArray = true;
    //         break;
    //     }
    // }
    // if(isInArray){
    //     System.out.println("The value is present in the array");
    // }
    // else{
    //     System.out.println("The value is not present in the array");
    // }


// Question 3. Calculate the average marks from an array containing marks of all students in physics using a for-each loop.


// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the number of elements you want to be present to print: ");
// int n;
// n = sc.nextInt();
// int[] marks = new int[n];
// System.out.print("Enter the elements : ");

// for(int element: marks)
// {

//     element = sc.nextInt();
//     int sum = 0;
//     System.out.print(element);
//     sum = sum + element;
//     System.out.print(sum);
//     int avg = (sum / n);
//     System.out.print(avg);
    
// }

// Question 4. Create a Java program to add two matrices of size 2x3.
        
// int [][] mat1 = {{1, 2, 3},
//                          {4, 5, 6}};
//         int [][] mat2 = {{2, 6, 13},
//                          {3, 7, 1}};
//         int [][] result = {{0, 0, 0},
//                            {0, 0, 0}};

//         for (int i=0;i<mat1.length;i++){ // row number of times
//             for (int j=0;j<mat1[i].length;j++) { // column number of time
//                 System.out.format(" Setting value for i=%d and j=%d\n", i, j);
//                 result[i][j] = mat1[i][j] + mat2[i][j];
//             }
//         }

//         // Printing the elements of a 2-D Array
//         for (int i=0;i<mat1.length;i++){ // row number of times
//             for (int j=0;j<mat1[i].length;j++) { // column number of time
//                 System.out.print(result[i][j] + " ");
//                 result[i][j] = mat1[i][j] + mat2[i][j];
//             }
//             System.out.println(""); // Prints a new line
//         }

// Question 5. Write a Java program to reverse an array.

    // Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the number of array you want to print : ");
    //     int n;
    //     n = sc.nextInt();

    //     int[] arr = new int[n];
    //     System.out.print("Enter array elements: ");        
    //     for(int i = 0; i<=arr.length; i++)
    //     {
    //         arr[i] = sc.nextInt();   
    //     }
    //     System.out.print("Reverse of an array element: ");
    //     for(int i =arr.length-1; i>=0; i-- )
    //         {
             
    //     System.out.print(arr[i]);
            
    //     }
    //     sc.close();
        

// Question 6. Write a Java program to find the maximum element in an array.

// int [] arr = {1, 2 ,3, 4, 5};
// int max = Integer.MIN_VALUE;

// for(int e: arr)
// {
//     if(e>max)
//     {
//         max = e;
//     }
// }
// System.out.println("Max value is : " + max);

// Question 7. Write a Java program to find the minimum element in a Java array.

// int [] arr = {1, 2 ,3, 4, 5};
// int min = Integer.MAX_VALUE;

// for(int e: arr)
// {
//     if(e<min)
//     {
//         min = e;
//     }
// }
// System.out.println("Max value is : " + min);

// Question 8. Write a Java program to find whether an array is sorted or not.
// boolean isSorted = true;
// int [] arr = {1, 12, 3, 4, 5, 34, 67};
// for(int i=0;i<arr.length-1;i++){
//     if(arr[i] > arr[i+1]){
//         isSorted = false;
//         break;
//     }
// }
// if(isSorted){
//     System.out.println("The Array is sorted");
// }
// else{
//     System.out.println("The Array is not sorted");
}



    }
    
}
