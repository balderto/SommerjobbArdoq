import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) {
		
		//Here is an example of how to use my HighestProduct class to produce the highest factor, given a number of factor and a list.
		final int NUMBER_OF_FACTORS = 3;
		int[] list = new int[] {1, 10, 7, 6, 5, 3};
		System.out.println(HighestProduct.getHighestProduct(NUMBER_OF_FACTORS, list));
		
		
	}
}
