package project1;

public class perfectnumber {
	public static void main(String[] args) {
		int no=6; int sum=0; 
		for(int i=1; i<no;i++)
		{
			if(no%i==0)
			{
				sum=sum+i;
			}
		}
		if(no==sum)
		{
			System.out.println("perfect number");
		}
		else
		{
			System.out.println("not a perfect number");
		}
	}

}
