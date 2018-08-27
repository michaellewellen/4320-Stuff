package Binary;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binarySearch test = new binarySearch();
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		int result = 0;
		for (int i = -1; i<15; i++) {
			result =test.chop(i,array);
			
			if(result==-1)
				System.out.print(i + " is not found");
			else
				System.out.print(i + " is at position " + result);
			
			
			if (i < 14)
				System.out.print(", ");
			else
				System.out.print(".");
			
			if(i%4 == 0)
				System.out.println("");
		}
			
		
	}

}
