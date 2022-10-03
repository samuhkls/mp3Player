
package Model;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class Player {
    
    static JFileChooser arquivo = new JFileChooser();
    
    public static void abrir() {
        String caminhoArquivo = " ";
        
        int retorno = arquivo.showOpenDialog(null);
        
        if(retorno == JFileChooser.APPROVE_OPTION){
            caminhoArquivo = arquivo.getSelectedFile().getAbsolutePath();
            JOptionPane.showMessageDialog(null, caminhoArquivo);
        }
        
        
    }
    
    
}
