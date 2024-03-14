package com.practice.arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
Problem statement
You are given an integer ‘n’.



Your task is to return an array containing integers from 1 to ‘n’ (in increasing order) without using loops.



Example:
Input: ‘n’ = 5

Output: 1 2 3 4 5

Explanation: An array containing integers from ‘1’ to ‘n’ is [1, 2, 3, 4, 5].
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
5
Sample Output 1 :
1 2 3 4 5
Explanation Of Sample Input 1:
The array contains all integers from 1 to 5 in ascending order.
Sample Input 2:
2
Sample Output 2:
1 2
Explanation Of Sample Input 2:
The array contains all integers from 1 to 2 in ascending order.
Expected Time Complexity:
The expected time complexity is O(n), where 'n' is the given integer.
Constraints:
1 <= n <= 10^6

Time Limit: 1-sec
 */
public class OneToNWithoutLoop {
    public static int[] printNos(int x) {
        // Write Your Code Here
        int[] result = new int[x];
        if(x == 1){
            result[0] = 1;
            return result;
        }else{
            return print(1,result);
        }
    }

    static int[] print(int x,int[] a){
        if(x <= a.length){
            a[x-1] = x;
            x++;
            print(x,a);
        }
        return a;

    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter upto what number you want to construct the array");
        int[] numbers = printNos(myObj.nextInt());
        System.out.println(Arrays.toString(numbers));
    }
}
