package produtos;

public class FabricaCarroPopular implements FabricaPecasCarro {
    @Override
    public Motor createMotor() {
        return new MotorPopular();
    }

    @Override
    public Pneu createPneu() {
        return new PneuPopular();
    }
}
