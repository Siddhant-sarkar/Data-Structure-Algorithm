#include<iostream>
#include<vector>
using namespace std;


// This was my desighned algorithm which works on the three pointer due fact that

/*arr[k]==2 k++;
arr[k]==1 we just swap(arr[k],arr[j]); j++,k++;
arr[k]==0 we just swap(arr[k],arr[i]); and we also swap(arr[k],arr[j]) j++,i++,k++;
*/
void sortt(vector<int>&arr){
	int j=0,i=0,k=0;
	while(k<arr.size()){
		if(arr[k]==0){
			cout<<"Swapping index "<<k<<" and index "<<i<<endl;
			swap(arr[k],arr[i]);
			cout<<"Swapping index "<<j<<" and index "<<k<<endl;
			swap(arr[j],arr[k]);
			i++;j++;k++;
		}else if(arr[k]==1){
			cout<<"Swapping index "<<k<<" and index "<<j<<endl;
			swap(arr[k],arr[j]);
			k++,j++;
		}else{
			k++;
		}
	}

}
void DNFsort(vector<int>&arr){
	int i=0,j=0,k=arr.size()-1;
	while(j<=k)	{
		if(arr[j]==0){
			cout<<"Swapping index "<<j<<" and index "<<i<<endl;
			swap(arr[i],arr[j]);
			j++,i++;
		}else if(arr[j]==1){
			j++;
		}else{
			cout<<"Swapping index "<<j<<" and index "<<k<<endl;
			swap(arr[k],arr[j]);
			k--;
		}
	}
}
int main(){
	int n;cin>>n;	
	vector<int>arr(n);
	for(int i=0;i<n;i++) cin>>arr[i];
	DNFsort(arr);
	for(auto it:arr)cout<<it<<endl; 
}