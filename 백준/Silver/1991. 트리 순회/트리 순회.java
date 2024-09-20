import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node {
    char ch;
    Node left;
    Node right;

    Node(char ch, Node left, Node right) {
        this.ch = ch;
        this.left = left;
        this.right = right;
    }
}

public class Main {
    static Node head;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        head = new Node('A', null, null);

        for(int i=0; i<n; i++) {
            String[] str = br.readLine().split(" ");
            char parent = str[0].charAt(0);
            char left = str[1].charAt(0);
            char right = str[2].charAt(0);
            insertNode(head, parent, left, right);
        }

        preOrder(head);
        System.out.println();
        inOrder(head);
        System.out.println();
        postOrder(head);
    }

    static void insertNode(Node node, char parent, char left, char right) {
        if(node.ch == parent) { // 부모 노드를 찾았을 때 자식 노드 삽입 
            node.left = left == '.' ? null : new Node(left, null, null);
            node.right = right == '.' ? null : new Node(right, null, null);
        } else {
            if(node.left != null) insertNode(node.left, parent, left, right);
            if(node.right != null) insertNode(node.right, parent, left, right);
        }
    }
    static void preOrder(Node node) { // 전위 순회 
        if(node == null) return;
        System.out.print(node.ch);
        preOrder(node.left);
        preOrder(node.right);
    }

    static void inOrder(Node node) { // 중위 순회 
        if(node == null) return;
        inOrder(node.left);
        System.out.print(node.ch);
        inOrder(node.right);
    }

    static void postOrder(Node node) { // 후위 순회 
        if(node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.ch);
    }
}
