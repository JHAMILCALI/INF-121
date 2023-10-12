package Examen_simul;

public class CSNormal extends CSimple{
    CSNormal(int ca){
        super(ca);
    }
    boolean esvacia(){
        if(ini==0)return true;
        else return false;
    }
    boolean esllena(){
        if(fin==max)return true;
        else return false;
    }
    void adicionar(Object x){
        if(!esllena()){
            if(esvacia())ini=1;
            fin++;
            v[fin]=x;
        }
        else System.out.println("Cola Llena");
    }
    Object eliminar(){
        Object x=null;
        if(!esvacia()){
            x=v[ini];ini++;
            if(ini>fin){
                ini=0;
                fin=0;
            }
        }
        else System.out.println("Cola Vacia");
        return (x);
    }
    void mostrar(){
        CSNormal aux=new CSNormal(max);Object x;
        if(!esvacia()){
            while(!esvacia()){
                x=eliminar();
                System.out.println("\t"+x);
                aux.adicionar(x);   
            }
            vaciar(aux);
        }
    }
    void vaciar(CSNormal B){
        while(!B.esvacia()){
            adicionar(B.eliminar());
        }
    }
    int nelem(){
        if(!esvacia())return (fin-ini+1);
        else return (0);
    }
    int getmax(){
        return max;
    }
}