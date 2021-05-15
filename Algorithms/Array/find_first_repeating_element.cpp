#include"bits/stdc++.h"
using namespace std;

int findRepetingElement(vector<int>ar){
	int mini=INT_MAX;
	vector<int> arr(100,-1);
	for(int i=0;i<(int)ar.size();i++){
		if(arr[ar[i]]!=-1){
			mini=min(arr[ar[i]],mini);
		}
		else{
			arr[ar[i]]=i;
		}
	}
	// for(auto it:arr){
	// 	cout<<it<<endl;
	// }
	return mini;
}
int main(){
	vector<int> ar={1,5,3,4,3,6};
	cout<<findRepetingElement(ar)<<endl;

	return 0;
}