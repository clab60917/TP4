public class Hunter extends Hero {
    public int arrows;
    private int vie;
    private int xp;

    public Hunter(){
        vie = 100;
        xp = 0;
    }

    public Hunter(int v, int x){
        vie = v;
        xp = x;
    }
    public int getVie(){
        return vie;
    }
    public int getXp(){
        return xp;
    }
    public void setVie(int v){
        vie = v;
    }
    public void setXp(int v){
        xp = v;
    }

//service
    public int attaquer(){
        return 5;
    }

    //on revoie un objet et la description


    @Override
    public String toString() {
        return "Hunter{" +
                "arrows=" + arrows +
                ", vie=" + vie +
                ", xp=" + xp +
                '}';
    }
}
