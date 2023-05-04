class ProgrammeSimple {
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
	r.modifieLargeur(dl);
	p.repaint();
	
	System.out.println("Entrez le nombre de pixels de variation de la hauteur :");
	int dh=Clavier.lireInt();
	p.dupliqueForme(r);
	r.modifieHauteur(dh);
	p.repaint();

	System.out.println("ROTATION");
	Clavier.lireString();
	p.dupliqueForme(r);
	r.rotation();
	p.repaint();

	System.out.println("SYMETRIE");
	Clavier.lireString();
	p.dupliqueForme(r);
	r.symetrie();
	p.repaint();
	

	//END
	System.out.println("EXIT?");
	Clavier.lireString();
	System.exit(0);
    }
}
