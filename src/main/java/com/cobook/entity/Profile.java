package com.cobook.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="profile")
public class Profile {

    @Id
    @Column(name="profile_id")
    private Long id;

    @Column(name="birthday")
    private String birthday;

    @Column(name="start_date")
    private String startDate;

    @Column(name="linkedin")
    private String linkedin;


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

    @Column(name="bio")
    private String bio;

    public Profile() {
    }

    @OneToOne
    @JoinColumn(name="employee_id")

    private Employee employee;

    public Long getId() {
        return id;
    }

    

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
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

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }



    @Override
    public String toString() {
        return "Profile [id=" + id + ", birthday=" + birthday + ", startDate=" + startDate + ", linkedin=" + linkedin
                + ", education=" + education + ", hobbies=" + hobbies + ", favoriteSport=" + favoriteSport
                + ", whereYouFrom=" + whereYouFrom + ", favoriteMusic=" + favoriteMusic + ", favoriteMovie="
                + favoriteMovie + ", interstingFact=" + interstingFact + ", bio=" + bio + ", employee=" + employee
                + "]";
    }

   
    
    

    
    

    
}
