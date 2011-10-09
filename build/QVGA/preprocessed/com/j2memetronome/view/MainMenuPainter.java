package com.j2memetronome.view;

import com.j2memetronome.dao.ImageDAO;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/**
 *
 * @author Deivid Martins
 */
public class MainMenuPainter {

    private int fluentY = 0;

    private Image title;
    private Image items;
    private MainMenuConfiguration mainMenuConfiguration;

    public MainMenuPainter(ImageDAO imageDAO, MainMenuConfiguration mainMenuConfiguration) throws IOException {
        title = imageDAO.get("/menu_title.png");
        items = imageDAO.get("/images_multilang/en/menuitems.png");
        this.mainMenuConfiguration = mainMenuConfiguration;
    }

    private void drawTitle(Graphics graphics) {
        graphics.drawImage(title, 0, 0, Graphics.TOP | Graphics.LEFT);
    }

    public void paint(Graphics graphics) 
    {
        drawTitle(graphics);

        for (int i = 0; i < Menu.maxLength(); i++) 
        {
            drawRectangle(graphics, i);
            drawText(graphics, i);
        }

    }

    private void drawText(Graphics graphics, int i) 
    {
        
        fluentY += mainMenuConfiguration.getTitleTextYposition();

        graphics.setClip(mainMenuConfiguration.getLeftAlignment(), fluentY, items.getWidth(), mainMenuConfiguration.getTextHeight() );
        graphics.drawImage(items, mainMenuConfiguration.getLeftAlignment(), fluentY - (mainMenuConfiguration.getDoubleRectangleHeight() + 
                (i * (mainMenuConfiguration.getDiff()))), Graphics.TOP | Graphics.LEFT);
    }

    private void drawRectangle(Graphics graphics, int i) 
    {
        fluentY = mainMenuConfiguration.getStartYposition() + (i * (mainMenuConfiguration.getRectangleHeight().intValue() + 
                mainMenuConfiguration.getSpaceBetweenRectangles()));
        
        graphics.setClip(mainMenuConfiguration.getLeftAlignment(), fluentY, items.getWidth(), mainMenuConfiguration.getRectangleHeight().intValue());

        if (Menu.getIndex() == i) 
        {
           drawChosenRectangle(graphics);
        } 
        else 
        {
            drawNotChosenRectangle(graphics);
        }
    }
    
    private void drawChosenRectangle(Graphics graphics)
    {
         graphics.drawImage(items, mainMenuConfiguration.getLeftAlignment(), fluentY - mainMenuConfiguration.getRectangleHeight().intValue(), Graphics.TOP | Graphics.LEFT);
    }
    private void drawNotChosenRectangle(Graphics graphics)
    {
        graphics.drawImage(items, mainMenuConfiguration.getLeftAlignment(), fluentY, Graphics.TOP | Graphics.LEFT);
    }
}
