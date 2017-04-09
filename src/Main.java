import java.util.Random;

public class Main {
    private static void MonteCarlo(int n){

        int daireIcideNoktalar=0;
        double noktaX,noktaY,hypot;

        for(int i=0 ; i<n ;i++){
            noktaX = Math.random();
            noktaY = Math.random();
            hypot = ((noktaX*noktaX)+(noktaY*noktaY));
            if(hypot<=1){
                daireIcideNoktalar++;
            }
        }

        System.out.println("("+n+")defa restgete nokta konulmasi ile : pi = "+(4*((double)daireIcideNoktalar/(double)n)));
    }
    public static void main(String[] args) {
        MonteCarlo(10);
        MonteCarlo(1000);
        MonteCarlo(100000);
        MonteCarlo(1000000);
        MonteCarlo(10000000);
    }
}
