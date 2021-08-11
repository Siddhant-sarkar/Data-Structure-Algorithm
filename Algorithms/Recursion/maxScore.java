import java.io.*;
import java.util.*;

public class maxScore {

	static int max=Integer.MIN_VALUE;
	public static int solution(String[] words, int[] farr, int[] score, int idx) {
		if(idx==words.length){
			return 0;
		}
		int m1=solution(words,farr,score,idx+1);
		boolean isValid=true;
		int m2=0;
		int sw=0;
		for(char c: words[idx].toCharArray()){
			if(farr[c-'a']==0) {
				isValid=false ;
			}
			farr[c-'a']--;
			sw+=score[c-'a'];
		}
		if(isValid){
			m2=sw+solution(words,farr,score,idx+1);
		}
		for(char c: words[idx].toCharArray()){
			farr[c-'a']++;
		}
		return Math.max(m1,m2);

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int nofWords = scn.nextInt();
		String[] words = new String[nofWords]; // number or words
		for(int i = 0 ; i < words.length; i++) {
			words[i] = scn.next();
		}
		int nofLetters = scn.nextInt();
		char[] letters = new char[nofLetters]; // number of characters
		for (int i = 0; i < letters.length; i++) {
			letters[i] = scn.next().charAt(0);
		}
		int[] score = new int[26]; // score array
		for (int i = 0; i < score.length; i++) {
			score[i] = scn.nextInt();
		}
		if (words == null || words.length == 0 || letters == null || letters.length == 0 || score == null
			|| score.length == 0) {
			System.out.println(0);
		return;
		}
		int[] farr = new int[score.length];
		for (char ch : letters) {
			farr[ch - 'a']++;
		}
		System.out.println(solution(words, farr, score, 0));

	}

}