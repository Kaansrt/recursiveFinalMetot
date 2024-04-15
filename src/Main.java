import java.util.Scanner;
public class Main {

    public static void recursive(int n)
    {
        System.out.println(n);

        if (n <= 0) {
//            System.out.println(n);
            return;
        }

        recursive(n - 5);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayi giriniz :");
        int sayi = inp.nextInt();
        recursive(sayi);

    }
}
