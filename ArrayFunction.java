import java.util.*;
//Declaration of ArrayFunction class
class ArrayFunction{
	//display function to display the arrayList
	void display(ArrayList<Integer> array){
		  System.out.println("Array is: "+array);
	}
	//display_arr function to display the array
	void display_arr(int[] array){
		System.out.print("Array is: ");
        System.out.println(Arrays.toString(array));
  }
  //oddEven function to separate the odd and even numbers
	void oddEven(int[] array){
//Dynsmic array list to store the odd and even numbers
	ArrayList<Integer> even= new ArrayList<Integer>();
	ArrayList<Integer> odd= new ArrayList<Integer>();
	for (int i=0;i<array.length;i++){
		//if even number
		if (array[i]%2==0){
			even.add(array[i]);	
		}
		//of odd no
		else{
			//odd[i]=array[i];
			//odd_index++;
			odd.add(array[i]);
		}
	}
	display(even);
	display(odd);
	}//to get the smallest distance between the elements
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
        //return the index of the smallest distance
        return minIndex;
    }
	//convert array to list
	ArrayList<Integer> arrayToArrayList(int[] array){
		ArrayList<Integer> list= new ArrayList<Integer>();
		for (int i=0;i<array.length;i++){
			list.add(array[i]);
		}
		return list;
	}
	//convert list to array
	int[] arrayListToArray(ArrayList<Integer> list){
		int[] array=new int[list.size()];
		for (int i=0;i<list.size();i++){
			array[i]=list.get(i);
		}
		return array;
	}

}