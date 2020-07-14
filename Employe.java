import java.util.UUID;
public class Employe implements Iservice {

    protected UUID id;
    protected String nomComplet;

    public Employe(){


    }
    public Employe(UUID id,String nomComplet){
        this.id = UUID.randomUUID();
        this.nomComplet=nomComplet;
    }

    public UUID getId(){
        return id;
    }
    public String getNomComplet() {
        return this.nomComplet;
      }
    
      public void setNomComplet(String nomComplet) {
        this.nomComplet =nomComplet;
      }
    
    public affiche(){
        System.out.print("Les données de l'employe sont id= "+id+" le nomcomplet est= "+nomComplet);
    }
    
}