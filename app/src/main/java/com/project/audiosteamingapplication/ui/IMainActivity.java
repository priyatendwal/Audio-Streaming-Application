package com.project.audiosteamingapplication.ui;

import android.support.v4.media.MediaMetadataCompat;

import com.project.audiosteamingapplication.MyApplication;
import com.project.audiosteamingapplication.models.Artist;
import com.project.audiosteamingapplication.util.MyPreferenceManager;

public interface IMainActivity {

    void hideProgressBar();

    void showPrgressBar();

    void onCategorySelected(String category);

    void onArtistSelected(String category, Artist artist);

    void setActionBarTitle(String title);

    void playPause();

    MyApplication getMyApplicationInstance();

    void onMediaSelected(String playlistId, MediaMetadataCompat mediaItem, int position);

    MyPreferenceManager getMyPreferenceManager();
}