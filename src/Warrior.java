public class Warrior extends Hero{
}
    private int vie;
    private int xp;

    public Warrior(){
        vie = 100;
        xp = 0;
    }

    public Warrior(int v, int x){
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
        return 8;
    }

    //on revoie un objet et la description


    @Override
    public String toString() {
        return "Warrior{" +

                ", vie=" + vie +
                ", xp=" + xp +
                '}';
    }
}

