class ProgrammeCommplet {
    public static void main(String args[]) {
        Plan2D p=new Plan2D();

	//LE RECTANGLE
	System.out.println("CONSTRUCTION RECTANGLE");
	System.out.println("Entrez son abscisse :");
	int x = Clavier.lireInt();
	System.out.println("Entrez son ordonnée :");
	int y = Clavier.lireInt();
	System.out.println("Entrez sa largeur :");
	int l = Clavier.lireInt();
	System.out.println("Entrez sa hauteur :");
	int h = Clavier.lireInt();
	UnRectangle r = new UnRectangle(x,y,l,h);
	p.ajouteForme(r);
	
	System.out.println("TRANSLATION");
	System.out.println("Entrez le nombre de pixels de translation en largeur :");
	int dx=Clavier.lireInt();
	System.out.println("Entrez le nombre de pixels de translation en hauteur :");
	int dy=Clavier.lireInt();
	p.dupliqueForme(r);
	r.translation(dx,dy);
	p.repaint();
	
	System.out.println("MODIFICATION");
	System.out.println("Entrez le nombre de pixels d'élargissement :");
	int dl=Clavier.lireInt();
	p.dupliqueForme(r);
	r.modifielargeur(dl);
	p.repaint();
	
	System.out.println("Entrez le nombre de pixels de variation de la hauteur :");
	int dh=Clavier.lireInt();
	p.dupliqueForme(r);
	r.modifiehauteur(dh);
	p.repaint();

	System.out.println("ROTATION");
	Clavier.lireString();
	p.dupliqueForme(r);
	r.rotation90();
	p.repaint();

	System.out.println("SYMETRIE");
	Clavier.lireString();
	p.dupliqueForme(r);
	r.symetrique1();
	p.repaint();
	

	//LE TRIANGLE
	System.out.println("CONSTRUCTION TRIANGLE");
	System.out.println("Entrez l'abscisse du premier sommet :");
	x = Clavier.lireInt();
	System.out.println("Entrez l'ordonnée du premier sommet :");
	y = Clavier.lireInt();
	UnPoint a = new UnPoint(x,y);
	System.out.println("Entrez l'abscisse du second sommet :");
	x = Clavier.lireInt();
	System.out.println("Entrez l'ordonnée du second sommet :");
	y = Clavier.lireInt();
	UnPoint b = new UnPoint(x,y);
	System.out.println("Entrez l'abscisse du troisième sommet :");
	x = Clavier.lireInt();
	System.out.println("Entrez l'ordonnée du troisième sommet :");
	y = Clavier.lireInt();
	UnPoint c = new UnPoint(x,y);
	UnTriangle t = new UnTriangle(a,b,c);
	p.ajouteForme(t);

	System.out.println("TRANSLATION");
	System.out.println("Entrez le nombre de pixels de translation en largeur :");
	dx=Clavier.lireInt();
	System.out.println("Entrez le nombre de pixels de translation en hauteur :");
	dy=Clavier.lireInt();
	p.dupliqueForme(t);
	t.translation(dx,dy);
	p.ajouteForme(t);

	System.out.println("CERCLE CIRCONSCRIT");
	Clavier.lireString();
	p.ajouteForme(new UnCercle(t));

	if (t.estRectangle()) {
	    System.out.println("Le triangle est rectangle");
	}  else {
	    System.out.println("Le triangle n'est pas rectangle");
	}

	//LE CERCLE
	System.out.println("CONSTRUCTION CERCLE");
	System.out.println("Entrez l'abscisse du centre :");
	x = Clavier.lireInt();
	System.out.println("Entrez l'ordonnée du centre :");
	y = Clavier.lireInt();
	System.out.println("Entrez son rayon :");
	int rayon = Clavier.lireInt();
	UnCercle cercle = new UnCercle(x,y,rayon);
	p.ajouteForme(cercle);

	System.out.println("TRANSLATION");
	System.out.println("Entrez le nombre de pixels de translation en largeur :");
	dx=Clavier.lireInt();
	System.out.println("Entrez le nombre de pixels de translation en hauteur :");
	dy=Clavier.lireInt();
	p.dupliqueForme(cercle);
	cercle.translation(dx,dy);

	//END
	System.out.println("EXIT?");
	Clavier.lireString();
	System.exit(0);
    }
}
