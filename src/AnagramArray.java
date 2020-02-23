import java.util.Arrays;
import java.util.Scanner;

public class AnagramArray {
    public static void main(String[] args) {
        int s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        String[] arr = new String[n];
        String[] arr1 = new String[n];
        int[] arr2 = new int[n];
        System.out.println("enter the 1 array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        System.out.println("enter the 2 array");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                for (int k = 0; k < arr1[i].length(); k++) {

                    char[] c = arr[i].toCharArray();
                    char[] c1 = arr1[i].toCharArray();
                    Arrays.sort(c);
                    Arrays.sort(c1);
                    if (c1[k] == c[j]) {
                        s = s + 1;
                    }
                }
            }
            arr2[i] = (arr[i].length() + arr1[i].length()) - s * 2;
            s = 0;
        }
        for (int k = 0; k < n; k++) {
            System.out.println(arr2[k]);
        }


    }
}
