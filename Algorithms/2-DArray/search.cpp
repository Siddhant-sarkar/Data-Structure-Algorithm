#include"bits/stdc++.h"
using namespace std;

bool isThere(vector<vector<int>>ar,int s){
	for(auto it:ar){
		for(auto iit :it){
			if(iit==s)
				return true;
		}
	}
	return false;
}
bool isThereNew(vector<vector<int>>ar,int s){
	int hr=(ar[0].size())-1,vr=0;
	while(hr>0;vr<ar.size()){
		if(ar[vr][hr]==s)
			return true;
		else if(ar[vr][hr]>s)
			vr++;
		else 
			hr--;
	}
	return false;

}
int main(){
	vector<vector<int>> ar={{1,2,3},{4,5,6},{7,8,9}};
	isThereNew(ar,90)?cout<<"Yes\n":cout<<"No\n";
	return 0;
}