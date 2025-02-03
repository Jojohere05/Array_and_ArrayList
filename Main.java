import java.util.ArrayList;

class Main{
	public static void main(String args[]){
		UserInput in = new UserInput();	
		ArrayFunction function = new ArrayFunction();
		int[] arr = in.arrayInput();
		ArrayList<Integer> arrList = in.arrayListInput();
		function.oddEven(arr);
		int index=function.findSmallestDistanceIndex(arr);
		System.out.println("Index of the smallest distance is: "+index);
		System.out.println("Array to ArrayList");
		ArrayList<Integer> arrayList = function.arrayToArrayList(arr);
        function.display(arrayList);
		System.out.println("ArrayList to Array");
		int[] converted = function.arrayListToArray(arrList);
        function.display_arr(converted);
	}
}