import java.util.*;
class ArrayFunction{
	void display(ArrayList<Integer> array){
		  System.out.println("Array is: "+array);
	}
	void oddEven(int[] array){

	ArrayList<Integer> even= new ArrayList<Integer>();
	ArrayList<Integer> odd= new ArrayList<Integer>();
	for (int i=0;i<array.length;i++){
		if (array[i]%2==0){
			even.add(array[i]);	
		}
		else{
			//odd[i]=array[i];
			//odd_index++;
			odd.add(array[i]);
		}
	}
	display(even);
	display(odd);
	}
	int findSmallestDistanceIndex(int[] array) {
        if (array.length < 2) {
           System.out.println("Array must have at least two elements.");
        }
        
        int minIndex = 0;
        int minDistance = Math.abs(array[1] - array[0]);
        
        for (int i = 1; i < array.length - 1; i++) {
            int distance = Math.abs(array[i + 1] - array[i]);
            if (distance < minDistance) {
                minDistance = distance;
                minIndex = i;
            }
        }
        
        return minIndex;
    }
	ArrayList<Integer> arrayToArrayList(int[] array){
		ArrayList<Integer> list= new ArrayList<Integer>();
		for (int i=0;i<array.length;i++){
			list.add(array[i]);
		}
		return list;
	}
	int[] arrayListToArray(ArrayList<Integer> list){
		int[] array=new int[list.size()];
		for (int i=0;i<list.size();i++){
			array[i]=list.get(i);
		}
		return array;
	}

}