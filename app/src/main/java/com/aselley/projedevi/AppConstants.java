package com.aselley.projedevi;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;

public class AppConstants {
    static BitmapBank bitmapBank;
    static GameEngine gameEngine;
    static  int SCREEN_WİDTH, SCREEN_HEİGHT;
    static  int gravity;
    static int VELOCİTY_WHEN_JUMPED;
    public static void initializion(Context context){
        setScreenSize(context);
    bitmapBank = new BitmapBank(context.getResources());
    gameEngine = new GameEngine();
     AppConstants.gravity = 3;
  AppConstants.VELOCİTY_WHEN_JUMPED = -40;
    }
    public static BitmapBank getBitmapBank(){
        return bitmapBank;

    }
    public static  GameEngine getGameEngine(){
        return gameEngine;
    }
    private static void setScreenSize(Context context){
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        DisplayMetrics metrics = new DisplayMetrics();
        display.getMetrics(metrics);
        int width = metrics.widthPixels;
        int height = metrics.heightPixels;
        AppConstants.SCREEN_WİDTH = width;
        AppConstants.SCREEN_HEİGHT = height;

    }
}