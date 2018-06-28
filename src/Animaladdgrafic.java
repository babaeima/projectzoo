import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animaladdgrafic extends JPanel {
    public Animaladdgrafic(){
        Person p=new Person() {
            @Override
            public void setreport(String level, String action) {
                super.setreport(level, action);
            }
        };
        setMinimumSize(new Dimension(800, 800));
        setPreferredSize(new Dimension(800, 800));
        setBackground(Color.darkGray);

        JLabel name = new JLabel("Name: ");
        name.setMinimumSize(new Dimension(750, 30));
        name.setPreferredSize(new Dimension(750, 30));
        name.setForeground(Color.white);
        EmptyBorder nameborder = new EmptyBorder(0, 0, 0, 0);
        name.setBorder(nameborder);

        JLabel sex = new JLabel("sex: ");
        sex.setMinimumSize(new Dimension(750, 30));
        sex.setPreferredSize(new Dimension(750, 30));
        sex.setForeground(Color.white);
        EmptyBorder sexborder = new EmptyBorder(0, 0, 0, 0);
        sex.setBorder(sexborder);

        JLabel nationality = new JLabel("nationality: ");
        nationality.setMinimumSize(new Dimension(750, 30));
        nationality.setPreferredSize(new Dimension(750, 30));
        nationality.setForeground(Color.white);
        EmptyBorder nationalityborder = new EmptyBorder(0, 0, 0, 0);
        nationality.setBorder(nationalityborder);

        JLabel nationalid = new JLabel("national id: ");
        nationalid.setMinimumSize(new Dimension(750, 30));
        nationalid.setPreferredSize(new Dimension(750, 30));
        nationalid.setForeground(Color.white);
        EmptyBorder nationalidborder = new EmptyBorder(0, 0, 0, 0);
        nationalid.setBorder(nationalidborder);

        JLabel insurance = new JLabel("Insurance: ");
        insurance.setMinimumSize(new Dimension(750, 30));
        insurance.setPreferredSize(new Dimension(750, 30));
        insurance.setForeground(Color.white);
        EmptyBorder insuranceborder = new EmptyBorder(0, 0, 0, 0);
        insurance.setBorder(insuranceborder);

        JLabel food = new JLabel("Food: ");
        food.setMinimumSize(new Dimension(750, 30));
        food.setPreferredSize(new Dimension(750, 30));
        food.setForeground(Color.white);
        EmptyBorder foodborder = new EmptyBorder(0, 0, 0, 0);
        food.setBorder(foodborder);

        JLabel department = new JLabel("Department: ");
        department.setMinimumSize(new Dimension(750, 30));
        department.setPreferredSize(new Dimension(750, 30));
        department.setForeground(Color.white);
        EmptyBorder departmentborder = new EmptyBorder(0, 0, 0, 0);
        department.setBorder(departmentborder);

        JLabel empity = new JLabel("                             ");
        empity.setMinimumSize(new Dimension(750, 30));
        empity.setPreferredSize(new Dimension(750, 30));


        JTextField entername = new JTextField("enter animals name");
        entername.setMinimumSize(new Dimension(650, 30));
        entername.setPreferredSize(new Dimension(650, 30));


        String item[] = {"Male","Female"};
        JComboBox entersex = new JComboBox(item);
        entersex.setMinimumSize(new Dimension(650, 30));
        entersex.setPreferredSize(new Dimension(650, 30));


        JTextField enternationalty = new JTextField("enter nationalty");
        enternationalty.setMinimumSize(new Dimension(650, 30));
        enternationalty.setPreferredSize(new Dimension(650, 30));


        JTextField enternationalid = new JTextField("enternationalid");
        enternationalid.setMinimumSize(new Dimension(650, 30));
        enternationalid.setPreferredSize(new Dimension(650, 30));


        JTextField enterinsurance = new JTextField("enter insurance");
        enterinsurance.setMinimumSize(new Dimension(650, 30));
        enterinsurance.setPreferredSize(new Dimension(650, 30));


        JTextField enterfood = new JTextField("enter food");
        enterfood.setMinimumSize(new Dimension(650, 30));
        enterfood.setPreferredSize(new Dimension(650, 30));


        String item2[] = {"Aquatic", "Birds", "Wild"};
        JComboBox enterdepartment = new JComboBox(item2);
        enterdepartment.setMinimumSize(new Dimension(650, 30));
        enterdepartment.setPreferredSize(new Dimension(650, 30));


        final JLabel save_status = new JLabel("save status");
        save_status.setMinimumSize(new Dimension(145, 30));
        save_status.setPreferredSize(new Dimension(145, 30));
        save_status.setForeground(Color.white);

        JButton Add = new JButton("Add");
        Add.setMinimumSize(new Dimension(325, 30));
        Add.setPreferredSize(new Dimension(325, 30));
        Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(enterfood.getText().matches("[a-zA-Z]*") && enternationalid.getText().matches("[0-9]*") && enternationalty.getText().matches("[a-zA-Z]*")) {
                    String result = (String) enterdepartment.getSelectedItem();
                    if (result.equals("Aquatic")) {
                        Aquatic a = new Aquatic();
                        a.id = String.valueOf(Aquatic.aquatics.size() + 1000);
                        a.Department = (String) enterdepartment.getSelectedItem();
                        a.food = enterfood.getText();
                        a.National_id = enternationalid.getText();
                        a.sex = (String) entersex.getSelectedItem();
                        a.insurance = enterinsurance.getText();
                        a.Nationality = enternationalty.getText();
                        a.name = entername.getText();
                        if (a.dublicat(enternationalid.getText())) {
                            Aquatic.aquatics.add(a);
                            a.saveaquatictofile(Aquatic.aquatics.size() - 1);
                            save_status.setForeground(Color.GREEN);
                            save_status.setText("add Aquatic succesfull");
                            p.setreport("Aquatic","add");
                        } else {
                            save_status.setForeground(Color.RED);
                            save_status.setText("add Aquatic unsuccesfull");
                        }
                    } else if (result.equals("Birds")) {
                        Birds b = new Birds();
                        b.id = String.valueOf(Birds.birds.size() + 2000);
                        b.Department = (String) enterdepartment.getSelectedItem();
                        b.food = enterfood.getText();
                        b.National_id = enternationalid.getText();
                        b.sex = (String) entersex.getSelectedItem();
                        b.insurance = enterinsurance.getText();
                        b.Nationality = enternationalty.getText();
                        b.name = entername.getText();
                        if (b.dublicat(enternationalid.getText())) {
                            Birds.birds.add(b);
                            b.savebridtofile(Birds.birds.size() - 1);
                            save_status.setForeground(Color.GREEN);
                            save_status.setText("add Birds succesfull");
                            p.setreport("Birds","add");
                        } else {
                            save_status.setForeground(Color.RED);
                            save_status.setText("add Birds unsuccesfull");
                        }
                    } else if (result.equals("Wild")) {
                        Wild w = new Wild();
                        w.id = String.valueOf(Wild.wilds.size() + 3000);
                        w.Department = (String) enterdepartment.getSelectedItem();
                        w.food = enterfood.getText();
                        w.National_id = enternationalid.getText();
                        w.sex = (String) entersex.getSelectedItem();
                        w.insurance = enterinsurance.getText();
                        w.Nationality = enternationalty.getText();
                        w.name = entername.getText();
                        if (w.dublicat(enternationalid.getText())) {
                            Wild.wilds.add(w);
                            w.savewildtofile(Wild.wilds.size() - 1);
                            save_status.setForeground(Color.GREEN);
                            save_status.setText("add Wild succesfull");
                            p.setreport("Wild","add");
                        } else {
                            save_status.setForeground(Color.RED);
                            save_status.setText("add Wild unsuccesfull");
                        }
                    }
                }else{
                    save_status.setText("not incorrect");
                    save_status.setForeground(Color.RED);
                }

            }
        });

        JButton cansel = new JButton("Cansel");
        cansel.setMinimumSize(new Dimension(325, 30));
        cansel.setPreferredSize(new Dimension(325, 30));
        cansel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setVisible(false);
            }
        });
        add(name, BorderLayout.NORTH);
        add(entername, BorderLayout.NORTH);
        add(sex, BorderLayout.NORTH);
        add(entersex, BorderLayout.NORTH);
        add(nationality, BorderLayout.NORTH);
        add(enternationalty, BorderLayout.NORTH);
        add(nationalid, BorderLayout.NORTH);
        add(enternationalid, BorderLayout.NORTH);
        add(insurance, BorderLayout.NORTH);
        add(enterinsurance, BorderLayout.NORTH);
        add(food, BorderLayout.NORTH);
        add(enterfood, BorderLayout.NORTH);
        add(department, BorderLayout.NORTH);
        add(enterdepartment, BorderLayout.NORTH);
        add(empity, BorderLayout.NORTH);
        add(Add, BorderLayout.SOUTH);
        add(cansel, BorderLayout.SOUTH);
        add(save_status, BorderLayout.LINE_END);
    }


}
