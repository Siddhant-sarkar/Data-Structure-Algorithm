#include"bits/stdc++.h"
using namespace std;

pair<int,int> findRequiredSum(vector<int> ar,int s){
	int i=0,sum=0,j=0;
	pair<int,int>ans;
	if(s==0){
		cout<<"the sum "<<s<<" is not possible\n";
		return NULL;
	}
	while(j<(int)ar.size()&&sum+ar[j]<=s)	{
		sum+=ar[j];
		j++;
	}
		cout<<sum<<endl;
	if(sum==s){
		ans=make_pair(i+1,j);
		return ans;
	}
	while(j<(int)ar.size()){
		sum+=ar[j];
		while(sum>s){
			sum-=ar[i];
			i++;	
		}
		if(sum==s){
			ans=make_pair(i+1,j+1);
			return ans;
		}
		j++;
	}
	cout<<"No such pattern possible\n";
	return make_pair(-1,-1);
}
int main(){
	vector<int> ar={1,2,3,7,5};
	pair <int,int> pos=findRequiredSum(ar,0);
	cout<< pos.first<<"  "<<pos.second<<endl;
	return 0;
}
