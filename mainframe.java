import  javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainframe extends JFrame{
    private JButton jbtnAdd=new JButton("Add");
    private JButton jbtnLow=new JButton("Lower");
    private JLabel jlb=new JLabel(">__<");
    private JTextField jlf=new JTextField();
    private int x=50;
    public mainframe(){
        init();
}
    private void init(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocation(100,50);
        this.setSize(800,600);
        jbtnAdd.setLocation(50,60);
        jbtnLow.setLocation(50,120);
        jbtnAdd.setSize(120,30);
        jbtnLow.setSize(120,30);
        jlb.setBounds(50,350,100,30);
        jlf.setBounds(50,200,100,30);
        this.add(jbtnAdd);
        this.add(jbtnLow);
        this.add(jlb);
        this.add(jlf);
        jbtnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                x-=Integer.parseInt(jlf.getText());
                jlb.setLocation(x,350);
            }
        });
        jbtnLow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                x+=Integer.parseInt(jlf.getText());
                jlb.setLocation(x,350);
            }
        });
    }
}