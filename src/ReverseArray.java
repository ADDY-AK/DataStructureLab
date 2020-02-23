import java.util.Arrays;

interface ReverseInterface {
    public int[] elementReverse(int[] inputArray);
}

class Demo1 implements ReverseInterface {

    @Override
    public int[] elementReverse(int[] inputArray) {
        int t = 0, r = 0;
        for (int i = 0; i < inputArray.length; i++) {
            t = inputArray[i];
            while (t != 0) {
                int n = t % 10;
                r = (r * 10) + n;
                t = t / 10;
            }
            inputArray[i] = r;
            r = 0;
            t = 0;
        }
        return inputArray;
    }
}

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {123, -123, 345, 643, -123, 99};
        Demo1 d1 = new Demo1();
        System.out.println(Arrays.toString(d1.elementReverse(arr)));

    }

}
