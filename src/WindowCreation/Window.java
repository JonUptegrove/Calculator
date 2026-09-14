package WindowCreation;

import javax.swing.JFrame;

public class Window {

    public static void windowCreater(){
        JFrame window = new JFrame("Calculator");

        //Makes the sign buttons and adds them to the window
        window.add(signButtons.equalButton());
        window.add(signButtons.addButton());
        window.add(signButtons.subButton());
        window.add(signButtons.multiButton());
        window.add(signButtons.divButton());
        window.add(signButtons.decimalButton());
        window.add(signButtons.negativeButton());
        window.add(signButtons.clearButton());

        //Makes the number buttons and adds them to the window
        window.add(numberButtons.zeroButton());
        window.add(numberButtons.oneButton());
        window.add(numberButtons.twoButton());
        window.add(numberButtons.threeButton());
        window.add(numberButtons.fourButton());
        window.add(numberButtons.fiveButton());
        window.add(numberButtons.sixButton());
        window.add(numberButtons.sevenButton());
        window.add(numberButtons.eightButton());
        window.add(numberButtons.nineButton());

        //Makes the Label and adds it to the Window
        window.add(Label.labelCreator());

        window.setSize(250,400);
        window.setLayout(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
