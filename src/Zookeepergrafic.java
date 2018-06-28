import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zookeepergrafic extends JFrame {
    public Zookeepereditprofilegrafic zookeepereditprofilegrafic;
    public Tickatshowgrafic tickatshowgrafic;

    public Zookeepergrafic(int iz){
        Person p=new Person() {
            @Override
            public void setreport(String level, String action) {
                super.setreport(level, action);
            }
        };
        zookeepereditprofilegrafic =new Zookeepereditprofilegrafic(iz);
        tickatshowgrafic =new Tickatshowgrafic(iz);
        setMinimumSize(new Dimension(1000, 1000));
        setPreferredSize(new Dimension(1000, 1000));
        setResizable(false);
        getContentPane().setBackground(Color.white);


        JPanel rightPanel = new JPanel();
        rightPanel.setMinimumSize(new Dimension(200, 1000));
        rightPanel.setPreferredSize(new Dimension(200, 1000));
        rightPanel.setBackground(Color.darkGray);
        this.add(rightPanel, BorderLayout.EAST);


        JPanel upPanel = new JPanel();
        upPanel.setMinimumSize(new Dimension(100, 80));
        upPanel.setPreferredSize(new Dimension(100, 80));
        upPanel.setBackground(Color.darkGray);
        this.add(upPanel, BorderLayout.NORTH);


        JPanel leftPanel = new JPanel();
        leftPanel.setMinimumSize(new Dimension(0, 300));
        leftPanel.setPreferredSize(new Dimension(0, 300));
        leftPanel.setBackground(Color.YELLOW);
        this.add(leftPanel, BorderLayout.WEST);

        JPanel centerPanel = new JPanel();
        centerPanel.setMinimumSize(new Dimension(800, 800));
        centerPanel.setPreferredSize(new Dimension(800, 800));
        centerPanel.setBackground(Color.darkGray);
        this.add(centerPanel, BorderLayout.CENTER);
        centerPanel.setVisible(false);

        centerPanel.add(zookeepereditprofilegrafic);zookeepereditprofilegrafic.setVisible(false);
        centerPanel.add(tickatshowgrafic);tickatshowgrafic.setVisible(false);

        JButton b1 = new JButton("Edit Profile");
        b1.setMinimumSize(new Dimension(180, 90));
        b1.setPreferredSize(new Dimension(180, 90));
        rightPanel.add(b1, BorderLayout.AFTER_LAST_LINE);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                zookeepereditprofilegrafic.setVisible(true);
                centerPanel.setVisible(true);
                tickatshowgrafic.setVisible(false);
            }
        });

        JButton b2 = new JButton("set time");
        b2.setMinimumSize(new Dimension(180, 90));
        b2.setPreferredSize(new Dimension(180, 90));
        rightPanel.add(b2, BorderLayout.AFTER_LAST_LINE);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                p.setreport("zookeeper","show settime");
                zookeepereditprofilegrafic.setVisible(false);
                centerPanel.setVisible(false);
                tickatshowgrafic.setVisible(false);
            }
        });


        JButton b3 = new JButton("Tickat");
        b3.setMinimumSize(new Dimension(180, 90));
        b3.setPreferredSize(new Dimension(180, 90));
        rightPanel.add(b3, BorderLayout.AFTER_LAST_LINE);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                tickatshowgrafic.setVisible(true);
                zookeepereditprofilegrafic.setVisible(false);
                centerPanel.setVisible(true);

            }
        });


        JButton b7 = new JButton("Exit");
        b7.setMinimumSize(new Dimension(180, 90));
        b7.setPreferredSize(new Dimension(180, 90));
        rightPanel.add(b7, BorderLayout.AFTER_LAST_LINE);
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setVisible(false);
                Gerafic g=new Gerafic();
                g.setVisible(true);

            }
        });


        JLabel welcomSuperadminToZooConsol = new JLabel("Welcom Zookeeper To Zoo Consol");
        welcomSuperadminToZooConsol.setForeground(Color.white);
        welcomSuperadminToZooConsol.setPreferredSize(new Dimension(300, 90));
        upPanel.add(welcomSuperadminToZooConsol, BorderLayout.WEST);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        this.setSize(320, 320);
        this.setTitle("Zookeeper Panel");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
