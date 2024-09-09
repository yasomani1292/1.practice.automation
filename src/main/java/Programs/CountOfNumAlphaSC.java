package Programs;

public class CountOfNumAlphaSC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="1234tyui@#$%";
		
		System.out.println(s.replaceAll("[^0-9]+", ""));
		System.out.println(s.replaceAll("[^A-z]+", ""));
		System.out.println(s.replaceAll("\\d+|[A-z]+", ""));
		
		int numOfDigits = s.replaceAll("\\D+", "").length();
		int numOfChars = s.replaceAll("[^A-z]+", "").length();
		int numOfSpecialChars = s.replaceAll("\\d+|[A-z]+", "").length();
		
		
		
		String[] splits = s.split("");
		
		int numCount =0, alphacount=0, specialCount =0;
		
		for(int i=0; i<splits.length;i++)
		{
			if(splits[i].matches("[0-9]+"))
			{
				numCount++;
			}
				
			else if (splits[i].matches("[A-z]+")) {
				alphacount++;
				
			}
				
			else
			{
				specialCount++;
			}
		}
			
		System.out.println(numCount);
		System.out.println(alphacount);
		System.out.println(specialCount);
		
		String s1 = new String("mom");
		System.out.println(s.hashCode());
		s1=s1+"dad";
		System.out.println(s1.hashCode());
		
		StringBuffer sb = new StringBuffer("mom");
		System.out.println(sb.hashCode());
		sb.append("dad");
		
		System.out.println(sb.hashCode());
		

	}
	
	
	
	

}
