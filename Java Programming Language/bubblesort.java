public class bubblesort {
    public static void bubbleSorting(int arr[]) {
        for (int turns = 0; turns < arr.length - 1; turns++) {
            // int swap =0;
            for (int j = 0; j < arr.length - 1- turns; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap++;
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        // int arr[] = { 1, 2, 3, 4, 5};
        bubbleSorting(arr);
        printArr(arr);
    }
}
