/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Entity
public class Personalinformation {

    private static final long serialVersionUID = 1L;

   

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String name;
    protected int age;
    protected String phone;

    public Personalinformation() {
        this.id = Long.MAX_VALUE;
        this.name = null;
        this.age=0;
        this.phone=null;
    }

    public Personalinformation(Long id, String name, int age, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", phone=" + this.phone + " ]";
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }


    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

   
    public int getAge() {
        return age;
    }

    
    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
