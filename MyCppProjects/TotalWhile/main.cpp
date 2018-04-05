#include <iostream>

using namespace std;

int main()
{
    int zaehler = 1;
    int Eingabe ;
    int totalErgebnis = 0;

    while (zaehler <= 5) {
        cin >> Eingabe;
        totalErgebnis += Eingabe;
        zaehler++;
    }
    cout << totalErgebnis << endl;
    return 0;
}
