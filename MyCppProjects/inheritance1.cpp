#include <iostream>
using namespace std;

class Mother
{
	public:
		Mother() {};
		void sayHi() {
			cout << "\nHi\n";
		}
};

class Daughter: public Mother
{
	public:
		Daughter() {};
};

int main() {
	Mother m;
	m.sayHi();
	Daughter d;
	d.sayHi();
}



