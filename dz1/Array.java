package dz1;

public class Array {
    public static void main(String[] args){
        int array[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
            if (i == 8)
                System.out.println("Good!\n");
        }
        int p = 0;

        while (p <= 8){

            System.out.println(array[p]);
            p++;
            if(p == 9)
                System.out.println("Good!\n");
        }

        for (int j = 0; j < array.length; j++){
            if (j%2 == 1)
                System.out.println(array[j]);
            if(j == 8)
                System.out.println("Good!\n");
        }
    }
}