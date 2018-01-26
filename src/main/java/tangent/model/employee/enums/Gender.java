/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangent.model.employee.enums;

/**
 *
 * @author User1
 */
public enum Gender {
    M("Male"),
    F("Female");

    private String gender;

    Gender(String genderCode) {
        this.gender = genderCode;
    }

    public String genderCode() {
        return gender;
    }
}
