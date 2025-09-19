package POOV.Ponto2D;
public class Ponto2D {
    private double x;
    private double y;
    
    public Ponto2D(){ // padroninzando x e y na origem
        x = 0.0;
        y = 0.0;
    }

    public Ponto2D(double x, double y){
        this.x = x; //nao precisa de validacao ja que o espaco possui valores negativos e positivos
        this.y = y;    
    }

    public void movendoPontos(double x, double y){
        this.x+= x;
        this.y+=y;
    }

    public void movendoNoventaGraus(){
        double aux = x;
        aux = x;
        x = y;
        y = - aux; 
       
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    public void mostrarPontos(){
        System.out.println("Ponto x: " +x);
        System.out.println("Ponto y: " + y);
        System.out.println();
    }
}
