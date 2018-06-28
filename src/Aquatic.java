import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Aquatic extends Animal implements showable {
    boolean camivorous;
    public String coin="1.1";
    public static ArrayList<Aquatic> aquatics=new ArrayList<Aquatic>();

    public void addaquaticanimal(String Nationality,String Id,String sex,String insurance,String food,String Department,boolean camivorous){
        Aquatic a=new Aquatic();
        a.Nationality=Nationality;
        a.National_id=Id;
        a.sex=sex;
        a.insurance=insurance;
        a.food=food;
        a.Department=Department;
        a.camivorous=camivorous;
        if(dublicat(National_id)) {
            aquatics.add(a);
            saveaquatictofile(aquatics.size()-1);
        }
        else{
            System.out.println("the aquatics is dublicat");
        }

    }
    public void saveaquatictofile(int i){
        try{
                BufferedWriter out = new BufferedWriter(new FileWriter("animal.txt",true));
                out.write("aquatic");
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("animal.txt", true));
                out.write(aquatics.get(i).name);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("animal.txt", true));
                out.write(aquatics.get(i).Nationality);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("animal.txt", true));
                out.write(aquatics.get(i).National_id);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("animal.txt", true));
                out.write(aquatics.get(i).sex);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("animal.txt", true));
                out.write(aquatics.get(i).food);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("animal.txt", true));
                out.write(aquatics.get(i).Department);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("animal.txt", true));
                out.write(aquatics.get(i).insurance);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("animal.txt", true));
                out.write(String.valueOf(aquatics.get(i).camivorous));
                out.newLine();
                out.close();

        } catch (IOException e) {
            System.out.println("exception occoured" + e);
        }

    }
    public void removeaquaticanimal(int id){
        if (id < aquatics.size()) {
            aquatics.remove(id);
            save_arraylist_to_file_animal();
        }else{
            System.out.println("id>aquatics.size");
        }
    }
    public char editaquaticanimal(String Id){
        for (int i=0;i<aquatics.size();i++){
            if(aquatics.get(i).National_id.equals(Id)){
                return (char) i;
                //ادامه نوشته شود
            }
        }
        return 0;
    }

    public boolean dublicat(String national_id){
        for(int i=0;i<aquatics.size();i++){
            if(aquatics.get(i).National_id.equals(national_id)){
                return false;
            }
        }
        return true;
    }
}
