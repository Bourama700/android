package com.example.tp_4;

public class Imc_Calcul {
    private  String nom;
    private  String prenom;
    private  float taille;
    private  float poids;
    private  float imc;
    private  String categorie;

    public Imc_Calcul(String nom, String prenom, float imc, String categorie) {
        this.nom = nom;
        this.prenom = prenom;
        this.imc = imc;
        this.categorie = categorie;
    }

    public Imc_Calcul(String nom, String prenom, float taille, float poids) {
        this.nom = nom;
        this.prenom = prenom;
        this.taille = taille;
        this.poids = poids;
    }

    public Imc_Calcul(String nom, String prenom, float taille, float poids, float imc, String categorie) {
        this.nom = nom;
        this.prenom = prenom;
        this.taille = taille;
        this.poids = poids;
        this.imc = imc;
        this.categorie = categorie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public float getTaille() {
        return taille;
    }

    public void setTaille(float taille) {
        this.taille = taille;
    }

    public float getPoids() {
        return poids;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }


    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void CalculIMC ()throws Exception{

        if(taille==0){
            throw new Exception("Division par zero");
        }
        else
        {

            imc=poids/(taille*taille);

            if(imc<15){
                categorie="dénutrition";}

             else if (imc<16){
                     categorie="maigreur";
                }
            else if (imc<18.5){
                categorie="corpulence normale";
            }
            else if (imc<25){
                categorie="surpoids";
            }
            else if (imc<30){
                categorie="obesité modérer";
            }
            else if (imc<35){
                categorie="obesité sévère";
            }
            else if (imc<40){
                categorie="obesité morbide ou massive";
            }
            }

        }
    }

