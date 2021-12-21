import java.util.Stack;

public class linklist_palidrom {
    node head;

    void add_data(int data) {
        node toadd = new node(data);
        // System.out.println("toadd " + toadd);
        if (head == null) {
            head = toadd;
            return;
        }
        node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = toadd;
        // System.out.println(temp.data + " tem.next " + temp.next);
    }

    public boolean palidrome() {
        Stack<Integer> s1 = new Stack<>();
        node temp = head;
        node temp2 = head;

        while (temp != null) {
            s1.push(temp.data);
            temp = temp.next;
        }

        while (temp2 != null || !s1.empty()) {

            if (s1.peek() != temp2.data) {
                return false;
            }
            s1.pop();
            temp2 = temp2.next;
        }
        return true;

    }

    static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            next = null;
        }

    }

    public static void main(String[] args) {
        linklist_palidrom ll = new linklist_palidrom();
        ll.add_data(2);
        ll.add_data(3);
        ll.add_data(2);
        boolean ans = ll.palidrome();
        System.out.println("ans " + ans);
    }
}
