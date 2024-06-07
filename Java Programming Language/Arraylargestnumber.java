public class Arraylargestnumber {
    public static int getlargest(int number[]){
        int largest = Integer.MIN_VALUE;  //-infinity
        int smallest = Integer.MAX_VALUE;  
        for(int i=0;i<number.length;i++){
            if(largest<number[i]){
                largest = number[i];
            }
            if(smallest>number[i]){
                smallest = number[i];
            }
        }
        System.out.println("Smallest vaue is " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int number[] = {1, 2, 6, 3, 5};
        System.out.println("get largest value : "+ getlargest(number));
        // System.out.println("get largest value : "+ getlargest(number));
    }
}
