#include"bits/stdc++.h"
using namespace std;

int main(){
	/*
		DECLARATION:
		tuple<obj_one,obj_two.......obj_nth> tuple_name=make_tupe{};
		tuple<obj_one,obj_two.......obj_nth> tuple_name={value1,value2,value3......value_n};
	*/	
	tuple<int,int,int> temp = make_tuple(1,2,3);
	tuple<int,int,string> tuple2 ={1,2,"This is a tuple"};

	/*
		ACCESS:
		get<0>(tuple_name);
		 ---- ... ----
		or we can use the structured binding declaration 
		auto [a,b,c,d] =  tuple_name;
	*/
	auto it = get<0>(temp);
	// auto& [a,b,c] = tuple2;
	// cout<<a<<b<<c<<endl;

	/*	
		This is a sample code introduction where we use the structured binding notions;
		DisjointSet dsu(MAX);
		vector<tuple<int, int, int>> edges;

		sort(edges.begin(), edges.end());
		for (auto e : edges) {
			auto [w, u, v] = e;
			if (dsu.merge(u, v))  // create new MST edge
		}
	*/

	int a= 10,b=20; string s = "This is not so dope";
	tie(a,b,s) = tuple2;
	auto [al,bl,cl] = tuple2;
	cout<<al<<"  "<<bl<<cl<<endl;

}