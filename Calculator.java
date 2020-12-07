import java.util.Scanner;

public class Calculator {
    double firstNum;
    double secndNum;
    int mathFunc;

    void addition() {
        System.out.println(firstNum + secndNum);
    }

    void substract() {
        System.out.println(firstNum - secndNum);
    }

    void multiplication() {
        System.out.println(firstNum * secndNum);
    }

    void division() {
        while(secndNum == 0) {
            System.out.println("You can't divide by zero!");
            inputData();
        }
        System.out.println(firstNum / secndNum);
    }

    void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Put your first number: ");
        firstNum = scanner.nextDouble();
        System.out.print("Put your second number: ");
        secndNum = scanner.nextDouble();
    }

    void chooseFunction() {
        System.out.println("1. Addition (+)");
        System.out.println("2. Substract (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Chose some function: ");
        Scanner scanner = new Scanner(System.in);
        mathFunc = scanner.nextInt();
        if (mathFunc == 1){
            addition();
        }
        else if (mathFunc == 2) {
            substract();
        }
        else if (mathFunc == 3) {
            multiplication();
        }
        else {
            division();
        }

    }


    public static void main(String [] args) {
        System.out.println("Simple Calculator");
        Calculator myCalc = new Calculator();
        myCalc.inputData();
        myCalc.chooseFunction();
    }
}
