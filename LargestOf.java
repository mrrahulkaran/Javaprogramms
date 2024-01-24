package Numbers;

public class LargestOf {
	
	static int a=3;  static int b=8; static int c=5;

	public static void main(String[]args) {
		
		
		if(a>b && b>c){
			
			System.out.println(a+" is largest");
		}
		else if(b>c && c>a) {
			System.out.println(b+" is largest");
		}else {
			
			System.out.println(c+" is largest");
		}
		
	}
	
}
