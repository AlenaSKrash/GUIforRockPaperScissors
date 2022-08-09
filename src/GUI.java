import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    int count = 0;

    JLabel rocklabel;
    JLabel paperlabel;
    JLabel scissorslabel;
    JFrame frame;
    JPanel panel;

    public GUI(){
        frame = new JFrame();

        JButton rockButton = new JButton("Rock");
        JButton scissorsButton = new JButton("Scissors");
        JButton paperButton = new JButton("Paper");
        rockButton.addActionListener(this);
        scissorsButton.addActionListener(this);
        paperButton.addActionListener(this);

        rocklabel = new JLabel("Rock: 0");
        paperlabel = new JLabel("Paper: 0");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10, 10));
        panel.setLayout(new GridLayout(0,1));
        panel.add(rockButton);
        panel.add(paperButton);
        panel.add(scissorsButton);
        panel.add(rocklabel);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Rock Paper Scissors");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args){
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        rocklabel.setText("Number of clicks: " + count);
    }
}
