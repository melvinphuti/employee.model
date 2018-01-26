/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangent.model.employee.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author User1
 */
public class NextOfKin {
    @JsonProperty("id")
    private short id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("relationship")
    private String relationship;
    @JsonProperty("phone_number")
    private String phone_number;
    @JsonProperty("email")
    private String email;
    @JsonProperty("physical_address")
    private String physical_address;
    @JsonProperty("employee")
    private short employeeId;

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhysical_address() {
        return physical_address;
    }

    public void setPhysical_address(String physical_address) {
        this.physical_address = physical_address;
    }

    public short getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(short employeeId) {
        this.employeeId = employeeId;
    }
    
    
}
