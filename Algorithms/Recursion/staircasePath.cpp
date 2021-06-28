#include<iostream>
#include<vector>
using namespace std;
void display(vector<string>& arr){
    cout << "[";
    for(int i = 0;i < arr.size();i++){
        cout << arr[i];
        if(i < arr.size() -1) cout << ", ";
    }
    
    cout << "]"<<endl;
}
vector<string>getPaths(int n){
	if(n==0){
		vector<string> path;
		path.push_back("");
		return path;
	}else if (n<0){
		vector<string>path;
		return path;
	}
	vector<string> ans1=getPaths(n-1);
	vector<string> ans2=getPaths(n-2);
	vector<string> ans3=getPaths(n-3);
	vector<string> ansMine;
	for(auto st: ans1){
		ansMine.push_back("1"+st);
	}
	for(auto st: ans2){
		ansMine.push_back("2"+st);
	}
	for(auto st: ans3){
		ansMine.push_back("3"+st);
	}
	return ansMine;
}
int main() {
	int n;
	cin>>n;
	vector<string> st=getPaths(n);
	display(st);
	return 0;
}