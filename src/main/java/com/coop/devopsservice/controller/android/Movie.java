/**
 * @ClassName Movie
 * @Author 24
 * @Date 2023/4/26 20:37
 * @Version 1.0.0
 * freedom is the oxygen of the soul.
 **/

package com.coop.devopsservice.controller.android;

public class Movie {

    private String name;
    private String actor;
    private int moviePhotoPath;

    public Movie() {
    }

    public Movie(String name, String actor) {
        this.name = name;
        this.actor = actor;
    }

    public Movie(String name, String actor, int moviePhotoPath) {
        this.name = name;
        this.actor = actor;
        this.moviePhotoPath = moviePhotoPath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public int getMoviePhotoPath() {
        return moviePhotoPath;
    }

    public void setMoviePhotoPath(int moviePhotoPath) {
        this.moviePhotoPath = moviePhotoPath;
    }
}

//    may the force be with you.
//
//    Created by 24 on 2023/4/26.
