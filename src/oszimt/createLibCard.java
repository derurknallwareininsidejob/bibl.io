/*
 *  Author:             ms@beronet.com / hi@mily.dev
 *  Date of Change:     25.08.2021
 *  Implements GUI Panel for creating LibCard Object
 */

package oszimt;

//import libaries for GUI
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class createLibCard {

    public JPanel mainPanel;
    private JButton createButton;

    public static void renderCreateLibCard () {
        JFrame frame = new JFrame("createLibCard");
        frame.setContentPane(new createLibCard().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);                          //center Frame
        frame.setVisible(true);
    }

    public createLibCard() {
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                LibCard user2 = new LibCard();

                String msg = String.format("ID: %d\nExpirey Date (s): %d\nValid: %s", user2.getId(), user2.getExpiry_date(), user2.isValid());
                JOptionPane.showMessageDialog(null, msg);
            }
        });
    }
}
