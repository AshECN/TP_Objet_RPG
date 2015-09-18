/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

/**
 *
 * @author Hicham
 */
public class Monstre {

    // Attributs
    private int ptVie;
    private int pourcentageAtt;
    private int pourcentagePar;
    private int degAtt;
    private Point2D pos;

    // Constructeurs
    public Monstre() {
        // Constructeur de monstre générique
        this.ptVie = 200;
        this.pourcentageAtt = 60;
        this.pourcentagePar = 20;
        this.degAtt = 30;
        this.pos = new Point2D(0, 0);
    }

    public Monstre(Monstre monster) {
        // Constructeur de monstre par copie
        this.ptVie = monster.ptVie;
        this.pourcentageAtt = monster.pourcentageAtt;
        this.pourcentagePar = monster.pourcentagePar;
        this.degAtt = monster.degAtt;
        this.pos = monster.pos;
    }

    public Monstre(int pV, int pA, int pP, int dA, Point2D pos) {
        // Constructeur de monstre customisé
        this.ptVie = pV;
        this.pourcentageAtt = pA;
        this.pourcentagePar = pP;
        this.degAtt = dA;
        this.pos = pos;
    }

    // Méthodes
        // Affectation
    public void setPtVie(int pV) {
        this.ptVie = pV;
    }

    public void setPourcentageAtt(int pA) {
        this.pourcentageAtt = pA;
    }

    public void setPourcentagePar(int pP) {
        this.pourcentagePar = pP;
    }

    public void setDegAtt(int dA) {
        this.degAtt = dA;
    }

    public void setPos(Point2D pos) {
        this.pos = pos;
    }

        // Lecture
    public int getPtVie() {
        return this.ptVie;
    }

    public int getPourcentageAtt() {
        return this.pourcentageAtt;
    }

    public int getPourcentagePar() {
        return this.pourcentagePar;
    }

    public int getDegAtt() {
        return this.degAtt;
    }

    public Point2D getPos() {
        return this.pos;
    }

        // Autres
    // add methode deplace
    public void affiche() {
        System.out.println("Les coordonnées du monstre sont : [" + this.pos.x + ";" + this.pos.y + "]");
        System.out.println("Il a " + this.ptVie + " PV, " + this.pourcentageAtt + " PA, " + this.pourcentagePar + " PM, " + this.degAtt + "dA");
    }
}
