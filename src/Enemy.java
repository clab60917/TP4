public abstract class Enemy {
}
    private int vie;
    private int xp;

    public Enemy(){
        vie = 100;
        xp = 0;
    }

    public Enemy(int v, int x){
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
        return Math.random() * ( 15 - 1 );
    }

    //on revoie un objet et la description


    @Override
    public String toString() {
        return "Enemy{" +

                ", vie=" + vie +
                ", xp=" + xp +
                '}';
    }
}

