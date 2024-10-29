package randomExercise;

import java.util.Arrays;

public class RemoveDups {

	public static void main(String[] args) {

		
		int [] arr = {1,2,3,5,7,3,4,5,6,8,9,7};
		int [] arr2 = new int[arr.length];
		
	//	Arrays.sort(arr);
		
	
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		int count=0;
		for(int i=0;i<arr.length-1;i++)
		{
			
			if(arr[i]==arr[i+1])
			{
				arr2[count++]=arr[i];
			}
		}
		
		//arr2[count++]= arr[arr.length-1];
		System.out.println(Arrays.toString(Arrays.copyOf(arr2, count)));
		
	}

}
