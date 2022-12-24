abstract public class Pembayaran {

    double bayarsepatu;

    Pembayaran(double biaya){
        this.bayarsepatu = biaya;
    }

    public double getBayarsepatu() {
        return bayarsepatu;
    }

    abstract double pembayaran();
}
