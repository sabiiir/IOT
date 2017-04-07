package com.example.sadaurin.iot;

/**
 * Created by sadaurin on 31/03/2017.
 */

public class ListItem {

    private String name;
    private int imageId;
   // private int age;
//    public ListItem(String name, int age, int imageId) {


    public ListItem(String name,  int imageId) {
        this.name = name;
        this.imageId = imageId;
      //  this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
/*
    public int getAge() {return age;
    }*/
/*
    public void setAge(int age) {
        this.age = age;
    }
*/
    @Override
    public String toString() {
        return this.name + " : ";
    }
}
