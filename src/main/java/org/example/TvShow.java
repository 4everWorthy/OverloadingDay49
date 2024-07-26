package org.example;

public class TvShow {
    private String name;
    private int numberOfEpisodes;
    private String genre;

    // Default constructor
    public TvShow() {
        this.name = "Unknown";
        this.numberOfEpisodes = 0;
        this.genre = "Unknown";
    }

    // Constructor with name and genre
    public TvShow(String name, String genre) {
        this.name = name;
        this.numberOfEpisodes = 0;
        this.genre = genre;
    }

    // Constructor with all attributes
    public TvShow(String name, int numberOfEpisodes, String genre) {
        this.name = name;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "The name of the show is " + name + " with " + numberOfEpisodes + " number of episodes. The genre is " + genre + ".";
    }
}

