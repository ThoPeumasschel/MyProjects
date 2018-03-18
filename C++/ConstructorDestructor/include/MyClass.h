#include <iostream>
using namespace std;

/*#ifndef MYCLASS_H
#define MYCLASS_H   */


class MyClass
{
    public:
        MyClass();
        ~MyClass();

};

MyClass::MyClass()
{
    cout<<"Destructor"<<endl;
}
MyClass::~MyClass()
{
    cout<<"Destructor"<<endl;
}

int main() {
    MyClass obj;
}
