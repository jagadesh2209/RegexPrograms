package RegexPrograms;

public class addading {

	public static void main(String[] args) {
		int []a= {10,22,99};
		
		for( int i:a)
		{
			//int j=a[i];
			int ading = ading(i);
			System.out.println(ading);
		}
		
	}
	public static int ading(int a)
	{
		int sum=0;
		while(a>0)
		{
			int t=a%10;
			sum=sum+t;
			a=a/10;
		}
		int p=0;
		if(sum <10)
		{
			p=sum;
		}else {
			ading(sum);
		}
		return p;
	}
	
}
