package tests.produtos;

import org.junit.jupiter.api.Test;
import produtos.*;

import static org.junit.jupiter.api.Assertions.*;

class MontadoraTest {

    @Test
    void deveTestarMotorCarroPopular() {
        FabricaPecasCarro fabrica = new FabricaCarroPopular();
        Montadora montadora = new Montadora(fabrica);
        assertEquals("Vrum (Motor Popular 1.0)", montadora.testarMotor());
    }

    @Test
    void deveTestarPneuCarroPopular() {
        FabricaPecasCarro fabrica = new FabricaCarroPopular();
        Montadora montadora = new Montadora(fabrica);
        assertEquals("Rodando de forma estável e focado em durabilidade", montadora.testarPneu());
    }

    @Test
    void deveTestarMotorCarroEsportivo() {
        FabricaPecasCarro fabrica = new FabricaCarroEsportivo();
        Montadora montadora = new Montadora(fabrica);
        assertEquals("VRUMMM! (Motor Esportivo V8)", montadora.testarMotor());
    }

    @Test
    void deveTestarPneuCarroEsportivo() {
        FabricaPecasCarro fabrica = new FabricaCarroEsportivo();
        Montadora montadora = new Montadora(fabrica);
        assertEquals("Rodando em altíssima velocidade com máxima aderência", montadora.testarPneu());
    }

    @Test
    void deveGarantirTipoExatoDasPecasPopulares() {
        FabricaPecasCarro fabrica = new FabricaCarroPopular();
        Motor motor = fabrica.createMotor();
        Pneu pneu = fabrica.createPneu();
        assertInstanceOf(MotorPopular.class, motor);
        assertInstanceOf(PneuPopular.class, pneu);
    }

    @Test
    void deveGarantirTipoExatoDasPecasEsportivas() {
        FabricaPecasCarro fabrica = new FabricaCarroEsportivo();
        Motor motor = fabrica.createMotor();
        Pneu pneu = fabrica.createPneu();
        assertInstanceOf(MotorEsportivo.class, motor);
        assertInstanceOf(PneuEsportivo.class, pneu);
    }

    @Test
    void deveCriarNovasInstanciasDependentes() {
        FabricaPecasCarro fabrica = new FabricaCarroEsportivo();
        Motor motor1 = fabrica.createMotor();
        Motor motor2 = fabrica.createMotor();
        assertNotSame(motor1, motor2);
    }
}
