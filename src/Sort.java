import java.util.Scanner;

interface SortOperation {
    public abstract void sortm1(int arr[]);

    public abstract void sortm2(int arr[]);

    public abstract void sortm3(int arr[]);
}

class MySort implements SortOperation {

    @Override
    public void sortm1(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    @Override
    public void sortm2(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    @Override
    public void sortm3(int[] arr) {
        int flag = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                flag = 0;
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (flag == 0)
                break;
        }
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}

public class Sort {
    public static void main(String[] args) {
        int arr[] = {34, 20, 54, 62, 12};
        char choice;
        MySort m = new MySort();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("enter 1 for sorting method 1");
            System.out.println("enter 2 for sorting method 2");
            System.out.println("enter 3 for sorting method 3");
            System.out.println("enter e for exit");
            String s = sc.next();
            choice = s.charAt(0);
            switch (choice) {
                case '1':
                    m.sortm1(arr);
                    break;
                case '2':
                    m.sortm2(arr);
                    break;
                case '3':
                    m.sortm3(arr);
                    break;
                case 'e':
                    System.exit(0);
                    break;
                default:
                    System.out.println("error");
            }

        }
    }
}
