import java.util.Arrays;

public class HW1Reverse {
    public static void main(String[] args) {
        int array[]=new int[]{22,33,44,55,66,77};
        System.out.println("order array is: ");

        for (int i=array.length-1;i>=0; i--) {
            System.out.print(array[i]+" ");

        }
    }
}
