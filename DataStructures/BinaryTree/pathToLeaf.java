import java.io.*;
import java.util.*;

public class pathToLeaf {
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

  static ArrayList<String> str;
  public static void printAllLeafs(Node node,String s){
    if(node.left==null && node.right==null){
      s+=node.data+" ";
      str.add(s);
      return;
    }
    printAllLeafs(node.left,s+node.data+" ");
    printAllLeafs(node.right,s+node.data+" ");
  }
  public static void pathToLeafFromRoot(Node node, String path, int sum, int lo, int hi){
    if(node ==null )return ;
    if(node.left==null && node.right==null){
      sum+=node.data;
      if(sum>=lo && sum<=hi){
        path+=node.data+" ";
        System.out.println(path);
        return;
      }
      return;
    }
    pathToLeafFromRoot(node.left,path+node.data+" ",sum+node.data,lo,hi);
    pathToLeafFromRoot(node.right,path+node.data+" ",sum+node.data,lo,hi);
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

    int lo = Integer.parseInt(br.readLine());
    int hi = Integer.parseInt(br.readLine());

    str=new ArrayList<>();
    Node root = construct(arr);
    // display(root);
    // printAllLeafs(root,"");
    // for(String s:str) System.out.println(s);
    pathToLeafFromRoot(root, "", 0, lo, hi);
  }

}