package produtos;

public class FabricaCarroEsportivo implements FabricaPecasCarro {
    @Override
    public Motor createMotor() {
        return new MotorEsportivo();
    }

    @Override
    public Pneu createPneu() {
        return new PneuEsportivo();
    }
}
