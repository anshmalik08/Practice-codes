import org.w3c.dom.css.Counter;

public class pattern5ad {
    public static void flyoids_traingle(int n){
        int counter = 1;
        for(int i=1;i<=n;i++){
            // inner - how many ttimes will counter be printed
            for(int j=1;j<=i;j++){
                System.out.print(counter+ " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        flyoids_traingle(5);
    }
}
