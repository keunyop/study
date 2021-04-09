package kevin.springboot.codereview;

public class MidValueSample {
	public static void main(String[] args) {

		int a = 2_100_000_000;
		int b = 2_000_000_000;

//		int mid = b + (a - b) / 2;1
		
		int mid = (a+b) >>> 1;
		

		System.out.println(mid);

	}
}
