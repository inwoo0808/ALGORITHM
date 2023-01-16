package sort;

public class Main {
    public static void main(String[] args) {
        int[] arr_threshold = {17, 33, 65, 129, 257, 513};
        int[] arr_size = {10000, 100000, 200000, 400000, 800000, 1600000, 3200000, 6400000};


        for (int size : arr_size) {
            int[] arr = createRandomArray(size);
            for(int threshold : arr_threshold) {
                int[] tmp_arr = arr.clone();

                long start = System.currentTimeMillis();
                pQuickSort(tmp_arr, 0, tmp_arr.length - 1, threshold);
                long end = System.currentTimeMillis();

                String result = "Array length: " + size + ", Threshold: " + threshold + ", Running time: " + (end-start) + "ms";
                System.out.println(result);

            }
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void insertionSort(int arr[], int left, int right) {
        for(int i = left + 1; i <= right; i++) {
            int key = arr[i];
            int j = i - 1;

            while(j >= left && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static int[] partition(int[] arr, int left, int right) {
        if(arr[left] > arr[right]) swap(arr, left, right);

        int l_pivot = arr[left];
        int r_pivot = arr[right];

        int index = left + 1;
        int l_index = left + 1;
        int r_index = right - 1;

        while (index <= r_index) {
            if(arr[index] < l_pivot) {
                swap(arr, index, l_index);
                l_index++;
            } else if(arr[index] >= r_index) {
                while(arr[r_index] > r_pivot && index < r_index) {
                    r_index--;
                }
                swap(arr, index, r_index);
                r_index--;

                if(arr[index] < l_pivot) {
                    swap(arr, index, l_index);
                    l_index++;
                }
            }
            index++;
        }
        l_index--;
        r_index++;

        swap(arr, left, l_index);
        swap(arr, right, r_index);

        return new int[] {l_index, r_index};
    }



    public static void pQuickSort(int[] arr, int left, int right, int threshold) {
        int len = right - left;

        if(left >= right) return;

        if(len < threshold) {
            insertionSort(arr, left, right);
            return;
        } else {
            int[] pivots = partition(arr, left, right);

            pQuickSort(arr, left, pivots[0] - 1, threshold);
            pQuickSort(arr, pivots[0] + 1, pivots[1] - 1, threshold);
            pQuickSort(arr, pivots[1] + 1, right, threshold);
        }
    }

    public static int[] createRandomArray(int size) {
        int[] randArr = new int[size];

        for(int i = 0; i < randArr.length; i++) {
            randArr[i] = (int)(Math.random() * 100000);
        }

        return randArr;
    }
}

