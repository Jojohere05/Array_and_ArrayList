import java.util.*;
class UserInput{
//take array input
	Scanner scan = new Scanner(System.in);
	int[] arrayInput(){
		System.out.println("Enter the size of the array");
		int size= scan.nextInt();
		int[] array = new int[size];
		System.out.printf("Enter %d nos\n",size);
		for (int i=0;i<array.length;i++){
			array[i]= scan.nextInt();
		}
	return array;
	}
	//take arraylist input
	ArrayList<Integer> arrayListInput(){
		System.out.println("Enter the size of the array");
		int size= scan.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.printf("Enter %d nos\n",size);
		for (int i=0;i<size;i++){
			arr.add(scan.nextInt());
		}
		return arr;
	}
}