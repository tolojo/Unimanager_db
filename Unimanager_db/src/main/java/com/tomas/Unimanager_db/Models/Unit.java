package com.tomas.Unimanager_db.Models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity 
@Table(name ="disciplinas")
public class Unit {
@Id @GeneratedValue
(strategy = GenerationType.IDENTITY)
@Column(name="dis_id") private int id;
@Column(name="dis_nome") private String name;
@Column(name="dis_creditos") private int credits;
@OneToMany @JoinColumn(name="pla_dis_id")
@JsonIgnoreProperties("unit")
private List<Plan> plans;
public Unit() {
   
}

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getCredits() {
    return credits;
}

public void setCredits(int credits) {
    this.credits = credits;
}
}
