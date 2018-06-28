import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Tickatshowgrafic extends JPanel {
    public Tickatshowgrafic(int iz) {
        setMinimumSize(new Dimension(800, 800));
        setPreferredSize(new Dimension(800, 800));
        setBackground(Color.darkGray);
        String department=Zookeeper.zookeeper.get(iz).department;
        String[] columName = {"id","department", "date", "hour", "Username", "mail", "phonenumber", "zookeeper"};

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

        if(department.equals("Birds")) {
            for (int i = 0; i < Tickatgrafic.tickats.size(); i++) {
                if(Tickatgrafic.tickats.get(i).departmentt.equals(department)) {
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
        }
        if(department.equals("Wild")) {
            for (int i = 0; i < Tickatgrafic.tickats.size(); i++) {
                if(Tickatgrafic.tickats.get(i).departmentt.equals(department)) {
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
        }
        if(department.equals("Aquatic")) {
            for (int i = 0; i < Tickatgrafic.tickats.size(); i++) {
                if(Tickatgrafic.tickats.get(i).departmentt.equals(department)) {
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
        }

        JScrollPane scroll = new JScrollPane(table);
        scroll.setPreferredSize(new Dimension(800, 800));
        scroll.setMinimumSize(new Dimension(800, 800));
        add(scroll);
    }
}