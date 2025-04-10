package com.practice.ib;

public class Palindrome {
    public static void main(String[] args){
        System.out.println(isPalindromeUsing2PointerApproach("Racecar"));         // true
        System.out.println(isPalindromeUsing2PointerApproach("nurses run"));      // true
        System.out.println(isPalindromeUsing2PointerApproach("Was it a car or a cat I saw")); // true
        System.out.println(isPalindromeUsing2PointerApproach("hello"));           // false
        System.out.println(isPalindromeUsing2PointerApproach(""));                // false
        System.out.println(isPalindromeUsing2PointerApproach(null));              // false
        System.out.println(isPalindrome("Racecar"));         // true
        System.out.println(isPalindrome("nurses run"));      // true
        System.out.println(isPalindrome("Was it a car or a cat I saw")); // true
        System.out.println(isPalindrome("hello"));           // false
        System.out.println(isPalindrome(""));                // false
        System.out.println(isPalindrome(null));
    }

    private static boolean isPalindrome(String s){
        if(s!=null && !s.trim().isEmpty()){
            s = s.replaceAll("\\s","");
            StringBuilder reversedStr = new StringBuilder();
            for(int i = s.length()-1;i>=0;i--){
                reversedStr.append(s.charAt(i));
            }
            return  s.equalsIgnoreCase(reversedStr.toString());
        }
        return false;
    }

    private static boolean isPalindromeUsing2PointerApproach(String s){
        if(s!=null && !s.trim().isEmpty()){
            s = s.replaceAll("\\s","").toUpperCase();
            int left = 0, right = s.length()-1;
            while(left < right){
                if(s.charAt(left) != s.charAt(right)) return false;
                    left++;right--;
            }
            return true;
        }
        return false;
    }



}
