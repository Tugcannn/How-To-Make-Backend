package com.example.HowToMake.User;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name ="HowToMake")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="User_id")
    private Long id;

    @Column(name="User_name")
    private String name;

    @Column(name="User_surname")
    private String surname;

    @Column(name="User_date")
    private LocalDate date;

    @Column(name="User_country")
    private String country;

    @Column(name="User_food")
    private String food;

    @Column(name="User_calori")
    private Integer calori;

    @Column(name="User_recipe")
    private String recipe;

    @Column(name="User_construction")
    private String construction;

    public User() {
    }

    public User(Long id, String name, String surname, LocalDate date,String country, String food, Integer calori, String recipe, String construction) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.date = date;
        this.country = country;
        this.food = food;
        this.calori = calori;
        this.recipe = recipe;
        this.construction = construction;
    }

    public User(String name, String surname, LocalDate date, String country, String food, Integer calori, String recipe, String construction) {
        this.name = name;
        this.surname = surname;
        this.date = date;
        this.country = country;
        this.food = food;
        this.calori = calori;
        this.recipe = recipe;
        this.construction = construction;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public Integer getCalori() {
        return calori;
    }

    public void setCalori(Integer calori) {
        this.calori = calori;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public String getConstruction() {
        return construction;
    }

    public void setConstruction(String construction) {
        this.construction = construction;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", date=" + date +
                ", country='" + country + '\'' +
                ", food='" + food + '\'' +
                ", calori=" + calori +
                ", recipe='" + recipe + '\'' +
                ", construction='" + construction + '\'' +
                '}';
    }
}


