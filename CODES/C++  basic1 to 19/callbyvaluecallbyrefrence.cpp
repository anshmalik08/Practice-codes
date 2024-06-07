#include <iostream>
using namespace std;
// int sum(int a, int b)
// {
//     int c = a + b;
//     return c;
// }
// int swap(int a, int b)
// //
// {

//     int temp;
//     temp = a; // temp a b
//     a = b;    // 4  4   5
//     b= temp;// 4 5 5
//     //4    5   4
// }
//  call by refernce using C++ pointer Variables
// void swapa(int *a, int *b)
// {
//     int temp = *a; // temp a b
//     *a = *b;       // 4  4   5
//     *b = temp;     // 4 5 5
//     // 4    5   4
// }
// Call by refrence using C++ Refrence Variables
void swapRefrenceVar(int &a, int &b)
{
    int temp = a;
    a = b;
    b = temp;
}
int main()
{
    int x = 4, y = 5;
    cout << "Enter the the value of  a " << x << "and the value of b is " << y << endl;

    // swap(x, y); This will not Swap a and b
    // swapa(&x, &y);This will swap a and b using Pointer Refrence
    // swapRefrenceVar(x , y);This will swap a and b using refrence variables
    cout << "Enter the the value of  a " << x << "and the value of b is " << y << endl;

    // cout<<"The sumof 4 and9 is"<<sum(4,5);
    return 0;
}