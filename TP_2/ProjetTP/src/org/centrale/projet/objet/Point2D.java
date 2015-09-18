/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

/**
 *
 * @author Victor
 */
public class Point2D {

    // Attributs
        protected int x;
        protected int y;
    
     // Constructeurs
        public Point2D() {
            x = 0;
            y = 0;        
        }

        public Point2D(int x, int y) {
            this.x = x;
            this.y = y;        
        }

        public Point2D(Point2D point) {
            this.x = point.x;
            this.y = point.y;
        }

        // Méthodes
        public void affiche() {
            System.out.println("Les coordonnées du point sont : [" + this.x + ";" + this.y + "]");
        }

        public void translate(int dx, int dy) {
            this.x = this.x + dx;
            this.y = this.y + dy;
        }

        public void setPosition(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }
}
