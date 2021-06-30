#include<iostream>
#include<vector>
#include<cmath>
using namespace std;

void print(vector<vector<int>>chess){
    for(auto it: chess){
        for(auto iit:it){
            cout<<iit<<" ";
        }
        cout<<endl;
    }
}

void printKnightsTour(vector<vector<int>>chess, int r, int c, int upcomingMove) {
    int l=chess.size();
    if(r<0 || c<0 || r>=l || c>=l || chess[r][c]!=0){
        return;
    }
    else if(upcomingMove==l*l){
        chess[r][c]=upcomingMove; 
        print(chess);
        chess[r][c]=0;
        cout<<endl;
        return;
    }
        chess[r][c]=upcomingMove; 
        printKnightsTour(chess, r - 2, c + 1, upcomingMove + 1);
        printKnightsTour(chess, r - 1, c + 2 , upcomingMove + 1);
        printKnightsTour(chess, r + 1, c + 2 , upcomingMove + 1);
        printKnightsTour(chess, r + 2, c + 1 , upcomingMove + 1);
        printKnightsTour(chess, r + 2, c - 1 , upcomingMove + 1);
        printKnightsTour(chess, r + 1, c - 2 , upcomingMove + 1);
        printKnightsTour(chess, r - 1, c - 2 , upcomingMove + 1);
        printKnightsTour(chess, r - 2, c - 1 , upcomingMove + 1);
        chess[r][c]=0;
        return;
}


int main(){
   int n,a,b;
   cin>>n>>a>>b;
   vector<vector<int>>chess(n,vector<int>(n,0));
   // print(chess);
   printKnightsTour(chess,a,b,1);


}