public class ArrayLinearsearch {
    public static int LinearSearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        
        int key = 5;
        int index = LinearSearch(number, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {

            System.out.println("key is about at index : " + index);
        }
    }

}
