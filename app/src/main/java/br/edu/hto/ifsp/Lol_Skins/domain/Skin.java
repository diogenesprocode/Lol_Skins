package br.edu.hto.ifsp.Lol_Skins.domain;

import android.graphics.Bitmap;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dioge on 31/05/2016.
 */
public class Skin {
    private int id;

    private int skins_id;

    private String skins_name;

    private Bitmap previewskin;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSkins_id() {
        return skins_id;
    }

    public void setSkins_id(int skins_id) {
        this.skins_id = skins_id;
    }

    public String getSkins_name() {
        return skins_name;
    }

    public void setSkins_name(String skins_name) {
        this.skins_name = skins_name;
    }

    public Bitmap getPreviewskin() {
        return previewskin;
    }

    public void setPreviewskin(Bitmap previewskin) {
        this.previewskin = previewskin;
    }
}
