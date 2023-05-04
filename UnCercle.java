class UnCercle {
    boolean circonscrit; // true si le cercle est circonscrit à un triangle
    UnTriangle associe;    // triangle (éventuel) auquel le cercle est circonscrit
    UnPoint centre;      // centre (éventuel) du cercle non circonscrit à un triangle
    int rayon;

    UnCercle(int x,int y,int r) {
    	centre=new UnPoint(x,y);
    	rayon=r;
    	circonscrit=false;
    }

    UnCercle(UnPoint c,int r) {
    	centre=new UnPoint(c);
    	rayon=r;
    	circonscrit=false;
    }

    UnCercle(UnTriangle t) {
    	circonscrit=true;
    	associe=t;
    }

    UnCercle(UnCercle c) {
    	if (circonscrit=true){
    		centre=associe.centreCercleCirconscrit();
    		rayon=associe.rayonCercle();
    	}else{
    		centre=c.centre;
    		rayon=c.rayon;
    		circonscrit=false;    		
    	}
    	
    	
    }

    UnPoint retourneCentre() {
    	if (circonscrit==true){
    	    centre=associe.centreCercleCirconscrit();
    	    return centre;
    	    }else{
    	    return centre;    	    	
    	    }
    }
    
     int retourneRayon() {
	if (circonscrit==true){
		rayon=associe.rayonCercle();
		return rayon;
		}else{
		return rayon;
    }
}


    void translation(int dx,int dy) {
    	if (circonscrit==true){
    		associe.translation(dx,dy);
    		}else{
    			centre.translation(dx,dy);
    		}
    }

}
