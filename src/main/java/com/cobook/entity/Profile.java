package com.cobook.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="profile")
public class Profile {

    @Id
    @Column(name="profile_id")
    private Long id;

    @Column(name="picture")
    private String picture;

    @Column(name="education")
    private String education;

    @Column(name="hobbies")
    private String hobbies;

    @Column(name="favorite_sport")
    private String favoriteSport;

    @Column(name="Where_you_from")
    private String whereYouFrom;

    @Column(name="favorite_music")
    private String favoriteMusic;

    @Column(name="favorite_movie")
    private String favoriteMovie;

    @Column(name="intersting_fact")
    private String interstingFact;

    public Profile() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getFavoriteSport() {
        return favoriteSport;
    }

    public void setFavoriteSport(String favoriteSport) {
        this.favoriteSport = favoriteSport;
    }

    public String getWhereYouFrom() {
        return whereYouFrom;
    }

    public void setWhereYouFrom(String whereYouFrom) {
        this.whereYouFrom = whereYouFrom;
    }

    public String getFavoriteMusic() {
        return favoriteMusic;
    }

    public void setFavoriteMusic(String favoriteMusic) {
        this.favoriteMusic = favoriteMusic;
    }

    public String getFavoriteMovie() {
        return favoriteMovie;
    }

    public void setFavoriteMovie(String favoriteMovie) {
        this.favoriteMovie = favoriteMovie;
    }

    public String getInterstingFact() {
        return interstingFact;
    }

    public void setInterstingFact(String interstingFact) {
        this.interstingFact = interstingFact;
    }

    @Override
    public String toString() {
        return "Profile [id=" + id + ", picture=" + picture + ", education=" + education + ", hobbies=" + hobbies
                + ", favoriteSport=" + favoriteSport + ", whereYouFrom=" + whereYouFrom + ", favoriteMusic="
                + favoriteMusic + ", favoriteMovie=" + favoriteMovie + ", interstingFact=" + interstingFact + "]";
    }
    

    
}
