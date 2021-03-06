package com.j2memetronome.appstate;

/**
 *
 * @author Deivid Martins
 */
public final class ApplicationState {
    // No enums in Java ME =(
    //-----------------------------------------------------------------
    // APPLICATION STATES
    //-----------------------------------------------------------------
    public static final int SPLASH = 0;
    public static final int MAIN_MENU = SPLASH + 1;
    public static final int START = MAIN_MENU + 1;
    public static final int OPTIONS = START + 1;
    public static final int HELP = OPTIONS + 1;
    public static final int ABOUT = HELP + 1;
    public static final int EXIT = ABOUT + 1;
    public static final int METRONOME_STARTED = EXIT + 1;
    public static final int METRONOME_STOPPED = METRONOME_STARTED + 1;
    public static final int KILL = METRONOME_STOPPED + 1;

    private int state;
    private int lastState;
    
    public ApplicationState() {
        this.state = SPLASH;
    }
    public int getState() {
        return state;
    }

    public void setState(int state) {
        lastState = this.state;
        this.state = state;
    }
    
    public int lastState()
    {
        return lastState;
    }

  
    
}
