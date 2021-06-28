/*

██╗████████╗░██████╗██╗░░░██╗░█████╗░██╗░░░██╗██████╗░░██████╗░█████╗░██████╗░██╗░░██╗░█████╗░██████╗░
██║╚══██╔══╝██╔════╝╚██╗░██╔╝██╔══██╗██║░░░██║██╔══██╗██╔════╝██╔══██╗██╔══██╗██║░██╔╝██╔══██╗██╔══██╗
██║░░░██║░░░╚█████╗░░╚████╔╝░██║░░██║██║░░░██║██████╔╝╚█████╗░███████║██████╔╝█████═╝░███████║██████╔╝
██║░░░██║░░░░╚═══██╗░░╚██╔╝░░██║░░██║██║░░░██║██╔══██╗░╚═══██╗██╔══██║██╔══██╗██╔═██╗░██╔══██║██╔══██╗
██║░░░██║░░░██████╔╝░░░██║░░░╚█████╔╝╚██████╔╝██║░░██║██████╔╝██║░░██║██║░░██║██║░╚██╗██║░░██║██║░░██║
╚═╝░░░╚═╝░░░╚═════╝░░░░╚═╝░░░░╚════╝░░╚═════╝░╚═╝░░╚═╝╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝
*/
#include<iostream>
#include<deque>
// #include<pair>
using namespace std;


int main(){
	string s;
	cin>>s;
	deque<char>st;
	deque<pair<char,int>>pr;
	for(int i=0;i<s.length();i++){
		if(st.empty()) st.push_back(s[i]);
		if(st.back()!=s[i] && !st.empty()) st.push_back(s[i]);
		else continue;
	}
	for(int i=0;i<s.length();i++){
		if(pr.empty()) pr.push_back(make_pair(s[i],1));
		else if(pr.back().first==s[i]) (pr.back().second)++;
		else pr.push_back(make_pair(s[i],1));
	}
	while(!st.empty()){
		cout<<st.front();
		st.pop_front();
	}
	cout<<endl;	
	while(!pr.empty()){
		cout<<pr.front().first;
		if(pr.front().second!=1)
			cout<<pr.front().second;
		pr.pop_front();
	}
}