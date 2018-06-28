import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Zookeeper extends Person implements showable {
    public static ArrayList<Zookeeper> zookeeper=new ArrayList<Zookeeper>();
    public String Address;
    public String Wage;
    public String department;

    public void savezookeeper(String id, String lastname, String name, String username, String password, String phonenumber, String address, String email, String wage,String department) {
        Zookeeper z = new Zookeeper();
        setId(id);
        this.lastname = lastname;
        this.Name = name;
        this.Username = username;
        this.password = password;
        this.phonenumber = phonenumber;
        this.Address = address;
        this.Wage = wage;
        this.mail = email;
        this.department = department;
    }

    public void savezookeepertofile(int i){
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("usernames.txt",true));
            out.write("zookeeper");
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("usernames.txt", true));
            out.write(zookeeper.get(i).Username);
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("usernames.txt", true));
            out.write(String.valueOf(zookeeper.get(i).password.hashCode()));
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("usernames.txt", true));
            out.write(zookeeper.get(i).mail);
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("usernames.txt", true));
            out.write(zookeeper.get(i).lastname);
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("usernames.txt", true));
            out.write(zookeeper.get(i).Name);
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("usernames.txt", true));
            out.write(zookeeper.get(i).Address);
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("usernames.txt", true));
            out.write(zookeeper.get(i).phonenumber);
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("usernames.txt", true));
            out.write(zookeeper.get(i).getId());
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("usernames.txt", true));
            out.write(zookeeper.get(i).Wage);
            out.newLine();
            out.close();

            out = new BufferedWriter(new FileWriter("usernames.txt", true));
            out.write(zookeeper.get(i).department);
            out.newLine();
            out.close();

        } catch (IOException e) {
            System.out.println("exception occoured" + e);
        }
    }

    public void removezookeeper(String id){
        if (Integer.parseInt(id) < zookeeper.size()) {
            zookeeper.remove(Integer.parseInt(id));
            save_arraylists_to_file();
        }else{
            System.out.println("id>zookeeper.size");
        }
    }

    public boolean dublicat(String username,String email){
        for(int i=0;i<zookeeper.size();i++){
            if(zookeeper.get(i).Username.equals(username) | zookeeper.get(i).mail.equals(email)){
                //user وجود دارد
                    return false;
                }
            }
        return true;
    }
}
