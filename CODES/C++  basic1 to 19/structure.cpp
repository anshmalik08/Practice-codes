#include <iostream>
using namespace std;
typedef struct employee
{
    int data;//4
    char type;//1
    float salary;//4
} ep;
// here epis thrown by typedef it is a shortcut ithelps only to
// not to write struct emplyee it can easy our work to do;
union money
{
    int rice; //4
    char car;//1
    float pounds;//4
};
int main()
{   
    // ep ansh;
    // union money a1;
    // a1.rice =3;
    // a1.car = 'A';
    // a1.pounds = 12.34;
    enum Meal{Breakfast, lunch , dinner};
    // Meal a1 = Breakfast;
    // cout<<a1;
    Meal m1 = lunch;
    // cout<<(m1==1);
    cout<<(m1==2);
    // cout<<Breakfast;
    // cout<<lunch; 
    // cout<<dinner;
    // struct employee ansh;
    // struct employee anshika;
    // ansh.data = 1;
    // ansh.type = 'c';
    // ansh.salary = 343242.34;
    // cout << "The value is" << ansh.data << endl;
    // cout << "The value is " << ansh.type << endl;
    // cout << "The value is " << ansh.salary << endl;
    return 0;
}