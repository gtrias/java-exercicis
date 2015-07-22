public class Lista extends Vector {
	
	Lista(){
		super();
	}
	
	public void ponPrimero(Object ob){
		super.insertElementAt(ob,0);
	}
	public void ponUltimo(Object ob){
		listaObjetos.addElement(ob);
	}
	public boolean estaVacia(){
		 
		if(super.isEmpty == true){
			return(true);
		}else{
			return(false);
		}
	}
	public Object extraePrimero(){
		Object primero = super.firstElement();
		removeElement(primero);
		return(primero);
	}
	public Object extraeUltimo(){
		Object ultimo = super.lastElement();
		removeElement(ultimo);
		return(ultimo);
	}
	public void VisualizaElementos(){
		System.out.println(super.Serializable());
	}	
}
