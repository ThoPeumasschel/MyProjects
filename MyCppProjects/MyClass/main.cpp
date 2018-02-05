#include <iostream>
#include "MyClass.h"
using namespace std;


MyClass::MyClass() {

}

void MyClass::myPrint() {
	cout << "Hello" <<endl;

}

int main() {
	MyClass obj;
//	obj.myPrint();
	MyClass *ptr = &obj;
	ptr->myPrint();

}
