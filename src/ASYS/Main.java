/*  FJMP - Para portfolio de evidencias
 *  Devel_java_gui
 *     GuiMaterialDesignLike       
 *          Main.java             
 */

package ASYS;

import gui.MainASYS;
import gui.ComplexNumbersASYS;
import javax.swing.JFrame;

/**
 *
 * @author xeon
 */
public class Main {
    
    public JFrame mainASYS;
    public JFrame complexNumbersASYS;
    
    public Main() {
        mainASYS = new MainASYS(this);
        complexNumbersASYS = new ComplexNumbersASYS(this);
  
    }
    
    public void run() {
        java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    mainASYS.setVisible(true);
                }
            });
    }
    public static void main(String[] args) {
                new Main().run();
        
    }
}
