class OutilsMath {
    int arrondi(double x) {
	return (int)(Math.round(x));
    }
    int racineEntiere(int i) {
	return arrondi(Math.sqrt(i));
    }
}
