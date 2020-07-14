public class Commande {

    //Taille Reservation :nbre Cellule du Tableau
     final int TAILLE=10;
   //Taille Réélle :nbre element du Tableau
     private int nbreClasse=0;//nbre Classe dans le tableau ,
                              //mais aussi la position d'insertion
     private int nbrePersonne=0;
   //Declaration des Tableaux
   private Classe tabclasse[];
   private Employe [] tabEmploye;

   public Commande(){
       //Creation du Tableau
       tabService=new Service[TAILLE];
       tabEmploye=new Employe[TAILLE];

   }


   public void creerService(Service service){
    if(nbreService<TAILLE){
        //Generer ID de la Classe
        Service.setId(nbreService+1);
        tabService[nbreService]=service;
        nbreService++;
    }else{
        System.out.println("Tableau Rempli");
    }
    
}
   public void listerService(){
       for(int i=0;i<nbreService;i++){
           System.out.println(tabService[i].affiche());
       }
       
   }

   
   public void  ajouterEmploye(Employe pers){
         tabEmploye[nbreEmploye]=pers;
          nbreEmploye++;

   }

   public void listerEmloyeParService(Service service){
       for(int i=0;i<nbreEmploye;i++){
           if(tabEmploye[i] instanceof Etudiant){
               //Convertion d'une Personne en un Etudiant=> downCasting
               //((Etudiant)tabPersonne[i]) possible car Etudiant herite de Personne
                  if(((Employe)tabEmploye[i]).getService().getId()==service.getId()){
                      System.out.println(tabEmploye[i].affiche());
                  }
           }
          
       }
       
   }

   //Uc 



   
}