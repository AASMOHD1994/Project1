package com.qa.testcases.RepeatTrial;

import java.util.Arrays;

public class trialFromWeb { 
	
    public static void main (String[] args) {  
        int arr[] = {10,70,30,90,20,20,30,40,70,50};//unsorted array  
        Arrays.sort(arr);//sorting array  
        int length = arr.length;  
        arr = removeDuplicateElements(arr, length);  
        //printing array elements  
        System.out.print(Arrays.toString(arr));
  
    } 
	
	public static int[] removeDuplicateElements(int arr[], int n){  
	       
	        int[] arr2 = new int[n];  
	        int count = 0;  
	        for (int i=0; i<n-1; i++)
	        {  
	            if (arr[i] != arr[i+1])
	            {  
	                arr2[count] = arr[i]; 
	                count++;
	            }

	         } 
	        
	        arr2[count] = arr[n-1];
	        count++;
	        
	        
	        return Arrays.copyOf(arr2, count);  
	    }  
	       
 
	}  
