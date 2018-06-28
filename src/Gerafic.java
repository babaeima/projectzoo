import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gerafic extends JFrame {

    public Gerafic() {
        Person p=new Person() {
            @Override
            public void setreport(String level, String action) {
                super.setreport(level, action);
            }
        };
        setMinimumSize(new Dimension(340, 300));
        setPreferredSize(new Dimension(340, 300));
        setResizable(false);
        getContentPane().setBackground(Color.white);


        JPanel centerPanel = new JPanel();
        centerPanel.setMinimumSize(new Dimension(180, 200));
        centerPanel.setPreferredSize(new Dimension(180, 200));
        centerPanel.setBackground(Color.darkGray);


        JPanel upPanel = new JPanel();
        upPanel.setMinimumSize(new Dimension(100, 50));
        upPanel.setPreferredSize(new Dimension(100, 50));
        upPanel.setBackground(Color.darkGray);
        this.add(upPanel, BorderLayout.NORTH);


        JPanel downPanel = new JPanel();
        downPanel.setMinimumSize(new Dimension(300, 50));
        downPanel.setPreferredSize(new Dimension(300, 50));
        downPanel.setBackground(Color.darkGray);
        this.add(downPanel, BorderLayout.SOUTH);

        JPanel rightPanel = new JPanel();
        rightPanel.setMinimumSize(new Dimension(70, 300));
        rightPanel.setPreferredSize(new Dimension(70, 300));
        rightPanel.setBackground(Color.darkGray);
        this.add(rightPanel, BorderLayout.EAST);


        JPanel leftPanel = new JPanel();
        leftPanel.setMinimumSize(new Dimension(70, 300));
        leftPanel.setPreferredSize(new Dimension(70, 300));
        leftPanel.setBackground(Color.darkGray);
        this.add(leftPanel, BorderLayout.WEST);
        this.add(centerPanel, BorderLayout.CENTER);
//JScrollBar

        JTextField username = new JTextField("username");
        username.setMinimumSize(new Dimension(190, 45));
        username.setPreferredSize(new Dimension(190, 45));
        centerPanel.add(username, BorderLayout.NORTH);


        JPasswordField password = new JPasswordField("password");
        password.setMinimumSize(new Dimension(190, 45));
        password.setPreferredSize(new Dimension(190, 45));
        centerPanel.add(password, BorderLayout.CENTER);


        String item[] = {"superadmin", "manager", "zookeeper", "visitor"};
        JComboBox admin = new JComboBox(item);
        admin.setMinimumSize(new Dimension(190, 30));
        admin.setPreferredSize(new Dimension(190, 30));
        upPanel.add(admin, BorderLayout.NORTH);

        JLabel login_status = new JLabel("login status");
        login_status.setForeground(Color.white);
        downPanel.add(login_status, BorderLayout.WEST);

        JButton login = new JButton("Login");
        login.setMinimumSize(new Dimension(93, 30));
        login.setPreferredSize(new Dimension(92, 30));
        centerPanel.add(login, BorderLayout.SOUTH);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String level = (String) admin.getSelectedItem();
                boolean result=login(level, username.getText(), String.valueOf(password.getText().hashCode()));
                if (result == false) {
                    login_status.setText("user or pass not found");
                    login_status.setForeground(Color.RED);
                }
                if(result == true){
                    login_status.setText("login succesfull");
                    p.setreport(level+" "+username.getText(),"login");
                    login_status.setForeground(Color.GREEN);
                    setVisible(false);

                }
            }
        });


        JButton sign_up = new JButton("sign");
        sign_up.setMinimumSize(new Dimension(92, 30));
        sign_up.setPreferredSize(new Dimension(92, 30));
        centerPanel.add(sign_up, BorderLayout.AFTER_LAST_LINE);
        sign_up.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setVisible(false);
                Sign s=new Sign();
                s.setVisible(true);
            }
        });

    JButton forgetpassword = new JButton("Forget password");
    forgetpassword.setMinimumSize(new Dimension(188, 30));
    forgetpassword.setPreferredSize(new Dimension(188, 30));
    centerPanel.add(forgetpassword, BorderLayout.AFTER_LAST_LINE);
    forgetpassword.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Forgetpassword f=new Forgetpassword();
            f.setVisible(true);
            setVisible(false);
        }
    });

        JLabel user = new JLabel("username:");
        leftPanel.add(user, BorderLayout.NORTH);
        user.setForeground(Color.white);
        EmptyBorder userborder = new EmptyBorder(15, 0, 0, 0);
        user.setBorder(userborder);


        JLabel pass = new JLabel("password:");
        leftPanel.add(pass, BorderLayout.NORTH);
        pass.setForeground(Color.white);
        EmptyBorder passborder = new EmptyBorder(27, 0, 0, 0);
        pass.setBorder(passborder);


        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        this.setSize(320, 320);
        this.setTitle("ZOO login");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }



    public boolean login(String level, String user, String pass) {
        if (level.equals("superadmin")) {
            for (int i = 0; i < Superadmin.superadmin.size(); i++) {
                if (Superadmin.superadmin.get(i).Karbariname.equals(user)) {
                    if(Superadmin.superadmin.get(i).Password.equals(pass)){
                        Superadmingrafic g=new Superadmingrafic(i);
                        g.setVisible(true);
                        return true;
                    }else {return false;}
                }
            }

        }
        if (level.equals("manager")) {
            for (int i = 0; i < Manager.manager.size(); i++) {
                if (Manager.manager.get(i).Username.equals(user)) {
                    if(Manager.manager.get(i).password.equals(pass)) {
                        Managergrafic g=new Managergrafic(i);
                        g.setVisible(true);
                        return true;
                    }else {return false;}
                }
            }
        }
        if (level.equals("zookeeper")) {
            for (int i = 0; i < Zookeeper.zookeeper.size(); i++) {
                if (Zookeeper.zookeeper.get(i).Username.equals(user)) {
                    if(Zookeeper.zookeeper.get(i).password.equals(pass)) {
                        Zookeepergrafic g=new Zookeepergrafic(i);
                        g.setVisible(true);
                        return true;
                    } else {return false;}
                }
            }
        }
        if (level.equals("visitor")) {
            for (int i = 0; i < Visitor.visitor.size(); i++) {
                if (Visitor.visitor.get(i).Username.equals(user)) {
                    if(Visitor.visitor.get(i).password.equals(pass)) {
                        Visitorgrafic g=new Visitorgrafic(i);
                        g.setVisible(true);
                        return true;
                    }else {return false;}
                }
            }
        }
        return false;
    }
    public static void main(String[]args){
        Person p=new Person() {

            @Override
            public void read_from_file() {
                super.read_from_file();
            }

        };
        p.read_from_file();

        Gerafic g=new Gerafic();
        g.setVisible(true);
        Superadmin s=new Superadmin();



    }
}
