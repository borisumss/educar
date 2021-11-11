
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
public class escoger{
    public static void main(String args[]) {
        JFrame parentFrame = new JFrame();
 
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");   
        
        int userSelection = fileChooser.showSaveDialog(parentFrame);
 
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            System.out.println("Save as file: " + fileToSave.getAbsolutePath());
            System.out.println(fileToSave.getName().contains(".pdf"));
            System.out.println((fileToSave.length()/1024)/1024);
        }
        System.exit(0);
    }
}