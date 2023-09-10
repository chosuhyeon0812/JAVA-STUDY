package jumptojava.ch03;

public class pb05 {
	public static void main(String[] args) {
		String a = "a:b:c:d";
		String b = a.replaceAll(":", "#");
		System.out.println(b);
	}
}
