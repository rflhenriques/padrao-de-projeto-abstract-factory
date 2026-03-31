package produtos;

public class Montadora {
    private Motor motor;
    private Pneu pneu;

    public Montadora(FabricaPecasCarro fabrica) {
        this.motor = fabrica.createMotor();
        this.pneu = fabrica.createPneu();
    }

    public String testarMotor() {
        return this.motor.emitirSom();
    }

    public String testarPneu() {
        return this.pneu.rodar();
    }
}
