package com.devopsbuddy.web.domain.frontend;

import java.io.Serializable;

/**
 * Created by Deni86 on 12.11.2016..
 */
public class FeedbackPojo implements Serializable {

    //Ovo takodje znaci da necemo snimati na disk niti koristiti tajne sesije...
    private static final long serialVersionUID = 1L;//Da izbjegnemo za svaki slucaj ClassCastException kada pravimo promjene u klasi.

    private String email;
    private String firstName;
    private String lastName;
    private String feedBack;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFeedBack() {
        return feedBack;
    }

    public void setFeedBack(String feedBack) {
        this.feedBack = feedBack;
    }

    @Override//Koristit cemo toString() da olaksamo bugging i StringBuilder da prikupimo i preikazemo output posto preferimmo konkatenaciju i poboljsamo performance:
    public String toString() {
        final StringBuilder sb = new StringBuilder("FeedbackPojo{");
        sb.append("email='").append(email).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", feedBack='").append(feedBack).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
