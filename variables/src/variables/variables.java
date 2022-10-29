package variables;

public class variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		double z;

		x = 5;
		y = 2;
		z = x / y;
		//System.out.print(z);
		
		
		for (int i = 1; i < 5; i++) {
			if (i==2) continue;
			System.out.print(" i = " + i); 
		}
		
		System.out.print("  "+Math.pow(8,2));
	}

}
