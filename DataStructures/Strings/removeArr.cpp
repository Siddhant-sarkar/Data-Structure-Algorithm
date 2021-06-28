#include<iostream>
#include<vector>
using namespace std;



int main(){
	vector<int> ar;
	int n;
	cin>>n;	
	while(n--){
		int t;
		cin>>t;
		ar.push_back(t);
	}
	for(auto it: ar) cout<<it<<endl;
	return 0;
}