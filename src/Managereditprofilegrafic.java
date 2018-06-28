import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Managereditprofilegrafic extends JPanel {
    public Managereditprofilegrafic(int i){
        Person p=new Person() {
            @Override
            public void setreport(String level, String action) {
                super.setreport(level, action);
            }
        };
        setMinimumSize(new Dimension(800, 800));
        setPreferredSize(new Dimension(800, 800));
        setBackground(Color.darkGray);

        JLabel name = new JLabel("Name: "+Manager.manager.get(i).Name);
        name.setMinimumSize(new Dimension(750, 30));
        name.setPreferredSize(new Dimension(750, 30));
        name.setForeground(Color.white);
        EmptyBorder nameborder = new EmptyBorder(0, 0, 0, 0);
        name.setBorder(nameborder);

        JLabel lastname = new JLabel("LastName: "+Manager.manager.get(i).lastname);
        lastname.setMinimumSize(new Dimension(750, 30));
        lastname.setPreferredSize(new Dimension(750, 30));
        lastname.setForeground(Color.white);
        EmptyBorder lastnameborder = new EmptyBorder(0, 0, 0, 0);
        lastname.setBorder(lastnameborder);

        JLabel username = new JLabel("Username: "+Manager.manager.get(i).Username);
        username.setMinimumSize(new Dimension(750, 30));
        username.setPreferredSize(new Dimension(750, 30));
        username.setForeground(Color.white);
        EmptyBorder usernameborder = new EmptyBorder(0, 0, 0, 0);
        username.setBorder(usernameborder);

        JLabel password = new JLabel("Password: "+Manager.manager.get(i).password);
        password.setMinimumSize(new Dimension(750, 30));
        password.setPreferredSize(new Dimension(750, 30));
        password.setForeground(Color.white);
        EmptyBorder passwordborder = new EmptyBorder(0, 0, 0, 0);
        password.setBorder(passwordborder);

        JLabel phonenumber = new JLabel("Phonenumber: "+Manager.manager.get(i).phonenumber);
        phonenumber.setMinimumSize(new Dimension(750, 30));
        phonenumber.setPreferredSize(new Dimension(750, 30));
        phonenumber.setForeground(Color.white);
        EmptyBorder phonenumberborder = new EmptyBorder(0, 0, 0, 0);
        phonenumber.setBorder(phonenumberborder);

        JLabel address = new JLabel("Address: "+Manager.manager.get(i).Address);
        address.setMinimumSize(new Dimension(750, 30));
        address.setPreferredSize(new Dimension(750, 30));
        address.setForeground(Color.white);
        EmptyBorder addressborder = new EmptyBorder(0, 0, 0, 0);
        address.setBorder(addressborder);

        JLabel email = new JLabel("Email: "+Manager.manager.get(i).mail);
        email.setMinimumSize(new Dimension(750, 30));
        email.setPreferredSize(new Dimension(750, 30));
        email.setForeground(Color.white);
        EmptyBorder emailborder = new EmptyBorder(0, 0, 0, 0);
        email.setBorder(emailborder);

        JLabel empity = new JLabel("                             ");
        empity.setMinimumSize(new Dimension(750, 30));
        empity.setPreferredSize(new Dimension(750, 30));


        JTextField entername = new JTextField(Manager.manager.get(i).Name);
        entername.setMinimumSize(new Dimension(650, 30));
        entername.setPreferredSize(new Dimension(650, 30));


        JTextField enterlastname = new JTextField(Manager.manager.get(i).lastname);
        enterlastname.setMinimumSize(new Dimension(650, 30));
        enterlastname.setPreferredSize(new Dimension(650, 30));


        JTextField enterusername = new JTextField(Manager.manager.get(i).Username);
        enterusername.setMinimumSize(new Dimension(650, 30));
        enterusername.setPreferredSize(new Dimension(650, 30));


        JPasswordField enterpassword = new JPasswordField(Manager.manager.get(i).password);
        enterpassword.setMinimumSize(new Dimension(650, 30));
        enterpassword.setPreferredSize(new Dimension(650, 30));


        JTextField enterphonenumber = new JTextField(Manager.manager.get(i).phonenumber);
        enterphonenumber.setMinimumSize(new Dimension(650, 30));
        enterphonenumber.setPreferredSize(new Dimension(650, 30));


        JTextField enteraddress = new JTextField(Manager.manager.get(i).Address);
        enteraddress.setMinimumSize(new Dimension(650, 30));
        enteraddress.setPreferredSize(new Dimension(650, 30));


        JTextField enteremail = new JTextField(Manager.manager.get(i).mail);
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
                if (enteremail.getText().matches("[a-zA-Z]+[a-zA-Z0-9]*[@][g][m][a][i][l][.][c][o][m]") && enterphonenumber.getText().matches("[0][9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]")) {
                    Manager m = new Manager();
                    Manager.manager.get(i).Name = entername.getText();
                    Manager.manager.get(i).lastname = enterlastname.getText();
                    Manager.manager.get(i).Username = enterusername.getText();
                    if (!Manager.manager.get(i).password.equals(enterpassword.getText())) {
                        Manager.manager.get(i).password = String.valueOf(enterpassword.getText().hashCode());
                    }
                    Manager.manager.get(i).phonenumber = enterphonenumber.getText();
                    Manager.manager.get(i).Address = enteraddress.getText();
                    Manager.manager.get(i).mail = enteremail.getText();
                    m.save_arraylists_to_file();
                    save_status.setForeground(Color.GREEN);
                    save_status.setText("Edit successfull");
                    p.setreport("manager "+i,"edit profile");
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
        add(name, BorderLayout.NORTH);
        add(entername, BorderLayout.NORTH);
        add(lastname, BorderLayout.NORTH);
        add(enterlastname, BorderLayout.NORTH);
        add(username, BorderLayout.NORTH);
        add(enterusername, BorderLayout.NORTH);
        add(password, BorderLayout.NORTH);
        add(enterpassword, BorderLayout.NORTH);
        add(phonenumber, BorderLayout.NORTH);
        add(enterphonenumber, BorderLayout.NORTH);
        add(address, BorderLayout.NORTH);
        add(enteraddress, BorderLayout.NORTH);
        add(email, BorderLayout.NORTH);
        add(enteremail, BorderLayout.NORTH);
        add(empity, BorderLayout.NORTH);
        add(save, BorderLayout.SOUTH);
        add(cansel, BorderLayout.SOUTH);
        add(save_status, BorderLayout.LINE_END);
    }

}
