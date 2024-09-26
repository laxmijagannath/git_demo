package project1;

public class palindrome {
	public static void main(String[] args) {
		String str= "MAM";
		String rev= "";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev= rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println("string is palindrome");
		}
		else {
			System.out.println("string is not a palindrome");
		}
	}

}
