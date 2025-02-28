// high level code:
#include <iostream>
using namespace std;
int main(){
    int n = 459;
    int m = 6;
    int x = 0,y = n;
    while(y>0){
        y = y - m;
        x++;
    }
    if(y<0){
        cout<<"Quotient = "<<x-1<<endl;
        cout<<"Remainder = "<< y+m<<endl;
    }
    else{
        cout<<"Quotient = "<<x<<endl;
        cout<<"Remainder = "<<0<<endl;
    }
    return 0;
}

//RISC-V code:
addi x11,x0,458
addi x4,x0,6
addi x9,x0,0  # x9 is used for quotient

add x10,x11,x0  # x10 is used for remainder

.loop:
bge x0,x10,.Sel
sub x10,x10,x4
addi x9,x9,1
beq x0,x0,.loop

.Sel:
blt x10,x0,.L1
beq x0,x0,.L2

.L1:
addi x9,x9,-1
add x10,x10,x4
beq x0,x0,.Exit

.L2:
add x10,x0,x0
beq x0,x0,.Exit

.Exit: