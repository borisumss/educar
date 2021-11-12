import javax.swing.JFileChooser;
import javax.swing.JFrame;

package ventanas.;

    public class SeleccionarArchivo{
        
        JFrame parentFrame = new JFrame();
 
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");   
        
        int userSelection = fileChooser.showSaveDialog(parentFrame);
 
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            System.out.println("Save as file: " + fileToSave.getAbsolutePath()); // direccion del archvivo
            System.out.println(fileToSave.getName().contains(".pdf"));// si es pdf
            System.out.println(((float)fileToSave.length()/1024)/1024);// a mb
        }
        System.exit(0);

    }
        