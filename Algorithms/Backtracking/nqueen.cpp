#include<iostream>
#include<vector>
using namespace std;

bool isSafe(vector<vector<int>>chess,int row,int col){
    // int l=chess.size();
    // for(int i=row-1,j=col;row>=0;i++) if(chess[i][j]) return false;
    // for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--) if(chess[i][j]) return false;
    // for(int i=row,j=col;i<l && j<l;i++,j++) if(chess[i][j]) return false;
    // return true;
    for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(chess[i][j] == 1){
                return false;
            }
        }

        for(int i = row - 1, j = col; i >= 0; i--){
            if(chess[i][j] == 1){
                return false;
            }
        }

        for(int i = row - 1, j = col + 1; i >= 0 && j < chess.size(); i--, j++){
            if(chess[i][j] == 1){
                return false;
            }
        }

        for(int i = row, j = col - 1; j >= 0; j--){
            if(chess[i][j] == 1){
                return false;
            }
        }

        return true;

}
void nqueen(vector<vector<int>>chess,int row,string s){
    if(row==chess.size()){
        s.append(".");
        cout<<s<<endl;
        return;
    }
    for(int col=0;col<chess.size();col++){
            if( chess[row][col]==0 && isSafe(chess,row,col)==true){
            chess[row][col]=1;
            nqueen(chess,row+1,s+to_string(row)+"-"+to_string(col)+", ");
            chess[row][col]=0;
        }
    }
}

int main(){
    int n;
    cin>>n;
    vector<vector<int>>chess(n,vector<int>(n,0));
    for(int i=0;i<n;i++) for(int j=0;j<n;j++) cin>>chess[i][j];
    nqueen(chess,0,"");
    return 0;
}