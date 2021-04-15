package kevin.springboot.codereview;

public class MidValueSample {
	public static void main(String[] args) {

		int start = 2_000_000_000;
		int end = 2_100_000_000;
		
		int mid = start +(end -start) /2;
		
//		int mid = (start + end) >>> 1;
		
		System.out.println(mid);
	}
}
