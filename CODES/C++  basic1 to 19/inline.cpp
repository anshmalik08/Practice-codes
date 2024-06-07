#include <iostream>
using namespace std;
inline int product(int a , int b){
// int product(int a, int b){
//     static int c =0;// this execute only
//     c =c +1;// Next time this functionis run , the value of c will be retained
//     // Not recommended for to use below lines with inline functions
    return a*b;
}


// int a , b;
// cout<<"Enter the value of a and b";
// cin>>a>>b;

// // cout<<"The product of a and b is"<<product(a,b)<<endl;;
// // cout<<"The product of a and b is"<<product(a,b)<<endl;;
// // cout<<"The product of a and b is"<<product(a,b)<<endl;;
// // cout<<"The product of a and b is"<<product(a,b)<<endl;;
// // cout<<"The product of a and b is"<<product(a,b)<<endl;;
// // cout<<"The product of a and b is"<<product(a,b)<<endl;;
// // cout<<"The product of a and b is"<<product(a,b)<<endl;;
// // cout<<"The product of a and b is"<<product(a,b)<<endl;;

//     return 0;
// }
float moneyReceived(int currentMoney, float factor=1.04){
    return currentMoney * factor;
}

int main(){
    int money = 100000;
    cout<<"If you have "<<money<<" Rs in your bank account, you will recive "<<moneyReceived(money)<< "Rs after 1 year"<<endl;
    cout<<"For VIP: If you have "<<money<<" Rs in your bank account, you will recive "<<moneyReceived(money, 1.1)<< " Rs after 1 year";
    return 0;
}