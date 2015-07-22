public class UrnaTrampa extends Urna {
	public sacaBola(){
		
		int bola = r.nextInt(totalBolas()+1);
		if (identificaColor(bola) == true){
			bolasBlancas--;
		}else{
			bolasNegras--;
		}
		int probabilidad = r.nextInt(totalBolas()+1);
		if(probabilidad <= totalBolas()){
			if(identificaColor(0) != identificaColor(totalBolas())){
				bolasNegras --;
				bolasBlancas ++;
			}
		}
			
		return(bola);
	}
	
}
