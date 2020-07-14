import java.util.UUID;
public class Service implements Iservice {
    UUID id;
    String libelle;

    public Service(){

    }
    public Service(UUID id, String libelle){
        this.id = UUID.randomUUID();
        this.libelle=libelle;
    }

    public UUID getId() {
        return id;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public void affiche(){
        System.out.print("Les informations du service sont= "+id+" le libelle est= "+libelle);


    }

    public UUID compare(UUID id){

    }
    public String libelle( String libelle){
        
    }
    
    
}