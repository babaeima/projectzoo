import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Birds extends Animal implements showable {
    public static ArrayList<Birds> birds=new ArrayList<Birds>();
    boolean Wild;
    public String coin="2.2";
    public void addbirdanimal(String Nationality,String Id,String sex,String insurance,String food,String Department,boolean wild){
        this.Nationality=Nationality;
        this.National_id=Id;
        this.sex=sex;
        this.insurance=insurance;
        this.food=food;
        this.Department=Department;
        this.Wild=wild;
    }
    public void savebridtofile(int i){
        try{
                BufferedWriter out = new BufferedWriter(new FileWriter("animal.txt",true));
                out.write("birds");
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("animal.txt", true));
                out.write(birds.get(i).name);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("animal.txt", true));
                out.write(birds.get(i).Nationality);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("animal.txt", true));
                out.write(birds.get(i).National_id);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("animal.txt", true));
                out.write(birds.get(i).sex);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("animal.txt", true));
                out.write(birds.get(i).food);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("animal.txt", true));
                out.write(birds.get(i).Department);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("animal.txt", true));
                out.write(birds.get(i).insurance);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("animal.txt", true));
                out.write(String.valueOf(birds.get(i).Wild));
                out.newLine();
                out.close();

        } catch (IOException e) {
            System.out.println("exception occoured" + e);
        }

    }
    public void removebirdanimal(int id){
        if (id < birds.size()) {
            birds.remove(id);
            save_arraylist_to_file_animal();
        }else{
            System.out.println("id>birds.size");
        }
    }
    public char editbirdanimal(String Id){
        for (int i=0;i<birds.size();i++){
            if(birds.get(i).National_id.equals(Id)){
                return (char) i;
                //ادامه نوشته شود
            }
        }
        return 0;
    }

    public boolean dublicat(String national_id){
        for(int i=0;i<birds.size();i++){
            if(birds.get(i).National_id.equals(national_id)){
                return false;
                }
            }
        return true;
    }
}
