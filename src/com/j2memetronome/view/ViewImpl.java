package com.j2memetronome.view;

import com.j2memetronome.model.Metronome;
import com.j2memetronome.appstate.ApplicationState;
import com.j2memetronome.dao.FontDAO;
import com.j2memetronome.dao.ImageDAO;
import com.j2memetronome.dao.TextDAO;
import com.j2memetronome.dao.mapper.FontMapper;
import com.j2memetronome.dao.mapper.ImageMapper;
import com.j2memetronome.dao.mapper.TextCommonMapper;
import com.j2memetronome.dao.mapper.TextMapper;
import com.j2memetronome.device.DeviceSpecification;

import java.io.IOException;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import mwt.Component;
import mwt.Font;

/**
 *
 * @author dmartins
 */
public class ViewImpl implements View{


    private Menu menu;
    private DeviceSpecification deviceSpecification;
    private ScrollablePage scrollablePage;
    private MainMenuPainter mainMenuPainter;
    private MetronomePainter metronomePainter;
 
    public ViewImpl(DeviceSpecification deviceSpecification)
    {
        this.deviceSpecification = deviceSpecification;
        this.scrollablePage = new ScrollablePage(deviceSpecification);
        this.metronomePainter = new MetronomePainter();
        this.menu = new Menu();

    }

    public int width() {
        return deviceSpecification.getWidth();
    }

    public int height() {
        return deviceSpecification.getHeight();
    }

    public int maxLines() {
        return deviceSpecification.maxLines();
    }

    public int supportedSounds() {
        return deviceSpecification.supportedSounds();
    }

    public void draw(Graphics graphics, FontDAO fontDAO, ImageDAO imageDAO, TextDAO textDAO, ApplicationState applicationState, Metronome metronome) throws Exception {
        graphics.setColor(0x00000000);
        graphics.fillRect(0, 0,width(), height());
        switch (applicationState.getState()) {
            case ApplicationState.SPLASH:
                drawSplash(graphics, fontDAO, imageDAO, textDAO);
                break;
            case ApplicationState.MAIN_MENU:
                drawMainMenu(graphics, fontDAO, imageDAO, textDAO);
                break;
            case ApplicationState.OPTIONS:
                drawOptions(graphics, fontDAO, imageDAO, textDAO, metronome);
                break;
            case ApplicationState.HELP:
                drawHelp(graphics, fontDAO, imageDAO, textDAO);
                break;
            case ApplicationState.ABOUT:
                drawAbout(graphics, fontDAO, imageDAO, textDAO);
                break;
            case ApplicationState.EXIT:
                drawExit(graphics, fontDAO, imageDAO, textDAO);
                break;

            case ApplicationState.METRONOME_STARTED:
                drawMetronomeStarted(graphics, fontDAO, imageDAO, textDAO, metronome);
                break;
            case ApplicationState.METRONOME_STOPPED:
                drawMetronomeCore(graphics, fontDAO, imageDAO, textDAO, metronome);
                break;
 

        }





    }
    
    private void drawBackground(Graphics g, ImageDAO imageDAO, String backgroundImagePath) throws IOException
    {
        g.drawImage(imageDAO.get(backgroundImagePath), 0, 0, Graphics.TOP | Graphics.LEFT);
    }

    
    private void drawSplash(Graphics graphics, FontDAO fontDAO, ImageDAO imageDAO, TextDAO textDAO) throws IOException {
        drawBackground(graphics, imageDAO, ImageMapper.SPLASH);

    }

    private void drawMainMenu(Graphics graphics, FontDAO fontDAO, ImageDAO imageDAO, TextDAO textDAO) throws IOException 
    {       
        drawBackground(graphics, imageDAO, ImageMapper.BACKGROUND);
        SoftKey.BOTH.paint(graphics, imageDAO, this);

        if(mainMenuPainter == null)
            mainMenuPainter = new MainMenuPainter(imageDAO, deviceSpecification.getMainMenuConfiguration());
 
        mainMenuPainter.paint(graphics, menu);
        

    }

