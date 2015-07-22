
public class Tablero {
	
	protected int [][] tablero;
	protected int lado=0;
	
	Tablero(int cuadradosX){
		this.tablero = new int[cuadradosX][cuadradosX];
		this.lado = cuadradosX;
	}
	
	Tablero(){
		this(20);
	}
	
	public void colocaBarco(int x, int y, int horientacion){  // horientacion 1 vertical, 0 horizontal
		if(horientacion == 1){
			if(y==0)
				y++;
			if(y==this.tablero.length)
				y--;
			this.tablero[x][y-1] = 1;
			this.tablero[x][y] = 1;
			this.tablero[x][y+1] = 1;
		}
		if(horientacion ==0){
			if(x==0)
				x++;
			if(x==this.tablero.length)
				x--;
			this.tablero[x-1][y] = 1;
			this.tablero[x][y] = 1;
			this.tablero[x+1][y] = 1;
		}
		
	}
	
	public int dispara(int x, int y){ 
		if(this.tablero[x][y] == 2 || this.tablero[x][y] ==3 ){
			return(2);
		}
		if(this.tablero[x][y] == 1){
			this.tablero[x][y] = 2;
			return(1);
		}else{
			this.tablero[x][y] = 3;
			return(0);
		}
		
		
	}
	
	public int quedanDisparos(){
		int disparos=0;
		for(int i=0; i<lado; i++){
			for(int j=0; j<lado;j++){
				if(this.tablero[i][j]==1){
					disparos++;
				}
			}
		}
		return(disparos);
	}
	
	public void visualizarTablero(){
		
		for(int i=0; i<lado; i++){
			for(int j=0; j<lado;j++){
				if(this.tablero[i][j]==0){
					System.out.print(".");
				}else{
					if(this.tablero[i][j]==1){
						System.out.print("o");
					}else{
						if(this.tablero[i][j]==2){
							System.out.print("X");
						}
					}
				}
			}
		}
	}
}
