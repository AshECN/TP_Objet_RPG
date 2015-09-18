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
public class Lapin extends Monstre {
    
    // Constructeurs
    public Lapin() {
        // Constructeur de lapin générique
        this.ptVie = 30;
        this.pourcentageAtt = 10;
        this.pourcentagePar = 5;
        this.degAtt = 5;
        this.pos = new Point2D(0, 0);
    }

    public Lapin(Lapin pinou) {
        // Constructeur de lapin par copie
        this.ptVie = pinou.ptVie;
        this.pourcentageAtt = pinou.pourcentageAtt;
        this.pourcentagePar = pinou.pourcentagePar;
        this.degAtt = pinou.degAtt;
        this.pos = pinou.pos;
    }

    public Lapin(int pV, int pA, int pP, int dA, Point2D pos) {
        // Constructeur de lapin customisé
        this.ptVie = pV;
        this.pourcentageAtt = pA;
        this.pourcentagePar = pP;
        this.degAtt = dA;
        this.pos = pos;
    }    
    
}
