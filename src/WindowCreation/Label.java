//Creates the Label
//Creates an outline for the label
//Sets Text alignment to the right

package WindowCreation;
import javax.swing.*;
import java.awt.*;


public class Label {
    static JLabel label = new JLabel("");
    public static Component labelCreator(){


        label.setBounds(8,25,215,30);
        label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        label.setHorizontalAlignment(SwingConstants.RIGHT);

        return label;
    }
}
