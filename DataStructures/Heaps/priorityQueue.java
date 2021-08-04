import java.io.*;
import java.util.*;

public class priorityQueue{

  public static class PriorityQueue {
    ArrayList<Integer> data;

    public PriorityQueue() {
      data = new ArrayList<>();
    }

    public void add(int val) {
     data.add(val);
     for(int i=data.size()/2-1;i>0;i--){
      downHeapify(i);
     }
    }

    public int remove() {
      if(data.size()==0){
        System.out.println("Underflow");
        return -1;
      }
      swap(0,data.size()-1);
      int val= data.remove(data.size()-1);
      downHeapify(0);
      return val;
    }

    public int peek() {
      if(data.size()==0) {
        System.out.println("Underflow");
        return -1;
      }
      return data.get(0);
    }

    public int size() {
      return data.size();
    }

    private void swap(int i ,int j){
      int a=data.get(i);
      int b= data.get(j);
      data.set(i,b);
      data.set(j,a);
    }
    private void upheapify(int i){
      int p=(i-1)/2;
      if(i==0) return;
      if(data.get(p)>data.get(i)){
       swap(i,p);
       upheapify(p);
      }

    }
    private void downHeapify(int pi){
      int mi=pi;
      int li=2*pi+1,ri=2*pi+2;
      if(li<data.size() && data.get(li)<data.get(mi)){
        mi=li;
      }
      if(ri<data.size() && data.get(ri)<data.get(mi)){
        mi=ri;
      }
      if(mi!=pi){
       swap(mi,pi);
       downHeapify(mi);
      }

    }

  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PriorityQueue qu = new PriorityQueue();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}