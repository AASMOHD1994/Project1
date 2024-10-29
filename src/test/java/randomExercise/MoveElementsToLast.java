package randomExercise;

import java.util.Arrays;

public class MoveElementsToLast {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,3,4,3,2,6}; // move all 6 to last
		
		int temp=0;
		for(int j=0;j<arr.length;j++)
		{
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i+1]==3)
				{
					temp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
				}
			}
			
		}
		
		
		System.out.println(Arrays.toString(arr));


	}

}
