import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class Siasatmali extends JPanel {
    Person p=new Person() {
        @Override
        public void setreport(String level, String action) {
            super.setreport(level, action);
        }
    };
    public String whatsiasatmali = "defult";
    public int down21defult = 21;
    public int down10defult = 10;
    public int up20tickatsiasat1 = 20;
    public int down10tickatsiasat1 = 10;
    public int up15wagesiasat1 = 15;
    public int down10alltickatsiasat2 = 10;
    public int down5wageallzookkepersiasat2 = 5;
    public int up10wagemanagersiasat2 = 10;

    public Siasatmali() {
        setMinimumSize(new Dimension(800, 800));
        setPreferredSize(new Dimension(800, 800));
        setBackground(Color.darkGray);
        String str=null;
        try {
            BufferedReader in = new BufferedReader(new FileReader("siasatmali.txt"));
            str = in.readLine();
        } catch (IOException e) {
            System.out.println("exception occoured" + e);
        }

        JRadioButton r1 = new JRadioButton("Defult Siasat Mali");
        r1.setMinimumSize(new Dimension(700, 30));
        r1.setPreferredSize(new Dimension(700, 30));
        r1.setBackground(Color.DARK_GRAY);
        r1.setForeground(Color.white);
        JRadioButton r2 = new JRadioButton("Siasat Mali 1");
        r2.setMinimumSize(new Dimension(700, 30));
        r2.setPreferredSize(new Dimension(700, 30));
        r2.setBackground(Color.DARK_GRAY);
        r2.setForeground(Color.white);
        JRadioButton r3 = new JRadioButton("Siasat Mali 2");
        r3.setMinimumSize(new Dimension(700, 30));
        r3.setPreferredSize(new Dimension(700, 30));
        r3.setBackground(Color.DARK_GRAY);
        r3.setForeground(Color.white);
        add(r1);
        add(r2);
        add(r3);

        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        group.add(r3);

        if(str.equals("defult")){
            whatsiasatmali = "defult";
            r1.setSelected(true);
        }
        else if(str.equals("sm1")){
            whatsiasatmali = "sm1";
            r2.setSelected(true);
        }
        else if(str.equals("sm2")){
            whatsiasatmali = "sm2";
            r3.setSelected(true);
        }

        JLabel showstatus = new JLabel("Status");
        showstatus.setMinimumSize(new Dimension(750, 30));
        showstatus.setPreferredSize(new Dimension(750, 30));
        showstatus.setForeground(Color.white);
        EmptyBorder showetebarborder = new EmptyBorder(0, 0, 0, 0);
        showstatus.setBorder(showetebarborder);

        JButton set = new JButton("set");
        set.setMinimumSize(new Dimension(700, 30));
        set.setPreferredSize(new Dimension(700, 30));
        add(set, BorderLayout.AFTER_LAST_LINE);
        set.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(r1.isSelected()){
                    p.setreport("superadmin","select siasatmali defult");
                    try{
                    BufferedWriter out = new BufferedWriter(new FileWriter("siasatmali.txt"));
                    out.write("defult");
                    out.newLine();
                    out.close();
                    } catch (IOException e) {
                        System.out.println("exception occoured" + e);
                    }
                    showstatus.setForeground(Color.GREEN);
                    showstatus.setText("select siasatmali defult Succesfull");
                }
                if(r2.isSelected()){
                    try{
                        p.setreport("superadmin","select siasatmali 1");
                        BufferedWriter out = new BufferedWriter(new FileWriter("siasatmali.txt"));
                        out.write("sm1");
                        out.newLine();
                        out.close();
                    } catch (IOException e) {
                        System.out.println("exception occoured" + e);
                    }
                    showstatus.setForeground(Color.GREEN);
                    showstatus.setText("select siasatmali 1 Succesfull");
                }
                if(r3.isSelected()){
                    try{
                        p.setreport("superadmin","select siasatmali 2");
                        BufferedWriter out = new BufferedWriter(new FileWriter("siasatmali.txt"));
                        out.write("sm2");
                        out.newLine();
                        out.close();
                    } catch (IOException e) {
                        System.out.println("exception occoured" + e);
                    }
                    showstatus.setForeground(Color.GREEN);
                    showstatus.setText("select siasatmali 2 Succesfull");
                }
            }
        });
        add(showstatus);

    }
}