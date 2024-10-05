/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventory.management.system;

/**
 *
 * @author Hrishikesh
 */
public class InventoryManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Splash MySplash = new Splash();
        MySplash.setVisible(true);
        try {
            for (int i = 0; i < 100; i++) {
                Thread.sleep(100);
                MySplash.updateProgress(i);
                MySplash.updatePercentText(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        new LoginForm().setVisible(true);
        MySplash.dispose();
    }
    
}
