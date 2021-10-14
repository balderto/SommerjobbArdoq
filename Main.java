import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) {
		
		//The complexity in big O notation here would be O(n) which is optimal as we necessarily have to look at each number at least once to decide which ones are the largest.
		final int NUMBER_OF_FACTORS = 3;
		int[] list = new int[] {1, 10, 7, 6, 5, 3};
		System.out.println(HighestProduct.getHighestProduct(NUMBER_OF_FACTORS, list));
		
		
	}
}
