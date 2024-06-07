import javax.management.relation.InvalidRelationTypeException;

public class patternad3 {
    public static void inverted_rotated_numbers(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inverted_rotated_numbers(4);
    }
    
}
