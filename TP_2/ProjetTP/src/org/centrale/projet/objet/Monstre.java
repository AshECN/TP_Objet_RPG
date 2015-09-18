/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

import java.util.Random;

/**
 *
 * @author Hicham
 */
public class Monstre {

    // Attributs
        protected int ptVie;
        protected int pourcentageAtt;
        protected int pourcentagePar;
        protected int degAtt;
        protected Point2D pos;

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
    
            public void deplace() {
                // deplace de façon aléatoire un personnage sur la carte
                // génère un nombre aléatoire entre 0 et 3, et selon le tirage, déplace le personnage
                // 1 = N, 2 = E, 3 = S, 0 = O
                Random generateurAleatoire = new Random();
                int entierAlea = generateurAleatoire.nextInt(1);
                if (entierAlea == 1){
                    this.pos.y = this.pos.y + 1;
                }else if (entierAlea == 2){
                    this.pos.x = this.pos.x - 1;
                }else if (entierAlea == 3){
                    this.pos.y = this.pos.y - 1;
                }else{
                    this.pos.x = this.pos.x + 1;
                }

            }

            public void affiche() {
                System.out.println("Les coordonnées du monstre sont : [" + this.pos.x + ";" + this.pos.y + "]");
                System.out.println("Il a " + this.ptVie + " PV, " + this.pourcentageAtt + " PA, " + this.pourcentagePar + " PM, " + this.degAtt + "dA");
            }
}
