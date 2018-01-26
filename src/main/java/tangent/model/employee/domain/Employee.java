/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangent.model.employee.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import tangent.model.employee.enums.Gender;
import tangent.model.employee.enums.Race;

/**
 *
 * @author User1
 */
public class Employee {
    @JsonProperty("user")
    private User user;
    @JsonProperty("position")
    private Position position;   
    @JsonProperty("phone_number") 
    private String phoneNumber;
    @JsonProperty("email")
    private String email;
    @JsonProperty("github_user")
    private String githubUser;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")  
    @JsonProperty("birth_date")  
    private Date birthDate;
    @JsonProperty("gender")
    private Gender gender;
    @JsonProperty("race")
    private Race race;
    @JsonProperty("years_worked")
    private short yearsWorked;
    @JsonProperty("age")
    private short age;
    @JsonProperty("days_to_birthday")
    private Short daysToBirthday;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGithubUser() {
        return githubUser;
    }

    public void setGithubUser(String githubUser) {
        this.githubUser = githubUser;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public short getYearsWorked() {
        return yearsWorked;
    }

    public void setYearsWorked(short yearsWorked) {
        this.yearsWorked = yearsWorked;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public Short getDaysToBirthday() {
        return daysToBirthday;
    }

    public void setDaysToBirthday(Short daysToBirthday) {
        this.daysToBirthday = daysToBirthday;
    }
    
    
}
