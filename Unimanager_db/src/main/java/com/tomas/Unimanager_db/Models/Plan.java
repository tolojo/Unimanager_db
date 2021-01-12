package com.tomas.Unimanager_db.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@IdClass(PlanId.class)

@Entity
@Table(name = "planoestudos")
public class Plan {
@Id @Column(name ="pla_cur_id")
@JsonIgnoreProperties("plans")
@JsonIgnore private int courseId;
@ManyToOne @MapsId("courseId")
@JoinColumn(name ="pla_cur_id")
private Course course;
@Column(name="pla_semestre")
private int semester;
@Id @Column(name ="pla_dis_id")
@JsonIgnore private int unitId;
@ManyToOne @MapsId("unitId")
@JoinColumn(name ="pla_dis_id")
@JsonIgnoreProperties("plans")
private Unit unit;

public Plan(int courseId, Course course, int semester) {
    this.courseId = courseId;
    this.course = course;
    this.semester = semester;
}

public int getCourseId() {
    return courseId;
}

public void setCourseId(int courseId) {
    this.courseId = courseId;
}

public Course getCourse() {
    return course;
}

public void setCourse(Course course) {
    this.course = course;
}

public int getSemester() {
    return semester;
}

public void setSemester(int semester) {
    this.semester = semester;
}

}
