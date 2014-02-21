/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package erp;

import java.awt.Event;
import javax.swing.JTextField;

/**
 *
 * @author henriquevalcanaia
 */
public class DBTextField extends JTextField{

    @Override
    public boolean mouseEnter(Event evt, int x, int y) {
        System.out.println("x: " + x + ", y: " + y);
        return super.mouseEnter(evt, x, y); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    public DBTextField() {
        System.out.println("teste");
    }
    
    

    
    
}
