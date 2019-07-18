package livraria;

import View.MenuView;
import static java.awt.Frame.MAXIMIZED_BOTH;

public class Livraria {

    
    public static void main(String[] args) {
        MenuView tela  = new MenuView();
        tela.setExtendedState(MAXIMIZED_BOTH);
        tela.setVisible(true);
        
       
    }
    
}
