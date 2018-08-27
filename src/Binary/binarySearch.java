package Binary;

public class binarySearch {
	

/* 	This is designed to use a binary search in 4 different ways. A description of each 
 	approach is given before the method implementation. To execute a particular method
 	comment out the current definition of 'position' and un-comment the one you would
 	to use instead.
 */

	public int chop(int value, int[] array) {
		if(array.length == 0)
			return -1;
		int bottom = 0;
		int top = array.length-1;
		//int position = recursionTraditional(value, array, bottom, top);
		//int position = iterativeTraditional(value, array, bottom, top);
		//int position = recursionNonTraditional(value, array, bottom, top);
		int position = iterativeNonTraditional(value, array, bottom, top);
		return position;
	}
	
	/* 	recursionTraditional uses recursion along with a traditional method of splitting the list in half
	  	at the middle to reduce the search.
	 */
	public int recursionTraditional(int value, int[] array, int bottom, int top) {
		int middle = (top + bottom)/2;
		if (top < bottom) {
			return -1;
		}
		if (value == array[middle]) {
			return middle;
		}
		else if (value < array[middle]) {
			return recursionTraditional(value,array,bottom, middle-1);			
		}
		else {
			return recursionTraditional(value,array,middle+1,top);
		}
		
		
	}
	/* 	IterativeTrational uses an iterative approach to navigate the array with a traditional method
	 	of splitting the list in half at the middle to reduce the search
	 */
	public int iterativeTraditional(int value, int[] array, int bottom, int top) {
		int middle = 0;
		while(bottom <= top) {
			middle = (top + bottom)/2;
			if(array[middle] == value) {
				return middle;
			}
			else if(array[middle] < value) {
				bottom = middle + 1;
			}
			else if(array[middle] > value) {
				top = middle -1;
			}
		}
		return -1;
				
	}
	/*	recursionNonTraditional uses recursion along with a nontraditional method of splitting the list
	 	splitting it at 1/4 and 3/4 and using the middle for one half, and the top and bottom as the other
	 	half. 
	 */
	public int recursionNonTraditional(int value, int[] array, int bottom, int top) {
		int oneQuarter = ((top-bottom)/4)+bottom;
		int threeQuarter = ((top-bottom)*3/4)+bottom;
		
		if (top <= bottom) {
			return -1;
		}
		if (value == array[oneQuarter]) {
			return oneQuarter;
		}
		else if (value == array[threeQuarter]) {
			return threeQuarter;
		}
		else if (value == array[top]) {
			return top;
		}
		else if (value == array[bottom]) {
			return bottom;
		}
		else if (value < array[oneQuarter]) {
			return recursionNonTraditional(value,array,bottom, oneQuarter-1);			
		}
		else if (value > array[threeQuarter]){
			return recursionNonTraditional(value,array,threeQuarter+1,top);
		}
		else {
			return recursionNonTraditional(value,array,oneQuarter+1,threeQuarter-1);
		}
		
		
	}
	/*	As expected, iterativeNonTrational using iteration with the previously defined nonTraditional
	 	approach to splitting the list in half.
	 */
	public int iterativeNonTraditional(int value, int[] array, int bottom, int top) {
		int oneQuarter = 0;
		int threeQuarter = 0;
		while(bottom <= top) {
			oneQuarter = ((top - bottom)/4)+bottom;
			threeQuarter = ((top-bottom)*3/4)+bottom;
			if (value == array[oneQuarter]) {
				return oneQuarter;
			}
			else if (value == array[threeQuarter]) {
				return threeQuarter;
			}
			else if (value == array[top]) {
				return top;
			}
			else if (value == array[bottom]) {
				return bottom;
			}
			else if(value < array[oneQuarter]){
				top = oneQuarter - 1;
			}
			else if(value > array[threeQuarter]) {
				bottom = threeQuarter + 1;
			}
			else {
				top = threeQuarter -1;
				bottom = oneQuarter +1;
			}
		}
		return -1;
	}
}