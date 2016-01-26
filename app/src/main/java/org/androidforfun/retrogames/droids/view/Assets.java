package org.androidforfun.retrogames.droids.view;

import org.androidforfun.retrogames.framework.Pixmap;
import org.androidforfun.retrogames.framework.Sound;

/*
 This class contains the global references to all the assets used in DroidsWorld game.
 */
public class Assets {
    // the logo asset
    public static Pixmap logo;

    // the screen used in DroidsWorld game
    public static Pixmap gamescreen;
    public static Pixmap startscreen;
    public static Pixmap highscoresscreen;
    public static Pixmap gameoverscreen;

    // the menu used in DroidsWorld game
    public static Pixmap mainmenu;
    public static Pixmap pausemenu;
    public static Pixmap readymenu;

    // these are the colored block to draw the DroidsWorld shape. Each shape is composed by 4 blocks
    // of same colors. Each shape has a different color.
    public static Pixmap redblock;
    public static Pixmap greenblock;
    public static Pixmap blueblock;
    public static Pixmap cyanblock;
    public static Pixmap yellowblock;
    public static Pixmap magentablock;
    public static Pixmap orangeblock;

    // these are the colored block to draw the DroidsWorld next shape.
    public static Pixmap smallredblock;
    public static Pixmap smallgreenblock;
    public static Pixmap smallblueblock;
    public static Pixmap smallcyanblock;
    public static Pixmap smallyellowblock;
    public static Pixmap smallmagentablock;
    public static Pixmap smallorangeblock;

    // buttons and numbers
    public static Pixmap buttons;
    public static Pixmap numbers;

    // sounds
    public static Sound click;
    public static Sound bitten;

    public static Pixmap getBlockByColor(int color) {
        switch(color) {
            case 0xffffff00: return Assets.yellowblock;
            case 0xffb2ffff: return Assets.cyanblock;
            case 0xff0000ff: return Assets.blueblock;
            case 0xffff7f00: return Assets.orangeblock;
            case 0xff00ff00: return Assets.greenblock;
            case 0xffff00ff: return Assets.magentablock;
            case 0xffff0000: return Assets.redblock;
            default: return Assets.redblock;
        }
    }

    public static Pixmap getSmallBlockByColor(int color) {
        switch(color) {
            case 0xffffff00: return Assets.smallyellowblock;
            case 0xffb2ffff: return Assets.smallcyanblock;
            case 0xff0000ff: return Assets.smallblueblock;
            case 0xffff7f00: return Assets.smallorangeblock;
            case 0xff00ff00: return Assets.smallgreenblock;
            case 0xffff00ff: return Assets.smallmagentablock;
            case 0xffff0000: return Assets.smallredblock;
            default: return Assets.smallredblock;
        }
    }
}