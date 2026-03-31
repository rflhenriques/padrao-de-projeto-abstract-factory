package produtos;

public class MotorEsportivo implements Motor {
    @Override
    public String emitirSom() {
        return "VRUMMM! (Motor Esportivo V8)";
    }
}
