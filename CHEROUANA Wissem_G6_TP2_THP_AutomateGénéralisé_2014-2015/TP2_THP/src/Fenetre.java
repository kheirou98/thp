import java.awt.Dimension; 
import javax.swing.JFrame;
 
public class Fenetre extends JFrame { /**Fenetre principale du programme **/ 
  private AutomateGeneraliseInterface pan = new AutomateGeneraliseInterface();

    public Fenetre() throws  Exception, Throwable{        
    this.setTitle("D�trmination des param�tres de l'automate");
    this.setSize(450, 270);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.add(pan);
    this.setVisible(true);

  }

  
        
}
