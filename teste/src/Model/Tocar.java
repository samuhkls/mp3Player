
package Model;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;



public class Tocar {
    
    static JFileChooser arquivo = new JFileChooser();
    
    public static void abrir() {
        String caminhoArquivo = "";
        
        int retorno = arquivo.showOpenDialog(null);
        
        if(retorno == JFileChooser.APPROVE_OPTION){
            caminhoArquivo = arquivo.getSelectedFile().getAbsolutePath();
            JOptionPane.showMessageDialog(null, caminhoArquivo); //a
        }
        
        
    }
    
     public static void tocamp3(){

        FileInputStream in;
 try {
  //Inicializa o FileInputStream com o endereço do arquivo para tocar
  in = new FileInputStream("C:\\Users\\Alunos\\Documents\\NetBeansProjects\\teste\\build\\classes\\teste.mp3");

  //Cria uma instancia da classe player passando para ele o InpuStream do arquivo
  Player p = new Player(in);

  //executa o som
  p.play();
 } catch (FileNotFoundException e) {
  e.printStackTrace();
 } catch (JavaLayerException e) {
  e.printStackTrace();
 }


    }
}
