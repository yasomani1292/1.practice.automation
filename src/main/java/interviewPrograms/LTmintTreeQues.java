package interviewPrograms;

public class LTmintTreeQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Yasothai 123788 manikandan";
		String output ="";
		String s1 = s.replaceAll("[0-9]", "" );
		
		String [] str = s1.split(" ");
		for(int i=str.length-1; i>=0;i--)
		{
			output = output+str[i];
		}
		System.out.println(output);
	}

}
