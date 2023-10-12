package Examen_simul;

public class PilaMul {
	int np,max;
	Pila P[]=new Pila[100];
	PilaMul(int cc){
		np=0;
		max=cc;
	}
	boolean esvacia(int i){
		return P[i].esvacia();
	}
	boolean esllena(int i){
		return P[i].esllena();
	}
	void adicionar(int i,Object ele){
		P[i].adicionar(ele);
	}
	Object eliminar(int i){
		return P[i].eliminar();
	}
	void mostrar(int i){
		P[i].mostrar();
	}
	int nElem(int i){
		return P[i].nElem();
	}
	void mostrar(){
		int i;
		for(i=1;i<=np;i++){
			mostrar(i);
		}
	}
	int nElem(){
		int i,s=0;
		for(i=1;i<=np;i++){
			s=s+nElem(i);
		}
		return s;
	}
	void crearPila(int i,int ca){
		P[i]=new Pila(ca);
		np++;
	}
	int getMax(int i){
		return P[i].getMax();
	}
}