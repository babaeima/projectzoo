public class Aquaticdepartment extends Department {

    private int count=0,count2=0;
    public int getzookeeper(){
        for(int i=0;i<Zookeeper.zookeeper.size();i++){
            if(Zookeeper.zookeeper.get(i).department.equals("Aquatic")) {
                count++;
            }
        }
        return count;
    }
    public int gettickatdepartment(){
        for(int i=0;i<Tickatgrafic.tickats.size();i++){
            if(Tickatgrafic.tickats.get(i).departmentt.equals("Aquatic")) {
                count2++;
            }
        }
        return count2;
    }
}
