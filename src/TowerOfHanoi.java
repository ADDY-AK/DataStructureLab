import java.util.Scanner;

public class TowerOfHanoi {
    static void towerOfHanoi(int n, char s, char d, char a) {
        if (n == 1) {
            System.out.println("Move disk 1 from source " + s + " to destination " + d);
            return;
        }
        towerOfHanoi(n - 1, s, a, d);
        System.out.println("Move disk " + n + " from source " + s + "to destination " + d);
        towerOfHanoi(n - 1, a, d, s);
    }
}

class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of discs: ");
        int n = sc.nextInt();
        TowerOfHanoi t = new TowerOfHanoi();
        t.towerOfHanoi(n, 'S', 'D', 'A');
    }
}
