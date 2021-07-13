#include<iostream>
#include<stack>
#include<vector>
using namespace std;

void findCelebrity(vector<string>&st){
    string t(st.size(),'0');
    for(int i=0;i<st.size();i++){
        if(st[i]==t){
            for(int j=0;j<st.size();j++){
                if(j!=i && st[j][i]!='1'){
                    cout<<"none\n";
                    return;
                }
            }
            cout<<i<<endl;
            return;
        }
    }
    cout<<"none\n";
}
// Another approach could be the fact the we have a stack with all the indices of th numbers put into the stack
// we can go ahead and pop two elements from the stack and we can check st[i][j] ==1 this means that the number i knows j
// This means the the elemnt i can't be the celebrity so we again push the element j into the stack
// and continue

// form the topmost element form the stack we check all the index of the number accpet the it pos 
// the all the index contains the number 1 ? then the st.top() is the celebrity : cout<<"nope\n";

int main(){
    int n;cin>>n;
    vector<string>st(n);
    for(auto &it:st) cin>>it;
    findCelebrity(st);
		
}