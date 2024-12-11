package com.example;

public class Event {
    private int id;
    private String libelle;
    private String dateDebut;
    private String dateFin;
    private String lieu;
    private float CoutTotal;

    private String type;
    private String supervision;

    public Event(int id, String libelle, String dateDebut, String dateFin, String lieu, float CoutTotal, String type, String supervision) {
        this.id = id;
        this.libelle = libelle;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.lieu = lieu;
        this.CoutTotal = CoutTotal;
        this.type = type;
        this.supervision = supervision;
    };

    public String getType() {
        return type;
    }

    public String getSupervision() {
        return supervision;
    }

    public Event(int id, String libelle, String dateDebut, String dateFin, String lieu, float CoutTotal) {
        this.id = id;
        this.libelle = libelle;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.lieu = lieu;
        this.CoutTotal = CoutTotal;
    };

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }

    public String getLieu() {
        return lieu;
    }

    public float getCoutTotal() {
        return CoutTotal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

}
