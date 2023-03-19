
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in) ;
		 
		System.out.println("Introduceti numarul de filme : " );
		int nrfilm = scanner.nextInt();
		scanner.nextLine();  // citeste newline-ul ramas in buffer-ul de intrare

		  
		  Film[] filme = new Film[nrfilm]; //creem un tablou cu n elemente introduse dela tastatura
		
		  
		 //utilizam for pentru a completa cu date toate obiectele de tipFilm din tabloul filme utilizind scaner
		for (int i=0 ; i< filme.length ; i++) {  // 
		
		    
System.out.println("Introduceți datele pentru filmul " + (i+1) + ":");
            
            System.out.print("Denumire: ");
            String denumire = scanner.nextLine();
            
            System.out.print("Durata (în minute): ");
            int durata = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Mărime (în GB): ");
            int marime = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Autor: ");
            String autor = scanner.nextLine();
            
            System.out.print("An lansare: ");
            int anlansare = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Număr actori: ");
            int nractori = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Este serial? (Da/Nu): ");
            boolean esteserial = scanner.nextLine().equalsIgnoreCase("Da");
            
            int nrepisoade = 0;
            String tematica = "";
            int pret = 0;
            double cheltuieli = 0;
                  
            if (esteserial) {                             //se face verificarea daca e serial sau nu , daca da , se mai aduga numarul de episoade in caz contrar doar pretul
                 System.out.print("Număr episoade: ");
                nrepisoade = scanner.nextInt();
                scanner.nextLine();
                
                System.out.print("Tematica: ");
                tematica = scanner.nextLine();
            } else {
                System.out.print("Preț: ");
                pret = scanner.nextInt();
                scanner.nextLine();
            }
            
            System.out.print("Cheltuieli: ");
            cheltuieli = scanner.nextDouble();
            scanner.nextLine();
            
            filme[i] = new Film(denumire, durata, marime, autor, anlansare, nractori, esteserial, nrepisoade, tematica, pret, cheltuieli); //completarea folosind datele introduse
         
            System.out.println();
			
		}
		
		System.out.println();
		System.out.println("Filmele introduse sunt: ");
		System.out.println();
		
		for (int i=0 ; i< filme.length ; i++) { //afisarea se face la toate obiectele pe rand prin apelarea la afisare(); din clasa Film
			filme[i].afisare();
			
		}
		
	
			
		Film filmCuCheltuieliMaxime = Film.gasesteFilmCuCheltuieliMaxime(filme); //am creat un obiect de tip Film ce va stoca rezultatul primit 

		if (filmCuCheltuieliMaxime != null) { // se verifica rezultatul pentru a da raspunsul final
		    System.out.println("Filmul cu cele mai mari cheltuieli este: " + filmCuCheltuieliMaxime.getDenumire());
		} else {
		    System.out.println("Nu exista filme in lista.");
		}
		
		
		System.out.println();
		System.out.println("Filmele intre ani 2000 si 2017 sunt: ");
		System.out.println();
		 Film.filmintreani(filme);

		 System.out.println();
			System.out.println("Filmele indiene cu minim 10 serii  sunt: ");
			System.out.println();
			 Film.filmeindiene(filme);
		
			 System.out.println();
				System.out.println("Filmele create de autorul dorit sunt: ");
				System.out.println();
				 Film.filmeautor(filme);
				 
				 System.out.println();
					System.out.println("Filmele create de autorul dorit sunt: ");
					System.out.println();	
				Film.afiseazaFilmCheltuieliMinimePretMaxim(filme);
		  
	}

	


	

	


}
