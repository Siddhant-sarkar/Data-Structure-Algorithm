#include<iostream>
using namespace std;

int cs(int n,int arr[]){
	if(n==0){
		return 1;
	}else if(arr[n]!=0) return arr[n];
	int f1=0,f2=0,f3=0;
	if(n-1>=0)  f1=cs(n-1,arr);
	if(n-2>=0) f2=cs(n-2,arr);
	if(n-3>=0) f3=cs(n-3,arr);
	arr[n]=f1+f2+f3;
	return f1+f2+f3;
}
int coutnPathsTab(int n){
	int arr[n+1]{0};
	arr[0]=1;
	for(int i=1;i<=n;i++){
		if(i==1) arr[i]=arr[i-1];
		else if(i==2) arr[i]=arr[i-1]+ arr[i-2];
		else arr[i]= arr[i-1]+arr[i-2]+arr[i-3];
	}
	return arr[n];
}
int main(){
	int n;	
	cin>>n;
	int arr[n+1]{0};
	cout<<cs(n,arr)<<endl;
	cout<<coutnPathsTab(n)<<endl;
	return 0;
}