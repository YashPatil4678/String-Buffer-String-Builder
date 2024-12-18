import java.util.Scanner;
public class ReverseString {
	public static String Reverse(String s1) {
		int len = s1.length();
	
		String rev="";
		for(int i = len -1; i>=0 ;i--) {
			rev = rev+s1.charAt(i);
			}
		return(rev);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		System.out.println("Enter any string:");
		Scanner sc = new Scanner(System.in);
		s1 = sc.next();
		String r = Reverse(s1);
		System.out.println(r);
		
		

	}

}
