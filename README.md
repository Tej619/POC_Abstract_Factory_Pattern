# GUI Word Application using Abstract Factory Pattern

## Problem Statement
A software company MicroOffice has produced four generations of Word Processing Applications, called Word90, Word00, Word10, and Word21. Suppose you are writing a program to test their GUIs. The GUI components we are interested in are Panel, Button, and Textbox. These GUI components look a little different in different generation. Each generation has it own program for testing these GUI components. To know which test to run, you will need to instantiate objects that correspond to each one of the GUI components.

We assume that generations of the Word to be tested are stored in a configuration file (text file). Because this situation fits the Abstract Factory pattern so well, you can use that pattern to organize the creation of objects that correspond to GUI components. You will also need to use the variation of singleton pattern to ensure that at most two instances of each generation in each test run. Please note finishing running all generations specified in the configuration file is considered as one test run.

Here is an example of the configuration file content. You can create your own.

Word90
Word00
Word90
Word21
Word10
Word00
Word21
Word90
Word00

## Author
- Tejas Vaity

## How to Run
To run the Program
- Run GuiWordDemo.java in eclipse or any other IDE, this java file present in package com.assignment2.word.AbstractFactory.Main
- If the File config.txt is not present the program will create one for you with some test values or else you can also give different values in config.txt file.