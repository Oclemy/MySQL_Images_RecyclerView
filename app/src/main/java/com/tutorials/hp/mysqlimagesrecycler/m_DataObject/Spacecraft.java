package com.tutorials.hp.mysqlimagesrecycler.m_DataObject;

/**
 * Created by Oclemy on 6/5/2016 for ProgrammingWizards Channel and http://www.camposha.com.
 */
public class Spacecraft {

    int id;
    String name,imageUrl;

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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
