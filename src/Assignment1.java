import java.util.Scanner;

public class Assignment1 {
    public static void main(String args[]) {
        int[] arr = new int[10];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        /*for(int j=0;j<args.length;j++)
        {
            arr[j]=Integer.parseInt(args[j]);
        }*/
        System.out.println("Enter the elements");
        Scanner sc = new Scanner(System.in);
        for (int k = 0; k < arr.length; k++) {
            arr[k] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
        System.out.println((double) sum / arr.length);

    }

}
