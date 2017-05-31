public class btree {
    public static void main(String[] args) {
        System.out.println("hello world!");
        Node root = new Node(4);
        System.out.println(root.value);

    }
}

class Node {
    int value;
    Node(int a) {
        value = a;
    }
}


