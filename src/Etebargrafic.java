import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Etebargrafic extends JPanel {
    public Etebargrafic(int iv){
        Person p=new Person() {
            @Override
            public void setreport(String level, String action) {
                super.setreport(level, action);
            }
        };
        setMinimumSize(new Dimension(800, 800));
        setPreferredSize(new Dimension(800, 800));
        setBackground(Color.darkGray);

        JLabel etebar = new JLabel("your etebar is:");
        etebar.setMinimumSize(new Dimension(750, 30));
        etebar.setPreferredSize(new Dimension(750, 30));
        etebar.setForeground(Color.white);
        EmptyBorder etebarborder = new EmptyBorder(0, 0, 0, 0);
        etebar.setBorder(etebarborder);

        JLabel showetebar = new JLabel(Visitor.visitor.get(iv).cash +" R");
        showetebar.setMinimumSize(new Dimension(750, 30));
        showetebar.setPreferredSize(new Dimension(750, 30));
        showetebar.setForeground(Color.white);
        EmptyBorder showetebarborder = new EmptyBorder(0, 0, 0, 0);
        showetebar.setBorder(showetebarborder);

        JLabel buyetebar = new JLabel("مبلغ در خواستی را در کادر زیر وارد نمایید.");
        buyetebar.setMinimumSize(new Dimension(750, 30));
        buyetebar.setPreferredSize(new Dimension(750, 30));
        buyetebar.setForeground(Color.white);
        EmptyBorder buyetebarborder = new EmptyBorder(0, 0, 0, 0);
        buyetebar.setBorder(buyetebarborder);

        JLabel cartnumber= new JLabel("شماره کارت خود را در کادر زیر وارد نمایید.");
        cartnumber.setMinimumSize(new Dimension(750, 30));
        cartnumber.setPreferredSize(new Dimension(750, 30));
        cartnumber.setForeground(Color.white);
        EmptyBorder cartnumberborder = new EmptyBorder(0, 0, 0, 0);
        cartnumber.setBorder(cartnumberborder);

        JLabel buystatus = new JLabel("buy status:");
        buystatus.setMinimumSize(new Dimension(750, 30));
        buystatus.setPreferredSize(new Dimension(750, 30));
        buystatus.setForeground(Color.white);
        EmptyBorder buystatusborder = new EmptyBorder(0, 0, 0, 0);
        buystatus.setBorder(buystatusborder);



        JLabel showbuystatus = new JLabel(" ");
        showbuystatus.setMinimumSize(new Dimension(750, 30));
        showbuystatus.setPreferredSize(new Dimension(750, 30));
        showbuystatus.setForeground(Color.white);
        EmptyBorder showbuystatusborder = new EmptyBorder(0, 0, 0, 0);
        showbuystatus.setBorder(showbuystatusborder);



        JLabel empity = new JLabel("                             ");
        empity.setMinimumSize(new Dimension(750, 30));
        empity.setPreferredSize(new Dimension(750, 30));


        JTextField entermany  = new JTextField("enter many");
        entermany.setMinimumSize(new Dimension(650, 30));
        entermany.setPreferredSize(new Dimension(650, 30));

        JTextField enternumbercart = new JTextField("enter number cart");
        enternumbercart.setMinimumSize(new Dimension(650, 30));
        enternumbercart.setPreferredSize(new Dimension(650, 30));


        JButton buy = new JButton("buy");
        buy.setMinimumSize(new Dimension(325, 30));
        buy.setPreferredSize(new Dimension(325, 30));
        buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (entermany.getText().matches("[0-9]*") && enternumbercart.getText().matches("[1-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]")) {
                    double cash = Double.parseDouble(Visitor.visitor.get(iv).cash);
                    cash = cash + Double.parseDouble(entermany.getText());
                    Visitor.visitor.get(iv).cash = String.valueOf(cash);
                    Person p = new Person() {
                        @Override
                        public void save_arraylists_to_file() {
                            super.save_arraylists_to_file();
                        }
                    };
                    p.save_arraylists_to_file();
                    showbuystatus.setForeground(Color.GREEN);
                    showbuystatus.setText("buy is succesfull and your cash is : " + Visitor.visitor.get(iv).cash + " R");
                    showetebar.setText(Visitor.visitor.get(iv).cash + " R");
                    p.setreport("visitor "+iv,"up etebar "+entermany.getText());
                }else{
                    showbuystatus.setText("entermany or enternumbercart not incorrect");
                    showbuystatus.setForeground(Color.RED);
                }
            }
        });

        JButton cansel = new JButton("Cansel");
        cansel.setMinimumSize(new Dimension(325, 30));
        cansel.setPreferredSize(new Dimension(325, 30));
        cansel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setVisible(false);
            }
        });
        add(etebar, BorderLayout.NORTH);
        add(showetebar, BorderLayout.NORTH);
        add(buyetebar, BorderLayout.NORTH);
        add(entermany, BorderLayout.NORTH);
        add(cartnumber, BorderLayout.NORTH);
        add(enternumbercart, BorderLayout.NORTH);
        add(empity, BorderLayout.NORTH);
        add(buy, BorderLayout.SOUTH);
        add(cansel, BorderLayout.SOUTH);
        add(buystatus, BorderLayout.NORTH);
        add(showbuystatus, BorderLayout.NORTH);

    }
}
