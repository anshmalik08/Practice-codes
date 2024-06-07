public class PrintSubarray{

    public static void ArrayCC(int number[]){
        int ts =0;
        int sum = 0;
        for(int i=0;i<number.length;i++){
            int start = i ;
            for(int j=i;j<number.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){//print
                    sum =start+end;
                    System.out.print(number[k]+" ");//subarray
                    System.out.println();
                    

                    
                }
                sum++;
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays" + ts);
        System.out.println("sum is"+ sum);
    }
    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};
        ArrayCC(number);
    }
}