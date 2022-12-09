package com.jd.thegamegym;

public class DataModel {
    String ejercicio,peso;
    int series, resps;
    private int images;

    private String title;
    private int description;
    private String value;
    //private int images;

    public DataModel(String title,int description, String value, int images){
        this.title = title;
        this.description = description;
        this.value = value;
        this.images = images;
    }
    public String getTitle(){
        return title;
    }

    public int getDescription(){
        return description;
    }

    public int getImages(){
        return images;
    }

    public String getValue() {
        return value;
    }

//    public DataModel(String ejercicio, String peso, int series, int resps, int images) {
//        this.ejercicio = ejercicio;
//        this.peso = peso;
//        this.series = series;
//        this.resps = resps;
//        this.images = images;
//    }

    public String getEjercicio() {
        return ejercicio;
    }

    public String getPeso() {
        return peso;
    }

    public int getSeries() {
        return series;
    }

    public int getResps() {
        return resps;
    }

//    public int getImages() {
//        return images;
//    }


}
