package com.Dylan;


import com.Div.Divide;

import javax.swing.*;

import static com.Div.Divide.div;
import static com.Dylan.Subtract.subtract;
import static com.Modulus.Modulus.modulus;
import static com.Multiply.Multiply.multiply;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String choice = "";
        String s1;
        String s2;
        int num1;
        int num2;
        int sum;

        Divide ob = new Divide();

        StringBuilder builder = new StringBuilder("<html>");
        builder.append("Please choose function option:");
        builder.append("\n");
        builder.append("----------------------------------------------------------------------------");
        builder.append("\n");
        builder.append("1: Addition");
        builder.append("\n");
        builder.append("2: Division");
        builder.append("\n");
        builder.append("3: Multiplication");
        builder.append("\n");
        builder.append("4: Subtract");
        builder.append("\n");
        builder.append("5: Modulus");
        builder.append("\n");
        builder.append("----------------------------------------------------------------------------");
        builder.append("\n");

        choice = JOptionPane.showInputDialog(builder);

        switch (Integer.parseInt(choice)){

            case 1:
                JOptionPane.showMessageDialog(null,"You chose Addition");
                s1 = JOptionPane.showInputDialog("Please enter 1st Number: ");
                s2 = JOptionPane.showInputDialog("Please enter 2nd Number: ");
                num1 = Integer.parseInt(s1);
                num2 = Integer.parseInt(s2);

                sum = addition(num1, num2);

                JOptionPane.showMessageDialog(null,"The answer is :"+sum,"Results", JOptionPane.INFORMATION_MESSAGE);

                break;

            case 2:
                JOptionPane.showMessageDialog(null,"You chose Division");

                s1 = JOptionPane.showInputDialog("Please enter 1st Number: ");
                s2 = JOptionPane.showInputDialog("Please enter 2nd Number: ");
                num1 = Integer.parseInt(s1);
                num2 = Integer.parseInt(s2);

                sum = div(num1, num2);

                JOptionPane.showMessageDialog(null,"The answer is :"+sum,"Results", JOptionPane.INFORMATION_MESSAGE);

                break;
            case 3:
                JOptionPane.showMessageDialog(null,"You chose Multiplication");

                s1 = JOptionPane.showInputDialog("Please enter 1st Number: ");
                s2 = JOptionPane.showInputDialog("Please enter 2nd Number: ");
                num1 = Integer.parseInt(s1);
                num2 = Integer.parseInt(s2);

                sum = multiply(num1, num2);

                JOptionPane.showMessageDialog(null,"The answer is :"+sum,"Results", JOptionPane.INFORMATION_MESSAGE);

                break;
            case 4:
                JOptionPane.showMessageDialog(null,"You chose Subtraction");

                s1 = JOptionPane.showInputDialog("Please enter 1st Number: ");
                s2 = JOptionPane.showInputDialog("Please enter 2nd Number: ");
                num1 = Integer.parseInt(s1);
                num2 = Integer.parseInt(s2);

                sum = subtract(num1, num2);

                JOptionPane.showMessageDialog(null,"The answer is :"+sum,"Results", JOptionPane.INFORMATION_MESSAGE);

                break;

            case 5:
                JOptionPane.showMessageDialog(null,"You chose Modulus");

                s1 = JOptionPane.showInputDialog("Please enter 1st Number: ");
                s2 = JOptionPane.showInputDialog("Please enter 2nd Number: ");
                num1 = Integer.parseInt(s1);
                num2 = Integer.parseInt(s2);

                sum = modulus(num1, num2);

                JOptionPane.showMessageDialog(null,"The answer is :"+sum,"Results", JOptionPane.INFORMATION_MESSAGE);

                break;
        }


    }

    public static int addition(int number, int number2)
    {
        return number +number2;

    }


    public static String CompareString(String name1, String name2){
        return name1 +" "+ name2;
    }
}
