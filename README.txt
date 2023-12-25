ScientificCalc.java is the main class.

This README file provides instructions on how to use the scientific calculator program.

This scientific calculator is designed to perform various mathematical operations,
including basic arithmetic, power, sine, cosine, tangent, and logarithm.
The user can interact with the calculator through a command-line interface.

Instructions
Getting Started
Clone the Repository:

A) Calculator Interface:
The calculator interface will be displayed with the available operations and the current result.

B) Operations:
Choose an operation by entering the corresponding number.
Available Operations:
1: Addition
2: Subtraction
3: Multiplication
4: Division
5: Power
6: Sin
7: Cos
8: Tan
9: Log

C) Input:
Enter the operand when prompted.
For trigonometric operations (sin, cos, tan), enter the angle in degrees.
For the natural logarithm (log), enter the number to calculate the natural log.

D) Result:
The result of the operation will be displayed.
The running total is continuously updated.

E) Exiting:
Enter 0 to exit the calculator.
Enter CLEAR to reset the result.

F) Notes:
The calculator supports an infinite loop until the user decides to exit.
Invalid input are handled with appropriate error messages.


NOTE: All the java files are in the Scientific_Calculator folder.
Hence every file has the package Scientific_Calculator; line on the top of the file.

NOTE: The OpTester.java class is another class with main method (besides ScientificCalc.java).
This class is used for the isolation testing of the classes. I have NOT included this class in
the final UML diagram.