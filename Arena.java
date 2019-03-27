import java.util.Scanner;
public class Arena {
	
	public static void main (String [] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Entrez le type de Pokémon : ");
		 String typePok = sc.nextLine();

		if ( typePok.equals("Feu")) {
			Feu dracofeu = new Feu ("Dracofeu", 1000, 400);
            Vent tortank = new Vent ("Tortank", 1000, 400) ;
            while ( !dracofeu.isKo() && !tortank.isKo()) {
                System.out.println( "Choisissez l'attaque");
                String attackj = sc.nextLine();
            
                if (attackj.equals("canicule")) {
                    dracofeu.canicule(tortank);
                    System.out.println("Tortank a utilisé l'attaque rapace");
                    tortank.rapace(dracofeu);
                    System.out.println("Voulez vous utiliser une super potion?");
                    String potion = sc.nextLine();
                    if(potion.equals("oui")){
                        Inventaire suuperPotion = new Inventaire ("Super Potion");
                        suuperPotion.superPotion(dracofeu);
                    }

                }

                if (attackj.equals("Danse Flamme")) {
                    dracofeu.danseFlamme(tortank);
                    tortank.rapace(dracofeu);
                }
            }
            if (tortank.isKo()){
                System.out.println ("Vous etes maintenant contre Josephine");
                Feu josephine = new Feu ("Josephine", 1000, 400) ;
                while ( !dracofeu.isKo() && !josephine.isKo()) {
                    System.out.println( "Choisissez l'attaque");
                    String attackj = sc.nextLine();
                
                    if (attackj.equals("canicule")) {
                        dracofeu.canicule(josephine);
                        System.out.println("Josephine a utilisé l'attaque rapace");
                        josephine.canicule(dracofeu);
                        System.out.println("Voulez vous utiliser une super potion?");
                        String potion = sc.nextLine();
                        if(potion.equals("oui")){
                            Inventaire suuperPotion = new Inventaire ("Super Potion");
                            suuperPotion.superPotion(dracofeu);
                        }
    
                    }
    
                    if (attackj.equals("Danse Flamme")) {
                        //dracofeu.danseFlamme(josephine);
                        josephine.canicule(dracofeu);
                    }
                }
                //if (josephine.isKo())
            }
	    }
    }

}
