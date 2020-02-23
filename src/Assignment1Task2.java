import java.util.Scanner;

public class Assignment1Task2 {
    public static void main(String[] args) {
        char choice;
        System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        while (true) {
            System.out.println("enter i for insert element");
            System.out.println("enter d for delete element");
            System.out.println("enter s for search element");
            System.out.println("enter o for sorting of elements");
            System.out.println("enter e for exit ");
            String s = sc.next();
            choice = s.charAt(0);
            switch (choice) {
                case 'i':
                    System.out.print("Enter the position where you want to insert element:");
                    int p = sc.nextInt();
                    System.out.print("Enter the element you want to insert:");
                    int x = sc.nextInt();
                    for (int i = (n - 2); i >= (p - 1); i--) {
                        arr[i + 1] = arr[i];
                    }
                    arr[p - 1] = x;
                    System.out.print("array after inserting:");
                    for (int i = 0; i < n; i++) {
                        System.out.print(+arr[i]);
                    }
                    break;
                case 'd':
                    System.out.println("enter the position of deleting element");
                    int p1 = sc.nextInt();
                    for (int i = p1 - 1; i < n - 1; i++)
                        arr[i] = arr[i + 1];
                    System.out.println("array after deleting");
                    for (int j = 0; j < n - 1; j++)
                        System.out.println(+arr[j]);
                    break;
                case 's':
                    System.out.println("enter the search element the array");
                    int search = sc.nextInt();
                    for (int i = 0; i < n; i++)
                        if (arr[i] == search) {
                            System.out.println("element is PRESENT at position" + (i + 1));
                            break;
                        }
                    break;
                case 'o':
                    int n1 = arr.length;
                    for (int i = 0; i < n1 - 1; i++)
                        for (int j = 0; j < n1 - i - 1; j++)
                            if (arr[j] > arr[j + 1]) {
                                int temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                            }
                    System.out.println("the sorted array is");
                    for (int i = 0; i < n1; i++)
                        System.out.println(+arr[i]);
                    break;
                case 'e':
                    System.exit(0);
                    break;
                default:
                    System.out.println("NIKAL PAHILE PHURSAT ME NIKAL......!!!!!");
            }
        }
    }
}
