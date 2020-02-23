
import java.util.Scanner;

class Node {
    int rollnumber;
    Node next;
    Node previous;
}

public class DoublyLinkedList {
    Node START;

    DoublyLinkedList() {
        START = null;
    }

    public static void main(String args[]) {

        DoublyLinkedList obj = new DoublyLinkedList();
        while (true) {
            System.out.println("1.add");
            System.out.println("2.delete");
            System.out.println("3.search");
            System.out.println("4.traverseforward");
            System.out.println("5.traversereverse");
            System.out.println("6.exit");

            System.out.println("Enter your choice");
            Scanner choice = new Scanner(System.in);
            int ch = choice.nextInt();
            switch (ch) {
                case 1:
                    obj.addnode();
                    break;
                case 2:
                    obj.delete();
                    break;
                case 3:
                    obj.search();
                    break;
                case 4:
                    obj.traverseforward();
                    break;
                case 5:
                    obj.traversereverse();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");


            }
        }
    }

    void addnode() {
        System.out.println("Enter your rollno");
        Scanner sc = new Scanner(System.in);
        int rollno = sc.nextInt();
        Node newnode = new Node();
        newnode.rollnumber = rollno;
        newnode.next = null;
        newnode.previous = null;
        if (START == null) {
            START = newnode;
        } else {
            Node current = START;

            while (current.next != null) {
                current = current.next;

            }
            current.next = newnode;
            newnode.previous = current;
            System.out.println("node inserted....");
        }
    }

    void delete() {
        //System.out.println("delete fn is working");

    }

    void search() {
        //System.out.println("search fn is working");
        if (START == null) {
            System.out.println("list is empty");
        } else {
            System.out.println("enter rollno. which you want to search");
            Scanner sc = new Scanner(System.in);
            int search = sc.nextInt();
            int count = 0;
            Node current;
            for (current = START; current != null; current = current.next) {
                if (current.rollnumber == search) {
                    count++;
                    break;
                }
            }
            if (count > 0) {
                System.out.println("found");
            } else {
                System.out.println("not found");
            }
        }
    }

    void traverseforward() {
        if (START == null) {
            System.out.println("list is empty");
        } else {
            System.out.println("list element");
            Node current;
            for (current = START; current != null; current = current.next) {
                System.out.println(current.rollnumber);
            }
        }

    }

    void traversereverse() {
        if (START == null) {
            System.out.println("list is empty");
        } else {
            System.out.println("list element");
            Node current, temp = null;
            for (current = temp; current != null; current = current.next) {
                System.out.println(current.rollnumber);
            }
        }
    }
}
