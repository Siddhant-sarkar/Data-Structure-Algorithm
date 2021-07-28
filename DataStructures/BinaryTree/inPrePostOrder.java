import java.io.*;
import java.util.*;

public class inPrePostOrder {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(Integer[] arr) {
    Node root = new Node(arr[0], null, null);
    Pair rtp = new Pair(root, 1);

    Stack<Pair> st = new Stack<>();
    st.push(rtp);

    int idx = 0;
    while (st.size() > 0) {
      Pair top = st.peek();
      if (top.state == 1) {
        idx++;
        if (arr[idx] != null) {
          top.node.left = new Node(arr[idx], null, null);
          Pair lp = new Pair(top.node.left, 1);
          st.push(lp);
        } else {
          top.node.left = null;
        }

        top.state++;
      } else if (top.state == 2) {
        idx++;
        if (arr[idx] != null) {
          top.node.right = new Node(arr[idx], null, null);
          Pair rp = new Pair(top.node.right, 1);
          st.push(rp);
        } else {
          top.node.right = null;
        }

        top.state++;
      } else {
        st.pop();
      }
    }

    return root;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    System.out.println("Preorder : "+node.data);
    display(node.left);
    System.out.println("Inorder : "+node.data);
    display(node.right);
    System.out.println("Postorder : "+node.data);
  }

  public static int size(Node node) {
    if(node==null) return 0;
    int size=0;
    size+=size(node.left);
    size+=size(node.right);
    size++;
    return size;
  }

  public static int sum(Node node) {
    if(node==null) return 0;
    int sum=0;
    sum+=sum(node.left);
    sum+=sum(node.right);
    sum+=node.data;
    return sum;
  }

  public static int max(Node node) {
    if(node==null) return Integer.MIN_VALUE;
    int max=Math.max(max(node.left),max(node.right));
    return Math.max(max,node.data);
  }

  public static int height(Node node) {
    if(node==null) return -1;
    int height=Math.max(height(node.left),height(node.right));
    return height+1;
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    Node root = construct(arr);
    display(root);
  }

}