    private void drawOptions(Graphics g, FontDAO fontDAO, ImageDAO imageDAO, TextDAO textDAO, Metronome metronome) throws IOException 
    {
        drawBackground(g, imageDAO, ImageMapper.BACKGROUND);
        
        Image arrowLeft = imageDAO.get(ImageMapper.ARROW_LEFT);
        Image arrowRight = imageDAO.get(ImageMapper.ARROW_RIGHT); 
        Image optionsBar = imageDAO.get(ImageMapper.OPTIONS_BAR);
        Font contour = fontDAO.get(FontMapper.CONTOUR);
        Font arial = fontDAO.get(FontMapper.ARIAL);
        
        String text[] = textDAO.get(TextMapper.COMMON);
   
              
        contour.write(g, text[TextCommonMapper.OPTIONS], 5, 0, deviceSpecification.getWidth(), contour.getHeight(), Component.ALIGN_TOP_LEFT);

        g.drawImage(arrowLeft, 5, deviceSpecification.getHeight() / 2 - 10, Graphics.TOP | Graphics.LEFT);
        g.drawImage(arrowRight, deviceSpecification.getWidth() - 5 - arrowRight.getWidth(), deviceSpecification.getHeight() / 2 - 10, Graphics.TOP | Graphics.LEFT);
        g.drawImage(optionsBar, 0, deviceSpecification.getHeight() / 2 - 20, Graphics.TOP | Graphics.LEFT);

        arial.write(g, text[TextCommonMapper.KITS], 0, deviceSpecification.getHeight() / 2 - 10,
                deviceSpecification.getWidth(), arial.getHeight(), Component.ALIGN_TOP_CENTER);

        arial.write(g, text[TextCommonMapper.BASS_DRUM_AND_SNARE + metronome.getKit()], 0, deviceSpecification.getHeight() / 2 + 10,
                deviceSpecification.getWidth(), arial.getHeight(), Component.ALIGN_TOP_CENTER);
        
        SoftKey.LEFT.paint(g, imageDAO, this);
    

    }
   

    private void drawHelp(Graphics g, FontDAO fontDAO, ImageDAO imageDAO, TextDAO textDAO) throws IOException {
        scrollablePage.draw(g, fontDAO, imageDAO, textDAO, TextMapper.HELP, TextCommonMapper.HELP);
        SoftKey.RIGHT.paint(g, imageDAO, this);

    }

    private void drawAbout(Graphics g, FontDAO fontDAO, ImageDAO imageDAO, TextDAO textDAO) throws IOException {
         scrollablePage.draw(g, fontDAO, imageDAO, textDAO, TextMapper.ABOUT, TextCommonMapper.ABOUT); 
         SoftKey.RIGHT.paint(g, imageDAO, this);
    }
 
    


    private void drawExit(Graphics g, FontDAO fontDAO, ImageDAO imageDAO, TextDAO textDAO) throws IOException {
        drawBackground(g, imageDAO, ImageMapper.BACKGROUND);
        
        String textCommon[] = textDAO.get(TextMapper.COMMON);
        Font contour = fontDAO.get(FontMapper.CONTOUR);
        Font arial = fontDAO.get(FontMapper.ARIAL);


        contour.write(g, textCommon[TextCommonMapper.EXIT], 5, 0, deviceSpecification.getWidth(), arial.getHeight(), Component.ALIGN_TOP_LEFT);
        arial.write(g, textCommon[TextCommonMapper.EXIT_TEXT], 0, deviceSpecification.getHeight() / 2, deviceSpecification.getWidth(), 0, Component.ALIGN_TOP_CENTER);
        
        SoftKey.BOTH.paint(g, imageDAO, this);
    }

    private void drawMetronomeStarted(Graphics g, FontDAO fontDAO, ImageDAO imageDAO, TextDAO textDAO, Metronome metronome) throws IOException {
        drawBackground(g, imageDAO, ImageMapper.METRONOME_CANVAS);
        metronomePainter.drawStarted(g, fontDAO, imageDAO, deviceSpecification, metronome);
    
    }

    private void drawMetronomeCore(Graphics g, FontDAO fontDAO, ImageDAO imageDAO, TextDAO textDAO, Metronome metronome) throws IOException {
        drawBackground(g, imageDAO, ImageMapper.METRONOME_CANVAS); 
        metronomePainter.drawCore(g, fontDAO, imageDAO, deviceSpecification, metronome);


    }

    public Menu menu() {
        return menu;
    }
    

}
