package Numbers;

public class LargestOfTwonumbers {
	
	public static void main(String[] args) {
		
		
		int nub= 123456789;
		int count=0;
		
		while(nub!=0) {
			
			count++;
			
			nub=nub/10;
		}
		
		
		System.out.println("no of digit in given No = " + count);
	}

} 
