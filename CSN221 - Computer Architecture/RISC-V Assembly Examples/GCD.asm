// High-level code:
#include <iostream>
using namespace std;
int main(){
    int a = 90;
    int b = 80;
    int y,x;
    if(b>=a){
        y = b;
        x = a;
    }
    else{
        y = a;
        x = b;
    }
    while(x){
        int c = y%x;
        y = x;
        x = c;
    }
    cout<<y<<endl;
    return 0;
}


---------------------------------------------------------------------------------------------------------

//High-level basic code:
#include <iostream>
using namespace std;
int main(){
    int a = 90;
    int b = 80;
    int y,x;
    if(b>=a){
        y = b;
        x = a;
    }
    else{
        y = a;
        x = b;
    }
    while(x){
        // int c = y%x;
        int c=y;
        while(c>=x){
            c-=x;
        }
        y = x;
        x = c;
    }
    cout<<y<<endl;
    return 0;
}

------------------------------------------------------------------------------------------------------------

//RISC-V code:
addi x5,x0,90      # a
addi x6,x0,80      # b
bge x6,x5,.L2      # if b>=a
beq x0,x0,.L3      # else

.loop:
beq x0,x10,.Exit
add x11,x0,x9

.loop2:
blt x11,x10,.L4
sub x11,x11,x10
beq x0,x0,.loop2

.L3:
add x9,x0,x5           # x9 = y
add x10,x0,x6          # x10 = x
beq x0,x0,.loop

.L2:
add x9,x0,x6
add x10,x0,x5
beq x0,x0,.loop

.L4:
add x9,x10,x0
add x10,x11,x0
beq x0,x0,.loop

.Exit:

