import java.util.*;

public class base_p3
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x , y;
		x = sc.nextInt();
		y = sc.nextInt();

		double dis;

		dis = Math.pow(x,2) + Math.pow(y,2);

		dis = Math.pow(dis,0.5);

		if(dis <= 200)
		{
			System.out.println("inside");
		}

		else
		{
			System.out.println("outside");
		}

	}
}