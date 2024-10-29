package randomExercise;

public class CharExample {

	public static void main(String[] args) {
		
		String s="i love programming";
		String [] ss = s.split(" ");
		String reqd="";
		
		for(String k: ss)
		{
			if(Character.isLowerCase(k.charAt(0)))
			{
				Character g=Character.toUpperCase(k.charAt(0));
				String n = k.substring(1, k.length());
				reqd = reqd+g +n;
			}
			
			reqd=reqd+" ";
			
			
		}
		System.out.println(reqd);

	}

}
