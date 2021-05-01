#include<iostream>
using namespace std;


//This is binary search
//this is the iterative approach
void binaySearch(int *a,int n,int k){
	int s=0,e=n-1;
	while(s<=e){
		int m=(s+e)/2;
		if(a[m]==k){
			cout<<"the number is there is the list\n";
			return;
		}else if(a[m]>k){
			s=0;
			e=m-1;
		}else{
			s=m+1;
			e=e;
		}
	}
}

//this is the recursive method to implement the binary serach
void binarySearch(int* a,int s,int e,int k){
	if(s>=e){
		int m=(s+e)/2;
	if(a[m]==k){
		cout<<"Yep found that\n";
	}else if(a[m]>k) binarySearch(a,s,m-1,k);
	else binarySearch(a,m+1,e,k);
	}
	return;
}

int main(){
	int* a=new int(10),b=10;

	for(int j=0;j<10;j++){
		cin>>a[j];
	}

	// cin number to find
	int k;
	cin>>k;

	// this is linear search
	for(int i=0;i<10;i++){
		if(a[i]==k){
			cout<<k<<" Found at the position "<<++i<<endl;
			break;
		}
	}

	//This is binary search
	binaySearch(a,10,99);
	binarySearch(a,0,9,99);
	
	return 0;
}