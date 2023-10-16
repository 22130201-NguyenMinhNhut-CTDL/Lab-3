public class Task1_3 {
	private int[] array;

	public Task1_3(int[] array) {
		this.array = array;
	}

	public int iterativeBinarySearch(int target) {
		int left = 0;
		int right = array.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (array[mid] == target) {
				return mid;
			} else if (array[mid] < target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		return -1;
	}

	public int recursiveBinarySearch(int target) {
		return recursiveBinarySearch(target, 0, array.length - 1);
	}

	private int recursiveBinarySearch(int target, int left, int right) {
		if (left <= right) {
			int mid = left + (right - left) / 2;

			if (array[mid] == target) {
				return mid;
			} else if (array[mid] < target) {
				return recursiveBinarySearch(target, mid + 1, right);
			} else {
				return recursiveBinarySearch(target, left, mid - 1);
			}
		}

		return -1;
	}
}
