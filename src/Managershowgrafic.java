import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Managershowgrafic extends JPanel {
    private int wage;
    public Managershowgrafic() {
        setMinimumSize(new Dimension(800, 800));
        setPreferredSize(new Dimension(800, 800));
        setBackground(Color.darkGray);

        String[] columName = {"ID","Name", "Lastname", "Username", "Password","Email","Wage","Phonenumber"};

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
        if(s.whatsiasatmali.equals("sm2")){
           wage=s.up10wagemanagersiasat2;
        }else{
            wage=0;
        }
        for (int i = 0; i < Manager.manager.size(); i++) {
            t.addRow(new Object[]{i,
                    Manager.manager.get(i).Name,
                    Manager.manager.get(i).lastname,
                    Manager.manager.get(i).Username,
                    Manager.manager.get(i).password,
                    Manager.manager.get(i).mail,
                    Double.parseDouble(Manager.manager.get(i).wage)+((Double.parseDouble(Manager.manager.get(i).wage)*wage)/100),
                    Manager.manager.get(i).phonenumber});
        }
        JScrollPane scroll = new JScrollPane(table);
        scroll.setPreferredSize(new Dimension(800, 800));
        scroll.setMinimumSize(new Dimension(800, 800));
        add(scroll);
    }
}
