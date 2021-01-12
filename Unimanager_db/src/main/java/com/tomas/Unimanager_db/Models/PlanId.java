package com.tomas.Unimanager_db.Models;

import java.io.Serializable;

public class PlanId implements Serializable {
    private static final long
    serialVersionUID = 3103463164387407729L;
    private int unitId; private int courseId;
     public PlanId(int unitId, int courseId) {
        this.unitId = unitId;
        this.courseId = courseId;
    }
    
    @Override
    public boolean equals(Object obj) {
    return obj!=null && obj.getClass() == PlanId.class && ((PlanId)obj).courseId == courseId && ((PlanId)obj).unitId == unitId ;
    
    }

    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

   
}
