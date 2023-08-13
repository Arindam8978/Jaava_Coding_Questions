package programming;

public class CiscoInterview {
	
	public static void main(StringDemo[] args) {
		// TODO Auto-generated method stub
		
		/*Algorithm:
			Steps 1: find the min number
			Step 2: identifiy the column of the min number
			Step 3: find the maximum number in identified column
		*/
		
		int arrMatrix [][]= {{2,5,8},{7,9,10},{3,4,1}};
			int min = arrMatrix[0][0];
			int minColumn = 0;
		
		for (int i = 0; i < arrMatrix.length; i++) {  //row 			
			for (int j = 0; j < arrMatrix[0].length; j++) {//column
				
				if (arrMatrix[i][j]<min)
				{
					min = arrMatrix[i][j];
					minColumn = j;
				}
				
			}
		}
		//System.out.println(min);
		int k=0;
		int max = arrMatrix[0][minColumn];
		while(k<arrMatrix[0].length)
		{
			if(arrMatrix[k][minColumn]>max)
			{
				max = arrMatrix[k][minColumn];
			}
			k++;
		}
		System.out.println(max);

	}
	

}
