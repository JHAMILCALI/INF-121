package Examen_simul;

public abstract class CSimple {
    protected int ini,fin,max;
    protected Object v[]=new Object[100];
    CSimple(int ca){
        ini=0;
        fin=0;
        max=ca;
    }
    abstract boolean esvacia();
    abstract boolean esllena();
    abstract void adicionar(Object x);
    abstract Object eliminar();
    abstract void mostrar();
    abstract int nelem();
}