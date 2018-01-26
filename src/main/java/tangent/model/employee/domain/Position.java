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
public class Position {
    @JsonProperty("id")
    private short id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("level")
    private String level;
    @JsonProperty("sort")
    private short sort;

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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public short getSort() {
        return sort;
    }

    public void setSort(short sort) {
        this.sort = sort;
    }
    
    
}
