public class Employee {

    private String name;
    private int ID;
    private String rank;

    public Employee(){

    }

    public Employee(String name, int ID){
        this.name = name;
        this.ID = ID;
    }

    public Employee(String name, int ID, String rank){
        this.name = name;
        this.ID = ID;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        this.ID = iD;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCEO(){
        if (rank.equalsIgnoreCase("CEO"))
            return true;
        return false;
    }

    public String toString(){
        return "Employee name: " + name + "\nID: " + ID + "\nRank: " + rank ;
    }

    
}
