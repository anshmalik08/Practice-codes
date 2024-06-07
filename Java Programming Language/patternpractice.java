public class patternpractice {
    public static void hollow_rectangle(int rows, int colomns){
        for(int i =1 ; i<=rows;i++){
            for(int j = 1;j<=colomns;j++){
                if(i == 1 || i == rows || j == 1 || j == colomns){
                    System.out.print("=");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        hollow_rectangle(4, 4);
    }
}
