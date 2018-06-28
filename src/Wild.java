import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Wild extends Animal implements showable{
    String home;
    public String coin="3.3";
    public static ArrayList<Wild> wilds=new ArrayList<Wild>();

    public void addaquaticanimal(String Nationality,String Id,String sex,String insurance,String food,String Department,String home){
        this.Nationality=Nationality;
        this.National_id=Id;
        this.sex=sex;
        this.insurance=insurance;
        this.food=food;
        this.Department=Department;
        this.home=home;
    }
    public void savewildtofile(int i){
        try{
            BufferedWriter out = new BufferedWriter(new FileWriter("animal.txt",true));
            out.write("wilds");
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("animal.txt", true));
            out.write(wilds.get(i).name);
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("animal.txt", true));
            out.write(wilds.get(i).Nationality);
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("animal.txt", true));
            out.write(wilds.get(i).National_id);
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("animal.txt", true));
            out.write(wilds.get(i).sex);
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("animal.txt", true));
            out.write(wilds.get(i).food);
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("animal.txt", true));
            out.write(wilds.get(i).Department);
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("animal.txt", true));
            out.write(wilds.get(i).insurance);
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("animal.txt", true));
            out.write(String.valueOf(wilds.get(i).home));
            out.newLine();
            out.close();

        } catch (IOException e) {
            System.out.println("exception occoured" + e);
        }

    }
    public void removewildanimal(int id){
        if (id < wilds.size()) {
            wilds.remove(id);
            save_arraylist_to_file_animal();
        }else{
            System.out.println("id>wilds.size");
        }
    }
    public char editwildanimal(String Id){
        for (int i=0;i<wilds.size();i++){
            if(wilds.get(i).National_id.equals(Id)){
                return (char) i;
                //ادامه نوشته شود
            }
        }
        return 0;
    }

    public boolean dublicat(String national_id){
        for(int i=0;i<wilds.size();i++){
            if(wilds.get(i).National_id.equals(national_id)){
                return false;
            }
        }
        return true;
    }
}
