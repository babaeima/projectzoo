import java.io.*;
import java.util.ArrayList;

public abstract class Person extends Live {
    public static ArrayList<Person> personArrayList=new ArrayList<Person>();

    public String Username;
    public String lastname;
    public String password;
    public String mail;
    public String phonenumber;

    public void read_from_file(){
        if(Manager.manager.size()!=0){
            while(Manager.manager.size()!=0){
                Manager.manager.remove(0);
            }
        }
        if(Superadmin.superadmin.size()!=0){
            while(Superadmin.superadmin.size()!=0){
                Superadmin.superadmin.remove(0);
            }
        }
        if(Visitor.visitor.size()!=0){
            while(Visitor.visitor.size()!=0){
                Visitor.visitor.remove(0);
            }
        }
        if(Zookeeper.zookeeper.size()!=0){
            while(Zookeeper.zookeeper.size()!=0){
                Zookeeper.zookeeper.remove(0);
            }
        }
        if (Massages.massage.size() != 0) {
            while (Massages.massage.size() != 0) {
                Massages.massage.remove(0);
            }
        }
        if (Report.report.size() != 0) {
            while (Report.report.size() != 0) {
                Report.report.remove(0);
            }
        }
        if (Tickatgrafic.tickats.size() != 0) {
            while (Tickatgrafic.tickats.size() != 0) {
                Tickatgrafic.tickats.remove(0);
            }
        }
        if (Aquatic.aquatics.size() != 0) {
            while (Aquatic.aquatics.size() != 0) {
                Aquatic.aquatics.remove(0);
            }
        }
        if (Birds.birds.size() != 0) {
            while (Birds.birds.size() != 0) {
                Birds.birds.remove(0);
            }
        }
        if (Wild.wilds.size() != 0) {
            while (Wild.wilds.size() != 0) {
                Wild.wilds.remove(0);
            }
        }
        try{
            BufferedReader in = new BufferedReader(new FileReader("usernames.txt"));
            String str;int i=0;
            while ((str = in.readLine()) != null) {


                if(str.equals("superadmin")){
                    Superadmin su=new Superadmin();
                    su.Karbariname=in.readLine();
                    su.Password=in.readLine();
                    su.Email=in.readLine();
                    Superadmin.superadmin.add(su);
                }

                if(str.equals("manager")){
                    Manager ma=new Manager();
                    ma.Username=in.readLine();
                    ma.password=in.readLine();
                    ma.mail=in.readLine();
                    ma.lastname=in.readLine();
                    ma.Name=in.readLine();
                    ma.Address=in.readLine();
                    ma.phonenumber=in.readLine();
                    ma.setId(in.readLine());
                    ma.wage=in.readLine();
                    Manager.manager.add(ma);
                }

                if(str.equals("zookeeper")){
                    Zookeeper zo=new Zookeeper();
                    zo.Username=in.readLine();
                    zo.password=in.readLine();
                    zo.mail=in.readLine();
                    zo.lastname=in.readLine();
                    zo.Name=in.readLine();
                    zo.Address=in.readLine();
                    zo.phonenumber=in.readLine();
                    zo.setId(in.readLine());
                    zo.Wage=in.readLine();
                    zo.department=in.readLine();
                    Zookeeper.zookeeper.add(zo);
                }

                if(str.equals("visitor")){
                    Visitor vi=new Visitor();
                    vi.Username=in.readLine();
                    vi.password=in.readLine();
                    vi.mail=in.readLine();
                    vi.lastname=in.readLine();
                    vi.Name=in.readLine();
                    vi.phonenumber=in.readLine();
                    vi.setId(in.readLine());
                    vi.cash=in.readLine();
                    Visitor.visitor.add(vi);
                }
            }

        }catch (IOException e) {
        }
        try {
            BufferedReader in = new BufferedReader(new FileReader("massage.txt"));
            String str;
            int i = 0;
            while ((str = in.readLine()) != null) {
                if (str.equals("massage")) {
                    Massages m=new Massages();
                    m.name_lastname = in.readLine();
                    m.emailm = in.readLine();
                    m.user = in.readLine();
                    m.messagetext=in.readLine();
                    Massages.massage.add(m);
                }
            }
        } catch (IOException e) {
            System.out.println("exception occoured" + e);
        }
        try {
            BufferedReader in = new BufferedReader(new FileReader("report.txt"));
            String str;
            int i = 0;
            while ((str = in.readLine()) != null) {
                if (str.equals("report")) {
                    Report r=new Report();
                    r.level = in.readLine();
                    r.action = in.readLine();
                    r.date = in.readLine();
                    Report.report.add(r);
                }
            }
        } catch (IOException e) {
            System.out.println("exception occoured" + e);
        }
        try {
            BufferedReader in = new BufferedReader(new FileReader("tickat.txt"));
            String str;
            int i = 0;
            while ((str = in.readLine()) != null) {
                if (str.equals("tickat")) {
                    Tickatgrafic t=new Tickatgrafic(0);
                    t.departmentt = in.readLine();
                    t.date = in.readLine();
                    t.hour = in.readLine();
                    t.usert = in.readLine();
                    t.emailt= in.readLine();
                    t.phonenumbert = in.readLine();
                    t.zookeepert = in.readLine();
                    Tickatgrafic.tickats.add(t);
                }
            }
        } catch (IOException e) {
            System.out.println("exception occoured" + e);
        }
        try {
            BufferedReader in = new BufferedReader(new FileReader("animal.txt"));
            String str;
            int ia = 0,ib=0,iw=0;
            while ((str = in.readLine()) != null) {
                if (str.equals("aquatic")) {
                    Aquatic a=new Aquatic();
                    a.id= String.valueOf(1000+ia);
                    a.name=in.readLine();
                    a.Nationality = in.readLine();
                    a.National_id = in.readLine();
                    a.sex = in.readLine();
                    a.food = in.readLine();
                    a.Department= in.readLine();
                    a.insurance = in.readLine();
                    a.camivorous = Boolean.parseBoolean(in.readLine());
                    Aquatic.aquatics.add(a);
                    ia++;
                }
                if (str.equals("birds")) {
                    Birds b=new Birds();
                    b.id= String.valueOf(2000+ib);
                    b.name=in.readLine();
                    b.Nationality = in.readLine();
                    b.National_id = in.readLine();
                    b.sex = in.readLine();
                    b.food = in.readLine();
                    b.Department= in.readLine();
                    b.insurance = in.readLine();
                    Birds.birds.add(b);
                    ib++;
                }
                if (str.equals("wilds")) {
                    Wild w=new Wild();
                    w.id= String.valueOf(3000+iw);
                    w.name=in.readLine();
                    w.Nationality = in.readLine();
                    w.National_id = in.readLine();
                    w.sex = in.readLine();
                    w.food = in.readLine();
                    w.Department= in.readLine();
                    w.insurance = in.readLine();
                    w.home = in.readLine();
                    Wild.wilds.add(w);
                    iw++;
                }

            }
        } catch (IOException e) {
            System.out.println("exception occoured" + e);
        }

    }

