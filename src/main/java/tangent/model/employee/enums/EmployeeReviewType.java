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
public enum EmployeeReviewType {
    P("Performance Increase"),
    S("Starting Salary"),
    A("Annual Increase"),
    E("Expectation Review");

    private String reviewType;

    EmployeeReviewType(String type) {
        this.reviewType = type;
    }

    public String genderCode() {
        return reviewType;
    }
}
