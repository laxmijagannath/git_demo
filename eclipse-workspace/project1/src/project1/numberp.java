package project1;

public class numberp {
	public static void main(String[] args) {
		int no=141; int copy=no; int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum*10+rem;
			no=no/10;
		}
		if(sum==copy)
		{
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("not a palindrome number");
		}
		
	}

}
