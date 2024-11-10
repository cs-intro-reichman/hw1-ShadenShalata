// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		int CurrentV = Integer.parseInt(args[0]);
		double Rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);
		double FutureV=0;
		double ahuz=Rate/100;
		double save=CurrentV;
		int count=n;
		while(count>0)
		{
			FutureV= save+(save*ahuz);
			save=FutureV;
			count--;

		}
		System.out.println("After "+n+" years, $"+CurrentV+" saved at "+Rate+"% will yield $"+(int)FutureV);

	}
}