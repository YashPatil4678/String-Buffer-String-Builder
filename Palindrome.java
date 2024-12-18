import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string:");
		s1 = sc.nextLine();
		StringBuffer s2 = new StringBuffer(s1);
		s2.reverse();
		System.out.println(s2);
		if(s1.equals(s2.toString())) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}

	}

}
