#incluce<iostream>
using namespace std;
double cube(double n){
	return n*n*n;
}
int main(){
	double n;
	cout<<"Enter a number\n";
	cin>>n;
	cout<<cube(n)<<endl;
	return 0;
}