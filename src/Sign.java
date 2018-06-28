import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class Sign extends JFrame {

    public Sign() {
        Person p=new Person() {
            @Override
            public void setreport(String level, String action) {
                super.setreport(level, action);
            }
        };
        setMinimumSize(new Dimension(400, 600));
        setPreferredSize(new Dimension(400, 600));
        setResizable(false);
        getContentPane().setBackground(Color.white);


        JPanel centerPanel = new JPanel();
        centerPanel.setMinimumSize(new Dimension(180, 200));
        centerPanel.setPreferredSize(new Dimension(180, 200));
        centerPanel.setBackground(Color.darkGray);


        JPanel upPanel = new JPanel();
        upPanel.setMinimumSize(new Dimension(100, 100));
        upPanel.setPreferredSize(new Dimension(100, 100));
        upPanel.setBackground(Color.darkGray);
        this.add(upPanel, BorderLayout.NORTH);


        JPanel downPanel = new JPanel();
        downPanel.setMinimumSize(new Dimension(0, 50));
        downPanel.setPreferredSize(new Dimension(0, 50));
        downPanel.setBackground(Color.darkGray);
        this.add(downPanel, BorderLayout.SOUTH);



        JPanel rightPanel = new JPanel();
        rightPanel.setMinimumSize(new Dimension(80, 0));
        rightPanel.setPreferredSize(new Dimension(80, 0));
        rightPanel.setBackground(Color.darkGray);
        this.add(rightPanel, BorderLayout.EAST);


        JPanel leftPanel = new JPanel();
        leftPanel.setMinimumSize(new Dimension(80, 300));
        leftPanel.setPreferredSize(new Dimension(80, 300));
        leftPanel.setBackground(Color.darkGray);
        this.add(leftPanel, BorderLayout.WEST);
        this.add(centerPanel, BorderLayout.CENTER);


        JTextField lastnameadd = new JTextField("Enter Lastname");
        lastnameadd.setMinimumSize(new Dimension(220, 30));
        lastnameadd.setPreferredSize(new Dimension(220, 30));
        centerPanel.add(lastnameadd, BorderLayout.NORTH);


        JTextField nameadd = new JTextField("Enter name");
        nameadd.setMinimumSize(new Dimension(220, 30));
        nameadd.setPreferredSize(new Dimension(220, 30));
        centerPanel.add(nameadd, BorderLayout.NORTH);


        JTextField useradd = new JTextField("Enter username");
        useradd.setMinimumSize(new Dimension(220, 30));
        useradd.setPreferredSize(new Dimension(220, 30));
        centerPanel.add(useradd, BorderLayout.NORTH);


        JPasswordField passadd = new JPasswordField("Enter Password");
        passadd.setMinimumSize(new Dimension(220, 30));
        passadd.setPreferredSize(new Dimension(220, 30));
        centerPanel.add(passadd, BorderLayout.NORTH);

        JPasswordField passadd2 = new JPasswordField("Enter Password2");
        passadd2.setMinimumSize(new Dimension(220, 30));
        passadd2.setPreferredSize(new Dimension(220, 30));
        centerPanel.add(passadd2, BorderLayout.NORTH);

        JTextField phoneadd = new JTextField("Enter Phonenumber");
        phoneadd.setMinimumSize(new Dimension(220, 30));
        phoneadd.setPreferredSize(new Dimension(220, 30));
        centerPanel.add(phoneadd, BorderLayout.NORTH);


        JTextField adrressadd = new JTextField("Enter Address");
        adrressadd.setMinimumSize(new Dimension(220, 30));
        adrressadd.setPreferredSize(new Dimension(220, 30));
        centerPanel.add(adrressadd, BorderLayout.NORTH);


        JTextField emailadd = new JTextField("Enter Email");
        emailadd.setMinimumSize(new Dimension(220, 30));
        emailadd.setPreferredSize(new Dimension(220, 30));
        centerPanel.add(emailadd, BorderLayout.NORTH);


        JTextField wageadd = new JTextField("Enter Email2");
        wageadd.setMinimumSize(new Dimension(220, 30));
        wageadd.setPreferredSize(new Dimension(220, 30));
        centerPanel.add(wageadd, BorderLayout.NORTH);


        JLabel login_status = new JLabel("Sign status");
        login_status.setForeground(Color.white);
        downPanel.add(login_status, BorderLayout.WEST);


        JButton saveadd = new JButton("Save All");
        saveadd.setMinimumSize(new Dimension(220, 30));
        saveadd.setPreferredSize(new Dimension(220, 30));
        centerPanel.add(saveadd, BorderLayout.NORTH);
        saveadd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (emailadd.getText().matches("[a-zA-Z]+[a-zA-Z0-9]*[@][g][m][a][i][l][.][c][o][m]") && phoneadd.getText().matches("[0][9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]")) {
                    if (passadd.getText().equals(passadd2.getText())) {
                        Visitor v = new Visitor();
                        v.savevisitor(String.valueOf(Visitor.visitor.size()), lastnameadd.getText(), nameadd.getText(), useradd.getText(), passadd.getText(), phoneadd.getText(), adrressadd.getText(), emailadd.getText(), "0");
                        if (v.dublicat(useradd.getText(), emailadd.getText())) {
                            Visitor.visitor.add(v);
                            v.savevisitortofile(Visitor.visitor.size() - 1);
                            login_status.setText("sign up Successfull");
                            p.setreport("visitor "+Visitor.visitor.size(),"sign");
                            login_status.setForeground(Color.GREEN);
                            v.read_from_file();
                        } else {
                            login_status.setText("sign up fail visitor is dublicat");
                            login_status.setForeground(Color.RED);
                        }
                    } else {
                        login_status.setText("password1 != password2");
                        login_status.setForeground(Color.RED);
                    }
                }else{
                    login_status.setText("phonenumber or email not incorrect");
                    login_status.setForeground(Color.RED);
                }
            }
            });

        JButton cansel = new JButton("Cansel");
        cansel.setMinimumSize(new Dimension(220, 30));
        cansel.setPreferredSize(new Dimension(220, 30));
        centerPanel.add(cansel, BorderLayout.NORTH);
        cansel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setVisible(false);
                Gerafic g=new Gerafic();
                g.setVisible(true);
            }
        });

                JLabel lastname = new JLabel("Last Name:");
        leftPanel.add(lastname, BorderLayout.NORTH);
        lastname.setForeground(Color.white);
        EmptyBorder lastnameborder = new EmptyBorder(5, 0, 0, 0);
        lastname.setBorder(lastnameborder);


        JLabel name = new JLabel("Name:");
        leftPanel.add(name, BorderLayout.NORTH);
        name.setForeground(Color.white);
        EmptyBorder nameborder = new EmptyBorder(15, 0, 0, 0);
        name.setBorder(nameborder);


        JLabel user = new JLabel("Username:");
        leftPanel.add(user, BorderLayout.NORTH);
        user.setForeground(Color.white);
        EmptyBorder userborder = new EmptyBorder(15, 0, 0, 0);
        user.setBorder(userborder);

        JLabel pass = new JLabel("Password:");
        leftPanel.add(pass, BorderLayout.NORTH);
        pass.setForeground(Color.white);
        EmptyBorder passborder = new EmptyBorder(15, 0, 0, 0);
        pass.setBorder(passborder);

        JLabel pass2 = new JLabel("Password2:");
        leftPanel.add(pass2, BorderLayout.NORTH);
        pass2.setForeground(Color.white);
        EmptyBorder passborder2 = new EmptyBorder(15, 0, 0, 0);
        pass2.setBorder(passborder2);

        JLabel phonenumber = new JLabel("Phone number:");
        leftPanel.add(phonenumber, BorderLayout.NORTH);
        phonenumber.setForeground(Color.white);
        EmptyBorder phonenumberborder = new EmptyBorder(15, 0, 0, 0);
        phonenumber.setBorder(phonenumberborder);

        JLabel address = new JLabel("Address:");
        leftPanel.add(address, BorderLayout.NORTH);
        address.setForeground(Color.white);
        EmptyBorder addressborder = new EmptyBorder(15, 0, 0, 0);
        address.setBorder(addressborder);

        JLabel email1 = new JLabel("Email:");
        leftPanel.add(email1, BorderLayout.NORTH);
        email1.setForeground(Color.white);
        EmptyBorder emailborder1 = new EmptyBorder(15, 0, 0, 0);
        email1.setBorder(emailborder1);

        JLabel email2 = new JLabel("Email2:");
        leftPanel.add(email2, BorderLayout.NORTH);
        email2.setForeground(Color.white);
        EmptyBorder emailborder2 = new EmptyBorder(15, 0, 0, 0);
        email2.setBorder(emailborder2);

        JLabel welcomSuperadminToZooConsol = new JLabel("باسلام به باغ وحش خوش آمدید جهت ثبت نام فرم زیر را تکمیل نمایید.*باتشکر*");
        welcomSuperadminToZooConsol.setForeground(Color.white);
        welcomSuperadminToZooConsol.setPreferredSize(new Dimension(300, 90));
        upPanel.add(welcomSuperadminToZooConsol, BorderLayout.WEST);

        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        this.setTitle("Sign up");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}