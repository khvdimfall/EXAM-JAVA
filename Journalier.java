public class Journalier extends Employe  {
    int duree;
    int forfait;

    public Journalier(){


    }
    public Journalier(String nomComplet, int duree,int forfait){
        super(nomComplet);
        this.duree=duree;
        this.forfait=forfait;

    }
    public int getDuree() {
        return duree;
    }
    public void setDuree(int duree) {
        this.duree = duree;
    }
    public int getForfait() {
        return forfait;
    }
    public void setForfait(int forfait) {
        this.forfait = forfait;
    }
    @Override
    
    public affiche(){
        super.affiche();
        System.out.println("duree= " + duree+  " forfait= "  +forfait);


    }
}