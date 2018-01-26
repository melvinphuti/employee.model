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
public enum Race {
    B("Black African"),
    C("Coloured"),
    I("Indian or Asian"),
    W("White"),
    N("None Dominant");

    private String race;

    Race(String raceCode) {
        this.race = raceCode;
    }

    public String race() {
        return race;
    }
}
