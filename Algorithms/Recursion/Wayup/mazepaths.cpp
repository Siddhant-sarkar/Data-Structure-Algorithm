#include <iostream>
using namespace std;

void printMazePaths(int sr, int sc, int dr, int dc, string psf){
    //Base case
    if(sr==dr && sc==dc){
        cout<<psf<<endl;
        return;
    }
    //Horizontal CASE
    if(sc+1<=dc){
        printMazePaths(sr,sc+1,dr,dc,psf+"h");
    }
    // vertical case
    if(sr+1<=dr){
        printMazePaths(sr+1,sc,dr,dc,psf+"v");
    }
    // diagonal case
    if(sr+1<=dr && sc+1<=dc){
        printMazePaths(sr+1,sc+1,dr,dc,psf+"d");
    }

}

int main(){
    int n;
    int m;
    cin >> n >> m;
    printMazePaths(0, 0, n - 1, m - 1, "");
}