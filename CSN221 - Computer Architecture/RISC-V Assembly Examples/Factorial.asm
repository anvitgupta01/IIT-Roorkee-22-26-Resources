// high level code:
#include <iostream>
using namespace std;

int main(){
    int u = 6;
    int g = 1;
    int f = 1;
    while(f<=u){
        // g*=f
        int y = 0;
        int i=0;
        while(i<f){
            y+=g;
            i++;
        }
        g = y;
        f++;
    }
    cout<<g<<endl;
    return 0;
}



// RISC-V code:

addi x6,x0,5
addi x7,x0,1   
addi x8,x0,1   

.loop:
blt x6,x8,.Exit
addi x9,x0,0  
addi x10,x0,0
beq x0,x0,.loop2

.loop2:

bge x10,x8,.L2
add x9,x9,x7
addi x10,x10,1
beq x0,x0,.loop2

.L2:
add x7,x0,x9
addi x8,x8,1
beq x0,x0,.loop

.Exit: