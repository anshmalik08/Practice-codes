#include <iostream>
using namespace std;
class Employee
{
    int id;
    static int count;
    ;

public:
    void setData(void)
    {
        cout << "Enter the id" << endl;
        cin >> id;
        count++;
    }
    void getData(void)
    {
        cout << "The id of this emplyee is " << id << "This is emplyee number" << count << endl;
        cin >> id;
    }
    static void getCount(void)
    {   //cout<<id;// throws an error 
        cout << "The value of count is " << count << endl;
    }
};
int Employee ::count; // Default value is zero
int main()
{
    Employee ansh, anshika, rohan;
    // Count is the static data member of class employee
    // Ansh.id = 1;

    // return 0;ansh.count=1; // cannot do this as id and count are private
    ansh.setData();
    ansh.getData();
    Employee::getCount();

    anshika.getData();
    anshika.getData();
    Employee::getCount();

    rohan.getData();
    rohan.getData();
    Employee::getCount();
}