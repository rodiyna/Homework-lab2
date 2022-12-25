import java.util.Arrays;

public class HW1Clone {

    public static void main(String[] args) {
        int x[]={23,24,25,26,27,28};
        int y[]=new int [x.length];
        System.out.println("array is:");

        for (int i = 0; i <x.length ; i++) {
            y[i]=x[i];

        }
        System.out.print(Arrays.toString(y));
    }
}
