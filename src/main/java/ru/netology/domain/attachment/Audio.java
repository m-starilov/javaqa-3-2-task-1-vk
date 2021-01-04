package ru.netology.domain.attachment;

public class Audio {
    private int id;
    private int ownerId;
    private String artist;
    private String title;
    private int duration;
    private String url;
    private int lyricId;
    private int albumId;
    private int genreId;
    private int date;
    private int noSearch;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getLyricId() {
        return lyricId;
    }

    public void setLyricId(int lyricId) {
        this.lyricId = lyricId;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getNoSearch() {
        return noSearch;
    }

    public void setNoSearch(int noSearch) {
        this.noSearch = noSearch;
    }
}
