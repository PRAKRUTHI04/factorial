import java.util.Scanner;
class fact
{
	public static void main (String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        int N, factorial = 1;   
        N = scanner.nextInt();  

        int i = 1;
        while (i <= N) {     
            factorial *= i;     
            ++i;
        }
        System.out.println(factorial);
	}
}
