public class Bombo  {
	
	protected boolean bombo[]; 
	protected int maximo;
	public Bombo(int maximo) {
		bombo = new boolean[maximo];
		for(int i=0; i<maximo; i++)
			bombo[i] = true;
		this.maximo = maximo;	
		
	}
	
	public boolean quedanBolas(){
		for(int i=0; i<maximo; i++)
			if (bombo[i])
				return(true);
		return(false);
	}
	
	public int sacaBola(){
		int n;
		if (quedanBolas() == false){
			System.out.println("El bombo esta vacio");
			return(-1);
		}
		do{
			n = (int) (Math.random()*maximo);
		}while(!bombo[n]);
		bombo[n] = false;
		return(n);
	}
	
	public void meteBola(int bola){
		if(bombo[bola]==true){
			System.out.println("Esta bola ya existe");
		}else{
			bombo[bola] = true;
		}
	}

}