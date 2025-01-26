import java.util.*;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList evesList = new CircularLinkedList();
        Scanner scan = new Scanner(System.in);

        System.out.print("enter eve's number of suitors: ");
        int n = scan.nextInt();

        if (n < 1) {
            System.out.println("invalid number. ");
            System.exit(1);
        }

        for (int i = 0; i < n; i++) evesList.add(i+1);
        System.out.print("eve's list of suitors: ");
        evesList.print();

        int k = 1;
        Node curr = evesList.getHead();

        while (curr != curr.next) {
            if (k % 3 == 0) {
                evesList.removeNode(curr.data);
                evesList.print();
                System.out.println("suitor " + curr.data + " eliminated");
            }

            k++;
            curr = curr.next;
        }

        System.out.println("\nlucky winner: " + evesList.getHead().data);
    }
}