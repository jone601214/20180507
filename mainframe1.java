import  javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class mainframe1 extends JFrame {
    private JLabel jlb = new JLabel("華氏度:");
    private JTextField jlf = new JTextField();
    private JButton jbtnequal = new JButton("=");
    private JLabel jlb1 = new JLabel("攝氏度");
    private int y = 100;

    public mainframe1() {
        init();
    }

    private void init() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocation(100, 50);
        this.setSize(800, 600);
        jlb.setBounds(100, 100, 100, 30);
        jlf.setBounds(150, 100, 100, 30);
        jbtnequal.setLocation(200, 100);
        jbtnequal.setSize(120, 30);
        jlb1.setBounds(350, 100, 100, 30);
        this.add(jlb);
        this.add(jlf);
        this.add(jbtnequal);
        this.add(jlb1);
        jbtnequal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int y = Integer.parseInt(jlf.getText());
                double x = (double)(y - 32*(5.0/9.0));
                System.out.println("攝氏溫度: " + x + "(°C)");
            }
        });
    }
}