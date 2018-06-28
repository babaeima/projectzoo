import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Visitor extends Person implements showable {
    public static ArrayList<Visitor> visitor=new ArrayList<Visitor>();
    public String cash;

    public void savevisitor(String id, String lastname, String name, String username, String password, String phonenumber, String address, String email, String cash) {
        Visitor v = new Visitor();
        setId(id);
        this.lastname = lastname;
        this.Name = name;
        this.Username = username;
        this.password = password;
        this.phonenumber = phonenumber;
        this.cash = cash;
        this.mail = email;
    }

    public void addtickat(String hour,String date,String usert,String emailt,String phonenumbert,String departmentt,String zookeepert){
        Tickatgrafic t=new Tickatgrafic(0);
        t.date=date;
        t.hour=hour;
        t.usert=usert;
        t.emailt=emailt;
        t.phonenumbert=phonenumbert;
        t.departmentt=departmentt;
        t.zookeepert=zookeepert;
        Tickatgrafic.tickats.add(t);

    }


    public void savevisitortofile(int i) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("usernames.txt", true));
            out.write("visitor");
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("usernames.txt", true));
            out.write(visitor.get(i).Username);
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("usernames.txt", true));
            out.write(String.valueOf(visitor.get(i).password.hashCode()));
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("usernames.txt", true));
            out.write(visitor.get(i).mail);
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("usernames.txt", true));
            out.write(visitor.get(i).lastname);
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("usernames.txt", true));
            out.write(visitor.get(i).Name);
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("usernames.txt", true));
            out.write(visitor.get(i).phonenumber);
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("usernames.txt", true));
            out.write(visitor.get(i).getId());
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("usernames.txt", true));
            out.write(visitor.get(i).cash);
            out.newLine();
            out.close();

        } catch (IOException e) {
            System.out.println("exception occoured" + e);
        }
    }

        public void removevisitor(String id) {
            if (Integer.parseInt(id) < visitor.size()) {
                visitor.remove(Integer.parseInt(id));
                save_arraylists_to_file();
            }else{
                System.out.println("id>visitor.size");
            }
        }



    public boolean dublicat(String username,String email){
        for(int i=0;i<visitor.size();i++){
            if(visitor.get(i).Username.equals(username) | visitor.get(i).mail.equals(email)){
                //user وجود دارد
                    return false;
                }
            }
        return true;
    }
}
