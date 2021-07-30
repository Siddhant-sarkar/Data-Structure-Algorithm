import java.io.*;
import java.util.*;

public class largestBinarySubtree{
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

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }
  
  public static class  bst{
    boolean found;
    int min;
    int max;
    int size;
    Node root;
  }
  public static bst largestBST(Node node){
    if(node==null){
      bst t=new bst();
      t.found=true;
      t.size=0;
      t.min=Integer.MAX_VALUE;
      t.max=Integer.MIN_VALUE;
      return t;
    }
    bst l= largestBST(node.left);
    bst r= largestBST(node.right);
    bst n=new bst();
    n.found=l.found && r.found && (node.data>=l.max && node.data<=r.min);
    n.max=Math.max(node.data ,Math.max(l.max,r.max));
    n.min=Math.min(node.data,Math.min(l.min,r.min));
    if(n.found) {
      n.root=node;
      n.size=l.size+r.size+1;
    }else if(l.size>r.size){
      n.root=l.root;
      n.size=l.size;
    }else{
      n.root=r.root;
      n.size=r.size;
    }
    return n;
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
    bst t=largestBST(root);
    System.out.println(t.root.data+"@"+t.size);

  }

}