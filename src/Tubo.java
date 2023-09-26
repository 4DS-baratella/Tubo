public class Tubo {
    private double superficie, volume;


    public Tubo(float raggio, float altezza){
        this.superficie = calcoloSuperficie(raggio);
        this.volume = calcoloVolume(raggio, altezza);
    }

    public double calcoloSuperficie(float raggio){
        return 2 * (3.14) * raggio;
    }

    public double calcoloVolume(float raggio, float altezza){
        return (3.14) * Math.pow(raggio, 2) * altezza;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
