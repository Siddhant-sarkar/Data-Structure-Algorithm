#include<bits/stdc++.h>
using namespace std;

void printArray(vector<int>a){
	for(auto it : a) cout<<it<<"  ";
	cout<<"\n";
}


/**
 * this is selection sort whose time complexity is 
 * O(n^2)
 */
vector<int> selection_sort(vector<int> &a){
	int m=100000000;
	for(int i=0;i<a.size();i++){
		for(int j=i+1;j<a.size();j++){
			if(a[j]<a[i]){
				swap(a[j],a[i]);
			}
		}
		
	}
	return a;
}

/**
 * Thsi si bubble sort we keep on swaping the elements till
 * all are arranged [a{l}<=a[r]]
 * @return reutrns the sorted vector
 * 
 */
vector<int> bubble_sort(vector<int>&a){
	for(int i=a.size()-1;i>=0;i--){
		int b=0;
		while(b!=i){
			if(a[b]>a[b+1]) swap(a[b],a[b+1]);
			b++;
		}
	}
	return a;

}

vector<int> insertion_sort(vector<int> &a){
	for(int i=1;i<a.size();i++){
		int c=a[i];
		int t=i-1;
		while(a[t]>c&&t>=0){
			a[t+1]=a[t];
			t--;
		}
		a[t+1]=c;
	}
	return a;
}


int main(){
	vector<int> a={2,5,4,7,6,8,9,0,8,10};
	freopen("err.txt","w",stderr);
	// selection_sort(a);
	// bubble_sort(a);
	insertion_sort(a);
	printArray(a);
	cerr<<"time taken : "<<((float)clock()/CLOCKS_PER_SEC)*1000<<" msecs"<<endl;

}

