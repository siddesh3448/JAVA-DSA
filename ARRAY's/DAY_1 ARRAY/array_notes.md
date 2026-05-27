📘 ARRAY IN JAVA

✅ Definition:- An array is a collection of elements of the same data type, stored in contiguous memory locations.


Contiguous Memory Locations:- Contiguous memory allocation is an operating system technique where each running process is assigned a single, 
                              unbroken block of adjacent memory addresses

👉 It allows you to store multiple values in a single variable.

🔹 Example:- int[] arr = {10, 20, 30, 40};


⭐ Features of Array:-  Fixed size (cannot change after creation)
                        Stores same data type elements
                        Indexed (starts from 0)
                        Fast access using index
                        Stored in continuous memory

📂 Types of Arrays:-

1. Single Dimensional Array
int[] arr = new int[5];

2. Multi-Dimensional Array
2D Array (matrix)
int[][] arr = new int[3][3];

🧠 Big Picture First

In Java:

Stack → stores references (addresses) + local variables
Heap → stores actual objects (like arrays)

👉 Arrays are always stored in HEAP memory

📦 Example
int[] arr = new int[3];
🔍 What actually happens in memory
1. Stack (method memory)
arr → 0x100  (reference / address)

👉 Stack only stores:

variable name (arr)
address of array
2. Heap (actual data)
Address 0x100:

[0] → 0
[1] → 0
[2] → 0

👉 Heap stores:

actual array elements
🔄 Step-by-step flow
int[] arr = new int[3];
Step 1

👉 int[] arr
→ variable created in stack

Step 2

👉 new int[3]
→ memory allocated in heap

Step 3

👉 reference assigned
→ stack variable points to heap memory

🎯 Important Rule

👉 Array variable = reference (stack)
👉 Array data = object (heap)

🔹 Another Example
int[] a = {10, 20, 30};
int[] b = a;
Memory
Stack
a → 0x200
b → 0x200
Heap
0x200:
[10, 20, 30]

👉 Both a and b point to same array

⚠️ Effect
b[0] = 99;

👉 Now array becomes:

[99, 20, 30]

👉 Change reflects in a also