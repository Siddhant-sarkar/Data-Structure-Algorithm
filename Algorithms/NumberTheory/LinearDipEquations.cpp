/*A Linear Diophantine Equation (in two variables) is an equation of the general form:

ax+by=c
where a, b, c are given integers, and x, y are unknown integers.

In this article, we consider several classical problems on these equations:

finding one solution
finding all solutions
finding the number of solutions and the solutions themselves in a given interval
finding a solution with minimum value of x+y
*/

#include"bits/stdc++.h"
using namespace std;

// The extended euclid algorithm is a single solution to the 
// Linear Diophantine Equations
//CASE 1: finding ONE SOLUTION
int findGcd(int a,int b,int& x,int& y){
	if(b==0){
		x=1;
		y=0;
		return a;
	} 
	int x1,y1;	
	int d=findGcd(b,a%b,x1,y1);
	x=y1;
	y=x1-(a/b)*y1;
	return d;
}
bool find_any_solution(int a,int b,int c,int& x,int& y,int& g){
	g=findGcd(a,b,x,y);
	if(c%g)
		return false;
	x=x*c/g;
	y=y*c/g;
	if(a<0) x*=-1;
	if(b<0) y*=-1;
	return true;
}
pair<int,int> find_a_solution(int a,int b,int c){
	int x,y,g;
	if(is_it_true(a,b,c,x,y,g))
		return make_pair(x,y);
	return make_pair(INT_MIN,INT_MAX);
}

/*From one solution (x0,y0), we can obtain all the solutions of the given equation.

Let g=gcd(a,b) and let x0,y0 be integers which satisfy the following:

a⋅x0+b⋅y0=c
Now, we should see that adding b/g to x0, and, at the same time subtracting a/g from y0 will not break the equality:

a⋅(x0+bg)+b⋅(y0−ag)=a⋅x0+b⋅y0+a⋅bg−b⋅ag=c
Obviously, this process can be repeated again, so all the numbers of the form:

x=x0+k⋅bg
y=y0−k⋅ag
are solutions of the given Diophantine equation.

Moreover, this is the set of all possible solutions of the given Diophantine equation.
*/
vector<pair<int,int>> find_all_solution(int a,int b,int c,int n){
	int g=gcd(a,b);
	vector<pair<int,int>> ar;
	pair<int,int>p=findAnswer(a,b,c);
	ar.push_back(p);
	for(int i=0;i<n;i++){
		p.first+=b/g;
		p.second-=a/g;
		ar.push_back(p);
	}
	return ar;
}


//CASE 3 :TO FIND THE MINIMUM VALUE OF X+Y 
/*Here, x and y also need to be given some restriction, otherwise, the answer may become negative infinity.

The idea is similar to previous section: We find any solution of the Diophantine equation, and then shift the solution to satisfy some conditions.

Finally, use the knowledge of the set of all solutions to find the minimum:

x′=x+k⋅bg,
y′=y−k⋅ag.
Note that x+y change as follows:

x′+y′=x+y+k⋅(bg−ag)=x+y+k⋅b−ag
If a<b, we need to select smallest possible value of k. If a>b, we need to select the largest possible value of k. If a=b, all solution will have the same sum x+y.
*/

int main(){
	std::boolalpha;
	vector<pair<int,int>>ar=find_all(4,10,10,10);
	// is_it_true(4,10,10,x,y,g);
	for(auto it: ar){
		cout<<it.first<<"   "<<it.second<<endl;
	}

}