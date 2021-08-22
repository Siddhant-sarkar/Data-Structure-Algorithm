import java.io.*;
import java.util.*;

public class validWords {

	public static int ecb(String s){
		int t=0;
		for(int i=0;i<s.length();i++){
			t|= 1<<s.charAt(i)-'a';
		}
		// System.out.println(Integer.toBinaryString(t));
		return t;
	}
	public static void printArr(String[] words){
		for(int i=0;i<words.length;i++){
			System.out.print(words[i]+" ");
		}
		System.out.println();
	}
	public static ArrayList<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
		ArrayList<Integer> ans= new ArrayList<>();
		int wb[]=new int[words.length];
		int pb[]= new int [puzzles.length];
		for(int i=0;i<words.length;i++){
			wb[i]=ecb(words[i]);
		}
		for(int i=0;i<puzzles.length;i++){
			pb[i]=ecb(puzzles[i]);
		}
		for(int i=0;i<puzzles.length;i++){
			int cnt=0;
			for(int j=0;j<words.length;j++){
				// System.out.print(puzzles[i].charAt(0));
				int pos=puzzles[i].charAt(0)-'a';
				// System.out.println(pos);
				if((wb[j]& (1<<pos))>0){
					if((wb[j]&pb[i])==wb[j]) {cnt++;}
				}
			}
			ans.add(cnt);
		}
		return ans;

	 }

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String[] words = new String[n];
		for(int i = 0 ; i < words.length; i++) {
			words[i] = scn.next();
		}
		int m = scn.nextInt();
		String[] puzzles = new String[m];
		for(int i = 0 ; i < m ;i++) {
			puzzles[i] = scn.next();
		}
		ArrayList<Integer> ans = findNumOfValidWords(words,puzzles);
		for(int i=0;i<ans.size();i++) {
			System.out.println(puzzles[i] + " -> " + ans.get(i));
		}
	}
	
}