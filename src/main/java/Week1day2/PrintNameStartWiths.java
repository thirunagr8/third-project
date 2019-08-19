package Week1day2;
import java.util.Scanner;

public class PrintNameStartWiths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str =  sc.nextLine();
		String[] start = str.split(" ");

		for (String str1 : start) {
			boolean verif;
			if(str1.startsWith("s"))
			{
				verif=true;
			}
			if(verif=true) {
				System.out.println(start);
			}

		}}
}
