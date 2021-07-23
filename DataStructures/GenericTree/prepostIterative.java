import java.io.*;
import java.util.*;

public class prepostIterative {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static void display(Node node) {
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
  }

  public static Node construct(int[] arr) {
    Node root = null;

    Stack<Node> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        st.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() > 0) {
          st.peek().children.add(t);
        } else {
          root = t;
        }

        st.push(t);
      }
    }

    return root;
  }
  static class Pair{
    Node node;
    int state;
    Pair(Node node,int state){
      this.state=state;
      this.node=node;
    }
  }
  public static void IterativePreandPostOrder(Node node) {
    String pre="",pos="";
    Stack<Pair> st= new Stack<>();
    st.push(new Pair(node,-1));
    while(st.size()>0){
      Pair t= st.peek();
      if(t.state==-1){
        pre+=t.node.data+" ";
        t.state++;
      }else if(t.state==t.node.children.size()){
        pos+=t.node.data+" ";
        st.pop();
      }else{
        Pair np=new Pair(t.node.children.get(t.state),-1);
        st.push(np);
        t.state++;
      }
    }
    System.out.println(pre);
    System.out.println(pos);
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    Node root = construct(arr);
    IterativePreandPostOrder(root);
  }

}