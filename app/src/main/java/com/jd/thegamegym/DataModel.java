package com.jd.thegamegym;

public class DataModel {

    private String title;
    private int description;
    private String value,reps;
    private int images;

    public DataModel(){

    }
    public DataModel(String title,int description, String value,String reps, int images){
        this.title = title;
        this.description = description;
        this.reps = reps;
        this.value = value;
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public int getDescription() {
        return description;
    }
    public int setDescription(){
        return description;
    }

    public String getValue() {
        return value;
    }

    public String getReps() {
        return reps;
    }

    public int getImages() {
        return images;
    }
}
