import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String choix;
        int nombreService = 10;
        Service[] tabService;
        tabService = new Service[nombreService];
        int serviceActuelle = 0;
      
        do {

            System.out.println("Menu");
            System.out.println("1-Ajout service (id libelle)");
            System.out.println("2- Lister services");
            System.out.println("3-Ajouter employe");
            System.out.println("4-Lister les journaliers ");
            System.out.println("5-lister les embauche d'un sevice");
            System.out.println("6-Quitter");
            System.out.println("Faites un choix");

            Scanner clavier = new Scanner(System.in);
            choix = clavier.nextLine();

            switch (choix) {
                case "1":
                    System.out.println("Donnner le libele du service");
                    String libelle = clavier.nextLine();
                    Servcice service = new Service(libelle);
                    tabService[classactuelle] = service1;
                    serviceactuelle++;

                    break;
                case "2":
                System.out.println("Entrer les informations de l'etudiant");
                System.out.println("Entrer le nom complet de l'etudiant");
                String fullname=clavier.nextLine();
                System.out.println("Entrer l'anneé de l'etudiant");
                int annee=clavier.nextInt();
                System.out.println("Entrer le tuteur de l'etudiant");
                String tuteur=clavier.nextLine();
                Etudiant etudiant1=new Etudiant(fullname, tuteur, annee);
                System.out.println("saisir la classe de l'etudiant");
                String classe=clavier.nextLine();
                
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    for (Classe cl : tabclasse) {
                        if (cl != null) {

                            cl.affiche();

                        }

                    }

                    break;
                case "7":
                    break;

            }

        } while (choix != "7");


    }
}
      
