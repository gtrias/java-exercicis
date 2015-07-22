public class  Mates				/*en java utilizar el dato booleano en vez de int*/
{
	 
	public static float factorial(int n){        
	float f=1;
	for(int cont=1;cont<=n;cont++){
   	f=f*cont;
	}
	return(f);
	}



	public static int primo(int n){             
	for(int i=2;i<=n/2;i++)
   	if(n%i==0)
   		return 0;
	return 1;
	}



	public static int perfecto(int n){          
	int s=0,cont;
	for(cont=1;cont<n;cont++){
   		if(n%cont==0){
      		s=s+cont;
		}
	}
	if(n==s){
   		return 1;
	}else{
   		return 0;
	}
	}	


	public static int amigos(int n,int m){          
	int s=0,cont;
	for(cont=1;cont<n;cont++){
   	if(n%cont==0){
      	s=s+cont;
      }
	}
	if(m==s){
   		s=0;
   		for(cont=1;cont<n;cont++){
   			if(m%cont==0){
      			s=s+cont;
     		   }
   		}
         if(n==s){
         	return 1;
         }
		else{
   			return 0;
		}
	}
	else return 0;
	}




	public static int primos(int n,int m){            

	int s=0;
	for(int cont=1;cont<=9;cont++){
     if(n%cont==0 && m%cont==0){
     		s++;
		 }
	}
	if(s==2){
     	return 1;
	}else{
     	return 0;
	}
	}




	public static int combinatorio(int n,int m){		  
	int combinatorio;
	combinatorio=n/(m*(n-m));
	return combinatorio;
	}




	public static int potencia(int n,int m){					
	int cont,resultado=0;
	if(m==0){
   		return(1);
	}if(m==1){
   		return(n);
	}if(m>=2){
   		for(cont=2;cont<=m;cont++){
      		resultado=resultado+(n*n);
		}
      return(resultado);
	}else{
		System.out.println("ERROR");
		return 0;
	}
	}



	public static int euler(int n){                   

	int cont,cont2,s=0;
	for(cont=1;cont<=n;cont++){
   		for (cont2=1;cont2<=n;cont2++){
    		 if(n%cont==0 && cont%cont2==0){
     			s++;
     		}
   		}
	}
    return	s;
	}
}
