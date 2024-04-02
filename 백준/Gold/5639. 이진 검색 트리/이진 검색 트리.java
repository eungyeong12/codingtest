import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static class Node {
        int key;
        Node left, right;

        public Node(int value) {
            this.key = value;
        }
    }

    static class BST {
        Node root;

        Node treeSearch(int key) {
            Node x = root;
            while(true) {
                if(key < x.key) {
                    if(x.left == null) return x;
                    else x = x.left;
                } else if(key > x.key) {
                    if(x.right == null) return x;
                    else x = x.right;
                }
            }
        }

        void put(int key) {
            if(root == null) {
                root = new Node(key);
                return;
            }
            Node x = treeSearch(key);
            Node newNode = new Node(key);
            if(key < x.key) x.left = newNode;
            else if (key > x.key) x.right = newNode;
        }

        ArrayList<Integer> keys() {
            if(root == null) return null;
            ArrayList<Integer> list = new ArrayList<>();
            postorder(root, list);
            return list;
        }

        void postorder(Node x, ArrayList list) {
            if(x != null) {
                postorder(x.left, list);
                postorder(x.right, list);
                list.add(x.key);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BST bst = new BST();
        while(true) {
            String s = br.readLine();
            if(s == null || s.equals(""))
                break;
            bst.put(Integer.parseInt(s));
        }
        ArrayList<Integer> answer = bst.keys();
        while(!answer.isEmpty())
            System.out.println(answer.remove(0));
    }
}
