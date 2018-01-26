/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangent.model.employee.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.List;
import tangent.model.employee.enums.Gender;
import tangent.model.employee.enums.Race;

/**
 *
 * @author User1
 */
public class UserProfile {
    @JsonProperty("id") 
    private long id;
    @JsonProperty("user") 
    private User user;
    @JsonProperty("position") 
    private Position position;
    @JsonProperty("employee_next_of_kin") 
    private List<NextOfKin> employeeNextOfKinList;
    @JsonProperty("employee_review") 
    private Review employeeReview;
    @JsonProperty("id_number") 
    private String idNumber;
    @JsonProperty("phone_number") 
    private String phoneNumber;
    @JsonProperty("physical_address") 
    private String physicalAddress;
    @JsonProperty("tax_number") 
    private String taxNumber;
    @JsonProperty("email") 
    private String email;
    @JsonProperty("personal_email") 
    private String personalEmail;
    @JsonProperty("github_user") 
    private String githubUser;    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("birth_date") 
    private Date birthDate;    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("start_date") 
    private Date startDate;    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("end_date") 
    private Date endDate;    
    @JsonProperty("id_document") 
    private byte[] idDocument;
    @JsonProperty("visa_document") 
    private byte[] visaDocument;
    @JsonProperty("is_employed") 
    private boolean isEmployed;
    @JsonProperty("is_foreigner") 
    private boolean isForeigner;
    @JsonProperty("gender") 
    private Gender gender;
    @JsonProperty("race") 
    private Race race;
    @JsonProperty("years_worked") 
    private short yearsWorked;
    @JsonProperty("age") 
    private short age;
    @JsonProperty("next_review") 
    private Date nextReviewDate;
    @JsonProperty("days_to_birthday") 
    private short daysToDirthday;
    @JsonProperty("leave_remaining") 
    private float leaveDaysRemaining;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public List<NextOfKin> getEmployeeNextOfKinList() {
        return employeeNextOfKinList;
    }

    public void setEmployeeNextOfKinList(List<NextOfKin> employeeNextOfKinList) {
        this.employeeNextOfKinList = employeeNextOfKinList;
    }

    public Review getEmployeeReview() {
        return employeeReview;
    }

    public void setEmployeeReview(Review employeeReview) {
        this.employeeReview = employeeReview;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPersonalEmail() {
        return personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public byte[] getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(byte[] idDocument) {
        this.idDocument = idDocument;
    }

    public byte[] getVisaDocument() {
        return visaDocument;
    }

    public void setVisaDocument(byte[] visaDocument) {
        this.visaDocument = visaDocument;
    }

    public boolean isIsEmployed() {
        return isEmployed;
    }

    public void setIsEmployed(boolean isEmployed) {
        this.isEmployed = isEmployed;
    }

    public boolean isIsForeigner() {
        return isForeigner;
    }

    public void setIsForeigner(boolean isForeigner) {
        this.isForeigner = isForeigner;
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

    public Date getNextReviewDate() {
        return nextReviewDate;
    }

    public void setNextReviewDate(Date nextReviewDate) {
        this.nextReviewDate = nextReviewDate;
    }

    public short getDaysToDirthday() {
        return daysToDirthday;
    }

    public void setDaysToDirthday(short daysToDirthday) {
        this.daysToDirthday = daysToDirthday;
    }

    public float getLeaveDaysRemaining() {
        return leaveDaysRemaining;
    }

    public void setLeaveDaysRemaining(float leaveDaysRemaining) {
        this.leaveDaysRemaining = leaveDaysRemaining;
    }
    
    
}
