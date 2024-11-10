// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int Num = Integer.parseInt(args[0]);
		int ones=Num%10;
		int tens=(Num/10)%10;
		int hund=(Num/100);
		System.out.println(hund+" hundreds, "+tens+" tens, and "+ones+" ones.");
		
	}
}
