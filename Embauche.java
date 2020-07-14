public class Embauche extends Employe {
 Localdate datEmbauche;
 int salaire;

 public Embauche(){


 }
 public  Embauche(String nomComplet,Localdate dateEmbauche,int salaire){
    super(nomComplet);
    this.dateEmbauche = dateEmbauche;
    this.salaire = salaire;

}

public int getSalaire() {
    return salaire;
}

public void setSalaire(int salaire) {
    this.salaire =salaire;
}

public int getDateEbauche() {
    return datEmbauche;
}

@Override
public void affiche() {
    super.affiche();
    System.out.println("salaire= " + salaire+ "dateEmbauche= " +dateEmbauche);



 }
    
}