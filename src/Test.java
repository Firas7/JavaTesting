import java.util.Arrays;

public class Test {
	public static void main(String []args){
		int [] x = {10,52,254,100,250,14,7,70,23};
		Arrays.sort(x);
		System.out.println("Der gesuchte Wert existiert auf der Stelle "+Arrays.binarySearch(x, 14)); 
		System.out.println(Arrays.toString(x));
		
		/* setzt jedes Element des Arrays auf den angegebenen Wert !*/
		Arrays.fill(x, 11);
		System.out.println(Arrays.toString(x));
	}
}