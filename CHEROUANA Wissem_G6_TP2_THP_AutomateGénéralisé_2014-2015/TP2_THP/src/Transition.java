public class Transition { /** Transition d'un automate **/ 
	Etat Si;  /** Etat de d�part **/
	String Xi;  /** Mot **/ 
	Etat Sj;  /** Etat d'arriv�e **/
	Transition()
	{
		
	}
	
	Transition(Etat Si, String Xi, Etat Sj)
	{
		this.Si=Si; 
		this.Xi=Xi; 
		this.Sj=Sj; 
	}
	
}
