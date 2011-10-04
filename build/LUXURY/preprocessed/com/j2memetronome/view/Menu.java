package com.j2memetronome.view;

/**
 *
 * @author Deivid Martins
 */
public class Menu {

    private static int index;
    private static int MAIN_MENU_LENGHT = 4;

    public Menu() {
        index = 0;
    }


    public static int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public static int maxLength()
    {
        return MAIN_MENU_LENGHT;
    }

    public static void nextIndex()
    {
        if(index == MAIN_MENU_LENGHT - 1)
            index = 0;
        else
            index++;
    }

    public static void previousIndex()
    {
        if(index == 0)
            index = MAIN_MENU_LENGHT - 1;
        else
            index--;
    }
    

}