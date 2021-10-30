#include<iostream>
using namespace std;

class Solution {
    int find(vector<int> &union_find, int index){
        while(union_find[index]!=index)
            index = union_find[index];
        return index;
    }
public:
    vector<vector<string>> accountsMerge(vector<vector<string>>& accounts) {
        unordered_map<string, int> A;
        unordered_map<int, vector<string>> ret;
        int m = accounts.size();
        vector<int> union_find(m, 0);
        for(int i=0; i<m; i++)
        {
            union_find[i] = i;
            for(int j=1;j <accounts[i].size(); j++)
            {
                if(A.find(accounts[i][j])!=A.end())
                {
                    int root1 = find(union_find, i);
                    int root2 = find(union_find, A[accounts[i][j]]);
                    union_find[root1] = root2;
                }
                else
                    A[accounts[i][j]] = union_find[i];
            }
        }
        for(int i: union_find){
            cout<<i<<"  ";
        }cout<<endl;
        for(auto i:A)
        {
            int index = find(union_find, i.second); //find ultimate parent index
            ret[index].push_back(i.first); //fill ret by pushing back email in its parent's index
        }
        vector<vector<string>> res;
        for(auto it:ret)
        {
            vector<string> email = it.second;
            sort(email.begin(), email.end());
            email.insert(email.begin(), accounts[it.first][0]);
            res.push_back(email);
        }
        return res;
    }
};
int main(){
	cout<<"HEllow World\n"<<endl;
	return 0;
}