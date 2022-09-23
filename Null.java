package whatsappassign;

public class Null {

	public static void main(String[] args) {
		String str = "";
		String[] split = str.split(" ");
			for (int j = split.length-1; j >= 0; j--) {
						if(split[j]==str) {
					System.out.println("True");
					}
				}
}

}
