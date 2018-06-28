import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Manager  extends Person implements showable {
    public static ArrayList<Manager> manager=new ArrayList<Manager>();

    public String Address;
    public String wage;

    public void savemanager(String id,String lastname,String name,String username,String password,String phonenumber,String address,String email,String wage) {
        setId(id);
        this.lastname = lastname;
        this.Name = name;
        this.Username = username;
        this.password = password;
        this.phonenumber = phonenumber;
        this.Address = address;
        this.wage = wage;
        this.mail = email;
    }

    public void savemanagertofile(int i){
        try{
            System.out.println(manager.get(1).getId());
            BufferedWriter out = new BufferedWriter(new FileWriter("usernames.txt",true));
            out.write("manager");
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("usernames.txt",true));
            out.write(manager.get(i).Username);
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("usernames.txt",true));
            out.write(String.valueOf(manager.get(i).password.hashCode()));
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("usernames.txt",true));
            out.write(manager.get(i).mail);
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("usernames.txt",true));
            out.write(manager.get(i).lastname);
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("usernames.txt",true));
            out.write(manager.get(i).Name);
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("usernames.txt",true));
            out.write(manager.get(i).Address);
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("usernames.txt",true));
            out.write(manager.get(i).phonenumber);
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("usernames.txt",true));
            out.write(getId());
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("usernames.txt",true));
            out.write(manager.get(i).wage);
            out.newLine();
            out.close();
        } catch (IOException e) {
            System.out.println("exception occoured" + e);
        }
    }

    public void removemanager(String id){
        if (Integer.parseInt(id) < manager.size()) {
            manager.remove(Integer.parseInt(id));
            save_arraylists_to_file();
        }else{
            System.out.println("id>manager.size");
        }
    }

    public boolean dublicat(String username,String email){
        for(int i=0;i<manager.size();i++){
            if(manager.get(i).Username.equals(username) | manager.get(i).mail.equals(email)){
                //user @ email وجود دارد
                    return false;

            }
        }
        return true;
    }
}
