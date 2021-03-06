package com.j2memetronome.dao;

import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Image;

/**
 *
 * @author Deivid Martins
 */
public class ImageDAOFileSystem implements ImageDAO {

    private Vector images;

    public ImageDAOFileSystem() {
        images = new Vector();
    }

    public Image get(String path) throws IOException 
    {
        int index = add(path);
        return ((ImageResource) images.elementAt(index)).getImage();
    }
    
    private int add(String path) throws IOException
    {
        ImageResource imageResource = new ImageResource(path);

        if (!images.contains(imageResource)) {
            Image image = Image.createImage(path);
            imageResource.setImage(image);
            images.addElement(imageResource);
        }
        
        return images.indexOf(imageResource);
    }
}
