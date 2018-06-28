import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Zookeepershowgrafic extends JPanel {
    private int wage;
    public Zookeepershowgrafic() {
        setMinimumSize(new Dimension(800, 800));
        setPreferredSize(new Dimension(800, 800));

        String[] columName = {"ID","Name", "Lastname", "Username","Email","Wage","Phonenumber","Department"};

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

        Person p=new Person() {
            @Override
            public void read_from_file() {
                super.read_from_file();
            }
        };
        Siasatmali s=new Siasatmali();
        if(s.whatsiasatmali.equals("sm1")){
            wage=s.up15wagesiasat1;
        }
        else if(s.whatsiasatmali.equals("sm2")){
            wage=s.down5wageallzookkepersiasat2;
        }
        else{
            wage=0;
        }

        for (int i = 0; i < Zookeeper.zookeeper.size(); i++) {
            t.addRow(new Object[]{i,
                    Zookeeper.zookeeper.get(i).Name,
                    Zookeeper.zookeeper.get(i).lastname,
                    Zookeeper.zookeeper.get(i).Username,
                    Zookeeper.zookeeper.get(i).mail,
                    Double.parseDouble(Zookeeper.zookeeper.get(i).Wage)+((Double.parseDouble(Zookeeper.zookeeper.get(i).Wage)*wage)/100),
                    Zookeeper.zookeeper.get(i).phonenumber,
                    Zookeeper.zookeeper.get(i).department});

        }
        JScrollPane scroll = new JScrollPane(table);
        scroll.setPreferredSize(new Dimension(800, 800));
        scroll.setMinimumSize(new Dimension(800, 800));
        add(scroll);
    }
}
