import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class backupfile extends JFrame {
    public backupfile() {
        Person p=new Person() {
            @Override
            public void setreport(String level, String action) {
                super.setreport(level, action);
            }
        };
        setMinimumSize(new Dimension(300, 200));
        setPreferredSize(new Dimension(300, 200));
        setResizable(false);

        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.darkGray);

        JPanel upPanel = new JPanel();
        upPanel.setMinimumSize(new Dimension(300, 50));
        upPanel.setPreferredSize(new Dimension(300, 50));
        upPanel.setBackground(Color.darkGray);
        this.add(upPanel, BorderLayout.NORTH);

        JPanel downPanel = new JPanel();
        downPanel.setMinimumSize(new Dimension(300, 50));
        downPanel.setPreferredSize(new Dimension(300, 50));
        downPanel.setBackground(Color.YELLOW);
        this.add(downPanel, BorderLayout.SOUTH);

        JPanel rightPanel = new JPanel();
        rightPanel.setMinimumSize(new Dimension(50, 200));
        rightPanel.setPreferredSize(new Dimension(50, 200));
        rightPanel.setBackground(Color.darkGray);
        this.add(rightPanel, BorderLayout.EAST);

        JPanel leftPanel = new JPanel();
        leftPanel.setMinimumSize(new Dimension(50, 200));
        leftPanel.setPreferredSize(new Dimension(50, 200));
        leftPanel.setBackground(Color.darkGray);
        this.add(leftPanel, BorderLayout.WEST);
        this.add(centerPanel, BorderLayout.CENTER);

        JLabel filebackup = new JLabel("Do you want backup from files?");
        filebackup.setForeground(Color.white);
        centerPanel.add(filebackup, BorderLayout.WEST);
        JLabel forget_status = new JLabel("In: c:/users/MOHAMAD/Desktop/backup");
        forget_status.setForeground(Color.white);
        centerPanel.add(forget_status, BorderLayout.WEST);

        JButton yes = new JButton("Yes");
        yes.setMinimumSize(new Dimension(100, 30));
        yes.setPreferredSize(new Dimension(100, 30));
        downPanel.add(yes, BorderLayout.NORTH);
        yes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                backupfilebin();
                backupfiletxt();
                setVisible(false);
                Gerafic g=new Gerafic();
                g.setVisible(true);
                p.setreport("Superadmin","backup all files");
            }
        });

        JButton no = new JButton("No");
        no.setMinimumSize(new Dimension(100, 30));
        no.setPreferredSize(new Dimension(100, 30));
        downPanel.add(no, BorderLayout.NORTH);
        no.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setVisible(false);
                Gerafic g=new Gerafic();
                g.setVisible(true);
            }
        });
        this.setTitle(":) Backup file (:");
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void backupfiletxt() {
        for (int i = 0; i < 2; i++) {
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/username.txt"));
                out.write("superadmin");
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/username.txt", true));
                out.write(String.valueOf(Superadmin.superadmin.get(0).Karbariname));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/username.txt", true));
                out.write(String.valueOf(Superadmin.superadmin.get(0).Password));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/username.txt", true));
                out.write(String.valueOf(Superadmin.superadmin.get(0).Email));
                out.newLine();
                out.close();

            } catch (IOException e) {
                System.out.println("exception occoured" + e);
            }
        }
        for (int i = 0; i < Manager.manager.size(); i++) {
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/username.txt", true));
                out.write("manager");
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/username.txt", true));
                out.write(String.valueOf(Manager.manager.get(i).Username));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/username.txt", true));
                out.write(String.valueOf(Manager.manager.get(i).password));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/username.txt", true));
                out.write(String.valueOf(Manager.manager.get(i).mail));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/username.txt", true));
                out.write(String.valueOf(Manager.manager.get(i).lastname));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/username.txt", true));
                out.write(String.valueOf(Manager.manager.get(i).Name));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/username.txt", true));
                out.write(String.valueOf(Manager.manager.get(i).Address));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/username.txt", true));
                out.write(String.valueOf(Manager.manager.get(i).phonenumber));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/username.txt", true));
                out.write(String.valueOf(Manager.manager.get(i).getId()));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/username.txt", true));
                out.write(String.valueOf(Manager.manager.get(i).wage));
                out.newLine();
                out.close();

            } catch (IOException e) {
                System.out.println("exception occoured" + e);
            }
        }
        for (int i = 0; i < Zookeeper.zookeeper.size(); i++) {
            try {

                BufferedWriter out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/username.txt", true));
                out.write("zookeeper");
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/username.txt", true));
                out.write(String.valueOf(Zookeeper.zookeeper.get(i).Username));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/username.txt", true));
                out.write(String.valueOf(Zookeeper.zookeeper.get(i).password));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/username.txt", true));
                out.write(String.valueOf(Zookeeper.zookeeper.get(i).mail));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/username.txt", true));
                out.write(String.valueOf(Zookeeper.zookeeper.get(i).lastname));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/username.txt", true));
                out.write(String.valueOf(Zookeeper.zookeeper.get(i).Name));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/username.txt", true));
                out.write(String.valueOf(Zookeeper.zookeeper.get(i).Address));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/username.txt", true));
                out.write(String.valueOf(Zookeeper.zookeeper.get(i).phonenumber));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/username.txt", true));
                out.write(String.valueOf(Zookeeper.zookeeper.get(i).getId()));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/username.txt", true));
                out.write(String.valueOf(Zookeeper.zookeeper.get(i).Wage));
                out.newLine();
                out.close();

            } catch (IOException e) {
                System.out.println("exception occoured" + e);
            }
        }
        for (int i = 0; i < Visitor.visitor.size(); i++) {
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/username.txt", true));
                out.write("visitor");
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/username.txt", true));
                out.write(String.valueOf(Visitor.visitor.get(i).Username));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/username.txt", true));
                out.write(String.valueOf(Visitor.visitor.get(i).password));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/username.txt", true));
                out.write(String.valueOf(Visitor.visitor.get(i).mail));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/username.txt", true));
                out.write(String.valueOf(Visitor.visitor.get(i).lastname));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/username.txt", true));
                out.write(String.valueOf(Visitor.visitor.get(i).Name));
                out.newLine();
                out.close();


                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/username.txt", true));
                out.write(String.valueOf(Visitor.visitor.get(i).phonenumber));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/username.txt", true));
                out.write(String.valueOf(Visitor.visitor.get(i).getId()));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/username.txt", true));
                out.write(String.valueOf(Visitor.visitor.get(i).cash));
                out.newLine();
                out.close();

            } catch (IOException e) {
                System.out.println("exception occoured" + e);
            }

        }
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/massage.txt"));
        } catch (IOException e) {
            System.out.println("exception occoured" + e);
        }
        for (int i = 0; i < Massages.massage.size(); i++) {
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/massage.txt", true));
                out.write("massage");
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/massage.txt", true));
                out.write(Massages.massage.get(i).name_lastname);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/massage.txt", true));
                out.write(String.valueOf(Massages.massage.get(i).emailm));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/massage.txt", true));
                out.write(String.valueOf(Massages.massage.get(i).user));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/massage.txt", true));
                out.write(String.valueOf(Massages.massage.get(i).messagetext));
                out.newLine();
                out.close();

            } catch (IOException e) {
                System.out.println("exception occoured" + e);
            }
        }
        System.out.println("check");
        try {

            BufferedWriter out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/report.txt"));

        } catch (IOException e) {
            System.out.println("exception occoured" + e);
        }

        for (int i = 0; i < Report.report.size(); i++) {
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/report.txt", true));
                out.write("report");
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/report.txt", true));
                out.write(Report.report.get(i).level);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/report.txt", true));
                out.write(String.valueOf(Report.report.get(i).action));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/report.txt", true));
                out.write(String.valueOf(Report.report.get(i).date));
                out.newLine();
                out.close();

            } catch (IOException e) {
                System.out.println("exception occoured" + e);
            }
        }
        try {

            BufferedWriter out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/tickat.txt"));

        } catch (IOException e) {
            System.out.println("exception occoured" + e);
        }

        for (int i = 0; i < Tickatgrafic.tickats.size(); i++) {
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/tickat.txt", true));
                out.write("tickat");
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/tickat.txt", true));
                out.write(Tickatgrafic.tickats.get(i).departmentt);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/tickat.txt", true));
                out.write(String.valueOf(Tickatgrafic.tickats.get(i).date));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/tickat.txt", true));
                out.write(String.valueOf(Tickatgrafic.tickats.get(i).hour));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/tickat.txt", true));
                out.write(String.valueOf(Tickatgrafic.tickats.get(i).usert));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/tickat.txt", true));
                out.write(String.valueOf(Tickatgrafic.tickats.get(i).emailt));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/tickat.txt", true));
                out.write(String.valueOf(Tickatgrafic.tickats.get(i).phonenumbert));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/tickat.txt", true));
                out.write(String.valueOf(Tickatgrafic.tickats.get(i).zookeepert));
                out.newLine();
                out.close();

            } catch (IOException e) {
                System.out.println("exception occoured" + e);
            }
        }
        try {

            BufferedWriter out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/animal.txt"));

        } catch (IOException e) {
            System.out.println("exception occoured" + e);
        }

        for (int i = 0; i < Aquatic.aquatics.size(); i++) {
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/animal.txt", true));
                out.write("aquatic");
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/animal.txt", true));
                out.write(Aquatic.aquatics.get(i).name);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/animal.txt", true));
                out.write(Aquatic.aquatics.get(i).Nationality);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/animal.txt", true));
                out.write(Aquatic.aquatics.get(i).National_id);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/animal.txt", true));
                out.write(Aquatic.aquatics.get(i).sex);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/animal.txt", true));
                out.write(Aquatic.aquatics.get(i).food);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/animal.txt", true));
                out.write(Aquatic.aquatics.get(i).Department);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/animal.txt", true));
                out.write(Aquatic.aquatics.get(i).insurance);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/animal.txt", true));
                out.write(String.valueOf(Aquatic.aquatics.get(i).camivorous));
                out.newLine();
                out.close();

            } catch (IOException e) {
                System.out.println("exception occoured" + e);
            }
        }
        for (int i = 0; i < Birds.birds.size(); i++) {
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/animal.txt", true));
                out.write("birds");
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/animal.txt", true));
                out.write(Birds.birds.get(i).name);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/animal.txt", true));
                out.write(Birds.birds.get(i).Nationality);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/animal.txt", true));
                out.write(Birds.birds.get(i).National_id);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/animal.txt", true));
                out.write(Birds.birds.get(i).sex);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/animal.txt", true));
                out.write(Birds.birds.get(i).food);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/animal.txt", true));
                out.write(Birds.birds.get(i).Department);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/animal.txt", true));
                out.write(Birds.birds.get(i).insurance);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/animal.txt", true));
                out.write(String.valueOf(Birds.birds.get(i).Wild));
                out.newLine();
                out.close();

            } catch (IOException e) {
                System.out.println("exception occoured" + e);
            }
        }
        for (int i = 0; i < Wild.wilds.size(); i++) {
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/animal.txt", true));
                out.write("wilds");
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/animal.txt", true));
                out.write(Wild.wilds.get(i).name);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/animal.txt", true));
                out.write(Wild.wilds.get(i).Nationality);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/animal.txt", true));
                out.write(Wild.wilds.get(i).National_id);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/animal.txt", true));
                out.write(Wild.wilds.get(i).sex);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/animal.txt", true));
                out.write(Wild.wilds.get(i).food);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/animal.txt", true));
                out.write(Wild.wilds.get(i).Department);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/animal.txt", true));
                out.write(Wild.wilds.get(i).insurance);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/animal.txt", true));
                out.write(String.valueOf(Wild.wilds.get(i).home));
                out.newLine();
                out.close();

            } catch (IOException e) {
                System.out.println("exception occoured" + e);
            }
        }
        try{
            Siasatmali s=new Siasatmali();
            BufferedWriter out = new BufferedWriter(new FileWriter("c:/users/MOHAMAD/Desktop/backup/siasatmali.txt"));
            out.write(s.whatsiasatmali);
            out.newLine();
            out.close();
        } catch (IOException e) {
            System.out.println("exception occoured" + e);
        }
    }

        public void backupfilebin(){
            for(int i=0;i<2;i++){
                try{

                    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/username.bin"));
                    out.writeObject("superadmin");
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/username.bin",true));
                    out.writeObject(String.valueOf(Superadmin.superadmin.get(0).Karbariname));
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/username.bin",true));
                    out.writeObject(String.valueOf(Superadmin.superadmin.get(0).Password));
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/username.bin",true));
                    out.writeObject(String.valueOf(Superadmin.superadmin.get(0).Email));
                    out.close();

                } catch (IOException e) {
                    System.out.println("exception occoured" + e);
                }
            }
            for(int i=0;i<Manager.manager.size();i++){
                try{
                    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/username.bin",true));
                    out.writeObject("manager");
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/username.bin",true));
                    out.writeObject(String.valueOf(Manager.manager.get(i).Username));
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/username.bin",true));
                    out.writeObject(String.valueOf(Manager.manager.get(i).password));
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/username.bin",true));
                    out.writeObject(String.valueOf(Manager.manager.get(i).mail));
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/username.bin",true));
                    out.writeObject(String.valueOf(Manager.manager.get(i).lastname));
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/username.bin",true));
                    out.writeObject(String.valueOf(Manager.manager.get(i).Name));
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/username.bin",true));
                    out.writeObject(String.valueOf(Manager.manager.get(i).Address));
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/username.bin",true));
                    out.writeObject(String.valueOf(Manager.manager.get(i).phonenumber));
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/username.bin",true));
                    out.writeObject(String.valueOf(Manager.manager.get(i).getId()));
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/username.bin",true));
                    out.writeObject(String.valueOf(Manager.manager.get(i).wage));
                    out.close();

                } catch (IOException e) {
                    System.out.println("exception occoured" + e);
                }
            }
            for(int i=0;i<Zookeeper.zookeeper.size();i++){
                try{

                    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/username.bin",true));
                    out.writeObject("zookeeper");
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/username.bin",true));
                    out.writeObject(String.valueOf(Zookeeper.zookeeper.get(i).Username));
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/username.bin",true));
                    out.writeObject(String.valueOf(Zookeeper.zookeeper.get(i).password));
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/username.bin",true));
                    out.writeObject(String.valueOf(Zookeeper.zookeeper.get(i).mail));
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/username.bin",true));
                    out.writeObject(String.valueOf(Zookeeper.zookeeper.get(i).lastname));
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/username.bin",true));
                    out.writeObject(String.valueOf(Zookeeper.zookeeper.get(i).Name));
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/username.bin",true));
                    out.writeObject(String.valueOf(Zookeeper.zookeeper.get(i).Address));
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/username.bin",true));
                    out.writeObject(String.valueOf(Zookeeper.zookeeper.get(i).phonenumber));
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/username.bin",true));
                    out.writeObject(String.valueOf(Zookeeper.zookeeper.get(i).getId()));
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/username.bin",true));
                    out.writeObject(String.valueOf(Zookeeper.zookeeper.get(i).Wage));
                    out.close();

                } catch (IOException e) {
                    System.out.println("exception occoured" + e);
                }
            }
            for(int i=0;i<Visitor.visitor.size();i++){
                try{
                    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/username.bin",true));
                    out.writeObject("visitor");
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/username.bin",true));
                    out.writeObject(String.valueOf(Visitor.visitor.get(i).Username));
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/username.bin",true));
                    out.writeObject(String.valueOf(Visitor.visitor.get(i).password));
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/username.bin",true));
                    out.writeObject(String.valueOf(Visitor.visitor.get(i).mail));
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/username.bin",true));
                    out.writeObject(String.valueOf(Visitor.visitor.get(i).lastname));
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/username.bin",true));
                    out.writeObject(String.valueOf(Visitor.visitor.get(i).Name));
                    out.close();


                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/username.bin",true));
                    out.writeObject(String.valueOf(Visitor.visitor.get(i).phonenumber));
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/username.bin",true));
                    out.writeObject(String.valueOf(Visitor.visitor.get(i).getId()));
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/username.bin",true));
                    out.writeObject(String.valueOf(Visitor.visitor.get(i).cash));
                    out.close();

                } catch (IOException e) {
                    System.out.println("exception occoured" + e);
                }

            }
            try {
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/massage.bin"));
            } catch (IOException e) {
                System.out.println("exception occoured" + e);
            }
            for (int i = 0; i <Massages.massage.size(); i++) {
                try {
                    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/massage.bin",true));
                    out.writeObject("massage");
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/massage.bin", true));
                    out.writeObject(Massages.massage.get(i).name_lastname);
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/massage.bin", true));
                    out.writeObject(String.valueOf(Massages.massage.get(i).emailm));
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/massage.bin", true));
                    out.writeObject(String.valueOf(Massages.massage.get(i).user));
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/massage.bin", true));
                    out.writeObject(String.valueOf(Massages.massage.get(i).messagetext));
                    out.close();

                } catch (IOException e) {
                    System.out.println("exception occoured" + e);
                }
            }
            System.out.println("check");
            try {

                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/report.bin"));

            } catch (IOException e) {System.out.println("exception occoured" + e);}

            for (int i = 0; i <Report.report.size(); i++) {
                try {
                    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/report.bin",true));
                    out.writeObject("report");
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/report.bin", true));
                    out.writeObject(Report.report.get(i).level);
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/report.bin", true));
                    out.writeObject(String.valueOf(Report.report.get(i).action));
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/report.bin", true));
                    out.writeObject(String.valueOf(Report.report.get(i).date));
                    out.close();

                } catch (IOException e) {
                    System.out.println("exception occoured" + e);
                }
            }
            try {

                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/tickat.bin"));

            } catch (IOException e) {System.out.println("exception occoured" + e);}

            for (int i = 0; i <Tickatgrafic.tickats.size(); i++) {
                try {
                    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/tickat.bin",true));
                    out.writeObject("tickat");
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/tickat.bin", true));
                    out.writeObject(Tickatgrafic.tickats.get(i).departmentt);
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/tickat.bin", true));
                    out.writeObject(String.valueOf(Tickatgrafic.tickats.get(i).date));
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/tickat.bin", true));
                    out.writeObject(String.valueOf(Tickatgrafic.tickats.get(i).hour));
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/tickat.bin", true));
                    out.writeObject(String.valueOf(Tickatgrafic.tickats.get(i).usert));
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/tickat.bin", true));
                    out.writeObject(String.valueOf(Tickatgrafic.tickats.get(i).emailt));
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/tickat.bin", true));
                    out.writeObject(String.valueOf(Tickatgrafic.tickats.get(i).phonenumbert));
                    out.close();

                    out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/tickat.bin", true));
                    out.writeObject(String.valueOf(Tickatgrafic.tickats.get(i).zookeepert));
                    out.close();

                } catch (IOException e) {
                    System.out.println("exception occoured" + e);
                }
            }
        try {

            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/animal.bin"));

        } catch (IOException e) {
            System.out.println("exception occoured" + e);
        }

        for (int i = 0; i < Aquatic.aquatics.size(); i++) {
            try {
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/animal.bin", true));
                out.writeObject("aquatic");
                out.close();

                out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/animal.bin", true));
                out.writeObject(Aquatic.aquatics.get(i).name);
                out.close();

                out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/animal.bin", true));
                out.writeObject(Aquatic.aquatics.get(i).Nationality);
                out.close();

                out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/animal.bin", true));
                out.writeObject(Aquatic.aquatics.get(i).National_id);
                out.close();

                out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/animal.bin", true));
                out.writeObject(Aquatic.aquatics.get(i).sex);
                out.close();

                out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/animal.bin", true));
                out.writeObject(Aquatic.aquatics.get(i).food);
                out.close();

                out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/animal.bin", true));
                out.writeObject(Aquatic.aquatics.get(i).Department);
                out.close();

                out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/animal.bin", true));
                out.writeObject(Aquatic.aquatics.get(i).insurance);
                out.close();

                out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/animal.bin", true));
                out.writeObject(String.valueOf(Aquatic.aquatics.get(i).camivorous));
                out.close();

            } catch (IOException e) {
                System.out.println("exception occoured" + e);
            }
        }
        for (int i = 0; i < Birds.birds.size(); i++) {
            try {
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/animal.bin", true));
                out.writeObject("birds");
                out.close();

                out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/animal.bin", true));
                out.writeObject(Birds.birds.get(i).name);
                out.close();

                out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/animal.bin", true));
                out.writeObject(Birds.birds.get(i).Nationality);
                out.close();

                out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/animal.bin", true));
                out.writeObject(Birds.birds.get(i).National_id);
                out.close();

                out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/animal.bin", true));
                out.writeObject(Birds.birds.get(i).sex);
                out.close();

                out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/animal.bin", true));
                out.writeObject(Birds.birds.get(i).food);
                out.close();

                out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/animal.bin", true));
                out.writeObject(Birds.birds.get(i).Department);
                out.close();

                out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/animal.bin", true));
                out.writeObject(Birds.birds.get(i).insurance);
                out.close();

                out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/animal.bin", true));
                out.writeObject(String.valueOf(Birds.birds.get(i).Wild));

                out.close();

            }catch (IOException e) {
                System.out.println("exception occoured" + e);
            }
        }
        for (int i = 0; i < Wild.wilds.size(); i++) {
            try {
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/animal.bin", true));
                out.writeObject("wilds");
                out.close();

                out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/animal.bin", true));
                out.writeObject(Wild.wilds.get(i).name);
                out.close();

                out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/animal.bin", true));
                out.writeObject(Wild.wilds.get(i).Nationality);
                out.close();

                out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/animal.bin", true));
                out.writeObject(Wild.wilds.get(i).National_id);
                out.close();

                out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/animal.bin", true));
                out.writeObject(Wild.wilds.get(i).sex);
                out.close();

                out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/animal.bin", true));
                out.writeObject(Wild.wilds.get(i).food);
                out.close();

                out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/animal.bin", true));
                out.writeObject(Wild.wilds.get(i).Department);
                out.close();

                out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/animal.bin", true));
                out.writeObject(Wild.wilds.get(i).insurance);
                out.close();

                out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/animal.bin", true));
                out.writeObject(String.valueOf(Wild.wilds.get(i).home));
                out.close();

            } catch (IOException e) {
                System.out.println("exception occoured" + e);
            }
        }
            try{
                Siasatmali s=new Siasatmali();
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c:/users/MOHAMAD/Desktop/backup/siasatmali.bin"));
                out.writeObject(s.whatsiasatmali);
                out.close();
            } catch (IOException e) {
                System.out.println("exception occoured" + e);
            }
    }
}


