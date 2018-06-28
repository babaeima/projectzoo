import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class Animal {
   public String name;
    public String Nationality;
    public String National_id;
    public String sex;
    public String insurance;
    public String food;
    public String Department;
    public String id;

 public void save_arraylist_to_file_animal() {
  try {

   BufferedWriter out = new BufferedWriter(new FileWriter("animal.txt"));

  } catch (IOException e) {
   System.out.println("exception occoured" + e);
  }

  for (int i = 0; i < Aquatic.aquatics.size(); i++) {
   try {
    BufferedWriter out = new BufferedWriter(new FileWriter("animal.txt", true));
    out.write("aquatic");
    out.newLine();
    out.close();

    out = new BufferedWriter(new FileWriter("animal.txt", true));
    out.write(Aquatic.aquatics.get(i).name);
    out.newLine();
    out.close();

    out = new BufferedWriter(new FileWriter("animal.txt", true));
    out.write(Aquatic.aquatics.get(i).Nationality);
    out.newLine();
    out.close();

    out = new BufferedWriter(new FileWriter("animal.txt", true));
    out.write(Aquatic.aquatics.get(i).National_id);
    out.newLine();
    out.close();

    out = new BufferedWriter(new FileWriter("animal.txt", true));
    out.write(Aquatic.aquatics.get(i).sex);
    out.newLine();
    out.close();

    out = new BufferedWriter(new FileWriter("animal.txt", true));
    out.write(Aquatic.aquatics.get(i).food);
    out.newLine();
    out.close();

    out = new BufferedWriter(new FileWriter("animal.txt", true));
    out.write(Aquatic.aquatics.get(i).Department);
    out.newLine();
    out.close();

    out = new BufferedWriter(new FileWriter("animal.txt", true));
    out.write(Aquatic.aquatics.get(i).insurance);
    out.newLine();
    out.close();

    out = new BufferedWriter(new FileWriter("animal.txt", true));
    out.write(String.valueOf(Aquatic.aquatics.get(i).camivorous));
    out.newLine();
    out.close();

   } catch (IOException e) {
    System.out.println("exception occoured" + e);
   }
  }
  for (int i = 0; i < Birds.birds.size(); i++) {
   try {
    BufferedWriter out = new BufferedWriter(new FileWriter("animal.txt", true));
    out.write("birds");
    out.newLine();
    out.close();

    out = new BufferedWriter(new FileWriter("animal.txt", true));
    out.write(Birds.birds.get(i).name);
    out.newLine();
    out.close();

    out = new BufferedWriter(new FileWriter("animal.txt", true));
    out.write(Birds.birds.get(i).Nationality);
    out.newLine();
    out.close();

    out = new BufferedWriter(new FileWriter("animal.txt", true));
    out.write(Birds.birds.get(i).National_id);
    out.newLine();
    out.close();

    out = new BufferedWriter(new FileWriter("animal.txt", true));
    out.write(Birds.birds.get(i).sex);
    out.newLine();
    out.close();

    out = new BufferedWriter(new FileWriter("animal.txt", true));
    out.write(Birds.birds.get(i).food);
    out.newLine();
    out.close();

    out = new BufferedWriter(new FileWriter("animal.txt", true));
    out.write(Birds.birds.get(i).Department);
    out.newLine();
    out.close();

    out = new BufferedWriter(new FileWriter("animal.txt", true));
    out.write(Birds.birds.get(i).insurance);
    out.newLine();
    out.close();

    out = new BufferedWriter(new FileWriter("animal.txt", true));
    out.write(String.valueOf(Birds.birds.get(i).Wild));
    out.newLine();
    out.close();

   }catch (IOException e) {
    System.out.println("exception occoured" + e);
   }
  }
  for (int i = 0; i < Wild.wilds.size(); i++) {
   try {
    BufferedWriter out = new BufferedWriter(new FileWriter("animal.txt", true));
    out.write("wilds");
    out.newLine();
    out.close();

    out = new BufferedWriter(new FileWriter("animal.txt", true));
    out.write(Wild.wilds.get(i).name);
    out.newLine();
    out.close();

    out = new BufferedWriter(new FileWriter("animal.txt", true));
    out.write(Wild.wilds.get(i).Nationality);
    out.newLine();
    out.close();

    out = new BufferedWriter(new FileWriter("animal.txt", true));
    out.write(Wild.wilds.get(i).National_id);
    out.newLine();
    out.close();

    out = new BufferedWriter(new FileWriter("animal.txt", true));
    out.write(Wild.wilds.get(i).sex);
    out.newLine();
    out.close();

    out = new BufferedWriter(new FileWriter("animal.txt", true));
    out.write(Wild.wilds.get(i).food);
    out.newLine();
    out.close();

    out = new BufferedWriter(new FileWriter("animal.txt", true));
    out.write(Wild.wilds.get(i).Department);
    out.newLine();
    out.close();

    out = new BufferedWriter(new FileWriter("animal.txt", true));
    out.write(Wild.wilds.get(i).insurance);
    out.newLine();
    out.close();

    out = new BufferedWriter(new FileWriter("animal.txt", true));
    out.write(String.valueOf(Wild.wilds.get(i).home));
    out.newLine();
    out.close();

   } catch (IOException e) {
    System.out.println("exception occoured" + e);
   }
  }

 }
}
