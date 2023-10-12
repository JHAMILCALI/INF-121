package Examen_simul;
import java.util.Scanner;
public class MicroMarket {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CCMul A=new CCMul(100);
		Producto PRO;
		Pila PR;
		Carrito CA;
		int n,i,j,k,cap,ne,npro;
		System.out.println("Ingrese la cantidad de Cajeros del Mini Market:");
		n=sc.nextInt();
		for(i=1;i<=n;i++){
			System.out.println("Ingrese la Capacidad de la Cola Circular:"+i);
			cap=sc.nextInt();
			A.creacci(i, cap);
			System.out.println("Ingresa el Numero de Elementos Carrito Para la Cola:"+i);
			ne=sc.nextInt();
			for(j=1;j<=ne;j++){
				System.out.println("Carrito+"+j);
				Carrito CA1=new Carrito();
				System.out.println("Ingrese el numero de productos:");
				npro=sc.nextInt();
				CA1.leer(npro);
				A.adicionar(CA1, i);
			}
		}
		int ele2;
		int ele;
		for(i=1;i<=n;i++){
			System.out.println("Cola:"+i);
			ele=A.nelem(i);
			for(j=1;j<=ele;j++){
				System.out.println("Carrito"+j);
				CA=(Carrito)A.eliminar(i);
				CA.mostrar();
				A.adicionar(CA, i);
			}
		}
		int precio1;
		Producto Cos,Cos2;
		Pila aux=new Pila(100);
		int mascostoso=0;
		System.out.println("**Inciso B**");
		for(i=1;i<=n;i++){
			ele=A.nelem(i);
			for(j=1;j<=ele;j++){
				CA=(Carrito)A.eliminar(i);
				ele2=CA.getnump();
				for(k=1;k<=ele2;k++){
					Cos=(Producto)CA.getproducto();
					precio1=Cos.getprecio();
					if(precio1>mascostoso){
						mascostoso=precio1;
					}
					aux.adicionar(Cos);
				}
				while(!aux.esvacia()){
					Cos2=(Producto)aux.eliminar();
					CA.setproductor(Cos2);
				}
				A.adicionar(CA, i);
			}
		}
		boolean p=false;
		int o;
		System.out.println();
		for(i=1;i<=n;i++){
			ele=A.nelem(i);
			for(j=1;j<=ele;j++){
				CA=(Carrito)A.eliminar(i);
				ele2=CA.getnump();
				for(k=1;k<=ele2;k++){
					Cos=(Producto)CA.getproducto();
					precio1=Cos.getprecio();
					if(precio1==mascostoso){
						p=true;
					}
					aux.adicionar(Cos);
				}
				while(!aux.esvacia()){
					Cos2=(Producto)aux.eliminar();
					CA.setproductor(Cos2);
				}
				if(p){
					p=false;
					System.out.println("Cola:"+i);
					ele=A.nelem(i);
					for(o=1;o<=ele;o++){
						System.out.println("Carrito"+j);
						CA=(Carrito)A.eliminar(i);
						CA.mostrar();
						A.adicionar(CA, i);
					}
				}
				A.adicionar(CA, i);
			}
		}
		System.out.println("**Inciso C**");
		int mayorcantidacarr=0;
		for(i=1;i<=n;i++){
			ele=A.nelem(i);
			if(ele>mayorcantidacarr){
				mayorcantidacarr=ele;
			}
		}
		for(i=1;i<=n;i++){
			ele=A.nelem(i);
			if(ele==mayorcantidacarr){
				System.out.println("Cola:"+i);
				for(j=1;j<=ele;j++){
					System.out.println("Carrito"+j);
					CA=(Carrito)A.eliminar(i);
					CA.mostrar();
					A.adicionar(CA, i);
				}
			}
		}
		System.out.println("**Inciso D**");
		int edadmay;
		for(i=1;i<=n;i++){
			ele=A.nelem(i);
			for(j=1;j<=ele;j++){
				CA=(Carrito)A.eliminar(i);
				edadmay=CA.getedad();
				if(edadmay>60){
					A.adicionar(CA, 1);
				}
				else{
					A.adicionar(CA, i);
				}
			}
		}
		for(i=1;i<=n;i++){
			System.out.println("Cola:"+i);
			ele=A.nelem(i);
			for(j=1;j<=ele;j++){
				System.out.println("Carrito"+j);
				CA=(Carrito)A.eliminar(i);
				CA.mostrar();
				A.adicionar(CA, i);
			}
		}
		System.out.println("**Inciso E**");
		int kesima,total=0,tc=0;
		System.out.println("Ingrese de cual caja quiere el total del ingreso monetario:");
		kesima=sc.nextInt();
		for(i=1;i<=n;i++){
			ele=A.nelem(i);
			if(i==kesima){
				for(j=1;j<=ele;j++){
					CA=(Carrito)A.eliminar(i);
					ele2=CA.getnump();
					for(k=1;k<=ele2;k++){
						Cos=(Producto)CA.getproducto();
						tc=tc+(Cos.getprecio()*Cos.getcant());
						aux.adicionar(Cos);
					}
					while(!aux.esvacia()){
						Cos2=(Producto)aux.eliminar();
						CA.setproductor(Cos2);
					}
					A.adicionar(CA, i);
				}
				total=tc+total;
			}			
		}
		System.out.println("El total de Ingresos Monetarios del Cajero:"+kesima+":es:"+total);
	}

}