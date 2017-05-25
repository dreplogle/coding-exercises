public class btree {
    public static void main(String[] args) {
        System.out.println("hello world!");
        Node root = new Node();
        BTree tree = new BTree();
        System.out.println(hi.a);
    }
}

class Node {
    int value;
    Node(int a) {
        value = a;
    }
}


abstract public class Tree {
    Node root;
    Tree() {
        root = new Node();
    }
    void add(int a) {
        Node temp = new Node(a);
    }
}

class BTree extends Tree {

}