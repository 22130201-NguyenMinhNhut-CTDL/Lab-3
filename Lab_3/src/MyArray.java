//Task1_1
public class MyArray {
	private int[] array;

	public MyArray(int[] array) {
		this.array = array;
	}

	public int iterativeLinearSearch(int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -1;
	}
	public int recursiveLinearSearch(int target) {
        return recursiveLinearSearchHelper(target, 0);
    }

    private int recursiveLinearSearchHelper(int target, int currentIndex) {
        if (currentIndex >= array.length) {
            return -1; 
        }

        if (array[currentIndex] == target) {
            return currentIndex;
        }

        return recursiveLinearSearchHelper(target, currentIndex + 1);
    }

	public static void main(String[] args) {
		int[] arr = { 12, 10, 9, 45, 2, 10, 10, 45 };

		MyArray re1 = new MyArray(arr);

		System.out.print(re1.iterativeLinearSearch(45));
	}
}
