package Examen_simul;

public class CSCircular extends CSimple{
    CSCircular(int ca){
        super(ca);
    }
    boolean esvacia(){
        if(nelem()==0)return true;
        else return false;
    }
    boolean esllena(){
        if(nelem()==(max-1))return true;
        else return false;
    }
    void adicionar(Object x){
        if(!esllena()){
            fin=(fin+1)%max;
            v[fin]=x;
        }
        else System.out.println("Cola Llena");
    }
    Object eliminar(){
        Object x=null;
        if(!esvacia()){
            ini=(ini+1)%max;
            x=v[ini];
        }
        else System.out.println("Cola Vacia");
        return x;
    }
    void mostrar(){
        Object x;int n=nelem();
        if(!esvacia()){
            while(n>0){
                x=eliminar();
                n--;
                System.out.println("\t"+x);
                adicionar(x);
            }
        }
        else System.out.println("Cola Vacia");
    }
    void vaciar(CSCircular B){
        while(!B.esvacia()){
            adicionar(B.eliminar());
        }
    }
    int nelem(){
        return((fin-ini+max)%max);
    }
    int getmax(){
        return max;
    }
}