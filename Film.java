// import java.util.ArrayList;
// import java.util.Comparator;
import java.util.Scanner;

public class Film {

	public String denumire ;
	public  int durata ;
	public int marime ;
	public  String autor ;
	public  int anlansare;
	public  int  nractori;
	public  boolean esteserial ;
	public  int nrepisoade;
	public  String tematica;
	public int pret;
	public  double chieltuieli;
	
	
	//constructorul obiectelor de tip Film
		public Film (String denumire , int durata , int marime , String autor , int anlansare , int nractori , boolean esteserial , int nrepisoade , String tematica , int pret , double chieltuieli) {
			
			this.denumire = denumire ;   
			this.durata=durata ;
			this.marime=marime ;
			this.autor = autor ;
			this.anlansare=anlansare;
			this.nractori= nractori;
			this.esteserial = esteserial ;
			this.nrepisoade = nrepisoade;
			this.tematica=tematica;
			this.pret = pret;
			this.chieltuieli = chieltuieli;
			
			
		}
		
		
		public void setDenumire(String denumire){
			this.denumire = denumire ; 
		}
		
		public String getDenumire (){	
			return denumire;
		}
		
		
		
		public void setDurata(int durata){
			this.durata=durata;
		}
		
		public int getDurata(){
			return durata ;
		}
		
		public void setMarime(int marime){
			this.marime=marime;
		}
		
		public int getmarime(){
			return durata ;
		}
		
		public void setAutor (String autor){
			this.autor=autor;
		}
		
		public String getAutor()
		{
			return autor ;
		}
	
		public int getAnlansare() {
	        return anlansare;
	    }

	    public void setAnlansare(int anlansare) {
	        this.anlansare = anlansare;
	    }

	   
	    public int getNractori() {
	        return nractori;
	    }

	    public void setNractori(int nractori) {
	        this.nractori = nractori;
	    }

	 
	    public boolean isEsteserial() {
	        return esteserial;
	    }

	    public void setEsteserial(boolean esteserial) {
	        this.esteserial = esteserial;
	    }

	    
	    public int getNrepisoade() {
	        return nrepisoade;
	    }

	    public void setNrepisoade(int nrepisoade) {
	        this.nrepisoade = nrepisoade;
	    }

	  
	    public String getTematica() {
	        return tematica;
	    }

	    public void setTematica(String tematica) {
	        this.tematica = tematica;
	    }


	    public int getPret() {
	        return pret;
	    }

	    public void setPret(int pret) {
	        this.pret = pret;
	    }

	
	    public double getCheltuieli() {
	        return chieltuieli;
	    }

	    public void setCheltuieli(int cheltuieli) {
	        this.chieltuieli = cheltuieli;
	    }
	    
	    
	    //afisarea prin uitilarea metodei de tip string
	   
	    public String afisare() {
	        String info = "Denumire: " + denumire + "\n" +
	                      "Durata (minute): " + durata + "\n" +
	                      "Marime (GB): " + marime + "\n" +
	                      "Autor: " + autor + "\n" +
	                      "Anul lansarii: " + anlansare + "\n" +
	                      "Numar actori: " + nractori + "\n" +
	                      "Este serial? " + esteserial + "\n";
	        if (esteserial) {                                          //se verifica daca este sau nu serial
	          info += "Numar de episoade: " + nrepisoade + "\n";
	        }
	        info += "Tematica: " + tematica + "\n" +
	                "Pret: " + pret + "\n" +
	                "Cheltuieli: " + chieltuieli + "\n";
	        return info;
	      }
	    
	    
	    public static Film gasesteFilmCuCheltuieliMaxime(Film[] filme) {
	        Film filmCuCheltuieliMaxime = null;                    //creem un obiect de tip Film ce va salva rezultatul final
	        double cheltuieliMaxime = Double.NEGATIVE_INFINITY;   // areprezenta valoarea negativă infinită a unui număr de tipul double ,
	                                                              //acest lucru se face pentru a asigura că orice valoare reală a cheltuielilor introduse în program, va fi mai mare decât cheltuieliMaxime.
	        for (int i = 0; i < filme.length; i++) {
	            if (filme[i].getCheltuieli() > cheltuieliMaxime) {
	                cheltuieliMaxime = filme[i].getCheltuieli();
	                filmCuCheltuieliMaxime = filme[i];
	            }
	        }
	        return filmCuCheltuieliMaxime; // la final se retuneza obiectul cu datele a filmului cu chielt maxime 
	    }
	    
	    public static void filmintreani(Film[] filme) {
	      int a = 0;  
	        for (int i = 0; i < filme.length; i++) { // se iau toate filmele pe rand
	            if (filme[i].getAnlansare() <= 2017 && filme[i].getAnlansare() >= 2000 ) { //daca filmul anul lansarei este mai mic egal cu 2017 sau mai mare egal cu 2000
	            	  System.out.println("- " + filme[i].getDenumire()); // afisarea denumiri
	            	a++;
	            }
	        }
	       if (a==0) {
	    	   System.out.println("Nu exista filme in lista."); //se conturizeaza daca sunt filme posibile
	       }
	    }
	    
	    public static void filmeindiene(Film[] filme) {
		      int a = 0;  
		        for (int i = 0; i < filme.length; i++) {
		            if (filme[i].getTematica() == "Indiene"  && filme[i].getNrepisoade() >= 10 || filme[i].getNrepisoade() <= 10000) { //daca tematica este 'Indiene' si numaruol de episoade este intre 10 si 10000
		            	  System.out.println("- " + filme[i].getDenumire());
		            	a++;
		            }
		        }
		       if (a==0) {
		    	   System.out.println("Nu exista filme in lista.");
		       }
		    }
	    
	    public static void filmeautor(Film[] filme) {
	    	Scanner scanner = new Scanner (System.in) ;
	    	
		      int a = 0;  
		      String nume ;
		      System.out.println("Autorul dorit: "); // se citeste numele autorului
		       nume = scanner.nextLine();
		      
		        for (int i = 0; i < filme.length; i++) {
		            if (filme[i].getAutor().equals(nume) ) { // se verifica daca autorul filmului coincide cu cel introdus , folosind functia (equals)
		            	  System.out.println("- " + filme[i].getDenumire()); // afisare
		            	a++;
		            }
		        }
		       if (a==0) {
		    	   System.out.println("Nu exista filme in lista.");
		       }
		    }
	    
	    public static void afiseazaFilmCheltuieliMinimePretMaxim(Film[] filme) {
	        Film filmCheltuieliMinime = null; //creem obiecte pentru a stoca rezultatul final
	        Film filmPretMaxim = null;

	        //gaseste filmul cu cheltuieli minime
	        double cheltuieliMinime = Double.MAX_VALUE;
	        
	        for (Film film : filme) {
	            if (film.getCheltuieli() < cheltuieliMinime) {
	                cheltuieliMinime = film.getCheltuieli(); //folosim interschimbarea
	                filmCheltuieliMinime = film;
	            }
	        }

	        // găsește filmul cu cel mai mare preț de vânzare
	        
	        double pretMaxim = Double.NEGATIVE_INFINITY;
	        for (Film film : filme) {
	            if (film.getPret() > pretMaxim) {
	                pretMaxim = film.getPret();
	                filmPretMaxim = film;
	            }
	        }

	        // afișează rezultatele
	        System.out.println("Filmul cu cele mai puține cheltuieli este: " + filmCheltuieliMinime.getDenumire());
	        System.out.println("Filmul cu cel mai mare preț de vânzare este: " + filmPretMaxim.getDenumire());
	    }
	    
	    
	    
	    
	 } 
	    

