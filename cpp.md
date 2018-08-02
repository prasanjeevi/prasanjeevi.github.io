# How to run C++ program on Mac

## Program.cpp
```cpp
#include <iostream>

int main()
{
    std::cout << "Hello World!\n";
    return 0;
}
```

## Using clang
```
clang -lstdc++ Program.cpp -o Program
./Program
Hello World!
```

## Using gcc
```
gcc -lstdc++ Program.cpp -o Program
./Program
Hello World!
```

# C++ vs Visual C++
* C++ is a general-purpose programming language
* Visual C++, on the other hand, is not a programming language at all. It is an integrated development environment (IDE) product from Microsoft for the C, C++, and C++/CLI programming languages