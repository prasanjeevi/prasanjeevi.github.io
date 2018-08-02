# How to run C program on Mac

## Program.c
```c
#include <stdio.h>

int main(void)    
{
  printf("Hello World!\n");
  return 0;
}
```

## Using clang
```
clang Program.c -o Program
./Program
Hello World!
```

## Using gcc
```
gcc Program.c -o Program
./Program
Hello World!
```