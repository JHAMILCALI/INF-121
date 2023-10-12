package Examen_simul;

public class Pila {
	private int tope,max;
	Object[] v=new Object[100];
	Pila(int a){
		max=a;tope=0;
	}
	boolean esllena(){
		if(tope==max) return true;
		else return false;
	}
	boolean esvacia(){
		if(tope==0) return true;
		else return false;
	}
	void adicionar(Object item){
		if(!esllena()){
			tope++;
			v[tope]=item;
		}
		else{
			System.out.println("Pila llena!!!!");
		}
	}
	Object eliminar(){
		Object item=null;
		if(esvacia()) System.out.println("Pila Vacia!!!!");
		else{
			item=v[tope];
			tope--;
		}
		return item;
	}
	void mostrar(){
		Object item;
		Pila aux=new Pila(max);
		while(!esvacia()){
			aux.adicionar(eliminar());
		}
		while(!aux.esvacia()){
			item=aux.eliminar();
			System.out.println(item);
			adicionar(item);
		}
		
	}
	void vaciar(Pila B){
		while(!B.esvacia()){
			adicionar(B.eliminar());
		}
	}
	int nElem(){
		return tope;
	}
	int getMax(){
		return max;
	}
}