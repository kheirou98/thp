
public class Etat { /** Etat d'un automate **/ 

	int nbEtat; /** num�ro d'�tat **/
	boolean fin;  /** bool�en permettant de savoir si un �tat est final ou non **/ 
	
	Etat ()
	{
	}
	Etat (int nbEtat, boolean fin)
	{
		this.nbEtat= nbEtat; 
		this.fin= fin; 
	}
}
