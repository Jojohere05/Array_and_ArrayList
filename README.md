# Array_and_ArrayList
## Project Description
This Java project provides utility functions to manipulate and process arrays and ArrayLists. It allows users to input arrays, separate even and odd numbers, find the smallest distance between neighboring numbers, and convert between arrays and ArrayLists. The project is structured with separate classes for handling user input, performing array operations, and executing the main program logic.

## Overview
This project consists of three main Java files:

Main.java: The entry point of the program.

UserInput.java: Handles user input for arrays and ArrayLists.

ArrayFunction.java: Contains utility functions for processing arrays and ArrayLists.

## File Descriptions
### 1. Main.java
This is the main driver class where program execution begins. It interacts with the UserInput and ArrayFunction classes to perform operations on arrays and ArrayLists.

Functions Used in Main.java:

arrayInput() - Gets an integer array from the user.

arrayListInput() - Gets an ArrayList from the user.

oddEven(int[] array) - Splits the array into even and odd numbers and displays them.

findSmallestDistanceIndex(int[] array) - Finds the index of two neighboring numbers with the smallest difference.

arrayToArrayList(int[] array) - Converts an array to an ArrayList.

arrayListToArray(ArrayList<Integer> list) - Converts an ArrayList to an array.

display(ArrayList<Integer> array) - Displays an ArrayList.

displayArray(int[] array) - Displays an integer array.

### 2. UserInput.java
This class is responsible for handling user input.

Functions:

arrayInput() - Asks the user for an array size, takes size integer inputs, and returns an integer array.

arrayListInput() - Asks the user for an array size, takes size integer inputs, and returns an ArrayList<Integer>.

### 3. ArrayFunction.java
This class provides several utility functions to process and manipulate arrays and ArrayLists.

Functions:

void display(ArrayList<Integer> array) - Prints an ArrayList<Integer>.

void displayArray(int[] array) - Prints an int[] array.

void oddEven(int[] array) - Splits an integer array into even and odd numbers and displays them.

int findSmallestDistanceIndex(int[] array) - Finds and returns the index of two neighboring numbers in an array with the smallest difference.

ArrayList<Integer> arrayToArrayList(int[] array) - Converts an int[] to an ArrayList<Integer>.

int[] arrayListToArray(ArrayList<Integer> list) - Converts an ArrayList<Integer> to an int[] array.

## How to Run
1. Compile the Java files:
   javac Main.java UserInput.java ArrayFunction.java
2. Run the main class:
   java Main
