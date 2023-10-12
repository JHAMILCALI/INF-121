package Examen_simul;

public class CNMul {
    private int ncs,max;
    private CSNormal cnm[]=new CSNormal[100];
    CNMul(int ca){
        max=ca;ncs=0;
    }
    boolean esvacia(int i){
        return cnm[i].esvacia();
    }
    boolean esllena(int i){
        return cnm[i].esllena();
    }
    int ncolas(){
        return ncs;
    }
    void adicionar(Object x,int i){
        cnm[i].adicionar(x);
    }
    Object eliminar(int i){
        return (cnm[i].eliminar());
    }
    void mostrar(int i){
        cnm[i].mostrar();
    }
    void mostrar(){
        int i;
        for(i=1;i<=ncs;i++){
            System.out.println("Cola:"+i);
            mostrar(i);
        }
    }
    int nlem(int i){
        return (cnm[i].nelem());
    }
    void creaICN(int i,int ca){
        cnm[i]=new CSNormal(ca);ncs++;
    }
    int getmaxcolai(int i){
        return cnm[i].getmax();
    }
    int getmax(){
        return max;
    }
}