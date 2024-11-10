// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		int lim=Integer.parseInt(args[0]);
		int a=(int)(Math.random()*lim);
		int b=(int)(Math.random()*lim);
		int c=(int)(Math.random()*lim);
		int sum=a+b+c;
		int min1=Math.min(a,b);
		int minimum=Math.min(c,min1);
		int max1=Math.max(a,b);
		int maximum=Math.max(c,max1);
		int mid=sum-minimum-maximum;
		System.out.println(a+" "+b+" "+c);
		System.out.println(minimum+" "+mid+" "+maximum);


	}
}
