#include <iostream>
using namespace std;
int fib(int n){
    if(n<2){
        return 1;
    }
    return fib(n-2) + fib(n-1);

}
int factorial(int n) 
{
    if (n <= 1)
    {
        return 1;
    }
    return n * factorial(n-1);
}
// *********StepBy Step Calculation of Factorial
// factorial(4) = 4 * factorial(3);
// factorial(4) = 4 * 3 *factorial(2);
// factorial(4) = 4 * 3 * 2 *factorial(1);
// factorial(4) = 4 *  *2 * 1;
int main()
{
    // Factorial of a number :
    //6! = 6*5*4*3*2*1 = 720
    // 0! = 1 by defination
    // 1! = 1 by defination
    // // n! = n * (n-1)!
    // int a;
    // cout << "Enter the number" << endl;
    // cin >> a;
    // cout << "The factorial of " << a << "is"<<factorial(a)<<endl; 
    // return 0;
    // <--************Fibonaaci series***********-->
    //fib(5)
    // fib(4 + fib(3)
    // fib(2) + fib(3) + fib(2) + fib (3)
    int a;
    cout<<"Enter the number"<<endl;
    cin>>a;
    cout<<"The fibonacci sequence at postion of "<<a<<"is"<<fib(a)<<endl;

}