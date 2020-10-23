package com.codepath.spalli235.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("mCR5zVeu2kX5xlHPYPFkpD9T6BIrUMIjmXRHMsKJ")
                .clientKey("qNfCJDQr0EIB5nPXDkoMY5SP7MW3TcMnOgd64nBm")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
