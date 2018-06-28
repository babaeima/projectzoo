import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Forgetpassword extends JFrame {
    private int result;
    public Forgetpassword() {
        Person p=new Person() {
            @Override
            public void setreport(String level, String action) {
                super.setreport(level, action);
            }
        };
        setMinimumSize(new Dimension(400, 600));
        setPreferredSize(new Dimension(400, 600));
        setResizable(false);

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
        downPanel.setMinimumSize(new Dimension(0, 100));
        downPanel.setPreferredSize(new Dimension(0, 100));
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


        String item[] = {"manager", "zookeeper", "visitor"};
        JComboBox admin = new JComboBox(item);
        admin.setMinimumSize(new Dimension(220, 30));
        admin.setPreferredSize(new Dimension(220, 30));
        centerPanel.add(admin, BorderLayout.NORTH);

        JTextField useradd = new JTextField("Enter username");
        useradd.setMinimumSize(new Dimension(220, 30));
        useradd.setPreferredSize(new Dimension(220, 30));
        centerPanel.add(useradd, BorderLayout.NORTH);

        JTextField emailadd = new JTextField("Enter Email");
        emailadd.setMinimumSize(new Dimension(220, 30));
        emailadd.setPreferredSize(new Dimension(220, 30));
        centerPanel.add(emailadd, BorderLayout.NORTH);

        JLabel forget_status = new JLabel("forgetpassword status");
        forget_status.setForeground(Color.white);
        downPanel.add(forget_status, BorderLayout.WEST);

        JLabel Level = new JLabel("Level:");
        leftPanel.add(Level, BorderLayout.NORTH);
        Level.setForeground(Color.white);
        EmptyBorder Levelborder1 = new EmptyBorder(10, 0, 0, 0);
        Level.setBorder(Levelborder1);

        JLabel user = new JLabel("Username:");
        leftPanel.add(user, BorderLayout.NORTH);
        user.setForeground(Color.white);
        EmptyBorder userborder = new EmptyBorder(15, 0, 0, 0);
        user.setBorder(userborder);

        JLabel email1 = new JLabel("Email:");
        leftPanel.add(email1, BorderLayout.NORTH);
        email1.setForeground(Color.white);
        EmptyBorder emailborder1 = new EmptyBorder(15, 0, 0, 0);
        email1.setBorder(emailborder1);

        JButton saveadd = new JButton("Find");
        saveadd.setMinimumSize(new Dimension(220, 30));
        saveadd.setPreferredSize(new Dimension(220, 30));
        centerPanel.add(saveadd, BorderLayout.NORTH);

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


        JLabel pass1 = new JLabel("newpass1:");
        pass1.setForeground(Color.white);
        EmptyBorder pass1border = new EmptyBorder(80, 0, 0, 0);
        pass1.setBorder(pass1border);
        pass1.setVisible(false);

        JLabel pass2 = new JLabel("newpass2:");
        pass2.setForeground(Color.white);
        EmptyBorder pass2border = new EmptyBorder(15, 0, 0, 0);
        pass2.setBorder(pass2border);
        pass2.setVisible(false);

        JTextField enterpass1 = new JTextField("Enter new password");
        enterpass1.setMinimumSize(new Dimension(220, 30));
        enterpass1.setPreferredSize(new Dimension(220, 30));
        enterpass1.setVisible(false);

        JTextField enterpass2 = new JTextField("Enter new password2");
        enterpass2.setMinimumSize(new Dimension(220, 30));
        enterpass2.setPreferredSize(new Dimension(220, 30));
        enterpass2.setVisible(false);

        JButton saveforget = new JButton("save new pass");
        saveforget.setMinimumSize(new Dimension(220, 30));
        saveforget.setPreferredSize(new Dimension(220, 30));
        centerPanel.add(saveforget, BorderLayout.NORTH);
        saveforget.setVisible(false);


        saveadd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (useradd.getText().matches("[a-zA-Z]*") && emailadd.getText().matches("[a-zA-Z]+[a-zA-Z0-9]*[@][g][m][a][i][l][.][c][o][m]")){
                String level = (String) admin.getSelectedItem();
                 result=forget(level,useradd.getText(),emailadd.getText());

                    if(result==1000){
                        forget_status.setText(level+" not find");
                    }
                    else{
                        leftPanel.add(pass1, BorderLayout.NORTH);
                        leftPanel.add(pass2, BorderLayout.NORTH);
                        centerPanel.add(enterpass1, BorderLayout.NORTH);
                        centerPanel.add(enterpass2, BorderLayout.NORTH);
                        centerPanel.add(saveforget, BorderLayout.NORTH);
                        pass1.setVisible(true);
                        pass2.setVisible(true);
                        enterpass1.setVisible(true);
                        enterpass2.setVisible(true);
                        saveforget.setVisible(true);
                    }
                }else{
                    forget_status.setText("email not incorrect");
                    forget_status.setForeground(Color.RED);
                }
            }
        });
        saveforget.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(enterpass1.getText().equals(enterpass2.getText())){
                    String level=(String) admin.getSelectedItem();
                    if(level.equals("superadmin")){
                        Superadmin.superadmin.get(result).Password= String.valueOf(enterpass1.getText().hashCode());
                    }
                    else if(level.equals("manager")){
                        Manager.manager.get(result).password= String.valueOf(enterpass1.getText().hashCode());
                    }
                    else if(level.equals("zookeeper")){
                        Zookeeper.zookeeper.get(result).password= String.valueOf(enterpass1.getText().hashCode());
                    }
                    else if(level.equals("visitor")){
                        Visitor.visitor.get(result).password= String.valueOf(enterpass1.getText().hashCode());
                    }
                    p.save_arraylists_to_file();
                    forget_status.setForeground(Color.GREEN);
                    forget_status.setText("new password save succesfully");
                    p.setreport(level,"forget password");
                }
                else{
                    forget_status.setForeground(Color.RED);
                    forget_status.setText("new password1 != new password2");
                }
            }
        });

        JLabel welcomSuperadminToZooConsol = new JLabel("جهت بازیابی رمز عبور خود مشخصات خود را وارد کرده و روی کلید'find'کلیک کنید.");
        welcomSuperadminToZooConsol.setForeground(Color.white);
        welcomSuperadminToZooConsol.setPreferredSize(new Dimension(300, 90));
        upPanel.add(welcomSuperadminToZooConsol, BorderLayout.WEST);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        this.setSize(320, 320);
        this.setTitle("Forget password");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public int forget(String level, String user, String email) {

        if (level.equals("superadmin")) {
            for (int i = 0; i < Superadmin.superadmin.size(); i++) {
                if (Superadmin.superadmin.get(i).Karbariname.equals(user)) {
                    if(Superadmin.superadmin.get(i).mail.equals(email)){
                        return i;
                    }else {return 1000;}
                }
            }

        }
        if (level.equals("manager")) {
            for (int i = 0; i < Manager.manager.size(); i++) {
                if (Manager.manager.get(i).Username.equals(user)) {
                    if(Manager.manager.get(i).mail.equals(email)) {
                        return i;
                    }else {return 1000;}
                }
            }
        }
        if (level.equals("zookeeper")) {
            for (int i = 0; i < Zookeeper.zookeeper.size(); i++) {
                if (Zookeeper.zookeeper.get(i).Username.equals(user)) {
                    if(Zookeeper.zookeeper.get(i).mail.equals(email)) {
                        return i;
                    } else {return 1000;}
                }
            }
        }
        if (level.equals("visitor")) {
            for (int i = 0; i < Visitor.visitor.size(); i++) {
                if (Visitor.visitor.get(i).Username.equals(user)) {
                    if(Visitor.visitor.get(i).mail.equals(email)) {
                        return i;
                    }else {return 1000;}
                }
            }
        }
        return 1000;
    }
}
