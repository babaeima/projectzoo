import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class Superadmingrafic extends JFrame {
    public Managershowgrafic managershowgrafic;
    public Zookeepershowgrafic zookeepershowgrafic;
    public Visitorshowgrafic visitorshowgrafic;
    public Managereditgrafic managereditgrafic;
    public Visitoreditgrafic visitoreditgrafic;
    public Zookeepereditgrafic zookeepereditgrafic;
    public Superadmineditprofilegrafic superadmineditprofilegrafic;
    public Messagegrafic messagegrafic;
    public Report report;
    public Animaladdgrafic animaladdgrafic;
    public Animaleditegrafic animaleditegrafic;
    public Animalshowgrafic animalshowgrafic;
    public Siasatmali siasatmali;

    public Superadmingrafic(int is){
        Person p=new Person() {
            @Override
            public void setreport(String level, String action) {
                super.setreport(level, action);
            }
        };
        setMinimumSize(new Dimension(1000, 1000));
        setPreferredSize(new Dimension(1000, 1000));
        setResizable(false);
        getContentPane().setBackground(Color.white);
        managershowgrafic=new Managershowgrafic();
        zookeepershowgrafic=new Zookeepershowgrafic();
        visitorshowgrafic=new Visitorshowgrafic();
        managereditgrafic=new Managereditgrafic(0);
        visitoreditgrafic=new Visitoreditgrafic(0);
        zookeepereditgrafic=new Zookeepereditgrafic(0);
        superadmineditprofilegrafic=new Superadmineditprofilegrafic(is);
        messagegrafic=new Messagegrafic("superadmin");
        report=new Report();
        animaladdgrafic=new Animaladdgrafic();
        animaleditegrafic=new Animaleditegrafic(0);
        animalshowgrafic=new Animalshowgrafic();
        siasatmali=new Siasatmali();

        JPanel rightPanel = new JPanel();
        rightPanel.setMinimumSize(new Dimension(200, 1000));
        rightPanel.setPreferredSize(new Dimension(200, 1000));
        rightPanel.setBackground(Color.darkGray);
        this.add(rightPanel, BorderLayout.EAST);


        JPanel centerPanel = new JPanel();
        centerPanel.setMinimumSize(new Dimension(200, 200));
        centerPanel.setPreferredSize(new Dimension(200, 200));
        centerPanel.setBackground(Color.darkGray);
        this.add(centerPanel, BorderLayout.CENTER);
        centerPanel.setVisible(false);

        centerPanel.add(managershowgrafic); managershowgrafic.setVisible(false);
        centerPanel.add(zookeepershowgrafic); zookeepershowgrafic.setVisible(false);
        centerPanel.add(visitorshowgrafic); visitorshowgrafic.setVisible(false);
        centerPanel.add(managereditgrafic);managereditgrafic.setVisible(false);
        centerPanel.add(zookeepereditgrafic);zookeepereditgrafic.setVisible(false);
        centerPanel.add(visitoreditgrafic);visitoreditgrafic.setVisible(false);
        centerPanel.add(superadmineditprofilegrafic);superadmineditprofilegrafic.setVisible(false);
        centerPanel.add(messagegrafic);messagegrafic.setVisible(false);
        centerPanel.add(report);report.setVisible(false);
        centerPanel.add(animaladdgrafic);animaladdgrafic.setVisible(false);
        centerPanel.add(animaleditegrafic);animaleditegrafic.setVisible(false);
        centerPanel.add(animalshowgrafic);animalshowgrafic.setVisible(false);
        centerPanel.add(siasatmali);siasatmali.setVisible(false);

        JPanel upPanel = new JPanel();
        upPanel.setMinimumSize(new Dimension(100, 80));
        upPanel.setPreferredSize(new Dimension(100, 80));
        upPanel.setBackground(Color.darkGray);
        this.add(upPanel, BorderLayout.NORTH);


        JPanel leftPanel = new JPanel();
        leftPanel.setMinimumSize(new Dimension(800, 300));
        leftPanel.setPreferredSize(new Dimension(800, 300));
        leftPanel.setBackground(Color.YELLOW);
        this.add(leftPanel, BorderLayout.WEST);
        leftPanel.setVisible(false);


        JPanel downPanel = new JPanel();
        downPanel.setMinimumSize(new Dimension(300, 100));
        downPanel.setPreferredSize(new Dimension(300, 100));
        downPanel.setBackground(Color.darkGray);
        this.add(downPanel, BorderLayout.SOUTH);
        downPanel.setVisible(false);


        JPanel leftPaneladd = new JPanel();
        leftPaneladd.setMinimumSize(new Dimension(100, 300));
        leftPaneladd.setPreferredSize(new Dimension(100, 300));
        leftPaneladd.setBackground(Color.darkGray);
        this.add(leftPaneladd, BorderLayout.WEST);
        leftPaneladd.setVisible(false);


        String item[] = {"Wild", "Birds", "Aquatic"};
        JComboBox zookeeperdepartment = new JComboBox(item);
        zookeeperdepartment.setMinimumSize(new Dimension(650, 30));
        zookeeperdepartment.setPreferredSize(new Dimension(650, 30));
        centerPanel.add(zookeeperdepartment, BorderLayout.NORTH);
        zookeeperdepartment.setVisible(false);


        JTextField lastnameadd = new JTextField("Enter Lastname");
        lastnameadd.setMinimumSize(new Dimension(650, 30));
        lastnameadd.setPreferredSize(new Dimension(650, 30));
        centerPanel.add(lastnameadd, BorderLayout.NORTH);


        JTextField nameadd = new JTextField("Enter name");
        nameadd.setMinimumSize(new Dimension(650, 30));
        nameadd.setPreferredSize(new Dimension(650, 30));
        centerPanel.add(nameadd, BorderLayout.NORTH);


        JTextField useradd = new JTextField("Enter username");
        useradd.setMinimumSize(new Dimension(650, 30));
        useradd.setPreferredSize(new Dimension(650, 30));
        centerPanel.add(useradd, BorderLayout.NORTH);


        JTextField passadd = new JTextField("Enter Password");
        passadd.setMinimumSize(new Dimension(650, 30));
        passadd.setPreferredSize(new Dimension(650, 30));
        centerPanel.add(passadd, BorderLayout.NORTH);

        JTextField phoneadd = new JTextField("Enter Phonenumber");
        phoneadd.setMinimumSize(new Dimension(650, 30));
        phoneadd.setPreferredSize(new Dimension(650, 30));
        centerPanel.add(phoneadd, BorderLayout.NORTH);


        JTextField adrressadd = new JTextField("Enter Address");
        adrressadd.setMinimumSize(new Dimension(650, 30));
        adrressadd.setPreferredSize(new Dimension(650, 30));
        centerPanel.add(adrressadd, BorderLayout.NORTH);


        JTextField emailadd = new JTextField("Enter Email");
        emailadd.setMinimumSize(new Dimension(650, 30));
        emailadd.setPreferredSize(new Dimension(650, 30));
        centerPanel.add(emailadd, BorderLayout.NORTH);


        JTextField wageadd = new JTextField("Enter Wage");
        wageadd.setMinimumSize(new Dimension(650, 30));
        wageadd.setPreferredSize(new Dimension(650, 30));
        centerPanel.add(wageadd, BorderLayout.NORTH);

        JTextField departmentadd = new JTextField("Enter department");
        departmentadd.setMinimumSize(new Dimension(650, 30));
        departmentadd.setPreferredSize(new Dimension(650, 30));
        centerPanel.add(departmentadd, BorderLayout.NORTH);
        departmentadd.setVisible(false);

        JButton savemanager = new JButton("save manager");
        savemanager.setMinimumSize(new Dimension(650, 30));
        savemanager.setPreferredSize(new Dimension(650, 30));
        centerPanel.add(savemanager, BorderLayout.NORTH);

        JButton savezookeeper = new JButton("save zookeeper");
        savezookeeper.setMinimumSize(new Dimension(650, 30));
        savezookeeper.setPreferredSize(new Dimension(650, 30));
        centerPanel.add(savezookeeper, BorderLayout.SOUTH);
        savezookeeper.setVisible(false);

        JButton savevisitor = new JButton("save visitor");
        savevisitor.setMinimumSize(new Dimension(650, 30));
        savevisitor.setPreferredSize(new Dimension(650, 30));
        centerPanel.add(savevisitor, BorderLayout.AFTER_LAST_LINE);
        savevisitor.setVisible(false);



        JLabel Add_status = new JLabel("Add status");
        Add_status.setForeground(Color.white);
        centerPanel.add(Add_status, BorderLayout.WEST);


        JTextField enterid = new JTextField("Enter Id for Edit");
        enterid.setMinimumSize(new Dimension(200, 30));
        enterid.setPreferredSize(new Dimension(200, 30));
        downPanel.add(enterid, BorderLayout.NORTH);
        EmptyBorder ideditborder = new EmptyBorder(10, 10, 5, 10);
        enterid.setBorder(ideditborder);

        JButton editmanager = new JButton("edit manager");
        editmanager.setMinimumSize(new Dimension(200, 30));
        editmanager.setPreferredSize(new Dimension(200, 30));
        downPanel.add(editmanager, BorderLayout.SOUTH);
        EmptyBorder managerediteborder = new EmptyBorder(10, 10, 5, 10);
        editmanager.setBorder(managerediteborder);

        JButton editzookeeper = new JButton("edit zookeeper");
        editzookeeper.setMinimumSize(new Dimension(200, 30));
        editzookeeper.setPreferredSize(new Dimension(200, 30));
        downPanel.add(editzookeeper, BorderLayout.SOUTH);
        editzookeeper.setVisible(false);

        JButton editvisitor = new JButton("edit visitor");
        editvisitor.setMinimumSize(new Dimension(200, 30));
        editvisitor.setPreferredSize(new Dimension(200, 30));
        downPanel.add(editvisitor, BorderLayout.AFTER_LAST_LINE);
        editvisitor.setVisible(false);

        JButton editanimal = new JButton("edit animal");
        editanimal.setMinimumSize(new Dimension(200, 30));
        editanimal.setPreferredSize(new Dimension(200, 30));
        downPanel.add(editanimal, BorderLayout.AFTER_LAST_LINE);
        editanimal.setVisible(false);

        JTextField enteriddelete = new JTextField("Enter Id for Delete");
        enteriddelete.setMinimumSize(new Dimension(200, 30));
        enteriddelete.setPreferredSize(new Dimension(200, 30));
        downPanel.add(enteriddelete, BorderLayout.NORTH);
        EmptyBorder iddeleteborder = new EmptyBorder(10, 10, 5, 10);
        enteriddelete.setBorder(iddeleteborder);

        JButton deletereport = new JButton("delete report");
        deletereport.setMinimumSize(new Dimension(650, 30));
        deletereport.setPreferredSize(new Dimension(650, 30));
        downPanel.add(deletereport, BorderLayout.AFTER_LAST_LINE);
        deletereport.setVisible(false);


        JButton deletemanager = new JButton("delete manager");
        deletemanager.setMinimumSize(new Dimension(200, 30));
        deletemanager.setPreferredSize(new Dimension(200, 30));
        downPanel.add(deletemanager, BorderLayout.SOUTH);
        EmptyBorder managerdeleteborder = new EmptyBorder(10, 10, 5, 10);
        deletemanager.setBorder(managerdeleteborder);

        JButton deletezookeeper = new JButton("delete zookeeper");
        deletezookeeper.setMinimumSize(new Dimension(200, 30));
        deletezookeeper.setPreferredSize(new Dimension(200, 30));
        downPanel.add(deletezookeeper, BorderLayout.SOUTH);
        deletezookeeper.setVisible(false);

        JButton deletevisitor = new JButton("delete visitor");
        deletevisitor.setMinimumSize(new Dimension(200, 30));
        deletevisitor.setPreferredSize(new Dimension(200, 30));
        downPanel.add(deletevisitor, BorderLayout.AFTER_LAST_LINE);
        deletevisitor.setVisible(false);

        JButton deleteanimal = new JButton("delete animal");
        deleteanimal.setMinimumSize(new Dimension(200, 30));
        deleteanimal.setPreferredSize(new Dimension(200, 30));
        downPanel.add(deleteanimal, BorderLayout.AFTER_LAST_LINE);
        deleteanimal.setVisible(false);

        JButton deleteall = new JButton("Delete All");
        deleteall.setMinimumSize(new Dimension(800, 30));
        deleteall.setPreferredSize(new Dimension(800, 30));
        downPanel.add(deleteall, BorderLayout.SOUTH);
        deleteall.setVisible(false);

        JLabel department = new JLabel("Department:");
        leftPaneladd.add(department, BorderLayout.NORTH);
        department.setForeground(Color.white);
        EmptyBorder departmentborder = new EmptyBorder(0, 0, 0, 0);
        department.setBorder(departmentborder);
        department.setVisible(false);


        JLabel lastname = new JLabel("Last Name:");
        leftPaneladd.add(lastname, BorderLayout.NORTH);
        lastname.setForeground(Color.white);
        EmptyBorder lastnameborder = new EmptyBorder(15, 0, 0, 0);
        lastname.setBorder(lastnameborder);


        JLabel name = new JLabel("Name:");
        leftPaneladd.add(name, BorderLayout.NORTH);
        name.setForeground(Color.white);
        EmptyBorder nameborder = new EmptyBorder(15, 0, 0, 0);
        name.setBorder(nameborder);


        JLabel user = new JLabel("Username:");
        leftPaneladd.add(user, BorderLayout.NORTH);
        user.setForeground(Color.white);
        EmptyBorder userborder = new EmptyBorder(15, 0, 0, 0);
        user.setBorder(userborder);


        JLabel pass = new JLabel("Password:");
        leftPaneladd.add(pass, BorderLayout.NORTH);
        pass.setForeground(Color.white);
        EmptyBorder passborder = new EmptyBorder(15, 0, 0, 0);
        pass.setBorder(passborder);


        JLabel phonenumber = new JLabel("Phone number:");
        leftPaneladd.add(phonenumber, BorderLayout.NORTH);
        phonenumber.setForeground(Color.white);
        EmptyBorder phonenumberborder = new EmptyBorder(15, 0, 0, 0);
        phonenumber.setBorder(phonenumberborder);


        JLabel address = new JLabel("Address  :");
        leftPaneladd.add(address, BorderLayout.NORTH);
        address.setForeground(Color.white);
        EmptyBorder addressborder = new EmptyBorder(10, 0, 0, 0);
        address.setBorder(addressborder);


        JLabel email1 = new JLabel("Email  :");
        leftPaneladd.add(email1, BorderLayout.NORTH);
        email1.setForeground(Color.white);
        EmptyBorder emailborder1 = new EmptyBorder(15, 10, 0, 10);
        email1.setBorder(emailborder1);


        JLabel wage = new JLabel("wage:");
        leftPaneladd.add(wage, BorderLayout.NORTH);
        wage.setForeground(Color.white);
        EmptyBorder emailborder2 = new EmptyBorder(15, 0, 0, 0);
        wage.setBorder(emailborder2);

        JButton showmanager = new JButton("show manager");
        showmanager.setMinimumSize(new Dimension(400, 30));
        showmanager.setPreferredSize(new Dimension(400, 30));
        downPanel.add(showmanager, BorderLayout.SOUTH);
        showmanager.setVisible(false);


        JButton addmanager = new JButton("Add manager");
        addmanager.setMinimumSize(new Dimension(400, 30));
        addmanager.setPreferredSize(new Dimension(400, 30));
        downPanel.add(addmanager, BorderLayout.SOUTH);
        addmanager.setVisible(false);

        JButton showzookeeper = new JButton("show zookeeper");
        showzookeeper.setMinimumSize(new Dimension(400, 30));
        showzookeeper.setPreferredSize(new Dimension(400, 30));
        downPanel.add(showzookeeper, BorderLayout.AFTER_LAST_LINE);
        showzookeeper.setVisible(false);

        JButton addzookeeper = new JButton("add zookeeper");
        addzookeeper.setMinimumSize(new Dimension(400, 30));
        addzookeeper.setPreferredSize(new Dimension(400, 30));
        downPanel.add(addzookeeper, BorderLayout.AFTER_LAST_LINE);
        addzookeeper.setVisible(false);

        JButton showvisitor = new JButton("show visitor");
        showvisitor.setMinimumSize(new Dimension(400, 30));
        showvisitor.setPreferredSize(new Dimension(400, 30));
        downPanel.add(showvisitor, BorderLayout.AFTER_LAST_LINE);
        showvisitor.setVisible(false);

        JButton addvisitor = new JButton("add visitor");
        addvisitor.setMinimumSize(new Dimension(400, 30));
        addvisitor.setPreferredSize(new Dimension(400, 30));
        downPanel.add(addvisitor, BorderLayout.AFTER_LAST_LINE);
        addvisitor.setVisible(false);

        JButton showanimal = new JButton("show animal");
        showanimal.setMinimumSize(new Dimension(400, 30));
        showanimal.setPreferredSize(new Dimension(400, 30));
        downPanel.add(showanimal, BorderLayout.AFTER_LAST_LINE);
        showanimal.setVisible(false);

        JButton addanimal = new JButton("add animal");
        addanimal.setMinimumSize(new Dimension(400, 30));
        addanimal.setPreferredSize(new Dimension(400, 30));
        downPanel.add(addanimal, BorderLayout.AFTER_LAST_LINE);
        addanimal.setVisible(false);

        JButton b1 = new JButton("Edit profile");
        b1.setMinimumSize(new Dimension(180, 70));
        b1.setPreferredSize(new Dimension(180, 70));
        rightPanel.add(b1, BorderLayout.AFTER_LAST_LINE);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

               leftPanel.setVisible(false);
                centerPanel.setVisible(false);
                leftPaneladd.setVisible(false);
                downPanel.setVisible(false);

                Add_status.setVisible(false);
                savemanager.setVisible(false);
                nameadd.setVisible(false);
                lastnameadd.setVisible(false);
                emailadd.setVisible(false);
                adrressadd.setVisible(false);
                wageadd.setVisible(false);
                useradd.setVisible(false);
                phoneadd.setVisible(false);
                passadd.setVisible(false);
                departmentadd.setVisible(false);
                animalshowgrafic.setVisible(false);
                animaladdgrafic.setVisible(false);
                animaleditegrafic.setVisible(false);
                managershowgrafic.setVisible(false);
                managereditgrafic.setVisible(false);
                zookeepershowgrafic.setVisible(false);
                zookeepereditgrafic.setVisible(false);
                visitorshowgrafic.setVisible(false);
                visitoreditgrafic.setVisible(false);
                report.setVisible(false);
                messagegrafic.setVisible(false);
                siasatmali.setVisible(false);
                superadmineditprofilegrafic.setVisible(true);
                centerPanel.setVisible(true);

            }
        });

        JButton b2 = new JButton("Manager");
        b2.setMinimumSize(new Dimension(180, 70));
        b2.setPreferredSize(new Dimension(180, 70));
        rightPanel.add(b2, BorderLayout.AFTER_LAST_LINE);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                editmanager.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        if(enterid.getText().matches("[0-9]*")) {
                            p.setreport("superadmin", "editmanagerenter "+enterid.getText());
                            centerPanel.remove(managereditgrafic);
                            managereditgrafic = new Managereditgrafic(Integer.parseInt(enterid.getText()));
                            centerPanel.add(managereditgrafic);
                            managereditgrafic.setVisible(false);
                            managereditgrafic.setVisible(true);
                            centerPanel.setVisible(true);
                        }else{
                            System.out.println("entered not inccorect");
                        }
                        leftPaneladd.setVisible(false);
                        visitorshowgrafic.setVisible(false);
                        zookeepershowgrafic.setVisible(false);
                        managershowgrafic.setVisible(false);
                        zookeepereditgrafic.setVisible(false);
                        visitoreditgrafic.setVisible(false);
                        adrressadd.setVisible(false);
                        departmentadd.setVisible(false);
                        emailadd.setVisible(false);
                        lastnameadd.setVisible(false);
                        nameadd.setVisible(false);
                        passadd.setVisible(false);
                        phoneadd.setVisible(false);
                        useradd.setVisible(false);
                        wageadd.setVisible(false);
                        savemanager.setVisible(false);
                        Add_status.setVisible(false);

                    }
                });
                deletemanager.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        if (enteriddelete.getText().matches("[0-9]*")) {
                            Manager m = new Manager();
                            m.removemanager(enteriddelete.getText());
                            p.setreport("superadmin", "deletemanager" + enteriddelete.getText());
                        }else{
                            System.out.println("entered not inccorect");
                        }
                    }
                });
                showmanager.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        p.setreport("superadmin","showmanager");
                        centerPanel.remove(managershowgrafic);
                        managershowgrafic=new Managershowgrafic();
                        centerPanel.add(managershowgrafic);
                        centerPanel.setVisible(false);
                        leftPaneladd.setVisible(false);
                        leftPanel.setVisible(false);

                        visitorshowgrafic.setVisible(false);
                        zookeepershowgrafic.setVisible(false);
                        managershowgrafic.setVisible(true);
                        managereditgrafic.setVisible(false);
                        zookeepereditgrafic.setVisible(false);
                        visitoreditgrafic.setVisible(false);
                        adrressadd.setVisible(false);
                        emailadd.setVisible(false);
                        lastnameadd.setVisible(false);
                        nameadd.setVisible(false);
                        passadd.setVisible(false);
                        phoneadd.setVisible(false);
                        useradd.setVisible(false);
                        wageadd.setVisible(false);
                        savemanager.setVisible(false);
                        Add_status.setVisible(false);

                        centerPanel.setVisible(true);
                    }
                });
                addmanager.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        Report r=new Report();
                        Report.report.add(r);
                        centerPanel.setVisible(false);
                        leftPanel.setVisible(false);

                        visitorshowgrafic.setVisible(false);
                        zookeepershowgrafic.setVisible(false);
                        managershowgrafic.setVisible(false);
                        managereditgrafic.setVisible(false);
                        zookeepereditgrafic.setVisible(false);
                        visitoreditgrafic.setVisible(false);

                        department.setVisible(false);
                        zookeeperdepartment.setVisible(false);
                        wage.setVisible(true);
                        wageadd.setVisible(true);
                        savemanager.setVisible(true);
                        savevisitor.setVisible(false);
                        savezookeeper.setVisible(false);
                        adrressadd.setVisible(true);
                        emailadd.setVisible(true);
                        lastnameadd.setVisible(true);
                        nameadd.setVisible(true);
                        passadd.setVisible(true);
                        phoneadd.setVisible(true);
                        useradd.setVisible(true);
                        savemanager.setVisible(true);
                        Add_status.setVisible(true);
                        managereditgrafic.setVisible(false);


                        leftPaneladd.setVisible(true);
                        centerPanel.setVisible(true);

                        savemanager.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent actionEvent) {
                                p.setreport("superadmin","addmanager "+String.valueOf(Manager.manager.size()));
                                if(emailadd.getText().matches("[a-zA-Z]+[a-zA-Z0-9]*[@][g][m][a][i][l][.][c][o][m]") && phoneadd.getText().matches("[0][9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]")) {

                                    Manager m = new Manager();
                                    m.savemanager(String.valueOf(Manager.manager.size()), lastnameadd.getText(), nameadd.getText(), useradd.getText(), passadd.getText(), phoneadd.getText(), adrressadd.getText(), emailadd.getText(), wageadd.getText());

                                    if (m.dublicat(useradd.getText(), emailadd.getText())) {
                                        Manager.manager.add(m);
                                        m.savemanagertofile(Manager.manager.size() - 1);
                                        Add_status.setText("Add successfull");
                                        Add_status.setForeground(Color.GREEN);
                                    } else {
                                        Add_status.setText("Add fail manager is dublicat");
                                        Add_status.setForeground(Color.RED);
                                    }
                                }else{
                                    Add_status.setText("phonenumber or email not incorrect");
                                    Add_status.setForeground(Color.RED);
                                }

                            }
                        });
                    }
                });
                downPanel.setVisible(false);
                leftPanel.setVisible(false);
                leftPaneladd.setVisible(false);
                centerPanel.setVisible(false);
                siasatmali.setVisible(false);
                deletezookeeper.setVisible(false);
                deletevisitor.setVisible(false);
                deletemanager.setVisible(true);
                editvisitor.setVisible(false);
                editzookeeper.setVisible(false);
                editmanager.setVisible(true);
                addvisitor.setVisible(false);
                addmanager.setVisible(true);
                addzookeeper.setVisible(false);
                showvisitor.setVisible(false);
                showmanager.setVisible(true);
                showzookeeper.setVisible(false);
                animaladdgrafic.setVisible(false);
                animalshowgrafic.setVisible(false);
                animaleditegrafic.setVisible(false);
                addanimal.setVisible(false);
                deleteanimal.setVisible(false);
                editanimal.setVisible(false);
                showanimal.setVisible(false);
                adrressadd.setVisible(false);
                departmentadd.setVisible(false);
                emailadd.setVisible(false);
                lastnameadd.setVisible(false);
                nameadd.setVisible(false);
                passadd.setVisible(false);
                phoneadd.setVisible(false);
                useradd.setVisible(false);
                wageadd.setVisible(false);
                savemanager.setVisible(false);
                Add_status.setVisible(false);
                managereditgrafic.setVisible(false);
                superadmineditprofilegrafic.setVisible(false);
                deletereport.setVisible(false);
                deleteall.setVisible(false);
                enterid.setVisible(true);
                report.setVisible(false);
                zookeeperdepartment.setVisible(false);
                savezookeeper.setVisible(false);
                downPanel.setVisible(true);
                messagegrafic.setVisible(false);
                superadmineditprofilegrafic.setVisible(false);
            }
        });

        JButton b3 = new JButton("Zookeeper");
        b3.setMinimumSize(new Dimension(180, 70));
        b3.setPreferredSize(new Dimension(180, 70));
        rightPanel.add(b3, BorderLayout.AFTER_LAST_LINE);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                editzookeeper.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        if(enterid.getText().matches("[0-9]*")) {
                            p.setreport("superadmin", "editezookeeperenter "+enterid.getText());
                            centerPanel.remove(zookeepereditgrafic);
                            zookeepereditgrafic = new Zookeepereditgrafic(Integer.parseInt(enterid.getText()));
                            centerPanel.add(zookeepereditgrafic);zookeepereditgrafic.setVisible(false);
                            zookeepereditgrafic.setVisible(true);
                            centerPanel.setVisible(true);
                        }else{
                            System.out.println("entered not inccorect");
                        }

                        leftPaneladd.setVisible(false);
                        visitorshowgrafic.setVisible(false);
                        zookeepershowgrafic.setVisible(false);
                        managershowgrafic.setVisible(false);
                        visitoreditgrafic.setVisible(false);
                        managereditgrafic.setVisible(false);
                        adrressadd.setVisible(false);
                        departmentadd.setVisible(false);
                        emailadd.setVisible(false);
                        lastnameadd.setVisible(false);
                        nameadd.setVisible(false);
                        passadd.setVisible(false);
                        phoneadd.setVisible(false);
                        useradd.setVisible(false);
                        wageadd.setVisible(false);
                        savemanager.setVisible(false);
                        Add_status.setVisible(false);
                        zookeeperdepartment.setVisible(false);
                        savezookeeper.setVisible(false);
                    }
                });
                deletezookeeper.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        if (enteriddelete.getText().matches("[0-9]*")) {
                            Zookeeper z = new Zookeeper();
                            z.removezookeeper(enteriddelete.getText());
                            p.setreport("superadmin", "deletezookeeper " + enteriddelete.getText());
                        }else{
                            System.out.println("entered not inccorect");
                        }
                    }
                });
                showzookeeper.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        p.setreport("superadmin","showzookeeper");
                        centerPanel.remove(zookeepershowgrafic);
                        zookeepershowgrafic=new Zookeepershowgrafic();
                        centerPanel.add(zookeepershowgrafic);
                        leftPaneladd.setVisible(false);
                        centerPanel.setVisible(false);

                        managershowgrafic.setVisible(false);
                        visitorshowgrafic.setVisible(false);
                        zookeepershowgrafic.setVisible(true);
                        managereditgrafic.setVisible(false);
                        zookeepereditgrafic.setVisible(false);
                        visitoreditgrafic.setVisible(false);
                        adrressadd.setVisible(false);
                        departmentadd.setVisible(false);
                        emailadd.setVisible(false);
                        lastnameadd.setVisible(false);
                        nameadd.setVisible(false);
                        passadd.setVisible(false);
                        phoneadd.setVisible(false);
                        useradd.setVisible(false);
                        wageadd.setVisible(false);
                        savemanager.setVisible(false);
                        Add_status.setVisible(false);
                        zookeeperdepartment.setVisible(false);
                        savezookeeper.setVisible(false);

                        centerPanel.setVisible(true);
                    }
                });
                addzookeeper.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        managershowgrafic.setVisible(false);
                        visitorshowgrafic.setVisible(false);
                        zookeepershowgrafic.setVisible(false);
                        managereditgrafic.setVisible(false);
                        zookeepereditgrafic.setVisible(false);
                        visitoreditgrafic.setVisible(false);

                        zookeeperdepartment.setVisible(true);
                        department.setVisible(true);
                        wage.setVisible(true);
                        wageadd.setVisible(true);
                        savemanager.setVisible(false);
                        savevisitor.setVisible(false);
                        savezookeeper.setVisible(true);
                        adrressadd.setVisible(true);
                        departmentadd.setVisible(true);
                        emailadd.setVisible(true);
                        lastnameadd.setVisible(true);
                        nameadd.setVisible(true);
                        passadd.setVisible(true);
                        phoneadd.setVisible(true);
                        useradd.setVisible(true);
                        wageadd.setVisible(true);
                        savemanager.setVisible(true);
                        Add_status.setVisible(true);
                        savemanager.setVisible(false);
                        departmentadd.setVisible(false);

                        centerPanel.setVisible(true);
                        leftPaneladd.setVisible(true);

                        savezookeeper.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent actionEvent) {
                                p.setreport("superadmin","addzookeeper "+String.valueOf(Zookeeper.zookeeper.size()));
                                if(emailadd.getText().matches("[a-zA-Z]+[a-zA-Z0-9]*[@][g][m][a][i][l][.][c][o][m]") && phoneadd.getText().matches("[0][9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]") && wageadd.getText().matches("[0-9]*")) {
                                    Zookeeper z = new Zookeeper();
                                    z.savezookeeper(String.valueOf(Zookeeper.zookeeper.size()), lastnameadd.getText(), nameadd.getText(), useradd.getText(), passadd.getText(), phoneadd.getText(), adrressadd.getText(), emailadd.getText(), wageadd.getText(), (String) zookeeperdepartment.getSelectedItem());
                                    if (z.dublicat(useradd.getText(), emailadd.getText())) {
                                        Zookeeper.zookeeper.add(z);
                                        z.savezookeepertofile(Zookeeper.zookeeper.size() - 1);
                                        Add_status.setText("Add Successfull");
                                        Add_status.setForeground(Color.GREEN);
                                    } else {
                                        Add_status.setText("Add fail zookeeper is dublicat");
                                        Add_status.setForeground(Color.RED);
                                    }
                                }else{
                                    Add_status.setText("phonenumber or email not incorrect");
                                    Add_status.setForeground(Color.RED);
                                }
                            }
                        });
                    }
                });
                downPanel.setVisible(false);
                leftPaneladd.setVisible(false);
                centerPanel.setVisible(false);
                leftPanel.setVisible(false);
                siasatmali.setVisible(false);
                deletezookeeper.setVisible(true);
                deletevisitor.setVisible(false);
                deletemanager.setVisible(false);
                editvisitor.setVisible(false);
                editzookeeper.setVisible(true);
                editmanager.setVisible(false);
                addmanager.setVisible(false);
                addzookeeper.setVisible(true);
                addvisitor.setVisible(false);
                showmanager.setVisible(false);
                showzookeeper.setVisible(true);
                showvisitor.setVisible(false);
                adrressadd.setVisible(false);
                departmentadd.setVisible(false);
                emailadd.setVisible(false);
                lastnameadd.setVisible(false);
                nameadd.setVisible(false);
                passadd.setVisible(false);
                phoneadd.setVisible(false);
                useradd.setVisible(false);
                wageadd.setVisible(false);
                savemanager.setVisible(false);
                Add_status.setVisible(false);
                deletereport.setVisible(false);
                animaleditegrafic.setVisible(false);
                animalshowgrafic.setVisible(false);
                animaladdgrafic.setVisible(false);
                addanimal.setVisible(false);
                deleteanimal.setVisible(false);
                editanimal.setVisible(false);
                showanimal.setVisible(false);
                deleteall.setVisible(false);
                enterid.setVisible(true);
                downPanel.setVisible(true);
                report.setVisible(false);
                messagegrafic.setVisible(false);
                superadmineditprofilegrafic.setVisible(false);
            }
        });


        JButton b4 = new JButton("Visitor");
        b4.setMinimumSize(new Dimension(180, 70));
        b4.setPreferredSize(new Dimension(180, 70));
        rightPanel.add(b4, BorderLayout.AFTER_LAST_LINE);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                editvisitor.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        if(enterid.getText().matches("[0-9]*")) {
                            p.setreport("superadmin", "editvisitorenter "+enterid.getText());
                            centerPanel.remove(visitoreditgrafic);
                            visitoreditgrafic = new Visitoreditgrafic(Integer.parseInt(enterid.getText()));
                            centerPanel.add(visitoreditgrafic);
                            visitoreditgrafic.setVisible(false);
                            visitoreditgrafic.setVisible(true);
                            centerPanel.setVisible(true);
                        }else{
                            System.out.println("entered not incorect");
                        }
                        leftPaneladd.setVisible(false);
                        visitorshowgrafic.setVisible(false);
                        zookeepershowgrafic.setVisible(false);
                        managershowgrafic.setVisible(false);
                        zookeepereditgrafic.setVisible(false);
                        managereditgrafic.setVisible(false);
                        adrressadd.setVisible(false);
                        departmentadd.setVisible(false);
                        emailadd.setVisible(false);
                        lastnameadd.setVisible(false);
                        nameadd.setVisible(false);
                        passadd.setVisible(false);
                        phoneadd.setVisible(false);
                        useradd.setVisible(false);
                        wageadd.setVisible(false);
                        savemanager.setVisible(false);
                        Add_status.setVisible(false);
                        savevisitor.setVisible(false);
                    }
                });
                deletevisitor.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        if (enteriddelete.getText().matches("[0-9]*")) {
                            Visitor v = new Visitor();
                            v.removevisitor(enteriddelete.getText());
                            p.setreport("superadmin", "deletevisitor " + enteriddelete.getText());
                        }else{
                            System.out.println("entered not incorect");
                        }
                    }
                });
                showvisitor.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        p.setreport("superadmin","showvisitor");
                        centerPanel.remove(visitorshowgrafic);
                        visitorshowgrafic=new Visitorshowgrafic();
                        centerPanel.add(visitorshowgrafic);
                        leftPaneladd.setVisible(false);
                        centerPanel.setVisible(false);

                        managershowgrafic.setVisible(false);
                        visitorshowgrafic.setVisible(true);
                        zookeepershowgrafic.setVisible(false);
                        managereditgrafic.setVisible(false);
                        zookeepereditgrafic.setVisible(false);
                        visitoreditgrafic.setVisible(false);
                        adrressadd.setVisible(false);
                        departmentadd.setVisible(false);
                        emailadd.setVisible(false);
                        lastnameadd.setVisible(false);
                        nameadd.setVisible(false);
                        passadd.setVisible(false);
                        phoneadd.setVisible(false);
                        useradd.setVisible(false);
                        wageadd.setVisible(false);
                        savemanager.setVisible(false);
                        Add_status.setVisible(false);
                        animaleditegrafic.setVisible(false);
                        animalshowgrafic.setVisible(false);
                        animaladdgrafic.setVisible(false);
                        addanimal.setVisible(false);
                        deleteanimal.setVisible(false);
                        editanimal.setVisible(false);
                        showanimal.setVisible(false);
                        savevisitor.setVisible(false);

                        centerPanel.setVisible(true);
                    }
                });
                addvisitor.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        managershowgrafic.setVisible(false);
                        visitorshowgrafic.setVisible(false);
                        zookeepershowgrafic.setVisible(false);
                        managereditgrafic.setVisible(false);
                        zookeepereditgrafic.setVisible(false);
                        visitoreditgrafic.setVisible(false);

                        zookeeperdepartment.setVisible(false);
                        department.setVisible(false);
                        wage.setVisible(false);
                        wageadd.setVisible(false);
                        savemanager.setVisible(false);
                        savevisitor.setVisible(true);
                        savezookeeper.setVisible(false);
                        savemanager.setVisible(false);
                        departmentadd.setVisible(false);
                        adrressadd.setVisible(true);
                        departmentadd.setVisible(false);
                        emailadd.setVisible(true);
                        lastnameadd.setVisible(true);
                        nameadd.setVisible(true);
                        passadd.setVisible(true);
                        phoneadd.setVisible(true);
                        useradd.setVisible(true);
                        wageadd.setVisible(false);
                        savemanager.setVisible(false);
                        Add_status.setVisible(true);

                        centerPanel.setVisible(true);
                        leftPaneladd.setVisible(true);
                        savevisitor.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent actionEvent) {
                                p.setreport("superadmin","addvisitor "+String.valueOf(Visitor.visitor.size()));
                                if(emailadd.getText().matches("[a-zA-Z]+[a-zA-Z0-9]*[@][g][m][a][i][l][.][c][o][m]") && phoneadd.getText().matches("[0][9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]")) {
                                    Visitor v = new Visitor();
                                    v.savevisitor(String.valueOf(Visitor.visitor.size()), lastnameadd.getText(), nameadd.getText(), useradd.getText(), passadd.getText(), phoneadd.getText(), adrressadd.getText(), emailadd.getText(), "0");
                                    if (v.dublicat(useradd.getText(), emailadd.getText())) {
                                        Visitor.visitor.add(v);
                                        v.savevisitortofile(Visitor.visitor.size() - 1);
                                        Add_status.setText("Add Successfull");
                                        Add_status.setForeground(Color.GREEN);
                                    } else {
                                        Add_status.setText("Add fail visitor is dublicat");
                                        Add_status.setForeground(Color.RED);
                                    }
                                }else{
                                    Add_status.setText("phonenumber or email not incorrect");
                                    Add_status.setForeground(Color.RED);
                                }
                    }
                });
            }
        });
                downPanel.setVisible(false);
                leftPaneladd.setVisible(false);
                centerPanel.setVisible(false);
                leftPanel.setVisible(false);
                siasatmali.setVisible(false);
                deletezookeeper.setVisible(false);
                deletevisitor.setVisible(true);
                deletemanager.setVisible(false);
                editvisitor.setVisible(true);
                editzookeeper.setVisible(false);
                editmanager.setVisible(false);
                addmanager.setVisible(false);
                addzookeeper.setVisible(false);
                addvisitor.setVisible(true);
                showmanager.setVisible(false);
                showzookeeper.setVisible(false);
                showvisitor.setVisible(true);
                deletereport.setVisible(false);
                animaleditegrafic.setVisible(false);
                animalshowgrafic.setVisible(false);
                animaladdgrafic.setVisible(false);
                addanimal.setVisible(false);
                deleteanimal.setVisible(false);
                editanimal.setVisible(false);
                showanimal.setVisible(false);
                deleteall.setVisible(false);
                enterid.setVisible(true);
                report.setVisible(false);
                downPanel.setVisible(true);
                zookeeperdepartment.setVisible(false);
                savezookeeper.setVisible(false);
                messagegrafic.setVisible(false);
                superadmineditprofilegrafic.setVisible(false);

            }
        });



        JButton b8 = new JButton("Animal");
        b8.setMinimumSize(new Dimension(180, 70));
        b8.setPreferredSize(new Dimension(180, 70));
        rightPanel.add(b8, BorderLayout.AFTER_LAST_LINE);
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                editanimal.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        if(enterid.getText().matches("[0-9]*")) {
                            p.setreport("superadmin", "editanimalenter "+enterid.getText());
                            centerPanel.remove(animaleditegrafic);
                            animaleditegrafic = new Animaleditegrafic(Integer.parseInt(enterid.getText()));
                            centerPanel.add(animaleditegrafic);
                            animaleditegrafic.setVisible(false);
                            animaleditegrafic.setVisible(true);
                            centerPanel.setVisible(true);
                        }else{
                            System.out.println("entered not inccorect");
                        }
                        leftPaneladd.setVisible(false);
                        visitorshowgrafic.setVisible(false);
                        zookeepershowgrafic.setVisible(false);
                        managershowgrafic.setVisible(false);
                        zookeepereditgrafic.setVisible(false);
                        visitoreditgrafic.setVisible(false);
                        managereditgrafic.setVisible(false);
                        animaladdgrafic.setVisible(false);
                        animalshowgrafic.setVisible(false);
                    }
                });
                deleteanimal.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        if (enteriddelete.getText().matches("[0-9]*")) {
                            if (Integer.parseInt(enteriddelete.getText()) >= 1000 & Integer.parseInt(enteriddelete.getText()) < 2000) {
                                Aquatic a = new Aquatic();
                                a.removeaquaticanimal(Integer.parseInt(enteriddelete.getText()) - 1000);
                            }
                            if (Integer.parseInt(enteriddelete.getText()) >= 2000 & Integer.parseInt(enteriddelete.getText()) < 3000) {
                                Birds b = new Birds();
                                b.removebirdanimal(Integer.parseInt(enteriddelete.getText()) - 2000);
                            }
                            if (Integer.parseInt(enteriddelete.getText()) >= 3000 & Integer.parseInt(enteriddelete.getText()) < 4000) {
                                Wild w = new Wild();
                                w.removewildanimal(Integer.parseInt(enteriddelete.getText()) - 3000);
                            }
                            p.setreport("superadmin", "deleteanimal " + enteriddelete.getText());
                        }else{
                            System.out.println("entered not inccorect");
                        }
                    }
                });
                showanimal.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        p.setreport("superadmin","showmanimal");
                        centerPanel.remove(animalshowgrafic);
                        animalshowgrafic=new Animalshowgrafic();
                        centerPanel.add(animalshowgrafic);
                        leftPaneladd.setVisible(false);
                        centerPanel.setVisible(false);

                        managershowgrafic.setVisible(false);
                        visitorshowgrafic.setVisible(false);
                        zookeepershowgrafic.setVisible(false);
                        managereditgrafic.setVisible(false);
                        zookeepereditgrafic.setVisible(false);
                        visitoreditgrafic.setVisible(false);
                        animalshowgrafic.setVisible(true);
                        animaladdgrafic.setVisible(false);
                        animaleditegrafic.setVisible(false);

                        centerPanel.setVisible(true);
                    }
                });
                addanimal.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        p.setreport("superadmin","addanimalenter");
                        managershowgrafic.setVisible(false);
                        visitorshowgrafic.setVisible(false);
                        zookeepershowgrafic.setVisible(false);
                        managereditgrafic.setVisible(false);
                        zookeepereditgrafic.setVisible(false);
                        visitoreditgrafic.setVisible(false);
                        zookeeperdepartment.setVisible(false);
                        department.setVisible(false);
                        wage.setVisible(false);
                        wageadd.setVisible(false);
                        savemanager.setVisible(false);
                        savevisitor.setVisible(false);
                        savezookeeper.setVisible(false);
                        animaladdgrafic.setVisible(true);

                        centerPanel.setVisible(true);
                        leftPaneladd.setVisible(false);
                    }
                });
                downPanel.setVisible(false);
                leftPaneladd.setVisible(false);
                centerPanel.setVisible(false);
                leftPanel.setVisible(false);
                siasatmali.setVisible(false);
                deletezookeeper.setVisible(false);
                deletevisitor.setVisible(false);
                deletemanager.setVisible(false);
                editvisitor.setVisible(false);
                editzookeeper.setVisible(false);
                editmanager.setVisible(false);
                addmanager.setVisible(false);
                addzookeeper.setVisible(false);
                addvisitor.setVisible(false);
                showmanager.setVisible(false);
                showzookeeper.setVisible(false);
                showvisitor.setVisible(false);
                deleteanimal.setVisible(true);
                editanimal.setVisible(true);
                addanimal.setVisible(true);
                showanimal.setVisible(true);
                adrressadd.setVisible(false);
                departmentadd.setVisible(false);
                emailadd.setVisible(false);
                lastnameadd.setVisible(false);
                nameadd.setVisible(false);
                passadd.setVisible(false);
                phoneadd.setVisible(false);
                useradd.setVisible(false);
                wageadd.setVisible(false);
                savemanager.setVisible(false);
                Add_status.setVisible(false);
                deleteall.setVisible(false);
                enterid.setVisible(true);
                messagegrafic.setVisible(false);
                report.setVisible(false);
                deletereport.setVisible(false);
                deleteall.setVisible(false);
                enterid.setVisible(true);
                report.setVisible(false);
                downPanel.setVisible(true);
                messagegrafic.setVisible(false);
                superadmineditprofilegrafic.setVisible(false);
            }
        });


        JButton b5 = new JButton("Masage");
        b5.setMinimumSize(new Dimension(180, 70));
        b5.setPreferredSize(new Dimension(180, 70));
        rightPanel.add(b5, BorderLayout.AFTER_LAST_LINE);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                p.setreport("superadmin","showmessages");
                messagegrafic.setVisible(true);
                centerPanel.setVisible(true);
                downPanel.setVisible(false);
                deletereport.setVisible(false);
                leftPaneladd.setVisible(false);
                report.setVisible(false);
                managereditgrafic.setVisible(false);
                managershowgrafic.setVisible(false);
                zookeepereditgrafic.setVisible(false);
                zookeepershowgrafic.setVisible(false);
                visitoreditgrafic.setVisible(false);
                visitorshowgrafic.setVisible(false);
                superadmineditprofilegrafic.setVisible(false);
                siasatmali.setVisible(false);
            }
        });


        JButton b6 = new JButton("Report");
        b6.setMinimumSize(new Dimension(180, 70));
        b6.setPreferredSize(new Dimension(180, 70));
        rightPanel.add(b6, BorderLayout.AFTER_LAST_LINE);
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                deletereport.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        if(enteriddelete.getText().matches("[0-9]*")){
                            Report r=new Report();
                            r.deletereport(Integer.parseInt(enteriddelete.getText()));
                            p.setreport("superadmin","deleterepurt "+enteriddelete.getText());
                        }else{
                            System.out.println("entered not inccorect");
                        }
                    }
                });
                deleteall.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        if (Report.report.size() != 0) {
                            while (Report.report.size() != 0) {
                                Report.report.remove(0);
                            }
                            System.out.println(Report.report.size());
                            p.save_arraylist_to_file_report();
                            p.read_from_file();
                            centerPanel.remove(report);
                            report=new Report();
                            centerPanel.add(report);
                        }
                    }
                });
                adrressadd.setVisible(false);
                departmentadd.setVisible(false);
                emailadd.setVisible(false);
                lastnameadd.setVisible(false);
                nameadd.setVisible(false);
                passadd.setVisible(false);
                phoneadd.setVisible(false);
                useradd.setVisible(false);
                wageadd.setVisible(false);
                savemanager.setVisible(false);
                Add_status.setVisible(false);
                centerPanel.remove(report);
                report=new Report();
                centerPanel.add(report);report.setVisible(false);
                report.setVisible(true);
                downPanel.setVisible(false);
                leftPanel.setVisible(false);
                leftPanel.setBackground(Color.MAGENTA);
                enterid.setVisible(false);
                addmanager.setVisible(false);
                deleteall.setVisible(true);
                downPanel.setVisible(true);
                leftPanel.setVisible(true);
                animaladdgrafic.setVisible(false);
                animalshowgrafic.setVisible(false);
                animaleditegrafic.setVisible(false);
                addanimal.setVisible(false);
                deleteanimal.setVisible(false);
                editanimal.setVisible(false);
                showanimal.setVisible(false);
                deletereport.setVisible(true);
                messagegrafic.setVisible(false);
                leftPaneladd.setVisible(false);
                addmanager.setVisible(false);
                deletemanager.setVisible(false);
                showmanager.setVisible(false);
                addvisitor.setVisible(false);
                deletevisitor.setVisible(false);
                editvisitor.setVisible(false);
                showvisitor.setVisible(false);
                addzookeeper.setVisible(false);
                deletezookeeper.setVisible(false);
                editzookeeper.setVisible(false);
                showzookeeper.setVisible(false);
                editmanager.setVisible(false);
                zookeepershowgrafic.setVisible(false);
                managershowgrafic.setVisible(false);
                visitorshowgrafic.setVisible(false);
                superadmineditprofilegrafic.setVisible(false);
                zookeeperdepartment.setVisible(false);
                savezookeeper.setVisible(false);
                savevisitor.setVisible(false);
                siasatmali.setVisible(false);
                centerPanel.setVisible(true);


            }
        });
        JButton b7 = new JButton("Siasat Mali");
        b7.setMinimumSize(new Dimension(180, 70));
        b7.setPreferredSize(new Dimension(180, 70));
        rightPanel.add(b7, BorderLayout.AFTER_LAST_LINE);
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                adrressadd.setVisible(false);
                departmentadd.setVisible(false);
                emailadd.setVisible(false);
                lastnameadd.setVisible(false);
                nameadd.setVisible(false);
                passadd.setVisible(false);
                phoneadd.setVisible(false);
                useradd.setVisible(false);
                wageadd.setVisible(false);
                savemanager.setVisible(false);
                Add_status.setVisible(false);
                report.setVisible(false);
                downPanel.setVisible(false);
                leftPanel.setVisible(false);
                enterid.setVisible(false);
                addmanager.setVisible(false);
                deleteall.setVisible(false);
                downPanel.setVisible(false);
                leftPanel.setVisible(false);
                animaladdgrafic.setVisible(false);
                animalshowgrafic.setVisible(false);
                animaleditegrafic.setVisible(false);
                addanimal.setVisible(false);
                deleteanimal.setVisible(false);
                editanimal.setVisible(false);
                showanimal.setVisible(false);
                deletereport.setVisible(false);
                messagegrafic.setVisible(false);
                leftPaneladd.setVisible(false);
                addmanager.setVisible(false);
                deletemanager.setVisible(false);
                showmanager.setVisible(false);
                addvisitor.setVisible(false);
                deletevisitor.setVisible(false);
                editvisitor.setVisible(false);
                showvisitor.setVisible(false);
                addzookeeper.setVisible(false);
                deletezookeeper.setVisible(false);
                editzookeeper.setVisible(false);
                showzookeeper.setVisible(false);
                editmanager.setVisible(false);
                zookeepershowgrafic.setVisible(false);
                managershowgrafic.setVisible(false);
                visitorshowgrafic.setVisible(false);
                superadmineditprofilegrafic.setVisible(false);
                zookeeperdepartment.setVisible(false);
                savezookeeper.setVisible(false);
                savevisitor.setVisible(false);
                siasatmali.setVisible(true);
                centerPanel.setVisible(true);
            }
        });

        JButton b9 = new JButton("Exit & Backup Files");
        b9.setMinimumSize(new Dimension(180, 70));
        b9.setPreferredSize(new Dimension(180, 70));
        rightPanel.add(b9, BorderLayout.AFTER_LAST_LINE);
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setVisible(false);
                backupfile b=new backupfile();
                b.setVisible(true);

            }
        });


        JLabel welcomSuperadminToZooConsol = new JLabel("Welcom Superadmin To Zoo Consol");
        welcomSuperadminToZooConsol.setForeground(Color.white);
        welcomSuperadminToZooConsol.setPreferredSize(new Dimension(300, 90));
        upPanel.add(welcomSuperadminToZooConsol, BorderLayout.WEST);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        this.setSize(320, 320);
        this.setTitle("Superadmin Panel");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }



}
