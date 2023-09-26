public class Tubo {
    private double superficie, volume;

    public Tubo(float raggio){
        this.superficie = calcoloSuperficie(raggio);
        this.volume = calcoloVolume(raggio);
    }

    public double calcoloSuperficie(float raggio){
        return 2 * (3.14) * raggio;
    }

    public double calcoloVolume(float raggio){

    }
}
