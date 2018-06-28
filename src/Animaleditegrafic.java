import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animaleditegrafic extends JPanel {
    public Animaleditegrafic(int ia){
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

        JLabel nationalty = new JLabel("nationalty: ");
        nationalty.setMinimumSize(new Dimension(750, 30));
        nationalty.setPreferredSize(new Dimension(750, 30));
        nationalty.setForeground(Color.white);
        EmptyBorder nationaltyborder = new EmptyBorder(0, 0, 0, 0);
        nationalty.setBorder(nationaltyborder);

        JLabel nationalid = new JLabel("national id: ");
        nationalid.setMinimumSize(new Dimension(750, 30));
        nationalid.setPreferredSize(new Dimension(750, 30));
        nationalid.setForeground(Color.white);
        EmptyBorder nationalidborder = new EmptyBorder(0, 0, 0, 0);
        nationalid.setBorder(nationalidborder);

        JLabel bime = new JLabel("bime: ");
        bime.setMinimumSize(new Dimension(750, 30));
        bime.setPreferredSize(new Dimension(750, 30));
        bime.setForeground(Color.white);
        EmptyBorder bimeborder = new EmptyBorder(0, 0, 0, 0);
        bime.setBorder(bimeborder);

        JLabel food = new JLabel("food: ");
        food.setMinimumSize(new Dimension(750, 30));
        food.setPreferredSize(new Dimension(750, 30));
        food.setForeground(Color.white);
        EmptyBorder foodborder = new EmptyBorder(0, 0, 0, 0);
        food.setBorder(foodborder);

        JLabel empity = new JLabel("                             ");
        empity.setMinimumSize(new Dimension(750, 30));
        empity.setPreferredSize(new Dimension(750, 30));


        JTextField entername = new JTextField();
        entername.setMinimumSize(new Dimension(650, 30));
        entername.setPreferredSize(new Dimension(650, 30));


        JTextField entersex = new JTextField();
        entersex.setMinimumSize(new Dimension(650, 30));
        entersex.setPreferredSize(new Dimension(650, 30));


        JTextField enternationality = new JTextField();
        enternationality.setMinimumSize(new Dimension(650, 30));
        enternationality.setPreferredSize(new Dimension(650, 30));


        JPasswordField enternationalid = new JPasswordField();
        enternationalid.setMinimumSize(new Dimension(650, 30));
        enternationalid.setPreferredSize(new Dimension(650, 30));


        JTextField enterbime = new JTextField();
        enterbime.setMinimumSize(new Dimension(650, 30));
        enterbime.setPreferredSize(new Dimension(650, 30));


        JTextField enterfood = new JTextField();
        enterfood.setMinimumSize(new Dimension(650, 30));
        enterfood.setPreferredSize(new Dimension(650, 30));


        final JLabel save_status = new JLabel("save status");
        save_status.setMinimumSize(new Dimension(145, 30));
        save_status.setPreferredSize(new Dimension(145, 30));
        save_status.setForeground(Color.white);

        if(ia>=1000 & ia<2000){
            if (ia-1000 < Aquatic.aquatics.size()) {
                name.setText("name: " + Aquatic.aquatics.get(ia - 1000).name);
                sex.setText("sex: " + Aquatic.aquatics.get(ia - 1000).sex);
                nationalty.setText("nationalty: " + Aquatic.aquatics.get(ia - 1000).Nationality);
                nationalid.setText("national id: " + Aquatic.aquatics.get(ia - 1000).National_id);
                bime.setText("bime: " + Aquatic.aquatics.get(ia - 1000).insurance);
                food.setText("food: " + Aquatic.aquatics.get(ia - 1000).food);

                entername.setText(Aquatic.aquatics.get(ia - 1000).name);
                entersex.setText(Aquatic.aquatics.get(ia - 1000).sex);
                enternationality.setText(Aquatic.aquatics.get(ia - 1000).Nationality);
                enternationalid.setText(Aquatic.aquatics.get(ia - 1000).National_id);
                enterbime.setText(Aquatic.aquatics.get(ia - 1000).insurance);
                enterfood.setText(Aquatic.aquatics.get(ia - 1000).food);
            }else{
                System.out.println("id>Aquatic.aquatics.size");
            }
        }
        if(ia>=2000 & ia<3000){
            if (ia-2000 < Birds.birds.size()) {
                name.setText("name: " + Birds.birds.get(ia - 2000).name);
                sex.setText("sex: " + Birds.birds.get(ia - 2000).sex);
                nationalty.setText("nationalty: " + Birds.birds.get(ia - 2000).Nationality);
                nationalid.setText("national id: " + Birds.birds.get(ia - 2000).National_id);
                bime.setText("bime: " + Birds.birds.get(ia - 2000).insurance);
                food.setText("food: " + Birds.birds.get(ia - 2000).food);

                entername.setText(Birds.birds.get(ia - 2000).name);
                entersex.setText(Birds.birds.get(ia - 2000).sex);
                enternationality.setText(Birds.birds.get(ia - 2000).Nationality);
                enternationalid.setText(Birds.birds.get(ia - 2000).National_id);
                enterbime.setText(Birds.birds.get(ia - 2000).insurance);
                enterfood.setText(Birds.birds.get(ia - 2000).food);
            }else{
                System.out.println("id>Birds.birds.size");
            }
        }
        if(ia>=3000 & ia<4000){
            if (ia-3000 < Birds.birds.size()) {
                name.setText("name: " + Wild.wilds.get(ia - 3000).name);
                sex.setText("sex: " + Wild.wilds.get(ia - 3000).sex);
                nationalty.setText("nationalty: " + Wild.wilds.get(ia - 3000).Nationality);
                nationalid.setText("national id: " + Wild.wilds.get(ia - 3000).National_id);
                bime.setText("bime: " + Wild.wilds.get(ia - 3000).insurance);
                food.setText("food: " + Wild.wilds.get(ia - 3000).food);

                entername.setText(Wild.wilds.get(ia - 3000).name);
                entersex.setText(Wild.wilds.get(ia - 3000).sex);
                enternationality.setText(Wild.wilds.get(ia - 3000).Nationality);
                enternationalid.setText(Wild.wilds.get(ia - 3000).National_id);
                enterbime.setText(Wild.wilds.get(ia - 3000).insurance);
                enterfood.setText(Wild.wilds.get(ia - 3000).food);
            }else{
                System.out.println("id>Wild.wilds.size");
            }
        }

        JButton save = new JButton("Save");
        save.setMinimumSize(new Dimension(325, 30));
        save.setPreferredSize(new Dimension(325, 30));
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(enterfood.getText().matches("[a-zA-Z]*") && entersex.getText().matches("[a-zA-Z]*") && enternationalid.getText().matches("[0-9]*") && enternationality.getText().matches("[a-zA-Z]*")) {
                    if (ia >= 1000 & ia < 2000) {
                        Aquatic.aquatics.get(ia).name = entername.getText();
                        Aquatic.aquatics.get(ia).sex = entersex.getText();
                        Aquatic.aquatics.get(ia).Nationality = enternationality.getText();
                        Aquatic.aquatics.get(ia).National_id = enternationalid.getText();
                        Aquatic.aquatics.get(ia).insurance = enterbime.getText();
                        Aquatic.aquatics.get(ia).food = enterfood.getText();
                        Animal a = new Animal() {
                            @Override
                            public void save_arraylist_to_file_animal() {
                                super.save_arraylist_to_file_animal();
                            }
                        };
                        a.save_arraylist_to_file_animal();
                        save_status.setForeground(Color.GREEN);
                        save_status.setText("Edit successfull");
                        p.setreport("Aquatic","edit");
                    } else if (ia >= 2000 & ia < 3000) {
                        Birds.birds.get(ia).name = entername.getText();
                        Birds.birds.get(ia).sex = entersex.getText();
                        Birds.birds.get(ia).Nationality = enternationality.getText();
                        Birds.birds.get(ia).National_id = enternationalid.getText();
                        Birds.birds.get(ia).insurance = enterbime.getText();
                        Birds.birds.get(ia).food = enterfood.getText();
                        Animal a = new Animal() {
                            @Override
                            public void save_arraylist_to_file_animal() {
                                super.save_arraylist_to_file_animal();
                            }
                        };
                        a.save_arraylist_to_file_animal();
                        save_status.setForeground(Color.GREEN);
                        save_status.setText("Edit successfull");
                        p.setreport("Birds","edit");
                    } else if (ia >= 3000 & ia < 4000) {
                        Wild.wilds.get(ia).name = entername.getText();
                        Wild.wilds.get(ia).sex = entersex.getText();
                        Wild.wilds.get(ia).Nationality = enternationality.getText();
                        Wild.wilds.get(ia).National_id = enternationalid.getText();
                        Wild.wilds.get(ia).insurance = enterbime.getText();
                        Wild.wilds.get(ia).food = enterfood.getText();
                        Animal a = new Animal() {
                            @Override
                            public void save_arraylist_to_file_animal() {
                                super.save_arraylist_to_file_animal();
                            }
                        };
                        a.save_arraylist_to_file_animal();
                        save_status.setForeground(Color.GREEN);
                        save_status.setText("Edit successfull");
                        p.setreport("Wild","edit");

                    } else {
                        save_status.setForeground(Color.RED);
                        save_status.setText("Edit unsuccessfull");
                    }
                }else{
                    save_status.setText("phonenumber or email not incorrect");
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
        add(nationalty, BorderLayout.NORTH);
        add(enternationality, BorderLayout.NORTH);
        add(nationalid, BorderLayout.NORTH);
        add(enternationalid, BorderLayout.NORTH);
        add(bime, BorderLayout.NORTH);
        add(enterbime, BorderLayout.NORTH);
        add(food, BorderLayout.NORTH);
        add(enterfood, BorderLayout.NORTH);
        add(empity, BorderLayout.NORTH);
        add(save, BorderLayout.SOUTH);
        add(cansel, BorderLayout.SOUTH);
        add(save_status, BorderLayout.LINE_END);
    }
}
