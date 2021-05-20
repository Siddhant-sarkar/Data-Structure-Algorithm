#include"bits/stdc++.h"
using namespace std;

/*	An efficient solution is to deal with circular arrays using the same array.
	If a careful observation is run through the array, then after n-th index,
	the next index always starts from 0 so using the mod operator, 
	we can easily access the elements of the circular list,
	if we use (i)%n and run the loop from i-th index to n+i-th index. 
	and apply mod we can do the traversal in a circular array within the 
	given array without using any extra space. 
*/
void traversal(int ar[],int id,int n){
	for(int i=id;i<n+id;i++){
		cout<<ar[i%n]<<"  ";
	}
}


int main(){
	#ifndef ONLINE_JUDGE
	freopen("inputf.in", "r", stdin);
	freopen("outputf.in", "w", stdout);
	freopen("errorf.in", "w", stderr);
	#endif 

	/*One way of declaring the circular array is by using 
	the double sized array and traversing the array from the 
	given index to the nth index*/


	int arr[10]={1,2,3,4,5,6,7,8,9,10};
	int carr[20]={1,2,3,4,5,6,7,8,9,10,
					1,2,3,4,5,6,7,8,9,10};

	traversal(arr,3,10);

	return 0;
}