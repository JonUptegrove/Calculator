package WindowCreation;


public class Calculator {
    public static double x = 0;
    public static String currentNumber = "";
    static boolean add = false;
    static boolean sub = false;
    static boolean multi = false;
    static boolean div = false;
    public static double ans = 0;
    public static boolean newCalc = false;

    public static void addOperation(){
        x = Double.parseDouble(currentNumber);
        currentNumber = "";
        add = true;

    }
    public static void subOperation(){
        x = Double.parseDouble(currentNumber);
        currentNumber = "";
        sub = true;

    }
    public static void mutliOperation(){
        x = Double.parseDouble(currentNumber);
        currentNumber = "";
        multi = true;

    }
    public static void divOperation(){
        x = Double.parseDouble(currentNumber);
        currentNumber = "";
        div = true;

    }
    public static void negative(){
        currentNumber = "-" + currentNumber;
        Label.label.setText(currentNumber);
    }
    public static void equalOperation(){
        if(add){
            ans = x + Double.parseDouble(currentNumber);
            x = 0;
            currentNumber = String.valueOf(ans);
            add = false;
            Label.label.setText(String.valueOf(ans));
            newCalc = true;
        }
        else if(sub){
            ans = x - Double.parseDouble(currentNumber);
            x = 0;
            currentNumber = String.valueOf(ans);
            sub = false;
            Label.label.setText(String.valueOf(ans));
            newCalc = true;
        }
        else if(multi){
            ans = x * Double.parseDouble(currentNumber);
            x = 0;
            currentNumber = String.valueOf(ans);
            multi = false;
            Label.label.setText(String.valueOf(ans));
            newCalc = true;
        }
        else if(div){
            if(x == 0 || Double.parseDouble(currentNumber) == 0){
                div = false;
                Label.label.setText("Error");
                newCalc = true;
            }
            else {
                ans = x / Double.parseDouble(currentNumber);
                x = 0;
                currentNumber = String.valueOf(ans);
                div = false;
                Label.label.setText(String.valueOf(ans));
                newCalc = true;
            }
        }
    }
    public static void newCalculation(){
        if(newCalc){
            Label.label.setText("");
            newCalc = false;
        }
    }
}
