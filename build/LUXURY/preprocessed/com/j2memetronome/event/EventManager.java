/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.j2memetronome.event;

import com.j2memetronome.appstate.ApplicationState;
import com.j2memetronome.container.ContainerImpl;
import com.j2memetronome.resource.ResourceLoader;
import com.j2memetronome.view.View;

/**
 *
 * @author Deivid Martins
 */
public class EventManager
{
    private EventProcessor eventProcessor;
    public EventManager()
    {
        eventProcessor = new ChooseLanguageEventProcessor();

    }
    public void processEvents(int eventCode , ContainerImpl containerImpl, ApplicationState applicationState, View view, ResourceLoader resourceLoader) {

     switch (applicationState.getState()) {

            case ApplicationState.CHOOSE_LANG:
                eventProcessor.processEvent(eventCode, applicationState, resourceLoader);
                
                break;
           /* case ApplicationState.MAIN_MENU:
                processMainMenu(keyCode);
                break;
            case ApplicationState.HELP:
            case ApplicationState.ABOUT:
                switch (keyCode) {
                    case GenericDevice.RSK:
                    case GenericDevice.CLEAR:
                        applicationState.setState(ApplicationState.MAIN_MENU);
                        firstLineScroll = 0;
                        break;
                    case GenericDevice.UP:
                        if (firstLineScroll > 0) {
                            firstLineScroll--;
                        }
                        break;
                    case GenericDevice.DOWN:

                        if (firstLineScroll < resourceLoader.getTextHelp().length - view.maxLines() && applicationState.getState() == ApplicationState.HELP) {
                            firstLineScroll++;
                        } else if (firstLineScroll < resourceLoader.getTextAbout().length - view.maxLines() && applicationState.getState == ApplicationState.ABOUT) {
                            firstLineScroll++;
                        }

                        break;


                }
                break;
            case ApplicationState.OPTIONS:
            case ApplicationState.METRONOME_OPTIONS:
                switch (keyCode) {
                    case GenericDevice.LSK:
                    case GenericDevice.CLEAR:

                        if (applicationState == ApplicationState.OPTIONS) {
                            applicationState = ApplicationState.MAIN_MENU;
                            //resetAnimation();
                        } else {
                            applicationState = ApplicationState.METRONOME_STOPPED;
                        }
                        break;
                    case UP:

                    case GenericDevice.RIGHT:
                    case Canvas.KEY_NUM6:


                        if (optionsSelectedSoundComponents + 1 < view.supportedSounds()) {
                            optionsSelectedSoundComponents++;

                        } else if (optionsSelectedSoundComponents + 1 == view.supportedSounds()) {
                            optionsSelectedSoundComponents = 0;
                        }
                        metronome.setKit(optionsSelectedSoundComponents);
                        break;


                    case GenericDevice.LEFT:
                    case Canvas.KEY_NUM4:

                        if (optionsSelectedSoundComponents > 0) {
                            optionsSelectedSoundComponents--;
                        } else if (optionsSelectedSoundComponents - 1 < 0) {
                            optionsSelectedSoundComponents = view.supportedSounds() - 1;
                        }
                        break;



                }
                break;
            case ApplicationState.EXIT:
                switch (keyCode) {
                    case GenericDevice.RSK:
                    case GenericDevice.CLEAR:
                        applicationState = ApplicationState.MAIN_MENU;
                        //resetAnimation();
                        break;
                    case Canvas.KEY_NUM5:
                    case GenericDevice.FIRE:
                    case GenericDevice.LSK:
                        midlet.kill();
                        break;

                }
                break;

            case ApplicationState.METRONOME_STARTED:
            case ApplicationState.METRONOME_STOPPED:

                switch (keyCode) {

                    case GenericDevice.RIGHT:
                        applicationState = ApplicationState.METRONOME_STOPPED;

                        metronome.increaseBeatsPerMinute();

                        break;
                    case GenericDevice.LEFT:
                        applicationState = ApplicationState.METRONOME_STOPPED;
                        metronome.decreaseBeatsPerMinute();
                        break;
                    case GenericDevice.UP:
                        metronome.setNumerator(metronome.getNumerator() + 1);
                        break;
                    case GenericDevice.DOWN:
                        metronome.setNumerator(metronome.getNumerator() == 2 ? 2 : metronome.getNumerator() - 1);
                        break;
                    case GenericDevice.FIRE:
                    case Canvas.KEY_NUM5:
                        if (applicationState == ApplicationState.METRONOME_STARTED) {
                            applicationState = ApplicationState.METRONOME_STOPPED;
                        } else if (applicationState == ApplicationState.METRONOME_STOPPED) {
                            applicationState = ApplicationState.METRONOME_STARTED;
                        }
                        break;
                    case Canvas.KEY_NUM2:
                        metronome.setDenominator(metronome.getDenominator().next());
                        break;
                    case Canvas.KEY_NUM8:
                        metronome.setDenominator(metronome.getDenominator().previous());
                        break;
                    case GenericDevice.LSK:
                        applicationState = ApplicationState.METRONOME_OPTIONS;
                        break;
                    case GenericDevice.RSK:
                        applicationState = ApplicationState.MAIN_MENU;
                        Display.getDisplay(midlet).setCurrent(this);
                        applicationState = ApplicationState.MAIN_MENU;
                        break;
                    case Canvas.KEY_POUND:
                        if (optionsSelectedSoundComponents < view.supportedSounds() - 1) {
                            optionsSelectedSoundComponents++;
                        } else {
                            optionsSelectedSoundComponents = 0;
                        }

                        metronome.setKit(optionsSelectedSoundComponents);
                        break;

                }

                */


        }
    }


}
