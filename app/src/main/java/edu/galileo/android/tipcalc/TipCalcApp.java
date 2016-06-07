package edu.galileo.android.tipcalc;

import android.app.Application;

/**
 * Created by kiryu on 8/06/16.
 */
public class TipCalcApp extends Application {
    private final static String ABOUT_URL = "https://about.me/yichuanlee";

    public String getAboutUrl() {
        return ABOUT_URL;
    }
}
