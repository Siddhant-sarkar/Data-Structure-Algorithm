import java.io.*;
import java.util.*;

public class targetSumPair3 {
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
  
  public static class it{
    Node node;
    int state=0;
    it(Node node,int state){
      this.node=node;
      this.state=state;
    }
  }
  public static void printPair(Node node){
    Stack<it> s1=new 
  }
  public static void inOrder(Node node){
    Stack<it> st = new Stack<>();
    st.push(new it(node,-1));
    String pre="",in="",post="";
    while(st.size()>0){
      it t=st.peek();
      if(t.state==-1) {
        pre+=t.node.data+" ";
        if(t.node.left!=null ) st.push(new it(t.node.left,-1));
      }else if(t.state==0){
        in+=t.node.data+" ";
        if(t.node.right!=null ) st.push(new it(t.node.right,-1));
      }else{
        st.pop();
      }
     t.state++;
    }
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

    int sum = Integer.parseInt(br.readLine());

    Node root = construct(arr);
    inOrder(root);
  }

}