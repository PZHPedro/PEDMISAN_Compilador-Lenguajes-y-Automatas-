#include <iostream>
#include <string>
#include <cstring>
using namespace std;
int main(){
float Y ;
bool Z = false;
Y= 0 ;
float A ;
float B ;
float C ;
float D ;
float I = 0 ;
cout << "Ingresa un digito" << endl;
cin >> A;
cout << "Ingresa un digito" << endl;
cin >> B;
cout << "Ingresa un digito" << endl;
cin >> C;
cout << "Ingresa un digito" << endl;
cin >> D;
while (true) {
Z= false;
if ( A < B  ){
Y= A ;
A= B ;
B= Y ;
Z= true ;
}
if ( B < C  ){
Y= B ;
B= C ;
C= Y ;
Z= true ;
}
if ( C < D  ){
Y= C ;
C= D ;
D= Y ;
Z= true ;
}
if ( Z == false ){
break;
}
for(I = I; I < 10; I = I + 1) {
}
}
cout << A << " " << B << " " << C << " " << D << endl;
cout << endl << "Ejecucion Finalizada";
system("pause");
return 0;
}