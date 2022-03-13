public class Mage extends SpellCaster{
}
    private int vie;
    private int xp;

    public Mage(){
        vie = 100;
        xp = 0;
    }

    public Mage(int v, int x){
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
        return 7;
    }

    //on revoie un objet et la description


    @Override
    public String toString() {
        return "Mage{" +

                ", vie=" + vie +
                ", xp=" + xp +
                '}';
    }
}
