package com.scraper;

import java.util.List;

public class Anime {
    private String title;
    private List<String> studios;
    private List<String> genres;
    private String source;
    private String synopsis;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getStudios() {
        return this.studios;
    }

    public void setStudios(List<String> studios) {
        this.studios = studios;
    }

    public List<String> getGenres() {
        return this.genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSynopsis() {
        return this.synopsis;
    }

    public void setSynopsis(String synposis) {
        this.synopsis = synopsis;
    }

    public String toString() {
        return this.title + ", " + this.source;
    }

}