    public void save_arraylists_to_file(){
        for(int i=0;i<2;i++){
            try{
                BufferedWriter out = new BufferedWriter(new FileWriter("usernames.txt"));
                out.write("superadmin");
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("usernames.txt",true));
                out.write(String.valueOf(Superadmin.superadmin.get(0).Karbariname));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("usernames.txt",true));
                out.write(String.valueOf(Superadmin.superadmin.get(0).Password));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("usernames.txt",true));
                out.write(String.valueOf(Superadmin.superadmin.get(0).Email));
                out.newLine();
                out.close();

            } catch (IOException e) {
                System.out.println("exception occoured" + e);
            }
        }

        for(int i=0;i<Manager.manager.size();i++){
            try{
                BufferedWriter out = new BufferedWriter(new FileWriter("usernames.txt",true));
                out.write("manager");
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("usernames.txt",true));
                out.write(String.valueOf(Manager.manager.get(i).Username));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("usernames.txt",true));
                out.write(String.valueOf(Manager.manager.get(i).password));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("usernames.txt",true));
                out.write(String.valueOf(Manager.manager.get(i).mail));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("usernames.txt",true));
                out.write(String.valueOf(Manager.manager.get(i).lastname));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("usernames.txt",true));
                out.write(String.valueOf(Manager.manager.get(i).Name));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("usernames.txt",true));
                out.write(String.valueOf(Manager.manager.get(i).Address));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("usernames.txt",true));
                out.write(String.valueOf(Manager.manager.get(i).phonenumber));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("usernames.txt",true));
                out.write(String.valueOf(Manager.manager.get(i).getId()));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("usernames.txt",true));
                out.write(String.valueOf(Manager.manager.get(i).wage));
                out.newLine();
                out.close();

            } catch (IOException e) {
                System.out.println("exception occoured" + e);
            }
        }
        for(int i=0;i<Zookeeper.zookeeper.size();i++){
            try{

                BufferedWriter out = new BufferedWriter(new FileWriter("usernames.txt",true));
                out.write("zookeeper");
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("usernames.txt",true));
                out.write(String.valueOf(Zookeeper.zookeeper.get(i).Username));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("usernames.txt",true));
                out.write(String.valueOf(Zookeeper.zookeeper.get(i).password));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("usernames.txt",true));
                out.write(String.valueOf(Zookeeper.zookeeper.get(i).mail));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("usernames.txt",true));
                out.write(String.valueOf(Zookeeper.zookeeper.get(i).lastname));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("usernames.txt",true));
                out.write(String.valueOf(Zookeeper.zookeeper.get(i).Name));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("usernames.txt",true));
                out.write(String.valueOf(Zookeeper.zookeeper.get(i).Address));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("usernames.txt",true));
                out.write(String.valueOf(Zookeeper.zookeeper.get(i).phonenumber));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("usernames.txt",true));
                out.write(String.valueOf(Zookeeper.zookeeper.get(i).getId()));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("usernames.txt",true));
                out.write(String.valueOf(Zookeeper.zookeeper.get(i).Wage));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("usernames.txt", true));
                out.write(Zookeeper.zookeeper.get(i).department);
                out.newLine();
                out.close();

            } catch (IOException e) {
                System.out.println("exception occoured" + e);
            }
        }
        for(int i=0;i<Visitor.visitor.size();i++){
            try{
                BufferedWriter out = new BufferedWriter(new FileWriter("usernames.txt",true));
                out.write("visitor");
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("usernames.txt",true));
                out.write(String.valueOf(Visitor.visitor.get(i).Username));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("usernames.txt",true));
                out.write(String.valueOf(Visitor.visitor.get(i).password));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("usernames.txt",true));
                out.write(String.valueOf(Visitor.visitor.get(i).mail));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("usernames.txt",true));
                out.write(String.valueOf(Visitor.visitor.get(i).lastname));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("usernames.txt",true));
                out.write(String.valueOf(Visitor.visitor.get(i).Name));
                out.newLine();
                out.close();


                out = new BufferedWriter(new FileWriter("usernames.txt",true));
                out.write(String.valueOf(Visitor.visitor.get(i).phonenumber));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("usernames.txt",true));
                out.write(String.valueOf(Visitor.visitor.get(i).getId()));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("usernames.txt",true));
                out.write(String.valueOf(Visitor.visitor.get(i).cash));
                out.newLine();
                out.close();

            } catch (IOException e) {
                System.out.println("exception occoured" + e);
            }

        }
    }

    public void save_arraylist_to_file_massages() {
        try {
          BufferedWriter out = new BufferedWriter(new FileWriter("massage.txt"));
        } catch (IOException e) {
            System.out.println("exception occoured" + e);
        }
        for (int i = 0; i <Massages.massage.size(); i++) {
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter("massage.txt",true));
                out.write("massage");
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("massage.txt", true));
                out.write(Massages.massage.get(i).name_lastname);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("massage.txt", true));
                out.write(String.valueOf(Massages.massage.get(i).emailm));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("massage.txt", true));
                out.write(String.valueOf(Massages.massage.get(i).user));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("massage.txt", true));
                out.write(String.valueOf(Massages.massage.get(i).messagetext));
                out.newLine();
                out.close();

            } catch (IOException e) {
                System.out.println("exception occoured" + e);
            }
        }
    }
    public void save_arraylist_to_file_report() {
        try {

            BufferedWriter out = new BufferedWriter(new FileWriter("report.txt"));

        } catch (IOException e) {System.out.println("exception occoured" + e);}

        for (int i = 0; i <Report.report.size(); i++) {
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter("report.txt",true));
                out.write("report");
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("report.txt", true));
                out.write(String.valueOf(Report.report.get(i).level));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("report.txt", true));
                out.write(String.valueOf(Report.report.get(i).action));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("report.txt", true));
                out.write(String.valueOf(Report.report.get(i).date));
                out.newLine();
                out.close();

            } catch (IOException e) {
                System.out.println("exception occoured" + e);
            }
        }
    }

    public void save_arraylist_to_file_tickat() {
        try {

            BufferedWriter out = new BufferedWriter(new FileWriter("tickat.txt"));

        } catch (IOException e) {System.out.println("exception occoured" + e);}

        for (int i = 0; i <Tickatgrafic.tickats.size(); i++) {
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter("tickat.txt",true));
                out.write("tickat");
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("tickat.txt", true));
                out.write(Tickatgrafic.tickats.get(i).departmentt);
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("tickat.txt", true));
                out.write(String.valueOf(Tickatgrafic.tickats.get(i).date));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("tickat.txt", true));
                out.write(String.valueOf(Tickatgrafic.tickats.get(i).hour));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("tickat.txt", true));
                out.write(String.valueOf(Tickatgrafic.tickats.get(i).usert));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("tickat.txt", true));
                out.write(String.valueOf(Tickatgrafic.tickats.get(i).emailt));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("tickat.txt", true));
                out.write(String.valueOf(Tickatgrafic.tickats.get(i).phonenumbert));
                out.newLine();
                out.close();

                out = new BufferedWriter(new FileWriter("tickat.txt", true));
                out.write(String.valueOf(Tickatgrafic.tickats.get(i).zookeepert));
                out.newLine();
                out.close();

            } catch (IOException e) {
                System.out.println("exception occoured" + e);
            }
        }
    }


    public void setreport(String level,String action){
        Report r=new Report();
        r.setreport(level,action);
        Report.report.add(r);
        save_arraylist_to_file_report();
    }
}
