#include <iostream>
using namespace std;
int main(){
    int a =4, b =5;
    cout<<"Operatorsin C++"<<endl;
    // Arithemetic operators
    cout<<"The value of a + b is "<<a+b<<endl;
    cout<<"The value of a - b is "<<a-b<<endl;
    cout<<"The value of a * b is "<<a*b<<endl;
    cout<<"The value of a / b is "<<a/b<<endl;
    cout<<"The value of a % b is "<<a%b<<endl;
    cout<<"The value of a++ is "<<a++<<endl;
    cout<<"The value of a-- is "<<a--<<endl;
    cout<<"The value of ++a is "<<++a<<endl;
    cout<<"The value of --a is "<<--a<<endl;
    cout<<endl;

    // Comparison Operators
    cout<<"Following are the comparison operators in C++"<<endl;
    cout<<"The value of a == b is"<<(a==b)<<endl;
    cout<<"The value of a != b is"<<(a!=b)<<endl;
    cout<<"The value of a >= b is"<<(a>=b)<<endl;
    cout<<"The value of a <= b is"<<(a<=b)<<endl;
    cout<<"The value of a > b is"<<(a>b)<<endl;
    cout<<"The value of a < b is"<<(a<b)<<endl;
    cout<<endl;

    // Logical Operators
    cout<<"Following are the logical operators in C++ "<<endl;
    cout<<"The value of this logical and operator ((a==b) && (a<b)) is :"<<((a==b) && (a<b))<<endl;
    cout<<"The value of this logical and operator ((a==b) || (a<b)) is :"<<((a||b) && (a<b))<<endl;
    cout<<"The value of this logical and operator (!(a==b)) is :"<<(!(a||b))<<endl;
    
}   