//Logic: sum of first n odd numbers will be equal to square of the n:

//High-level code:
#include <iostream>
using namespace std;
int main(){
    int n = 9; // number for calculating square root
    int i = 1; // iterating pointer
    int sum = 0;
    int x = 0;
    while(sum!=n){
        sum+=i;
        i+=2;
        x++;
    }
    cout<<x<<endl;
    return 0;
}

//RISC-V code:
addi x6,x0,121  # Number
addi x7,x0,1    # Iterating to odd number
addi x8,x0,0    # Calculate sum of all odd numbers till x7
addi x9,x0,0    # Answer

.loop:
beq x8,x6,.Exit
add x8,x8,x7
addi x7,x7,2
addi x9,x9,1
beq x0,x0,.loop

.Exit: