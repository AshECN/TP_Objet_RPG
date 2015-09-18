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
public class Paysan extends Personnage {
    
 // Méthodes
    // Constructeurs
        public Paysan() {
            // Constructeur par défaut
            this.ptVie = 80;
            this.ptMana = 50;
            this.pourcentageAtt = 30;
            this.pourcentagePar = 30;
            this.pourcentageMag = 10;
            this.pourcentageResistMag = 20;
            this.degAtt = 20;
            this.degMag = 10;
            this.distAttMax = 3;
            this.pos = new Point2D(0,0);
        }

        public Paysan(Paysan pequenot) {
            // Constructeur par défaut
            this.ptVie = pequenot.ptVie;
            this.ptMana = pequenot.ptMana;
            this.pourcentageAtt = pequenot.pourcentageAtt;
            this.pourcentagePar = pequenot.pourcentagePar;
            this.pourcentageMag = pequenot.pourcentageMag;
            this.pourcentageResistMag = pequenot.pourcentageResistMag;
            this.degAtt = pequenot.degAtt;
            this.degMag = pequenot.degMag;
            this.distAttMax = pequenot.distAttMax;
            this.pos = pequenot.pos;
        }

        public Paysan(int pV, int pM, int pA, int pP, int pctM, int rM, int dA, int dM, int distMax, int nbFleches, Point2D pos) {
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
            this.pos = pos;
        }   
    
}
