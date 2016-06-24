package br.edu.hto.ifsp.Lol_Skins.domain;

/**
 * Created by dioge on 31/05/2016.
 */
import com.google.gson.annotations.SerializedName;

public class Campeao{
    private int id;

    private String name;

    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
