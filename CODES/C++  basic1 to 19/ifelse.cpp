#include <iostream>
using namespace std;
int main(){
    int age;
    cout<<"Tell me your age"<<endl;
    cin>>age;
    if (age<18)
    {
        cout<<"Youcan not come to my party"<<endl;
 
    }
    else if (age== 18){
        cout<<"Youa re a kid and you will get a kid pass to the party"<<endl;

    }    
   else{
    cout<<"you are come to the party"<<endl;
}
}