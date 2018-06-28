import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Superadmin extends Person implements showable  {
    public static ArrayList<Superadmin> superadmin=new ArrayList<Superadmin>();
    public String Karbariname;
    public String Password;
    public String Email;

    public void addbirdanimal(String Karbariname, String Password, String Email){
        Superadmin s=new Superadmin();
        s.Karbariname=Karbariname;
        s.Password=Password;
        s.Email=Email;
        /*superadmin.add(s);
        savesuperadmin(superadmin.size()-1);*/

    }

    public void savesuperadmin(int i){
            try{
                    BufferedWriter out = new BufferedWriter(new FileWriter("usernames.txt",true));
                    out.write("superadmin");
                    out.newLine();
                    out.close();

                    out = new BufferedWriter(new FileWriter("username.txt", true));
                    out.write(superadmin.get(i).Karbariname);
                    out.newLine();
                    out.close();

                    out = new BufferedWriter(new FileWriter("username.txt", true));
                    out.write(superadmin.get(i).Password);
                    out.newLine();
                    out.close();

                    out = new BufferedWriter(new FileWriter("username.txt", true));
                    out.write(superadmin.get(i).Email);
                    out.newLine();
                    out.close();

            } catch (IOException e) {
                System.out.println("exception occoured" + e);
            }
    }


}
