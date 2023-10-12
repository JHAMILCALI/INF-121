package Examen_simul;


import java.util.Scanner;
public class Carrito {
	private
		int numcarr;
		Pila P;
		Producto PR;
		int edad,nump;
	public
		void leer(int i){
			nump=i;
			int j;
			Scanner sc=new Scanner(System.in);
			System.out.println("Ingrese el Numero de Carrito:");
			numcarr=sc.nextInt();
			System.out.println("Ingrese su Edad:");
			edad=sc.nextInt();
			 P=new Pila(100);
			for(j=1;j<=nump;j++){
				Producto PR=new Producto();
				PR.leer();
				P.adicionar(PR);
			}
		}
		int getnump(){
			return nump;
		}
		int getnumcarr(){
			return numcarr;
		}
		int getedad(){
			return edad;
		}
		Producto getproducto(){
			return (Producto) P.eliminar();
		}
		void setproductor(Producto X){
			P.adicionar(X);
		}
		void mostrar(){
			int k;
			System.out.println("NUM:"+numcarr);
			System.out.println("EDAD:"+edad);
			System.out.println("PRODUCTOS");
			Pila aux=new Pila(100);
			Producto P2;
			aux.vaciar(P);
			while(!aux.esvacia()){
				P2=(Producto)aux.eliminar();
				P2.mostrar();
				P.adicionar(P2);
			}
		}
}