package praktek03;

public class SepedaMotor extends Sepeda{
    private String jenisMotor;
    
    void throlttle(){
        System.out.println("NGEEENG......");
    }

    public String getJenisMotor() {
        return jenisMotor;
    }

    public void setJenisMotor(String jenisMotor) {
        this.jenisMotor = jenisMotor;
    }
    
    
}
