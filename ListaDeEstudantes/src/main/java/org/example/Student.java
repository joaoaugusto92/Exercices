package org.example;

public class Student {
     private double pontuation;
        private String name;
        private String gender;
        private int age;

    public void setPontuation(Double pontuation) {
        this.pontuation = pontuation;
    }

    public Double getPontuation() {
        return pontuation;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public String getNome() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setAge(int idade) {
        this.age = idade;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "\nNome: " + this.getNome() + "\n Gênero: " + this.getGender() + "\n Idade: " + this.getAge() + "\n Pontuação: " + this.getPontuation();
    }
}
