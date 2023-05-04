class UnRectangle {
	UnPoint coin ;
	int largeur, hauteur ;
	UnRectangle(){
		coin = new UnPoint() ;
		largeur = 1;
		hauteur = 1;
	}


	UnRectangle(int l, int h){
		coin = new UnPoint () ;
		largeur = l;
		hauteur = h;
	}

	UnRectangle(UnPoint p1)
	{
		if (p1 == null) p1 = new UnPoint();
		else coin = p1;
		largeur = 1;
		hauteur = 1; 
	}

	UnRectangle(UnPoint p1, int x, int y){
		if (p1 == null) p1 = new UnPoint();
		else coin = p1;
		largeur = x;
		hauteur = y; 
	}


	UnRectangle(int x, int y, int l, int h){
		coin = new UnPoint(x, y);
		largeur = l;
		hauteur = h;
	}

	UnRectangle(UnRectangle r){
		if (r == null){
			coin = new UnPoint();
			largeur = 1;
			hauteur = 1;
		}else{
			coin = r.coin;
			largeur = r.largeur;
			hauteur = r.hauteur;			
		}	
	}
	
	 void modifieLargeur(int dl){
         if (dl<1) dl=1;
         else largeur = largeur+dl;
     }
     
     void modifieHauteur(int dl){
         if (dl<1) dl=1;
         else hauteur = hauteur+dl;
     }
     
       void rotation(){
         coin.translation(-hauteur,0);
         int largeur1;
         largeur1 = largeur;
         largeur = hauteur;
         hauteur = largeur1;
              }
     void symetrie(){
         coin.symetrie();
         coin.translation(-hauteur,-largeur);
         int largeur2 = largeur;
         largeur = hauteur;
         hauteur = largeur2;
	}
	
	void translation(int dx, int dy){
            coin.translation(dx,dy);
        }
}