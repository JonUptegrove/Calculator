package WindowCreation;

import javax.swing.JButton;
import java.awt.*;

/*
Creates the number buttons
ex. 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
Then returns them to the window class
 */
public class numberButtons {
    public static Component zeroButton(){
        JButton zero = new JButton("0");
        zero.setBounds(65,305,50,50);
        zero.addActionListener(e->{
            Calculator.currentNumber += "0";
            Calculator.newCalculation();
            Label.label.setText(Label.label.getText() + "0");
        });
        return zero;
    }
    public static Component oneButton(){
        JButton one = new JButton("1");
        one.setBounds(10,250,50,50);
        one.addActionListener(e->{
            Calculator.currentNumber += "1";
            Calculator.newCalculation();
            Label.label.setText(Label.label.getText() + "1");
        });
        return one;
    }
    public static Component twoButton(){
        JButton two = new JButton("2");
        two.setBounds(65,250,50,50);
        two.addActionListener(e->{
            Calculator.currentNumber += "2";
            Calculator.newCalculation();
            Label.label.setText(Label.label.getText() + "2");
        });
        return two;
    }
    public static Component threeButton(){
        JButton three = new JButton("3");
        three.setBounds(120,250,50,50);
        three.addActionListener(e->{
            Calculator.currentNumber += "3";
            Calculator.newCalculation();
            Label.label.setText(Label.label.getText() + "3");
        });
        return three;
    }
    public static Component fourButton(){
        JButton four = new JButton("4");
        four.setBounds(10,195,50,50);
        four.addActionListener(e->{
            Calculator.currentNumber += "4";
            Calculator.newCalculation();
            Label.label.setText(Label.label.getText() + "4");
        });
        return four;
    }
    public static Component fiveButton(){
        JButton five = new JButton("5");
        five.setBounds(65,195,50,50);
        five.addActionListener(e->{
            Calculator.currentNumber += "5";
            Calculator.newCalculation();
            Label.label.setText(Label.label.getText() + "5");
        });
        return five;
    }
    public static Component sixButton(){
        JButton six = new JButton("6");
        six.setBounds(120,195,50,50);
        six.addActionListener(e->{
            Calculator.currentNumber += "6";
            Calculator.newCalculation();
            Label.label.setText(Label.label.getText() + "6");
        });
        return six;
    }
    public static Component sevenButton(){
        JButton seven = new JButton("7");
        seven.setBounds(10,140,50,50);
        seven.addActionListener(e->{
            Calculator.currentNumber += "7";
            Calculator.newCalculation();
            Label.label.setText(Label.label.getText() + "7");
        });
        return seven;
    }
    public static Component eightButton(){
        JButton eight = new JButton("8");
        eight.setBounds(65,140,50,50);
        eight.addActionListener(e->{
            Calculator.currentNumber += "8";
            Calculator.newCalculation();
            Label.label.setText(Label.label.getText() + "8");
        });
        return eight;
    }
    public static Component nineButton(){
        JButton nine = new JButton("9");
        nine.setBounds(120,140,50,50);
        nine.addActionListener(e->{
            Calculator.currentNumber += "9";
            Calculator.newCalculation();
            Label.label.setText(Label.label.getText() + "9");
        });
        return nine;
    }
}
