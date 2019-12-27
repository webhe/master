public class QuickSort {
    public static void quickSort(int arr[]) {
        if (arr == null || arr.length < 2) {
            return;
        }
        quicksSort(arr, 0, arr.length - 1);
    }

    private static void quicksSort(int[] arr, int L, int R) {
        if (L < R) {
            swap(arr, L+(int) Math.random()*(R-L+1), R);
            int[] pattion = pattion(arr, L, R);
            quicksSort(arr, L, pattion[0] - 1);
            quicksSort(arr, pattion[1] + 1, R);
        }
    }

    private static int[] pattion(int[] arr, int L, int R) {
        int less = L - 1;
        int more = R;
        while (L < more) {
            if (arr[L] < arr[R]) {
                swap(arr, ++less, L++);
            } else if (arr[L] > arr[R]) {
                swap(arr, --more, L);
            } else {
                L++;
            }
        }
        swap(arr, more, R);
        return new int[]{less + 1, R};
    }

    private static void swap(int[] arr, int L, int R) {
        int temp = arr[L];
        arr[L] = arr[R];
        arr[R] = temp;
    }

    public static void main(String[] args) {
        int[] arr ={1,3,4,5,6,5,2};
        quickSort(arr);
        System.out.println();
    }
}
