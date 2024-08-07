package dz2;

public class Multiplication {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + "*" + j);
                for (int p = 1; p <= 1; p++){
                    System.out.print( "=" + i*j + " ");
                    if (j == 10)
                        System.out.println();
                }
            }
        }
    }
}
