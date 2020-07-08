package com.test.commentdialog;

import android.app.Application;

public class CommentApplication extends Application {

    public static Application sApplication;

    public static Application getApplication() {
        return sApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sApplication = this;
    }
}
