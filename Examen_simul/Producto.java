package Examen_simul;
import java.util.Scanner;
public class Producto {
	private
		String nom;
		int precio,cantidad;
	public
		Producto(){
			precio=0;
			cantidad=0;
			nom="";
		}
		String getnom(){
			return nom;
		}
		int getprecio(){
			return precio;
		}
		int getcant(){
			return cantidad;
		}
		void leer(){
			Scanner sc=new Scanner(System.in);
			System.out.println("Ingrese el Nombre del Producto:");
			nom=sc.next();
			System.out.println("Ingrese el precio del producto:");
			precio=sc.nextInt();
			System.out.println("Ingrese la Cantidad del Producto:");
			cantidad=sc.nextInt();
		}
		void mostrar(){
			System.out.println("NOMBRE:"+nom);
			System.out.println("PRECIO:"+precio);
			System.out.println("CANTIDAD:"+cantidad);
		}
}