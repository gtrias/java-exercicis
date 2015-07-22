public class  Quiniela
{
	public static void main(String[] args) 
	{
		System.out.println("Quiniela");
		System.out.println("--------");
		System.out.println("");
		for(int i=1;i<=15;i++){
			int n=(int) (Math.random()*10+1);
			if(n<=5)System.out.println("Partido"+i+": 1");
			else
				if(n<=8)System.out.println("Partido"+i+": X");
				else
					System.out.println("Partido"+i+": 2");
		}
	}
}
