public class StringISPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="124";
		StringBuilder sb=new StringBuilder(str1);
		System.out.println(sb.reverse());
		String str2=sb.toString();
		
		if(str1.equals(str2)) {
			System.out.println("Its a PAlindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
		

	}

}
