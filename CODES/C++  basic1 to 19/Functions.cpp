#include <iostream>
using namespace std;
// Function Prototype
// type function-name (arguments);
// int sum(int a, int b);//__>Accepatable
// int sum(int a, b);//-->Not Accepatble
// int sum(inta , int)//--> Accepatabe
int sum(int a, int b);
void g();
int main()
{
    int nim1, nim2;
    cout << "Enter  first number " << endl;
    cin >> nim1;
    cout << "Enter  second number" << endl;
    cin >> nim2;
    // nim1 and nim2 are actual parameters
    cout << "The sum is :" << sum(nim1, nim2) << endl;
    ;
    //  void g(void);
    g();
    return 0;
}
int sum(int a, int b)
{
    // Formal Parameters a and b will be taking values from actual
    // parameter num 1 and num2
    int c = a + b;
    return c;
}
void g()
{
    cout << "Hello , Good Morning\n";
}
