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
public class TestPoint2D {
    public static void main(String[] args) {
        System.out.println("Création sans arguments");
        Point2D point_1 = new Point2D();
        point_1.affiche();
        
        System.out.println("Création avec arguments");
        Point2D point_2 = new Point2D(2,8);
        point_2.affiche();
        
        System.out.println("Création à partir du point précédent");
        Point2D point_3 = new Point2D(point_2);
        point_3.affiche();
        
        System.out.println("On translate le point_1");
        point_1.translate(2,4);
        point_1.affiche();
        
        System.out.println("On modifie x du point_2");
        point_2.setX(4);
        point_2.affiche();
        
        System.out.println("On modifie y du point_3");
        point_3.setY(-5);
        point_3.affiche();
        
        System.out.println("On modifie x ET y du point_2");
        point_2.setPosition(10,2);
        point_2.affiche();
        
        System.out.println("L'abscisse du point_1 vaut " + point_1.getX());
        
        System.out.println("L'ordonnée  du point_2 vaut " + point_2.getY());
    }
}
