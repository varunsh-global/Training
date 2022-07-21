import java.util.Scanner;

public class helloworldclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Factorial
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		//System.out.println(a);
		int b = a-1;
		int ans = a;
		while(b>0){
			ans = ans*b;
			b--;
		}
		System.out.println(ans);
		//To display A-Z characters
		for(char i = 'A';i<='Z';i++){
			System.out.println(i);
		}
		
	}

}
