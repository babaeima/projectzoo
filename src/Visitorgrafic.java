import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Visitorgrafic extends JFrame {
public Messagegrafic messagegrafic;
public Tickatgrafic tickatgrafic;
public Etebargrafic etebargrafic;
public visitoreditprofilegrafic visitoreditprofilegrafic;
    public Visitorgrafic(int iv){
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

        messagegrafic=new Messagegrafic("visitor");
        tickatgrafic=new Tickatgrafic(0);
        etebargrafic=new Etebargrafic(iv);
        visitoreditprofilegrafic=new visitoreditprofilegrafic(iv);

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
        leftPanel.setMinimumSize(new Dimension(800, 300));
        leftPanel.setPreferredSize(new Dimension(800, 300));
        leftPanel.setBackground(Color.YELLOW);
        /*this.add(leftPanel, BorderLayout.WEST);*/

        JPanel centerPanel = new JPanel();
        centerPanel.setMinimumSize(new Dimension(800, 800));
        centerPanel.setPreferredSize(new Dimension(800, 800));
        centerPanel.setBackground(Color.darkGray);
        this.add(centerPanel, BorderLayout.CENTER);
        centerPanel.setVisible(false);

        centerPanel.add(tickatgrafic);tickatgrafic.setVisible(false);
        centerPanel.add(etebargrafic);etebargrafic.setVisible(false);
        centerPanel.add(visitoreditprofilegrafic);visitoreditprofilegrafic.setVisible(false);
        centerPanel.add(messagegrafic);messagegrafic.setVisible(false);

        JButton b1 = new JButton("ویرایش پروفایل");
        b1.setMinimumSize(new Dimension(180, 90));
        b1.setPreferredSize(new Dimension(180, 90));
        rightPanel.add(b1, BorderLayout.AFTER_LAST_LINE);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                centerPanel.setVisible(false);
                tickatgrafic.setVisible(false);
                messagegrafic.setVisible(false);
                etebargrafic.setVisible(false);
                visitoreditprofilegrafic.setVisible(true);
                centerPanel.setVisible(true);

            }
        });


        JButton b2 = new JButton("خرید بلیت");
        b2.setMinimumSize(new Dimension(180, 90));
        b2.setPreferredSize(new Dimension(180, 90));
        rightPanel.add(b2, BorderLayout.AFTER_LAST_LINE);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                centerPanel.remove(tickatgrafic);
                tickatgrafic=new Tickatgrafic(iv);
                centerPanel.add(tickatgrafic);tickatgrafic.setVisible(false);
                centerPanel.setVisible(false);
                messagegrafic.setVisible(false);
                etebargrafic.setVisible(false);
                visitoreditprofilegrafic.setVisible(false);
                tickatgrafic.setVisible(true);
                centerPanel.setVisible(true);

            }
        });


        JButton b3 = new JButton("افزایش اعتبار");
        b3.setMinimumSize(new Dimension(180, 90));
        b3.setPreferredSize(new Dimension(180, 90));
        rightPanel.add(b3, BorderLayout.AFTER_LAST_LINE);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                centerPanel.setVisible(false);
                tickatgrafic.setVisible(false);
                messagegrafic.setVisible(false);
                visitoreditprofilegrafic.setVisible(false);
                etebargrafic.setVisible(true);
                centerPanel.setVisible(true);

            }
        });


        JButton b4 = new JButton("پیام ها");
        b4.setMinimumSize(new Dimension(180, 90));
        b4.setPreferredSize(new Dimension(180, 90));
        rightPanel.add(b4, BorderLayout.AFTER_LAST_LINE);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                p.setreport("visitor "+iv,"messageenter");
                centerPanel.setVisible(false);
                tickatgrafic.setVisible(false);
                etebargrafic.setVisible(false);
                visitoreditprofilegrafic.setVisible(false);
                messagegrafic.setVisible(true);
                centerPanel.setVisible(true);

            }
        });


      /*  JButton b5 = new JButton("b5");
        b5.setMinimumSize(new Dimension(180, 90));
        b5.setPreferredSize(new Dimension(180, 90));
        rightPanel.add(b5, BorderLayout.AFTER_LAST_LINE);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {


            }
        });


        JButton b6 = new JButton("b6");
        b6.setMinimumSize(new Dimension(180, 90));
        b6.setPreferredSize(new Dimension(180, 90));
        rightPanel.add(b6, BorderLayout.AFTER_LAST_LINE);
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {


            }
        });
*/

        JButton b7 = new JButton("خروج");
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


        JLabel welcomSuperadminToZooConsol = new JLabel("Welcom Visitor To Zoo Consol");
        welcomSuperadminToZooConsol.setForeground(Color.white);
        welcomSuperadminToZooConsol.setPreferredSize(new Dimension(300, 90));
        upPanel.add(welcomSuperadminToZooConsol, BorderLayout.WEST);
        Toolkit tool = getToolkit();
        Dimension size = tool.getScreenSize();
        this.setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        this.setSize(320, 320);
        this.setTitle("Visitor Panel");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
