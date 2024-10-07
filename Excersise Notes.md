Programming Languages and Principles Implementation: Java
Raisa Begum

Excersise 2: Lecture Notes
  The title of slide n would be Abstract Classes and Methods (Example)
  n --> 18 (r)

Exersise 3:
- All TODOs have been answered within the code file iself
Summary of exercise: 
  - In the circle and employee package we covered polymorphism. In the circle package we got a reinforcement of how to implement objects as well as how to properly override methods to exceute properly. In the employee package we implemented inhertience and learned how the program will behave differently dependant on the object's type.
  - In the stack package, we got a better understanding of generics within a stack. This packcage reinforced how to properly execute this code while also handling exceptions (ClassCast) during the process.
  - The reflection package was an introduction to the reflection API which allows you to inspect classes, methods, and feilds and then dynamically retrive/manipulate that information (and even navigate the hierarchies). The usage of reflection helps with the overall fluidity and structure of the code, and helps with debudding and reusability.


Excercise 4: Java Bytecode

Java Code
  public static int sum_for(int n) {
    int i = 0, sum = 0;
    for (i = 0; i <= n; i++) {
      sum += i;
    }
    return sum;
  }

Btyecode
  // access flags 0x9			      1
  public static sum_for(I)I		2	
    L0					                3
      LINENUMBER 4 L0			      4
      ICONST_0				          5
      ISTORE 1				          6
    L1					                7
      ICONST_0				          8
      ISTORE 2				          9
    L2					                10
      LINENUMBER 5 L2			      11
      ICONST_0				          12
      ISTORE 1				          13
      GOTO L3				            14
    L4					                15
      LINENUMBER 6 L4			      16	
    FRAME APPEND [I I]		      17
      ILOAD 2				            18
      ILOAD 1				            19
      IADD				              20
      ISTORE 2				          21
    L5					                22
      LINENUMBER 5 L5			      23
      IINC 1 1				          24
    L3					                25
    FRAME SAME				          26	
      ILOAD 1				            27
      ILOAD 0				            28
      IF_ICMPLE L4			        29
    L6					                30
      LINENUMBER 8 L6			      31	
      ILOAD 2				            32
      IRETURN				            33
    L7					                34
      LOCALVARIABLE n I L0 L7 0	35	
      LOCALVARIABLE i I L1 L7 1	36
      LOCALVARIABLE sum I L2 L7 2	37
      MAXSTACK = 2			        38
      MAXLOCALS = 3			        39


  The java function here calculates the sum of all the integers all the way to n (summation), on the other hand the bytecode translates the high-level language to a low-level langauage so the JVM can properly excecute. 

  Breakdown of bytecode to java correspondense:
  Lines 1-2: mehthod declaration (similar to in java)
            0x9 indicates method is public and static 
            sum_for is declared with parameters I and returns int I 

  Lines 3-9: numbers are pushes and stored in the stack, variable initializtion/assignments
            ICONST pushes to stack, ISTORE stores value
            ISTORE 1 stores value 0 at local variable i
            INCONST 1 pushes 0 to stack
            ISTORE 2 stores value 0 at local sum

  Lines 10-14: initializes loop
            ICONST pushes 0 to ISTORE1 which assigns 0 to i
            GOTO L3 jumps to the loop condiitonal at L3

  Lines 25-29: loop conditional check
            ILOAD 1 loads the current value i to stack
            ILOAD 0 loads value n to stack at index 0
            IF_ICMPLE L4 checks the condition, if true then jumps to L4

  Lines 15-21: loop body
            ILOAD 2 loads value sum to stack
            ILOAD 1 loads value i to stack
            IADD adds current sum and i to stack
            ISTORE2 stores the new sum

  Lines 22-24: loop counter increments
            IINC 1 1 increments i by a value of 1

  Lines 25-33: loop recheck
            ILOAD 2 loads final sum
            IRETURN returns final value

  Lines 34-39: structure and resourse management

            