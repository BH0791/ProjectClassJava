package Class;

class UnPoint {
	int abscisse, ordonnee;

	UnPoint() {
		abscisse = 0;
		ordonnee = 0;
	}

	UnPoint(UnPoint p) {
		if (p != null) {
			abscisse = p.abscisse;
			ordonnee = p.ordonnee;
		} else {
			abscisse = 0;
			ordonnee = 0;
		}
	}

	UnPoint(int a, int o) {
		abscisse = a;
		ordonnee = o;
	}

	UnPoint(double a, double o) {
		OutilsMath om = new OutilsMath();
		abscisse = om.arrondi(a);
		ordonnee = om.arrondi(o);
	}

	void translation(int dx, int dy) {
		abscisse = abscisse + dx;
		ordonnee = ordonnee + dy;
	}

	void symetrie() {
	}

	int distance(UnPoint p) {
		int a, b;
		OutilsMath math = new OutilsMath();
		a = (p.abscisse - abscisse) * (p.abscisse - abscisse);
		b = (p.ordonnee - ordonnee) * (p.ordonnee - ordonnee);
		return math.racineEntiere(a * b);
	}
}

class UnRectangle {
	UnPoint coin;
	int largeur, hauteur;

	UnRectangle() {
		coin = new UnPoint();
		largeur = 1;
		hauteur = 1;
	}

	UnRectangle(int l, int h) {
		coin = new UnPoint();
		largeur = l;
		hauteur = h;
	}

	UnRectangle(UnPoint p1) {
		if (p1 == null)
			p1 = new UnPoint();
		else
			coin = p1;
		largeur = 1;
		hauteur = 1;
	}

	UnRectangle(UnPoint p1, int x, int y) {
		if (p1 == null)
			p1 = new UnPoint();
		else
			coin = p1;
		largeur = x;
		hauteur = y;
	}

	UnRectangle(int x, int y, int l, int h) {
		coin = new UnPoint(x, y);
		largeur = l;
		hauteur = h;
	}

	UnRectangle(UnRectangle r) {
		if (r == null) {
			coin = new UnPoint();
			largeur = 1;
			hauteur = 1;
		} else {
			coin = r.coin;
			largeur = r.largeur;
			hauteur = r.hauteur;
		}
	}
}
