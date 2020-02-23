import java.util.Arrays;

interface EvenInterface {
    abstract int[] evenArray(int[] inputArray);
}

class Demo implements EvenInterface {

    @Override
    public int[] evenArray(int[] inputArray) {
        int c = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] != 0 && inputArray[i] % 2 == 0) {
                c++;
            }
        }
        System.out.println(c);
        int[] arr = new int[c];
        int j = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] != 0 && inputArray[i] % 2 == 0) {
                arr[j] = inputArray[i];
                j++;
            }
        }
        return arr;
    }
}

public class EvenArray {
    public static void main(String[] args) {
        int inputArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 7, 5, 4, 3, 20, 0};
        Demo d = new Demo();
        System.out.println(Arrays.toString(d.evenArray(inputArray)));

    }
}
