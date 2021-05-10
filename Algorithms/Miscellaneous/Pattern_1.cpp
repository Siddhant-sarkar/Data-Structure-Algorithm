#include<iostream>
using namespace std;
int main(){
    int a,b;
    cout<<"PLease enter the numbers ----"<<endl;
    cin>>a>>b;
//THis is printing the rectangle star pattern
    cout<<"|||||||||||||||||||||||||||||||||"<<endl;
    for (int i=0;i<a;i++){
        for(int j=0;j<b;j++){
            cout<<"*";
        }
        cout<<endl;
    }
    cout<<"|||||||||||||||||||||||||||||||||"<<endl;
//THis is printing The hollow Rectangle
    for (size_t i = 0; i < a; i++)
    {
        for (size_t j = 0; j < b; j++)
        {
            if (i==0||i==a-1)
            {
                 cout<<"*";
            }else{
                if(j==0||j==b-1){
                    cout<<"*";
                }else{
                    cout<<" ";
                }
            }
        }
            cout<<endl;
    }
    cout<<"|||||||||||||||||||||||||||||||||"<<endl;
//THis is inverted half Pyramid
    for(int i=a;i>0;i--){
        for (size_t j= 0; j < i; j++)
        {
            cout<<"*";
        }
        cout<<endl;
    }    
    cout<<"|||||||||||||||||||||||||||||||||"<<endl;
//Rotating the aboove patter 180 degerees
    for(int i=0;i<=a;i++){
        for (size_t j = 0; j< 5-i; j++){
            cout<<" ";   
        }
        for (size_t k = 0; k < i; k++)
        {
            cout<<"*";
        }
        cout<<endl;
    }
    cout<<"|||||||||||||||||||||||||||||||||"<<endl;
//Now printing the triangle with row numbrs as entries
    for (size_t i = 1; i <= a; i++)
    {
        for (size_t j = 0; j < i; j++)
        {
            cout<<i;
        }
        cout<<endl;
    }
    cout<<"|||||||||||||||||||||||||||||||||"<<endl;
//Floyds Triangle
    int temp=1;
    for (size_t i = 1; i <= a; i++)
    {
        for (size_t j = 0; j < i; j++)
        {
            cout<<temp<<" ";
            temp++;
        }
        cout<<endl;
    }
    cout<<"|||||||||||||||||||||||||||||||||"<<endl;
//The butterfly Pattern
    const int Total_column{2*a};
    for (size_t i = 0; i <= a; i++)
    {   
        int col_number{0};
        for (size_t j = 0; j < i; j++)
        {
           cout<<"*";
           col_number++;
        }
        for (size_t k = 0; k <Total_column-2*col_number ; k++)
        {
            cout<<" ";
        }
        for (size_t j = 0; j < i; j++)
        {
            
           cout<<"*";
        }
        cout<<endl;
    }
    for (size_t i = a; i > 0; i--)
    {   
        int col_number{0};
        for (size_t j = i; j > 0; j--)
        {
           cout<<"*";
           col_number++;
        }
        for (size_t k = 0; k <Total_column-2*col_number ; k++)
        {
            cout<<" ";
        }
        for (size_t j = i; j > 0; j--)
        {
           cout<<"*";
        }
        cout<<endl;
    }
    cout<<"|||||||||||||||||||||||||||||||||"<<endl;
    return 0;
}