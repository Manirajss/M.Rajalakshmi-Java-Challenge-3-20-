package whatsappassign;

public class StringPalindrome {
	public static void main(String[] args) {
		String str = "A man, a plan, a canal: Panama";
		String[] split = str.split(" ");
		System.out.println(str.toLowerCase());
		for (int i = 0; i < split.length; i++) {
			for (int j = split.length-1; j >= 0; j--) {
				if(split[i]==split[j]) {
					//System.out.println("True");
					System.out.println("True");
					}
				
			}
			}
	}
}
