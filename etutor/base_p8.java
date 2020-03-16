import java.util.*;

public class base_p8
{
	static int[] prime = new int[33000];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		init();
		int n;

		while(sc.hasNext())
		{
			n = sc.nextInt();

			

			if(prime[n] == 1)
				System.out.println("YES");
			else
				System.out.println("NO");
			}	
	}

	public static void init()
	{
		for(int i=0 ; i<33000 ; i++)
		{
			prime[i] = 1;
		}
		prime[0] = 0;
		prime[1] = 0;
		for(int i=2; i<33000 ; i++)
		{
			if(prime[i] == 1)
			{
				for(int j=i+i ; j<33000 ; j+=i)
				{
					prime[j] = 0;
				}
			}
		}
	}


}