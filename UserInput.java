import java.util.*;
class UserInput{
	Scanner scan = new Scanner(System.in);
	int[] arrayInput(){
		int[] array = new int[5];
		System.out.println("enter 5 nos");
		
		for (int i=0;i<array.length;i++){
			array[i]= scan.nextInt();
		}
	return array;
	}

}