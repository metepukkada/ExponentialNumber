import java.util.Scanner;

public class ExponentialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r, result = 0, total = 1;
       do {

           System.out.print("Bir Sayı Giriniz: ");
           n = input.nextInt();

           System.out.print("Sayının Üssünü Giriniz: ");
           r = input.nextInt();
           if (r < 0) {
               System.out.println("Üssü Negatif Girmeyiniz! ");
           }
       }
       while(r < 0);


        // result = Math.pow(n,r );
        // System.out.println(result);

        for (int k = 1; k <= r; k++) {
            total *= n;
        }
        System.out.println(total);
    }
}

