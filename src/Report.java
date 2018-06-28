import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Report extends JPanel {
    public static ArrayList<Report> report = new ArrayList<Report>();
    public String date,level,action,id;
    public Report() {
        setMinimumSize(new Dimension(800, 900));
        setPreferredSize(new Dimension(800, 900));
        setBackground(Color.darkGray);

        String[] columName = {"Id","level","action", "date"};

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


        for (int i = 0; i < report.size(); i++) {
            t.addRow(new Object[]{i,
                    report.get(i).level,
                    report.get(i).action,
                    report.get(i).date});
        }
        JScrollPane scroll = new JScrollPane(table);
        scroll.setPreferredSize(new Dimension(800, 800));
        scroll.setMinimumSize(new Dimension(800, 800));
        add(scroll);


    }
    public void setreport(String level,String action){
        Date date=new Date();
        SimpleDateFormat ft=new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        this.id= String.valueOf(report.size());
        this.level=level;
        this.action=action;
        this.date=ft.format(date);

    }
    public void deletereport(int i){
        if(i<report.size()) {
            report.remove(i);
        }
        else{
            System.out.println("id not found");
        }
    }


}
