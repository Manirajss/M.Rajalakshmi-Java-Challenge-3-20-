package whatsappassign;

public class Racecar {
	public boolean reverseString(String str) {
		String rev="";
		String[] split = str.split(" ");
		//for (int i = 0; i < split.length; i++) {
			//String str1=split[i];
			//System.out.println(str1);
			//	}
		for (int j = split.length-1; j >= 0; j--) {
			rev=rev+split[j];
			//System.out.println(rev);
	}
	if(str.equals(rev)){
		System.out.println("True");
		return true;
	}
	else {
		System.out.println("False");
		return false;
	}
	}
		

	public static void main(String[] args) {
		String str = "race a car";
		System.out.println(str.toLowerCase());
		//boolean A=reverseString(str);
		Racecar obj=new Racecar();
		obj.reverseString(str);
				
	}
}
