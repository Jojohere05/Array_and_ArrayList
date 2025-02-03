import java.util.*;
class UserInput{
	Scanner scan = new Scanner(System.in);
	int[] arrayInput(){
		System.out.println("Enter the size of the array");
		int size= scan.nextInt();
		int[] array = new int[size];
		System.out.println("enter 5 nos");
		
		for (int i=0;i<array.length;i++){
			array[i]= scan.nextInt();
		}
	return array;
	}
	ArrayList<Integer> arrayListInput(){
		System.out.println("Enter the size of the array");
		int size= scan.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.println("enter 5 nos");
		for (int i=0;i<size;i++){
			arr.add(scan.nextInt());
		}
		return arr;
	}
}