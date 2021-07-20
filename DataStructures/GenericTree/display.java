import java.util.*;
// import java.io.*;
public class display{
  public static class Node{
    int data;
    ArrayList<Node> children=new ArrayList<>();
  }
  public static void display(Node root){
    String s=root.data+"==>";
    for(Node child:root.children){
      s+=child.data+",";
    }
    s+='.';
    System.out.println(s);
    for(Node child:root.children){
      display(child);
    }
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Node root=null;
    int []arr={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,100,-1,-1,90,-1,-1,40,100,-1,-1,-1};
    Stack <Node> st=new Stack<>();
    for(int i=0;i<arr.length;i++){
      if(arr[i]==-1){
        st.pop();
      }else{
        Node t=new Node();
        t.data=arr[i];
        if(st.isEmpty()){
          root=t;
        }else{
          st.peek().children.add(t);
        }
        st.push(t);
      }
    }
    display(root);
    sc.close();
  }
}