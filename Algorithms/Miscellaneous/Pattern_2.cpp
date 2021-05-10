#include<iostream>
using namespace std;

int replace_number(int n);



int main(){
    int a,b;
    cout<<"PLease enter the numbers ----"<<endl;
    cin>>a>>b;
    a=9;

    cout<<"|||||||||||||||||||||"<<endl; 
        for (size_t i = a; i > 0; i--)
        {
            int temp=1;
            for (size_t j = 0; j < i; j++)
            {
                cout<<temp;
                temp++;
            }
            cout<<endl;
        } 
    cout<<"|||||||||||||||||||||"<<endl;
    int temp;
        for (size_t i = 1; i <= a; i++)
        {
            if (i%2!=0){
                temp=0;
            }else{
                temp=1;
            }
            for (size_t j = 0; j < i; j++)
            {
                if (temp==1)
                {
                    temp=0;
                }else
                {
                    temp=1;
                }
                cout<<temp;            
            }
            cout<<endl;
        }
    cout<<"|||||||||||||||||||||"<<endl;   
//For Printing  Rohmbus
    for (size_t i = 1; i <= a; i++)
    {
        for (size_t j = 1; j <=a-i  ; j++)
        {
            cout<<" ";
        }
        for (size_t k = 0; k < a; k++)
        {
            cout<<"* ";
        }
        cout<<endl;
    }
    cout<<"|||||||||||||||||||||"<<endl;
//FOr printing numbered equilateral Triangle
    for (size_t i = 1; i <= a; i++)
    {
        int temp=1;
        for (size_t j = 1; j <= a-i; j++)
        {
            cout<<" ";
        }
        for (size_t k = 1; k <= i; k++)
        {
            cout<<temp;
            temp++;
        }
        cout<<endl;
    }
    cout<<"|||||||||||||||||||||"<<endl;
//For printing Palindromic pattern
    for (size_t i = 1; i <= a; i++)
    {
        int temp=i;
        int temo=2;
        for (size_t j = 1; j <=a-i; j++)
        {
            cout<<"  ";
        }
        for (size_t k = 1; k <= a; k++)
        {
            if(temp<1){
                break;
            }
            cout<<temp<<" ";
            temp--;
        }
        for (size_t l = 1; l <= i-1; l++)
        {
            cout<<temo<<" ";
            temo++;
        }
        cout<<endl;
    }
    cout<<"|||||||||||||||||||||"<<endl;
//The Diamond pattern 
    for (size_t i = 1; i <= a; i++)
    {
        
        for (size_t j = 1; j <=a-i; j++)
        {
            cout<<"  ";
        }
        for (size_t K = 1; K <=i ; K++)
        {
            cout<<"* ";
        }
        
        for (size_t l = 1; l < i; l++)
        {
            if(l==i){
                break;
            }
            cout<<"* ";
        }
        
        cout<<endl;
    }
    for (size_t i = a; i >= 1; i--)
    {
        
        for (size_t j = a-i; j >=1; j--)
        {
            cout<<"  ";
        }
        for (size_t K = i; K >=1 ; K--)
        {
            cout<<"* ";
        }
        
        for (size_t l = i; l > 1; l--)
        {
            cout<<"* ";
        }
        
        cout<<endl;
    }
    cout<<"|||||||||||||||||||||"<<endl;
//now printing the zigzag pattern
    for(int i =1;i<=3;i++){
        if(i==1){
            int temp=3;
            for (size_t l = 1; l <= 9; l++)
            {
                if(temp==l){
                    cout<<"*";
                    temp+=4;
                }else{
                    cout<<" ";
                }
            }
            
        }
         else if (i==2)
        {
            for (size_t j = 1; j <=a; j++)
            {
                if (j%2==0)
                {
                    cout<<"*";
                }else if(j%2!=0)
                {
                    cout<<" ";
                }
            }
            
        }
        else if(i==3){
            int temp=1;
            for (size_t k = 1; k <=a; k++)
            {
                if (temp==k)
                {
                    cout<<"*";
                    temp+=4;
                }else{
                    cout<<" ";
                }
                
            }
            
        }
        cout<<endl;
        
    }
}

