//First : without offset:
addi x3,x0,70
addi x4,x0,21
add x10,x0,x0
add x6,x0,x0

.loop:
bge x10,x4,.Exit
add x6,x6,x3
addi x10,x10,1
beq x0,x0,.loop

.Exit:

------------------------------------------------------------------------------------------

// Second : with offset:
addi x3,x0,70
addi x4,x0,21
add x10,x0,x0
add x6,x0,x0
bge x10,x4,16
add x6,x6,x3
addi x10,x10,1
beq x0,x0,-12

