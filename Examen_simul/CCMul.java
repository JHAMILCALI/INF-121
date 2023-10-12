package Examen_simul;

public class CCMul {
    private int ncc,max;
    private CSCircular ccm[]=new CSCircular[100];
    
    CCMul(int ca){
        max=ca;ncc=0;
    }
    boolean esvacia(int i){
        return ccm[i].esvacia();
    }
    boolean esllena(int i){
        return ccm[i].esllena();
    }
    int ncolas(){
        return ncc;
    }
    void adicionar(Object x,int i){
        ccm[i].adicionar(x);
    }
    Object eliminar(int i){
        return ccm[i].eliminar();
    }
    void mostrar(int i){
        ccm[i].mostrar();
    }
    void mostrar(){
        int i;
        for(i=1;i<=ncc;i++){
            System.out.println("Cola:"+i);
            mostrar(i);
        }
    }
    int nelem(int i){
        return (ccm[i].nelem());
    }
    void creacci(int i,int ca){
        ccm[i]=new CSCircular(ca);ncc++;
    }
    int getmaxcolai(int i){
        return ccm[i].getmax();
    }
    int getmax(){
        return max;
    }
}