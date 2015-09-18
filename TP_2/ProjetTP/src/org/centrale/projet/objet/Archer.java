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
public class Archer extends Personnage {

    // Attributs supplémentaires
    private int nbFleches;

    // Méthodes
    // Constructeurs
    public Archer() {
        // Constructeur par défaut
        this.ptVie = 120;
        this.ptMana = 80;
        this.pourcentageAtt = 70;
        this.pourcentagePar = 50;
        this.pourcentageMag = 40;
        this.pourcentageResistMag = 40;
        this.degAtt = 40;
        this.degMag = 10;
        this.distAttMax = 5;
        this.nbFleches = 20;
        this.pos = new Point2D(0,0);
    }
    
    public Archer(Archer archer) {
        // Constructeur par défaut
        this.ptVie = archer.ptVie;
        this.ptMana = archer.ptMana;
        this.pourcentageAtt = archer.pourcentageAtt;
        this.pourcentagePar = archer.pourcentagePar;
        this.pourcentageMag = archer.pourcentageMag;
        this.pourcentageResistMag = archer.pourcentageResistMag;
        this.degAtt = archer.degAtt;
        this.degMag = archer.degMag;
        this.distAttMax = archer.distAttMax;
        this.nbFleches = archer.nbFleches;
        this.pos = archer.pos;
    }
    
    public Archer(int pV, int pM, int pA, int pP, int pctM, int rM, int dA, int dM, int distMax, int nbFleches, Point2D pos) {
        // Constructeur de personnage customisé
        this.ptVie = pV;
        this.ptMana = pM;
        this.pourcentageAtt = pA;
        this.pourcentagePar = pP;
        this.pourcentageMag = pctM;
        this.pourcentageResistMag = rM;
        this.degAtt = dA;
        this.degMag = dM;
        this.distAttMax = distMax;
        this.nbFleches = nbFleches;
        this.pos = pos;
    }

}
