import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Animalshowgrafic extends JPanel {
    public Animalshowgrafic() {
        setMinimumSize(new Dimension(800, 800));
        setPreferredSize(new Dimension(800, 800));
        setBackground(Color.darkGray);

        String[] columName = {"ID","Name", "Department", "sex", "nationality","Nationalid","Insurance","food"};

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

        for (int i = 0; i < Aquatic.aquatics.size(); i++) {
            t.addRow(new Object[]{i+1000,
                    Aquatic.aquatics.get(i).name,
                    Aquatic.aquatics.get(i).Department,
                    Aquatic.aquatics.get(i).sex,
                    Aquatic.aquatics.get(i).Nationality,
                    Aquatic.aquatics.get(i).National_id,
                    Aquatic.aquatics.get(i).insurance,
                    Aquatic.aquatics.get(i).food});
        }

        for (int i = 0; i < Birds.birds.size(); i++) {
        t.addRow(new Object[]{i+2000,
                Birds.birds.get(i).name,
                Birds.birds.get(i).Department,
                Birds.birds.get(i).sex,
                Birds.birds.get(i).Nationality,
                Birds.birds.get(i).National_id,
                Birds.birds.get(i).insurance,
                Birds.birds.get(i).food});
    }

        for (int i = 0; i < Wild.wilds.size(); i++) {
        t.addRow(new Object[]{i+3000,
                Wild.wilds.get(i).name,
                Wild.wilds.get(i).Department,
                Wild.wilds.get(i).sex,
                Wild.wilds.get(i).Nationality,
                Wild.wilds.get(i).National_id,
                Wild.wilds.get(i).insurance,
                Wild.wilds.get(i).food});
    }
        JScrollPane scroll = new JScrollPane(table);
        scroll.setPreferredSize(new Dimension(800, 800));
        scroll.setMinimumSize(new Dimension(800, 800));
        add(scroll);
    }
}
