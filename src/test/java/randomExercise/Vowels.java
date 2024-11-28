package randomExercise;

public class Vowels {

	public static void main(String[] args) {
		
		String s="vowels are aeiou and AEIOU";
	//	String kk =s.replace(" ", "");
		String [] k = s.split(" ");
		int count =0;
		
		for(String str: k)
		{
			
			for(Character ag:str.toCharArray())
			{
//				if(Character.isUpperCase(ag))
//				{
//					ag=Character.toLowerCase(ag);
//				}
				
				if(ag.equals('A') ||(ag.equals('E'))||ag.equals('I') || ag.equals('O') || ag.equals('U') )
				{
					count++;
				}
			}
		}
		
		System.out.print(count);
	//

	}

}
