package com.example.googleplay.utils;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.lidroid.xutils.BitmapUtils;

/**
 * bitmapUtils.display(container, uri)
 *
 * @author haopi
 */
public class BitmapHelper {

    public static BitmapUtils bitmapUtils;

    static {
        bitmapUtils = new BitmapUtils(UIUtils.getContext());
    }

    public static <T extends View> void display(T container, String uri) {
        bitmapUtils.display(container, uri);
    }

    public static void display(Context context, ImageView container, String uri) {
        Glide.with(context).load(uri).into(container);
    }

    public static void display(ImageView container, String uri) {
        Glide.with(UIUtils.getContext()).load(uri).into(container);
    }

}
