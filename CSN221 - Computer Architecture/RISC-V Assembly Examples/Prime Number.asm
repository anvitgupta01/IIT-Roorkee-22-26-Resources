//First : without offset :
addi x5,x0,5
addi x10,x0,2
addi x3,x0,1

.loop: 
add x9,x5,x0
bge x10,x5,.Exit

.look:
sub x9,x9,x10
blt x0,x9,.look

beq x0,x9,.looe
addi x10,x10,1
beq x0,x0,.loop

.looe:
add x3,x0,x0
beq x0,x0,.Exit

.Exit:

-----------------------------------------------------------------------------------------------------------------

//Second : with offset :
// Note that here the architecture does not support compressed instructions:
// That's why jump from line:6 to line:23, will involve offset = (23-6)*4

addi x5,x0,13
addi x10,x0,2
addi x3,x0,1
add x9,x5,x0
bge x10,x5,32
sub x9,x9,x10
blt x0,x9,-4
beq x0,x9,12
addi x10,x10,1
beq x0,x0,-24
add x3,x0,x0
beq x0,x0,4