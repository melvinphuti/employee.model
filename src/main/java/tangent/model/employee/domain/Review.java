/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tangent.model.employee.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.Date;
import tangent.model.employee.enums.EmployeeReviewType;

/**
 *
 * @author User1
 */
public class Review {
    @JsonProperty("id")
    private short id;    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("date")
    private Date date;    
    @JsonProperty("salary")
    private String salary;
    @JsonProperty("type")
    private EmployeeReviewType type;

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public EmployeeReviewType getType() {
        return type;
    }

    public void setType(EmployeeReviewType type) {
        this.type = type;
    }
    
    
}
