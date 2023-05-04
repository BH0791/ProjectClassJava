package Class;

class UnTriangle {
	UnPoint A, B, C;

	UnTriangle(UnPoint a, UnPoint b, UnPoint c) {
		A = a;
		B = b;
		C = c;
	}

	UnTriangle(UnTriangle t) {
		A = t.A;
		B = t.B;
		C = t.C;

	}

	void translation(int dx, int dy) {
		A.translation(dx, dy);
		B.translation(dx, dy);
		C.translation(dx, dy);
	}

	boolean estRectangle() {
		int cAB2 = (A.abscisse - B.abscisse) * (A.abscisse - B.abscisse)
				+ (A.abscisse - B.abscisse) * (A.abscisse - B.abscisse);
		int cAC2 = (A.abscisse - C.abscisse) * (A.abscisse - C.abscisse)
				+ (A.abscisse - C.abscisse) * (A.abscisse - C.abscisse);
		int cBC2 = (B.abscisse - C.abscisse) * (B.abscisse - C.abscisse)
				+ (B.abscisse - C.abscisse) * (B.abscisse - C.abscisse);
		return ((cAB2 + cAC2 == cBC2) || (cAC2 + cBC2 == cAB2) || (cBC2 + cAB2 == cAC2));
	}

	UnPoint centreCercleCirconscrit() {
		int xa = A.abscisse;
		int xb = B.abscisse;
		int xc = C.abscisse;
		int ya = A.ordonnee;
		int yb = B.ordonnee;
		int yc = C.ordonnee;
		int num1, num2, denom1, denom2;
		num1 = ((yc - ya) * (yb - ya) * (yb - yc)) + ((xa + xb) * (xb - xa) * (yc - ya))
				- ((xa + xc) * (xc - xa) * (yb - ya));
		num2 = ((xc - xa) * (xb - xa) * (xb - xc)) + ((ya + yb) * (yb - ya) * (xc - xa))
				- ((ya + yc) * (yc - ya) * (xb - xa));
		denom1 = 2 * (((yc - ya) * (xb - xa)) - ((xc - xa) * (yb - ya)));
		denom2 = 2 * (((xc - xa) * (yb - ya)) - ((yc - ya) * (xb - xa)));
		if ((denom1 == 0) || (denom2 == 0)) {
			UnPoint centre = new UnPoint();
			System.out.println("Impossible");
			return centre;
		} else {
			UnPoint centre = new UnPoint((num1 / denom1), (num2 / denom2));
			return centre;
		}
	}

	int rayonCercle() {
		UnPoint p = centreCercleCirconscrit();
		int rayon = p.distance(A);
		return rayon;
	}

}