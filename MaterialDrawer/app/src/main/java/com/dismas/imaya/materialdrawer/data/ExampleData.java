package com.dismas.imaya.materialdrawer.data;



/**
 * Created by marc on 12.03.2015.
 */
public class ExampleData {

    private String title;
    private String instruction;
    private Class clazz;

    public ExampleData(String title, Class clazz) {
        this.title = title;
        this.clazz = clazz;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }
}
