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
public class World {
    
    // Attributs
        public Archer robin ;
        public Paysan peon ;
        public Lapin bugs ;
    
    // Constructeurs
        public World() {
            this.robin = new Archer();
            this.peon = new Paysan();
            this.bugs = new Lapin();
        }

        public World(Archer robin, Paysan peon, Lapin bugs) {
            this.robin = robin;
            this.peon = peon;
            this.bugs = bugs;
        }

        public World (World monde){
            this.robin = monde.robin;
            this.peon = monde.peon;
            this.bugs = monde.bugs;
        }
        
    // Méthodes
        public void creeMondeAlea(){
                // On crée le nombre aléatoire et la variable qui stockera la position en attendant qu'on l'indique dans nos personnages et notre monstre
                Random generateurAleatoire = new Random();
                Point2D position = new Point2D();
                
                // On génére aléatoirement x
                int entierAlea = generateurAleatoire.nextInt(100);
                position.setX(entierAlea);
                
                // On génére aléatoire y
                entierAlea = generateurAleatoire.nextInt(100);
                position.setY(entierAlea);
                
                // On indique la position de robin
                this.robin.setPos(position);
                
                // On va trouver 
                
                this.robin.setPos(null);
                
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
}
