
package main;


import static Model.Tocar.abrir;
import static Model.Tocar.tocamp3;
import View.mp3_GUI;

public class Main {

    
    public static void main(String[] args) {
        abrir();
        new mp3_GUI().setVisible(true);
    }
    
}
