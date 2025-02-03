import java.util.*;
class UserInput{
	int[] arrayInput(){
		int[] array = new int[5];
		System.out.println("enter 5 nos");
		Scanner scan = new Scanner(System.in);
		for (int i=0;i<array.length;i++){
			array[i]= scan.nextInt();
		}
	return array;
	}
}