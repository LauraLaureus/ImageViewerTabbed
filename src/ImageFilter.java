
import java.io.File;

/**
 *
 * @author lala
 */
public class ImageFilter extends javax.swing.filechooser.FileFilter {

    @Override
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }
        String name = f.getName();
        int index = name.indexOf('.');
        if(index == -1)return false;
        String extension = name.substring(index);
        
        return extension.equalsIgnoreCase(".jpg")
                || extension.equalsIgnoreCase(".jpeg")
                || extension.equalsIgnoreCase(".png")
                || extension.equalsIgnoreCase(".tiff")
                || extension.equalsIgnoreCase(".bmp");

    }

    @Override
    public String getDescription() {
        return "Image files (.jpg,.jpeg,.png,.tiff,.bmp)";
    }

}
