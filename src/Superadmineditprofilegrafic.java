import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Superadmineditprofilegrafic extends JPanel {
    public Superadmineditprofilegrafic(int i){
        Person p=new Person() {
            @Override
            public void setreport(String level, String action) {
                super.setreport(level, action);
            }
        };
        setMinimumSize(new Dimension(800, 800));
        setPreferredSize(new Dimension(800, 800));
        setBackground(Color.darkGray);

        JLabel username = new JLabel("Username: "+Superadmin.superadmin.get(i).Karbariname);
        username.setMinimumSize(new Dimension(750, 30));
        username.setPreferredSize(new Dimension(750, 30));
        username.setForeground(Color.white);
        EmptyBorder usernameborder = new EmptyBorder(0, 0, 0, 0);
        username.setBorder(usernameborder);

        JLabel password = new JLabel("Password: "+Superadmin.superadmin.get(i).Password);
        password.setMinimumSize(new Dimension(750, 30));
        password.setPreferredSize(new Dimension(750, 30));
        password.setForeground(Color.white);
        EmptyBorder passwordborder = new EmptyBorder(0, 0, 0, 0);
        password.setBorder(passwordborder);


        JLabel email = new JLabel("Email: "+Superadmin.superadmin.get(i).Email);
        email.setMinimumSize(new Dimension(750, 30));
        email.setPreferredSize(new Dimension(750, 30));
        email.setForeground(Color.white);
        EmptyBorder emailborder = new EmptyBorder(0, 0, 0, 0);
        email.setBorder(emailborder);


        JLabel empity = new JLabel("                             ");
        empity.setMinimumSize(new Dimension(750, 30));
        empity.setPreferredSize(new Dimension(750, 30));


        JTextField enterusername = new JTextField(Superadmin.superadmin.get(i).Karbariname);
        enterusername.setMinimumSize(new Dimension(650, 30));
        enterusername.setPreferredSize(new Dimension(650, 30));


        JPasswordField enterpassword = new JPasswordField(Superadmin.superadmin.get(i).Password);
        enterpassword.setMinimumSize(new Dimension(650, 30));
        enterpassword.setPreferredSize(new Dimension(650, 30));


        JTextField enteremail = new JTextField(Superadmin.superadmin.get(i).Email);
        enteremail.setMinimumSize(new Dimension(650, 30));
        enteremail.setPreferredSize(new Dimension(650, 30));

        final JLabel save_status = new JLabel("save status");
        save_status.setMinimumSize(new Dimension(145, 30));
        save_status.setPreferredSize(new Dimension(145, 30));
        save_status.setForeground(Color.white);

        JButton save = new JButton("Save");
        save.setMinimumSize(new Dimension(325, 30));
        save.setPreferredSize(new Dimension(325, 30));
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (enteremail.getText().matches("[a-zA-Z]+[a-zA-Z0-9]*[@][g][m][a][i][l][.][c][o][m]")) {
                    Superadmin s = new Superadmin();
                    Superadmin.superadmin.get(i).Karbariname = enterusername.getText();
                    if (!Superadmin.superadmin.get(i).Password.equals(enterpassword.getText())) {
                        Superadmin.superadmin.get(i).Password = String.valueOf(enterpassword.getText().hashCode());
                    }
                    Superadmin.superadmin.get(i).Email = enteremail.getText();
                    s.save_arraylists_to_file();
                    save_status.setForeground(Color.GREEN);
                    save_status.setText("Edit successfull");
                    p.setreport("superadmin","edit profile");
                }else{
                    save_status.setText("phonenumber or email not incorrect");
                    save_status.setForeground(Color.RED);
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
        add(username, BorderLayout.NORTH);
        add(enterusername, BorderLayout.NORTH);
        add(password, BorderLayout.NORTH);
        add(enterpassword, BorderLayout.NORTH);
        add(email, BorderLayout.NORTH);
        add(enteremail, BorderLayout.NORTH);
        add(empity, BorderLayout.NORTH);
        add(save, BorderLayout.SOUTH);
        add(cansel, BorderLayout.SOUTH);
        add(save_status, BorderLayout.LINE_END);
    }
}
