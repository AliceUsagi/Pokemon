import java.util.Scanner;
public class Arena {
	
public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
	System.out.println("Entrez le type de Pokémon : Feu ou Eau ");
	String typePok = sc.nextLine();
    Inventaire suuperPotion = new Inventaire ("Super Potion", 3);
// Pokemon Feu 
	if ( typePok.equals("Feu")) {           
		Feu dracofeu = new Feu ("Dracofeu", 1000, 400);
        Vent etouraptor = new Vent ("Etouraptor", 1000, 400) ; 
        System.out.println("Votre pokémon est Dracofeu et votre adreversaire est Etouraptor de type Vent"); 
        while ( !dracofeu.isKo() && !etouraptor.isKo()) {
            System.out.println( "Choisissez l'attaque : (1) pour Canicule / (2) pour Danse flamme");
            String attackj = sc.nextLine();
            
            if (attackj.equals("1")) {
                    
                dracofeu.canicule(etouraptor);
                System.out.println("Etouraptor a utilisé l'attaque rapace");
                etouraptor.rapace(dracofeu);
 
                System.out.println("Voulez vous utiliser une super potion?");
                String potion = sc.nextLine();

                if(potion.equals("oui")){
                            
                    suuperPotion.superPotion(dracofeu);
                    suuperPotion.utilisationS();
                } 
            }

            if (attackj.equals("2")) {

                dracofeu.danseFlamme(etouraptor);

                System.out.println("Etouraptor a utilisé l'attaque rapace");
                etouraptor.rapace(dracofeu);
                    
                System.out.println("Voulez vous utiliser une super potion?");
                String potion = sc.nextLine();

                if(potion.equals("oui")){
                            
                    suuperPotion.superPotion(dracofeu);
                    suuperPotion.utilisationS();
                }
                    
            }
        }

            if (etouraptor.isKo()){
                System.out.println ("Vous etes maintenant contre Luxray de type Tonnerre ");
                Tonnerre luxray = new Tonnerre ("Luxray", 1000, 400);

                while ( !dracofeu.isKo() && !luxray.isKo()) {
                    System.out.println( "Choisissez l'attaque : (1) pour Canicule / (2) pour Danse flamme");
                    
                    String attackj = sc.nextLine();
                
                    if (attackj.equals("1")) {
                        dracofeu.canicule(luxray);
                        System.out.println("Luxray a utilisé l'attaque éclair-fou");
                        luxray.eclairFou(dracofeu);

                        if (dracofeu.isKo()){
                            System.out.println("RIP");
                        } else {
                            System.out.println("Voulez vous utiliser une super potion?");
                            String potion = sc.nextLine();
                            if(potion.equals("oui")){
                                suuperPotion.superPotion(dracofeu);
                                suuperPotion.utilisationS();                
                            }
                        }
                    }
                    if (attackj.equals("2")) {

                        dracofeu.danseFlamme(luxray);
                        System.out.println("Luxray a utilisé l'attaque étincelle");
                        luxray.etincelle(dracofeu);
                        if (dracofeu.isKo()){
                            System.out.println("RIP");
                        } else {
                            System.out.println("Voulez vous utiliser une super potion?");
                            String potion = sc.nextLine();

                            if(potion.equals("oui")){
                                suuperPotion.superPotion(dracofeu);
                                suuperPotion.utilisationS();
                            }
                        }
                    }    
                }
            
            if (luxray.isKo()){
                System.out.println ("Vous etes maintenant contre Tortank de type Eau");
                Eau tortank = new Eau ("Tortank", 1000, 400);

                while ( !dracofeu.isKo() && !tortank.isKo()) {
                    System.out.println( "Choisissez l'attaque : (1) pour Canicule / (2) pour Danse flamme");
                    String attackj = sc.nextLine();
                
                    if (attackj.equals("1")) {
                        dracofeu.canicule(tortank);
                        System.out.println("Tortank a utilisé l'attaque hydro-canon");
                        tortank.hydrocanon(dracofeu);
                        if (dracofeu.isKo()){
                            System.out.println("RIP");
                        } else {
                            System.out.println("Voulez vous utiliser une super potion?");
                            String potion = sc.nextLine();
                            if(potion.equals("oui")){
                                suuperPotion.superPotion(dracofeu);
                                suuperPotion.utilisationS();                
                            }
                        }
                    }
    
                    if (attackj.equals("2")) {

                        dracofeu.danseFlamme(tortank);
                        System.out.println("Tortank a utilisé l'attaque écume");
                        tortank.ecume(dracofeu);
                        if (dracofeu.isKo()){
                            System.out.println("RIP");
                        } else {
                            System.out.println("Voulez vous utiliser une super potion?");
                            String potion = sc.nextLine();

                            if(potion.equals("oui")){
                                suuperPotion.superPotion(dracofeu);
                                suuperPotion.utilisationS();
                            }
                        }
                    }
                
                }
	        }
        }
     }       

// Pokemon Eau 
	if ( typePok.equals("Eau")) {           
		Feu dracofeu = new Feu ("Dracofeu", 1000, 400);
        Eau tortank = new Eau ("Tortank", 1000, 400) ; 
        System.out.println("Votre pokémon est Tortank et votre adversaire est Dracofeu de type Feu"); 
        while ( !dracofeu.isKo() && !tortank.isKo()) {
            System.out.println( "Choisissez l'attaque : (1) pour Ecume / (2) pour Hydro-canon");
            String attackj = sc.nextLine();
            
            if (attackj.equals("1")) {
                    
                tortank.ecume(dracofeu);
                System.out.println("Dracofeu a utilisé l'attaque Canicule");
                dracofeu.canicule(tortank);
 
                System.out.println("Voulez vous utiliser une super potion?");
                String potion = sc.nextLine();

                if(potion.equals("oui")){
                            
                    suuperPotion.superPotion(tortank);
                    suuperPotion.utilisationS();
                } 
            }

            if (attackj.equals("2")) {

                tortank.hydrocanon(dracofeu);

                System.out.println("Dracofeu a utilisé l'attaque Danse Flamme");
                dracofeu.danseFlamme(tortank);
                    
                System.out.println("Voulez vous utiliser une super potion?");
                String potion = sc.nextLine();

                if(potion.equals("oui")){
                            
                    suuperPotion.superPotion(tortank);
                    suuperPotion.utilisationS();
                }
                    
            }
        }

            if (dracofeu.isKo()){
                System.out.println ("Vous etes maintenant contre Etouraptor de type Vent");
                Vent etouraptor = new Vent ("Etouraptor", 1000, 400) ;
                
                while ( !tortank.isKo() && !etouraptor.isKo()) {
                    System.out.println( "Choisissez l'attaque : (1)  pour Ecume / (2) pour Hydro-canon");
                    
                    String attackj = sc.nextLine();
                
                    if (attackj.equals("1")) {
                        tortank.ecume(etouraptor);
                        System.out.println("Etouraptor a utilisé l'attaque Cru-Aile");
                        etouraptor.cru(tortank);

                        if (tortank.isKo()){
                            System.out.println("RIP");
                        } else {
                            System.out.println("Voulez vous utiliser une super potion?");
                            String potion = sc.nextLine();
                            if(potion.equals("oui")){
                                suuperPotion.superPotion(tortank);
                                suuperPotion.utilisationS();                
                            }
                        }
                    }
                    if (attackj.equals("2")) {

                        tortank.hydrocanon(etouraptor);
                        System.out.println("Etouraptor a utilisé l'attaque Rapace");
                        etouraptor.rapace(tortank);
                        if (tortank.isKo()){
                            System.out.println("RIP");
                        } else {
                            System.out.println("Voulez vous utiliser une super potion?");
                            String potion = sc.nextLine();

                            if(potion.equals("oui")){
                                suuperPotion.superPotion(tortank);
                                suuperPotion.utilisationS();
                            }
                        }
                    }    
                }
            
            if (etouraptor.isKo()){
                System.out.println ("Tortank est maintenant contre Luxray de type Tonnerre");
                Tonnerre luxray = new Tonnerre ("Luxray", 1000, 400);

                while ( !luxray.isKo() && !tortank.isKo()) {
                    System.out.println( "Choisissez l'attaque : (1) pour Ecume / (2) pour Hydro-canon");
                    String attackj = sc.nextLine();
                
                    if (attackj.equals("1")) {
                        tortank.ecume(luxray);
                        System.out.println("Luxray a utilisé l'attaque Eclair-Fou");
                        luxray.eclairFou(tortank);
                        if (tortank.isKo()){
                            System.out.println("RIP");
                        } else {
                            System.out.println("Voulez vous utiliser une super potion?");
                            String potion = sc.nextLine();
                            if(potion.equals("oui")){
                                suuperPotion.superPotion(tortank);
                                suuperPotion.utilisationS();                
                            }
                        }
                    }
    
                    if (attackj.equals("2")) {

                        tortank.hydrocanon(luxray);
                        System.out.println("Luxray a utilisé Etincelle");
                        luxray.etincelle(tortank);
                        if (tortank.isKo()){
                            System.out.println("RIP");
                        } else {
                            System.out.println("Voulez vous utiliser une super potion?");
                            String potion = sc.nextLine();

                            if(potion.equals("oui")){
                                suuperPotion.superPotion(tortank);
                                suuperPotion.utilisationS();
                            }
                        }
                    }
                
                }
	        }
        }
     }  
}
}

