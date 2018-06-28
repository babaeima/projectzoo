import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Visitorshowgrafic extends JPanel{
    public Visitorshowgrafic() {
        setMinimumSize(new Dimension(800, 800));
        setPreferredSize(new Dimension(800, 800));

        String[] columName = {"Id","name", "lastname", "username", "password","email","phonenumber","cash"};

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

        for (int i = 0; i < Visitor.visitor.size(); i++) {
            t.addRow(new Object[]{i,
                    Visitor.visitor.get(i).Name,
                    Visitor.visitor.get(i).lastname,
                    Visitor.visitor.get(i).Username,
                    Visitor.visitor.get(i).password,
                    Visitor.visitor.get(i).mail,
                    Visitor.visitor.get(i).phonenumber,
                    Visitor.visitor.get(i).cash});
        }
        JScrollPane scroll = new JScrollPane(table);
        scroll.setPreferredSize(new Dimension(800, 800));
        scroll.setMinimumSize(new Dimension(800, 800));
        add(scroll);
    }
}
