public class LineComparisonuc1 {
	public static void main(String[] args) {
		int X1=10;
		int X2=7;
		int Y1=2;
		int Y2=6;
		int x=2;
		int y=2;
		double a=Math.subtractExact(X2, X1);
		double b=Math.subtractExact(Y2,Y1);
		// Here c is double version of int aperand
		int c=(int)Math.pow(a, x);
		int d=(int)Math.pow(b, y);
		double e=Math.addExact(c, d);
		double f=Math.sqrt(e);

				System.out.println("distance of line"+f);

	}

}
