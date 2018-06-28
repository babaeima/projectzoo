import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Tickatgrafic extends JPanel {
    public static ArrayList<Tickatgrafic> tickats = new ArrayList<Tickatgrafic>();
    public String date, hour, usert, emailt, phonenumbert, departmentt, zookeepert;

    public Tickatgrafic(int iv) {
        Person p=new Person() {
            @Override
            public void setreport(String level, String action) {
                super.setreport(level, action);
            }
        };
        setMinimumSize(new Dimension(800, 800));
        setPreferredSize(new Dimension(800, 800));
        setBackground(Color.darkGray);

        String[] columName = {"id","department","date","hour","Username","mail","phonenumber","zookeeper"};

        DefaultTableModel t = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        JTable table = new JTable(t);
        t.addColumn(columName[0]);
        t.addColumn(columName[1]);
        t.addColumn(columName[2]);
        t.addColumn(columName[3]);
        t.addColumn(columName[4]);
        t.addColumn(columName[5]);
        t.addColumn(columName[6]);
        t.addColumn(columName[7]);

        for (int i = 0; i < Tickatgrafic.tickats.size(); i++) {
            if (Tickatgrafic.tickats.get(i).usert.equals(Visitor.visitor.get(iv).Username) && Tickatgrafic.tickats.get(i).emailt.equals(Visitor.visitor.get(iv).mail)) {
                t.addRow(new Object[]{i,
                        Tickatgrafic.tickats.get(i).departmentt,
                        Tickatgrafic.tickats.get(i).date,
                        Tickatgrafic.tickats.get(i).hour,
                        Tickatgrafic.tickats.get(i).hour,
                        Tickatgrafic.tickats.get(i).emailt,
                        Tickatgrafic.tickats.get(i).phonenumbert,
                        Tickatgrafic.tickats.get(i).zookeepert});
            }

        }
        JScrollPane scroll = new JScrollPane(table);
        scroll.setPreferredSize(new Dimension(800, 300));
        scroll.setMinimumSize(new Dimension(800, 300));


        JLabel department = new JLabel("select department:");
        department.setMinimumSize(new Dimension(750, 30));
        department.setPreferredSize(new Dimension(750, 30));
        department.setForeground(Color.white);
        EmptyBorder departmentborder = new EmptyBorder(0, 0, 0, 0);
        department.setBorder(departmentborder);

        JLabel date = new JLabel("Enter date:");
        date.setMinimumSize(new Dimension(750, 30));
        date.setPreferredSize(new Dimension(750, 30));
        date.setForeground(Color.white);
        EmptyBorder dateborder = new EmptyBorder(0, 0, 0, 0);
        date.setBorder(dateborder);

        JLabel hour = new JLabel("Enter hour:");
        hour.setMinimumSize(new Dimension(750, 30));
        hour.setPreferredSize(new Dimension(750, 30));
        hour.setForeground(Color.white);
        EmptyBorder hourborder = new EmptyBorder(0, 0, 0, 0);
        hour.setBorder(hourborder);

        String item[] = {"Aquatic", "Birds", "Wild"};
        JComboBox enterdepartment = new JComboBox(item);
        enterdepartment.setMinimumSize(new Dimension(650, 30));
        enterdepartment.setPreferredSize(new Dimension(650, 30));

        JLabel etebar = new JLabel("your etebar is:");
        etebar.setMinimumSize(new Dimension(750, 30));
        etebar.setPreferredSize(new Dimension(750, 30));
        etebar.setForeground(Color.white);
        EmptyBorder etebarborder = new EmptyBorder(0, 0, 0, 0);
        etebar.setBorder(etebarborder);

        JLabel showetebar = new JLabel("  ");
        showetebar.setMinimumSize(new Dimension(750, 30));
        showetebar.setPreferredSize(new Dimension(750, 30));
        showetebar.setForeground(Color.white);
        EmptyBorder showetebarborder = new EmptyBorder(0, 0, 0, 0);
        showetebar.setBorder(showetebarborder);

        JLabel many = new JLabel("how much many:");
        many.setMinimumSize(new Dimension(750, 30));
        many.setPreferredSize(new Dimension(750, 30));
        many.setForeground(Color.white);
        EmptyBorder manyborder = new EmptyBorder(0, 0, 0, 0);
        many.setBorder(manyborder);

        JLabel showmany = new JLabel("    ");
        showmany.setMinimumSize(new Dimension(750, 30));
        showmany.setPreferredSize(new Dimension(750, 30));
        showmany.setForeground(Color.white);
        EmptyBorder showmanyborder = new EmptyBorder(0, 0, 0, 0);
        showmany.setBorder(showmanyborder);

        JLabel buystatus = new JLabel("buy tickat status: ");
        buystatus.setMinimumSize(new Dimension(750, 30));
        buystatus.setPreferredSize(new Dimension(750, 30));
        buystatus.setForeground(Color.white);
        EmptyBorder buystatusborder = new EmptyBorder(0, 0, 0, 0);
        buystatus.setBorder(buystatusborder);

        JLabel showbuystatus = new JLabel("      ");
        showbuystatus.setMinimumSize(new Dimension(750, 30));
        showbuystatus.setPreferredSize(new Dimension(750, 30));
        showbuystatus.setForeground(Color.white);
        EmptyBorder showbuystatusborder = new EmptyBorder(0, 0, 0, 0);
        showbuystatus.setBorder(showbuystatusborder);

        JLabel empity = new JLabel("                             ");
        empity.setMinimumSize(new Dimension(750, 30));
        empity.setPreferredSize(new Dimension(750, 30));


        JTextField enterdate = new JTextField("(ex:2018/12/20)");
        enterdate.setMinimumSize(new Dimension(650, 30));
        enterdate.setPreferredSize(new Dimension(650, 30));

        JTextField enterhour = new JTextField("(ex:9:50)");
        enterhour.setMinimumSize(new Dimension(650, 30));
        enterhour.setPreferredSize(new Dimension(650, 30));

        JTextField enterid = new JTextField("enter id tickat");
        enterid.setMinimumSize(new Dimension(160, 30));
        enterid.setPreferredSize(new Dimension(160, 30));

        JButton canseltickat = new JButton("Cansel Tickat");
        canseltickat.setMinimumSize(new Dimension(160, 30));
        canseltickat.setPreferredSize(new Dimension(160, 30));
        canseltickat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(enterid.getText().matches("[0-9]*")){
                    if(Integer.parseInt(enterid.getText())<Tickatgrafic.tickats.size()){
                        String resultt = getcancelcoindepartment(tickats.get(Integer.parseInt(enterid.getText())).departmentt);
                        double cash = Double.parseDouble(Visitor.visitor.get(iv).cash);
                        cash = cash + Double.parseDouble(resultt);
                        Visitor.visitor.get(iv).cash = String.valueOf(cash);
                        Tickatgrafic.tickats.remove(Integer.parseInt(enterid.getText()));
                        p.save_arraylists_to_file();
                        p.save_arraylist_to_file_tickat();
                        showbuystatus.setForeground(Color.GREEN);
                        showbuystatus.setText("بلیت شما با موفقیت کنسل شد.");
                        p.setreport("visitor "+iv,"cansel tickat ");
                    }else{
                        System.out.println("id>tickats.size");
                    }
                }else{
                    showbuystatus.setForeground(Color.RED);
                    showbuystatus.setText("id entered not inccorect");
                }
            }
        });
                JButton buy = new JButton("Buy");
        buy.setMinimumSize(new Dimension(325, 30));
        buy.setPreferredSize(new Dimension(325, 30));
        buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(enterhour.getText().matches("[0-2][0-9][:][0-6][0-9]") && enterdate.getText().matches("[2][0-1][1-9][0-9][/][0-1][0-9][/][0-3][0-9]")) {
                    String resultt = getcoindepartment((String) enterdepartment.getSelectedItem());
                    resultt= String.valueOf(Double.parseDouble(resultt)-((Double.parseDouble(resultt)*Double.parseDouble(getoff(iv)))/100));
                    if (Double.parseDouble(Visitor.visitor.get(iv).cash) >= Double.parseDouble(resultt)) {
                        double cash = Double.parseDouble(Visitor.visitor.get(iv).cash);
                        cash = cash - Double.parseDouble(resultt);
                        Visitor.visitor.get(iv).cash = String.valueOf(cash);
                        Visitor v = new Visitor();
                        v.addtickat(enterhour.getText(), enterdate.getText(), Visitor.visitor.get(iv).Username, Visitor.visitor.get(iv).mail, Visitor.visitor.get(iv).phonenumber, (String) enterdepartment.getSelectedItem(), "zookeepert");
                        Person p = new Person() {
                            @Override
                            public void save_arraylist_to_file_tickat() {
                                super.save_arraylist_to_file_tickat();
                            }
                        };
                        p.save_arraylist_to_file_tickat();
                        p.save_arraylists_to_file();
                        showbuystatus.setForeground(Color.GREEN);
                        showbuystatus.setText("بلیت مورد نظر برای شما رزرو گردید.");
                        p.setreport("visitor "+iv,"buy tickat "+resultt);
                    } else if (Double.parseDouble(Visitor.visitor.get(iv).cash) < Double.parseDouble(resultt)) {
                        showbuystatus.setForeground(Color.RED);
                        showbuystatus.setText("موجودی کافی نیست لطفا حساب خود را شارژ نمایید.");
                    }
                }else{
                    showbuystatus.setText("enterhour or enterdate not incorrect");
                    showbuystatus.setForeground(Color.RED);
                }
            }
        });

        JButton result = new JButton("محاسبه قیمت");
        result.setMinimumSize(new Dimension(325, 30));
        result.setPreferredSize(new Dimension(325, 30));
        result.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String resultt=getcoindepartment((String) enterdepartment.getSelectedItem());
                resultt= String.valueOf(Double.parseDouble(resultt)-(Double.parseDouble(resultt)*Double.parseDouble(getoff(iv)))/100);
                showmany.setForeground(Color.YELLOW);
                showmany.setText(resultt);

            }
        });
        JButton cansel = new JButton("cansel");
        cansel.setMinimumSize(new Dimension(325, 30));
        cansel.setPreferredSize(new Dimension(325, 30));
        cansel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setVisible(false);

            }
        });
        add(department, BorderLayout.NORTH);
        add(enterdepartment, BorderLayout.NORTH);
        add(date, BorderLayout.NORTH);
        add(enterdate, BorderLayout.NORTH);
        add(hour, BorderLayout.NORTH);
        add(enterhour, BorderLayout.NORTH);
        add(etebar, BorderLayout.NORTH);
        add(showetebar, BorderLayout.NORTH);
        add(many, BorderLayout.NORTH);
        add(showmany, BorderLayout.NORTH);
        add(empity, BorderLayout.NORTH);
        add(result, BorderLayout.SOUTH);
        add(buy, BorderLayout.SOUTH);
        add(cansel, BorderLayout.SOUTH);
        add(enterid, BorderLayout.SOUTH);
        add(canseltickat, BorderLayout.SOUTH);
        add(buystatus, BorderLayout.NORTH);
        add(showbuystatus, BorderLayout.NORTH);
        add(scroll);

    }
    public String getcoindepartment(String itemt) {
        double resultt=0 ;
        int darsad = 0;
        Siasatmali s=new Siasatmali();
        if (itemt.equals("Birds")) {
            if(s.whatsiasatmali.equals("defult")){
                darsad=0;
                Birds b = new Birds();
                resultt = Double.parseDouble(b.coin)-((Double.parseDouble(b.coin)*darsad)/100);
            }
            else if(s.whatsiasatmali.equals("sm1")){
                darsad=s.down10tickatsiasat1;
                Birds b = new Birds();
                resultt = Double.parseDouble(b.coin)-((Double.parseDouble(b.coin)*darsad)/100);
            }
            else if(s.whatsiasatmali.equals("sm2")){
                darsad=s.down10alltickatsiasat2;
                Birds b = new Birds();
                resultt = Double.parseDouble(b.coin)-((Double.parseDouble(b.coin)*darsad)/100);
            }
            return String.valueOf(resultt);


        } else if (itemt.equals("Wild")) {
            if(s.whatsiasatmali.equals("defult")){
                darsad=0;
                Wild w = new Wild();
                resultt = Double.parseDouble(w.coin)-((Double.parseDouble(w.coin)*darsad)/100);
            }
            else if(s.whatsiasatmali.equals("sm1")){
                darsad=s.down10tickatsiasat1;
                Wild w = new Wild();
                resultt = Double.parseDouble(w.coin)-((Double.parseDouble(w.coin)*darsad)/100);
            }
            else if(s.whatsiasatmali.equals("sm2")){
                darsad=s.down10alltickatsiasat2;
                Wild w = new Wild();
                resultt = Double.parseDouble(w.coin)-((Double.parseDouble(w.coin)*darsad)/100);
            }
            return String.valueOf(resultt);


        } else if (itemt.equals("Aquatic")) {
            if(s.whatsiasatmali.equals("defult")){
                darsad=0;
                Aquatic a = new Aquatic();
                resultt = Double.parseDouble(a.coin)-((Double.parseDouble(a.coin)*darsad)/100);
            }
            else if(s.whatsiasatmali.equals("sm1")){
                darsad=s.up20tickatsiasat1;
                Aquatic a = new Aquatic();
                resultt = Double.parseDouble(a.coin)+((Double.parseDouble(a.coin)*darsad)/100);
            }
            else if(s.whatsiasatmali.equals("sm2")){
                darsad=s.down10alltickatsiasat2;
                Aquatic a = new Aquatic();
                resultt = Double.parseDouble(a.coin)-((Double.parseDouble(a.coin)*darsad)/100);
            }
            return String.valueOf(resultt);
        }
        return null;
    }


    public String getcancelcoindepartment(String itemt) {
        double resultt=0 ;
        int darsad = 0;
        Siasatmali s=new Siasatmali();


        if (itemt.equals("Birds")) {
            if(s.whatsiasatmali.equals("defult")){
                darsad=s.down21defult;
                Birds b = new Birds();
                resultt = Double.parseDouble(b.coin)-((Double.parseDouble(b.coin)*darsad)/100);
            }
            else if(s.whatsiasatmali.equals("sm1")){
                darsad=0;
                Birds b = new Birds();
                resultt = Double.parseDouble(b.coin)-((Double.parseDouble(b.coin)*darsad)/100);
            }
            else if(s.whatsiasatmali.equals("sm2")){
                darsad=0;
                Birds b = new Birds();
                resultt = Double.parseDouble(b.coin)-((Double.parseDouble(b.coin)*darsad)/100);
            }
            return String.valueOf(resultt);


        } else if (itemt.equals("Wild")) {
            if(s.whatsiasatmali.equals("defult")){
                darsad=s.down21defult;
                Wild w = new Wild();
                resultt = Double.parseDouble(w.coin)-((Double.parseDouble(w.coin)*darsad)/100);
            }
            else if(s.whatsiasatmali.equals("sm1")){
                darsad=0;
                Wild w = new Wild();
                resultt = Double.parseDouble(w.coin)-((Double.parseDouble(w.coin)*darsad)/100);
            }
            else if(s.whatsiasatmali.equals("sm2")){
                darsad=0;
                Wild w = new Wild();
                resultt = Double.parseDouble(w.coin)-((Double.parseDouble(w.coin)*darsad)/100);
            }
            return String.valueOf(resultt);


        } else if (itemt.equals("Aquatic")) {
            if(s.whatsiasatmali.equals("defult")){
                darsad=s.down21defult;
                Aquatic a = new Aquatic();
                resultt = Double.parseDouble(a.coin)-((Double.parseDouble(a.coin)*darsad)/100);
            }
            else if(s.whatsiasatmali.equals("sm1")){
                darsad=0;
                Aquatic a = new Aquatic();
                resultt = Double.parseDouble(a.coin)-((Double.parseDouble(a.coin)*darsad)/100);
            }
            else if(s.whatsiasatmali.equals("sm2")){
                darsad=0;
                Aquatic a = new Aquatic();
                resultt = Double.parseDouble(a.coin)-((Double.parseDouble(a.coin)*darsad)/100);
            }
            return String.valueOf(resultt);
        }
        return null;
    }
    public String getoff(int iv){
        int count=0,darsad=0;
        Siasatmali s=new Siasatmali();
        for(int i=0;i<tickats.size();i++){
            if(tickats.get(i).usert.equals(Visitor.visitor.get(iv).Username)){
                count++;
            }
        }
        if(count>8){
            if(s.whatsiasatmali.equals("defult")){
                darsad=20;
            }
            else if(s.whatsiasatmali.equals("sm1")){
                darsad=0;
            }
            else if(s.whatsiasatmali.equals("sm2")){
                darsad=0;
            }
            return String.valueOf(darsad);
        }
        else if(count>3){
            if(s.whatsiasatmali.equals("defult")){
                darsad=s.down10defult;
            }
            else if(s.whatsiasatmali.equals("sm1")){
                darsad=0;
            }
            else if(s.whatsiasatmali.equals("sm2")){
                darsad=0;
            }
            return String.valueOf(darsad);
        }
        else{
            if(s.whatsiasatmali.equals("defult")){
                darsad=0;
            }
            else if(s.whatsiasatmali.equals("sm1")){
                darsad=0;
            }
            else if(s.whatsiasatmali.equals("sm2")){
                darsad=0;
            }
            return String.valueOf(darsad);
        }
    }
}
