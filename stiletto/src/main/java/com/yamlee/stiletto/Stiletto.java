package com.yamlee.stiletto;

import android.app.Activity;
import android.app.Fragment;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;

/**
 * Stiletto with public static method
 *
 * @author yamlee
 */
public class Stiletto {

    private Stiletto() {
        throw new AssertionError("No instances.");
    }

    /**
     * Inject method for Activity,call this method will auto inject param which
     * annotated with {@link InjectParam} with Intent extra value
     *
     * @param activity target activity for param injection
     */
    @UiThread
    public static void inject(@NonNull Activity activity) {

    }

    /**
     * Inject method for Fragment,call this method will auto inject param which
     * annotated with {@link InjectParam} with Intent extra value
     *
     * @param fragment target fragment for param injection
     */
    @UiThread
    public static void inject(@NonNull Fragment fragment) {

    }
}
