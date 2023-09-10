package jumptojava.ch03;

public class pb03 {
	public static void main(String[] args) {
		String pin = "881120-1068234";
		String yyyyMMdd = pin.substring(0,6);
		String num = pin.substring(7);
		System.out.println(yyyyMMdd);
		System.out.println(num);
	}
}
