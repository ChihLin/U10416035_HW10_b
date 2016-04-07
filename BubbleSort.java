//U10416035 Cheng Chih Lin

public class BubbleSort {

	public static void main (String[] args) {

    //to put them into the right seat
		int location;
		
		
		//an array to store numbers
		int array[] = {6, 8 ,384, 18 , 5 , 4 , 9 , 75 ,  42 , 65 , 720 , 15 ,9 , 8 , 43 , 28, 48, 91 ,36 ,80};


    // to change the number's seat
		for (int i = 1; i < 20; i++){

      //to compare the two numbers size
			for(int j = 0 ; j <19 ; j++ ){
			
			  //compare the two number
				if(array[j] > array[j+1]){
					
					//put the big number in the right seat ,
					//put the small number in the left seat.
					location = array[j];
					array[j] = array[j+1];
					array[j+1] = location;
				}
			}
			
		}
		
		//print the bubble sort
		for(int i = 0 ; i <20 ; i++){
			System.out.print(array[i]+",");
		}
	}

}
