package programming;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = new int [2][3];
		
		a [0][0]=2;
		a [0][1]=4;
		a [0][2]=6;
		a [1][0]=8;
		a [1][1]=10;
		a [1][2]=12;
		
		int b[][]= {{2,5,8},{7,9,10}};
		
		// a.length- return the row size
		//a[0].length - return the column size
		
		//System.out.println(b.length);
		for (int i = 0; i < a.length; i++) { //row
			
			for (int j = 0; j <a[0].length; j++) { //column
				
				System.out.print(a[i][j]);
				System.out.print("\t");
				
			}
			System.out.println("");
			
			
		}

	}

}
