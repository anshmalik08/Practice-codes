#include<iostream>
using namespace std;
int c =45;
int main(){
    // ******************Build in Data Types************

    // int a , b , c;
    // cout<<"Enter the value of a is :"<<endl;
    // cin>>a;
    // cout<<"Enter the value of b is :"<<endl;
    // cin>>b;
    // c = a + b;
    // cout<<"The sum of value of a and b is"<<c;
    // cout<<"The global c is "<<::c<<endl;
    //**********************Float, doulbe and Literals**************** 

    // float d = 34.4f;
    // long double e =34.4l;
    // cout<<"The size of 34.4  is"<<sizeof(34.4)<<endl;
    // cout<<"The size of 34.4f is "<<sizeof(34.4f)<<endl;
    // cout<<"The size of 34.4F is "<<sizeof(34.4F)<<endl;
    // cout<<"The size of 34.4l is "<<sizeof(34.4l)<<endl;
    // cout<<"The size of 34.4L is "<<sizeof(34.4L)<<endl;
    // cout<<"The value of d is "<<d<<endl<<"The value of e is"<<e;
    // return 0;
    //********************Refrence Variables*****************
    // // Rohan----> Monty------>Dangerous Coder
    // float x = 455;
    // float & y = x;
    // cout<<x<<endl;
    // cout<<y<<endl;

    //***********************Typecasting*************************
    int a =45;
    float b = 45.45;
    cout<<"The value of a is "<<(float)a<<endl;
    cout<<"The value of b is "<<(int)b<<endl;;

    cout<<"The value of b is "<<(int)b<<endl;
    cout<<"The value of b is "<<int(b)<<endl;
    int c =int(b);

    cout<<"The expression is "<<a + b <<endl;
    cout<<"THe expression is "<<a +int(b)<<endl;
    cout<<"The expression is "<<a + int(b)<<endl;


    
}