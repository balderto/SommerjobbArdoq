import java.util.PriorityQueue;

public class HighestProduct {
	/*1: Create a function that, given a list of integers, returns the highest product between three of those numbers.
	For example, given the list [1, 10, 2, 6, 5, 3] the highest product would be 10 * 6 * 5 = 300*/
	
	// From math we know that finding the 3 largest integers in the list will also produce the highest product
	// Therefore we can simply make an algorithm that finds the 3 largest integers in a given list of integers.
	
	//I have chosen to use a priorityQueue for this as it produces quite readable code.
	public static int getHighestProduct(int numberOfFactors, int[] list){
		PriorityQueue<Integer> largest = new PriorityQueue<>();
		for(int i = 0; i < list.length; i++) {
			if(largest.size() < numberOfFactors) {
				largest.add(list[i]);
			}else {
				if(list[i] > largest.peek()) {
					largest.poll();
					largest.add(list[i]);
				}
			}
		}
		int product = largest.poll();
		while(!largest.isEmpty()) {
			product = product * largest.poll();
		}
		return product;
	}
}
