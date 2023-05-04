import javax.swing.*;
import java.util.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.*;


class Dessin extends JPanel  {
    Object figs[];
    int fig_type[];
    int how_many;

    Dessin() {
	figs = new Object[100];
	fig_type = new int[100];
	how_many = 0;
    }
    public void paint(Graphics g) {
	super.paint(g);

	g.setColor(Color.black);
	g.drawLine(0,0,getWidth(),getHeight());

	for(int i=0; i<how_many;i++){
	    switch(fig_type[i]){
	    case 1:
		UnRectangle rectangle = (UnRectangle) figs[i];
		g.setColor(Color.red);
		if(i==how_many-1){
		    g.fillRect(rectangle.coin.abscisse,rectangle.coin.ordonnee-rectangle.hauteur,
			       rectangle.largeur,rectangle.hauteur);
		} else {
		    g.drawRect(rectangle.coin.abscisse,rectangle.coin.ordonnee-rectangle.hauteur,
			       rectangle.largeur,rectangle.hauteur);
		}
		//System.out.println(rectangle);
		break;
	    case 2:
		UnTriangle triangle = (UnTriangle) figs[i];
		int[] xs,ys;
		xs=new int[4];
		ys=new int[4];
		xs[0]=triangle.A.abscisse;
		ys[0]=triangle.A.ordonnee;
		xs[1]=triangle.B.abscisse;
		ys[1]=triangle.B.ordonnee;
		xs[2]=triangle.C.abscisse;
		ys[2]=triangle.C.ordonnee;
		xs[3]=triangle.A.abscisse;
		ys[3]=triangle.A.ordonnee;
		g.setColor(Color.green);
		if(i==how_many-1){
		    g.fillPolygon(xs,ys,3);
		} else {
		    g.drawPolygon(xs,ys,3);
		}
		//System.out.println(triangle);
		break;
	    case 3:
		UnCercle cercle = (UnCercle) figs[i];
		UnPoint p = cercle.retourneCentre();
		int r = cercle.retourneRayon();
		g.setColor(Color.blue);
		g.drawOval(p.abscisse-r,p.ordonnee-r,2*r,2*r);
		//System.out.println(cercle);
		break;
	    default:
	    }
	}
    }
    public void dupliquer(UnRectangle r){
	UnRectangle new_r = new UnRectangle(r);
	figs[how_many] = figs[how_many-1];
	fig_type[how_many] = fig_type[how_many-1];
	figs[how_many-1] = new_r;
	fig_type[how_many-1] = 1;
	how_many++;
    }
    public void ajoute(UnRectangle r){
	figs[how_many] = r;
	fig_type[how_many++] = 1;
    }
    public void dupliquer(UnTriangle t){
	UnTriangle new_t = new UnTriangle(t);
	figs[how_many] = figs[how_many-1];
	fig_type[how_many] = fig_type[how_many-1];
	figs[how_many-1] = new_t;
	fig_type[how_many-1] = 2;
	how_many++;
    }
    public void ajoute(UnTriangle t){
	figs[how_many] = t;
	fig_type[how_many++] = 2;
    }
    public void dupliquer(UnCercle c){
	UnCercle new_c = new UnCercle(c);
	figs[how_many] = figs[how_many-1];
	fig_type[how_many] = fig_type[how_many-1];
	figs[how_many-1] = new_c;
	fig_type[how_many-1] = 3;
	how_many++;
    }
    public void ajoute(UnCercle c){
	figs[how_many] = c;
	fig_type[how_many++] = 3;
    }

}

class Plan2D extends JFrame  {
    Dessin dessin;
    Plan2D() {
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	dessin=new Dessin();
	dessin.setPreferredSize(new Dimension(600,600));
	dessin.setBackground(Color.white);
	this.setContentPane(dessin);
	this.pack();
	this.setVisible(true);
    }
    void ajouteForme(UnRectangle r) {
	dessin.ajoute(r);
	repaint();
    }
    void ajouteForme(UnTriangle t) {
	dessin.ajoute(t);
	repaint();
    }
    void ajouteForme(UnCercle c) {
	dessin.ajoute(c);
	repaint();
    }
    void dupliqueForme(UnRectangle r) {
	dessin.dupliquer(r);
	repaint();
    }
    void dupliqueForme(UnTriangle t) {
	dessin.dupliquer(t);
	repaint();
    }
    void dupliqueForme(UnCercle c) {
	dessin.dupliquer(c);
	repaint();
    }

}

