package randomExercise;

import java.util.Arrays;

public class RotateArrays {

	public static void main(String[] args) {

		
		int [] arr = {1,2,3,5,7,3,4,5,6,8,9,7};
		int p=0;
		while(p<2)
		{
			
		
		int k=arr[0];
		
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		
		arr[arr.length-1]=k;
		p++;
		}
		
		System.out.print(Arrays.toString(arr));
	}

}
