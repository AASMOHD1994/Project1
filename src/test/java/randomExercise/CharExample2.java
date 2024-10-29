package randomExercise;

public class CharExample2 {

	public static void main(String[] args) {
		
		String s="This is for me";
		String kk =s.replace(" ", "");
		String [] k = s.split(" ");
		
		int count=kk.length()-1;
		for(String n: k)
		{
			for(int i=0;i<n.length();i++)
			{
				System.out.print(kk.charAt(count--));
			}
			System.out.print(" ");
		}
		
		//System.out.println(kk);
		
	//

	}

}
