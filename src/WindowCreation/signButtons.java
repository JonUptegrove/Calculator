package WindowCreation;

import javax.swing.JButton;
import java.awt.*;

/*
Creates the sign buttons for the Calculator
ex. +, -, *, /, ., +/-
Then returns them to the Window Class
 */

public class signButtons {

    public static Component equalButton(){
        JButton equals = new JButton("=");
        equals.setBounds(175,305,50,50);

        equals.addActionListener(_ ->{
            Calculator.equalOperation();

        });
        return equals;
    }
    public static Component addButton(){
        JButton add = new JButton("+");
        add.setBounds(175,250,50,50);

        add.addActionListener(e->{
            Calculator.addOperation();
            Label.label.setText(Label.label.getText() + "+");
        });
        return add;
    }
    public static Component subButton(){
        JButton sub = new JButton("-");
        sub.setBounds(175,195,50,50);

        sub.addActionListener(e->{
            Calculator.subOperation();
            Label.label.setText(Label.label.getText() + "-");
        });
        return sub;
    }
    public static Component multiButton(){
        JButton multi = new JButton("*");
        multi.setBounds(175,140,50,50);

        multi.addActionListener(e->{
            Calculator.mutliOperation();
            Label.label.setText(Label.label.getText() + "*");
        });
        return multi;
    }
    public static Component divButton(){
        JButton div = new JButton("/");
        div.setBounds(175,85,50,50);

        div.addActionListener(e->{
            Calculator.divOperation();
            Label.label.setText(Label.label.getText() + "/");
        });
        return div;
    }
    public static Component decimalButton(){
        JButton dec = new JButton(".");
        dec.setBounds(120,305,50,50);

        dec.addActionListener(e->{
            Calculator.currentNumber += ".";
            Label.label.setText(Label.label.getText() + ".");
        });
        return dec;
    }
    public static Component negativeButton(){
        JButton neg = new JButton("+/-");
        neg.setBounds(10,305,50,50);
        neg.addActionListener(e->{
            Calculator.negative();
        });
        return neg;
    }
    public static Component clearButton(){
        JButton clear = new JButton("Clear");
        clear.setBounds(10,85,105,50);
        clear.addActionListener(e->{
            Calculator.currentNumber = "";
            Calculator.x = 0;
            Label.label.setText("");
        });
        return clear;
    }
}
