import java.util.*;
public class nCr_nPr {
    public static int factorial(int num){

        int facto = 1;
        for(int i=num;i>=1;i--){
            facto*=i;
        }

        return facto;

    } 

    public static int combi(int n,int r){
        int combination = factorial(n)/(factorial(r)*factorial(n-r));
        return combination;
    }

    public static int permi(int n,int r){
        int permutation = factorial(n)/factorial(n-r);
        return permutation;
    }

    public static void main(String[] args) {
        System.out.print("Combination: "+combi(5, 2)+"\n");
        System.out.print("Permutaion: "+permi(5, 2));
    }

   
}
