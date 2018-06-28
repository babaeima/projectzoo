import sun.plugin2.message.Message;
import sun.plugin2.message.Serializer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class Messagegrafic extends JPanel {
    public Messagegrafic(String level){
        Person p=new Person() {
            @Override
            public void setreport(String level, String action) {
                super.setreport(level, action);
            }
        };
        setMinimumSize(new Dimension(800, 900));
        setPreferredSize(new Dimension(800, 900));
        setBackground(Color.darkGray);

        JPanel showpanel=new JPanel();
        showpanel.setMinimumSize(new Dimension(800, 100000));
        showpanel.setPreferredSize(new Dimension(800, 100000));
        this.add(showpanel);
        showpanel.setVisible(false);

        JLabel welcom = new JLabel("welcom to messages slid report");
        welcom.setMinimumSize(new Dimension(0, 100));
        welcom.setPreferredSize(new Dimension(250, 100));
        welcom.setForeground(Color.white);
        add(welcom, BorderLayout.NORTH);
        welcom.setVisible(false);


        JLabel name_lastname_label = new JLabel("plase enter your name and lastname in butten box");
        name_lastname_label.setMinimumSize(new Dimension(750, 30));
        name_lastname_label.setPreferredSize(new Dimension(750, 30));
        name_lastname_label.setForeground(Color.white);
        add(name_lastname_label, BorderLayout.NORTH);
        name_lastname_label.setVisible(false);

        JTextField lastname_name = new JTextField("Please Enter your Name and Lastname");
        lastname_name.setMinimumSize(new Dimension(650, 30));
        lastname_name.setPreferredSize(new Dimension(650, 30));
        add(lastname_name, BorderLayout.NORTH);
        lastname_name.setVisible(false);


        JLabel email_label = new JLabel("please enter your email in under box");
        email_label.setMinimumSize(new Dimension(750, 30));
        email_label.setPreferredSize(new Dimension(750, 30));
        email_label.setForeground(Color.white);
        add(email_label, BorderLayout.NORTH);
        email_label.setVisible(false);

        JTextField email = new JTextField("Plase Enter your Email");
        email.setMinimumSize(new Dimension(650, 30));
        email.setPreferredSize(new Dimension(650, 30));
        add(email, BorderLayout.NORTH);
        email.setVisible(false);



        JLabel username_label = new JLabel("plase enter your username in under box ");
        username_label.setMinimumSize(new Dimension(750, 30));
        username_label.setPreferredSize(new Dimension(750, 30));
        username_label.setForeground(Color.white);
        add(username_label, BorderLayout.NORTH);
        username_label.setVisible(false);

        JTextField username = new JTextField("Plase Enter your Username");
        username.setMinimumSize(new Dimension(650, 30));
        username.setPreferredSize(new Dimension(650, 30));
        add(username,BorderLayout.NORTH);
        username.setVisible(false);



        JLabel messagebox_label = new JLabel("plase enter your report in box");
        messagebox_label.setMinimumSize(new Dimension(750, 30));
        messagebox_label.setPreferredSize(new Dimension(750, 30));
        messagebox_label.setForeground(Color.white);
        add(messagebox_label, BorderLayout.NORTH);
        messagebox_label.setVisible(false);

        JTextField messagebox = new JTextField("Message Box");
        messagebox.setMinimumSize(new Dimension(650, 60));
        messagebox.setPreferredSize(new Dimension(650, 60));
        add(messagebox, BorderLayout.NORTH);
        messagebox.setVisible(false);

        JLabel send_status = new JLabel("send status");
        send_status.setMinimumSize(new Dimension(0, 60));
        send_status.setPreferredSize(new Dimension(150, 60));
        send_status.setForeground(Color.white);

        JLabel empity = new JLabel("                ");
        empity.setMinimumSize(new Dimension(750, 30));
        empity.setPreferredSize(new Dimension(750, 30));
        empity.setForeground(Color.white);
        add(empity, BorderLayout.NORTH);
        empity.setVisible(false);

        JButton send = new JButton("Send");
        send.setMinimumSize(new Dimension(650, 30));
        send.setPreferredSize(new Dimension(650, 30));
        add(send, BorderLayout.NORTH);
        send.setVisible(false);
        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (email.getText().matches("[a-zA-Z]+[a-zA-Z0-9]*[@][g][m][a][i][l][.][c][o][m]")) {
                    Massages m = new Massages();
                    m.name_lastname = lastname_name.getText();
                    m.emailm = email.getText();
                    m.user = username.getText();
                    m.messagetext = messagebox.getText();
                    Massages.massage.add(m);
                    send_status.setForeground(Color.GREEN);
                    Person p = new Person() {
                    };
                    p.save_arraylist_to_file_massages();
                    send_status.setText("Send Successfull");
                    p.setreport("visitor", "send message");
                }else{
                    send_status.setText("phonenumber or email not incorrect");
                    send_status.setForeground(Color.RED);
                }
            }
        });
        add(send_status, BorderLayout.NORTH);
        send_status.setVisible(false);


        if(level.equals("visitor")){
            welcom.setVisible(true);
            name_lastname_label.setVisible(true);
            lastname_name.setVisible(true);
            email_label.setVisible(true);
            email.setVisible(true);
            username_label.setVisible(true);
            username.setVisible(true);
            messagebox_label.setVisible(true);
            messagebox.setVisible(true);
            empity.setVisible(true);
            send.setVisible(true);
            send_status.setVisible(true);
        }
        if(level.equals("Zookeeper")){
            welcom.setVisible(true);
            name_lastname_label.setVisible(true);
            lastname_name.setVisible(true);
            email_label.setVisible(true);
            email.setVisible(true);
            username_label.setVisible(true);
            username.setVisible(true);
            messagebox_label.setVisible(true);
            messagebox.setVisible(true);
            empity.setVisible(true);
            send.setVisible(true);
            send_status.setVisible(true);
        }
        if(level.equals("superadmin")){

            for(int i=0;i<Massages.massage.size();i++){
                JLabel name_lastname_show = new JLabel(Massages.massage.get(i).name_lastname);
                name_lastname_show.setMinimumSize(new Dimension(750, 30));
                name_lastname_show.setPreferredSize(new Dimension(750, 30));
                showpanel.add(name_lastname_show, BorderLayout.NORTH);

                JLabel email_show = new JLabel(Massages.massage.get(i).emailm);
                email_show.setMinimumSize(new Dimension(750, 30));
                email_show.setPreferredSize(new Dimension(750, 30));
                showpanel.add(email_show, BorderLayout.NORTH);

                JLabel username_show = new JLabel(Massages.massage.get(i).user);
                username_show.setMinimumSize(new Dimension(750, 30));
                username_show.setPreferredSize(new Dimension(750, 30));
                showpanel.add(username_show, BorderLayout.NORTH);

                JLabel massagetext_show = new JLabel(Massages.massage.get(i).messagetext);
                massagetext_show.setMinimumSize(new Dimension(750, 30));
                massagetext_show.setPreferredSize(new Dimension(750, 30));
                showpanel.add(massagetext_show, BorderLayout.NORTH);

                JLabel espace = new JLabel("---------------------------------------------------------------------");
                espace.setMinimumSize(new Dimension(750, 30));
                espace.setPreferredSize(new Dimension(750, 30));
                showpanel.add(espace, BorderLayout.NORTH);
            }
            JScrollPane scroll = new JScrollPane(showpanel);
            scroll.setMinimumSize(new Dimension(800, 900));
            scroll.setPreferredSize(new Dimension(800, 900));
            add(scroll);
            showpanel.setVisible(true);
        }
        if(level.equals("manager")){

            for(int i=0;i<Massages.massage.size();i++){
                JLabel name_lastname_show = new JLabel(Massages.massage.get(i).name_lastname);
                name_lastname_show.setMinimumSize(new Dimension(750, 30));
                name_lastname_show.setPreferredSize(new Dimension(750, 30));
                showpanel.add(name_lastname_show, BorderLayout.NORTH);

                JLabel email_show = new JLabel(Massages.massage.get(i).emailm);
                email_show.setMinimumSize(new Dimension(750, 30));
                email_show.setPreferredSize(new Dimension(750, 30));
                showpanel.add(email_show, BorderLayout.NORTH);

                JLabel username_show = new JLabel(Massages.massage.get(i).user);
                username_show.setMinimumSize(new Dimension(750, 30));
                username_show.setPreferredSize(new Dimension(750, 30));
                showpanel.add(username_show, BorderLayout.NORTH);

                JLabel massagetext_show = new JLabel(Massages.massage.get(i).messagetext);
                massagetext_show.setMinimumSize(new Dimension(750, 30));
                massagetext_show.setPreferredSize(new Dimension(750, 30));
                showpanel.add(massagetext_show, BorderLayout.NORTH);

                JLabel espace = new JLabel("---------------------------------------------------------------------");
                espace.setMinimumSize(new Dimension(750, 30));
                espace.setPreferredSize(new Dimension(750, 30));
                showpanel.add(espace, BorderLayout.NORTH);
            }
            JScrollPane scroll = new JScrollPane(showpanel);
            scroll.setMinimumSize(new Dimension(800, 900));
            scroll.setPreferredSize(new Dimension(800, 900));
            add(scroll);
            showpanel.setVisible(true);
        }
    }
}
