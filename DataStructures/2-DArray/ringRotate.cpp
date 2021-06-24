#include<iostream>
#include<vector>
#include<deque>
using namespace std;
#define beb(x,y) cout<<x<<"	"<<y<<endl;

void print(vector<vector<int>> arr){
	for(auto it:arr){
		for(auto iit: it){
			cout<<iit<<"	";
		}
		cout<<endl;
	}
}
vector<vector<int>> get(int r,int c){
	vector<vector<int>> arr;
		for(int i=0;i<r;i++){
			vector<int>ar;
			int t;
			for(int j=0;j<c;j++){
				cin>>t;
				ar.push_back(t);
			} 
			arr.push_back(ar);
		}
	return arr;
}
deque<int> getShell(vector<vector<int>>&arr,int n,int a,int b){
	deque<int> dq;
	int rmin=n-1,cmin=n-1,rmax=a-n,cmax=b-n,ct=0;
	int rs=b-2*(n-1);
	int cs=a-2*(n-1);
	int tt=2*(rs+cs)-4;
	if(rmin==rmax) tt--;
	for(int i=rmin,j=cmin;i<=rmax && ct<tt;i++) {dq.push_back(arr[i][j]);ct++;}
	for(int i=rmax,j=cmin+1;j<=cmax && ct<tt;j++) {dq.push_back(arr[i][j]);ct++;}
	for(int i=rmax-1,j=cmax;i>=rmin && ct<tt;i--) {dq.push_back(arr[i][j]);ct++;}
	for(int i=rmin,j=cmax-1;j>=cmin && ct<tt;j--) {dq.push_back(arr[i][j]);ct++;}
	return dq;
}
void setShell(vector<vector<int>>&arr,deque<int>dq,int n,int a,int b){
	int rmin=n-1,cmin=n-1,rmax=a-n,cmax=b-n,ct=0;
	int rs=b-2*(n-1);
	int cs=a-2*(n-1);
	int tt=2*(rs+cs)-4;
	if(rmin==rmax) tt--;
	for(int i=rmin,j=cmin;i<=rmax && ct<tt;i++) {arr[i][j]=dq.front();ct++;dq.pop_front();}
	for(int i=rmax,j=cmin+1;j<=cmax && ct<tt;j++) {arr[i][j]=dq.front();ct++;dq.pop_front();}
	for(int i=rmax-1,j=cmax;i>=rmin && ct<tt;i--){arr[i][j]=dq.front();ct++;dq.pop_front();}
	for(int i=rmin,j=cmax-1;j>=cmin && ct<tt;j--) {arr[i][j]=dq.front();ct++;dq.pop_front();}
}
void rotate(vector<vector<int>> &arr,int r,int n){
	deque<int>dq=getShell(arr,r,arr.size(),arr[0].size());
	if(n<0) n+=dq.size();
	n%=dq.size();
	while(n--){
		dq.push_front(dq.back());
		dq.pop_back();
	}

	setShell(arr,dq,r,arr.size(),arr[0].size());

}
int main(){
	int r,c;
	cin>>r>>c;
	vector<vector<int>> arr=get(r,c);
	int a,b;
	cin>>a>>b;
	rotate(arr,a,b);
	print(arr);

}