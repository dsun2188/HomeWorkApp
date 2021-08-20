import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow() {
        setLocation(650, 250);
        setSize(500, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton myFirstButton = new JButton("Главная");

        JButton mySecondButton = new JButton("Выход");
        ActionListener myButtonListener = new CloseActionListener();
        mySecondButton.addActionListener(myButtonListener);

        JPanel myPanel = new JPanel(new GridLayout(1,2));
        myPanel.add(myFirstButton);
        myPanel.add(mySecondButton);

        add(myPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}
