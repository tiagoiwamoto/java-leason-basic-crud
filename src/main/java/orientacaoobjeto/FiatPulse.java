package orientacaoobjeto;

/*
 * Tiago Henrique Iwamoto
 * tiago.iwamoto@gmail.com
 * linkedin.com/in/tiago-iwamoto
 * System specialist
 * 09/04/2022 | 07:13
 */

import java.util.HashMap;
import java.util.Map;

public class FiatPulse implements CarroInterface{
    @Override
    public void chassi() {
        Map<String, String> fiatPulseChassi = new HashMap<>();
        fiatPulseChassi.put("modelo", "AB-10");
        fiatPulseChassi.put("tamanho", "4.2M");
        fiatPulseChassi.put("largura", "1.3M");
        fiatPulseChassi.put("entreEichos", "2M");
        System.out.println(fiatPulseChassi);
    }

    @Override
    public void motor() {
        Map<String, String> fiatPulseMotor = new HashMap<>();
        fiatPulseMotor.put("tipo", "ASPIRADO");
        fiatPulseMotor.put("potencia", "1.3");
        fiatPulseMotor.put("cavalos", "107");
    }

    @Override
    public void pintura() {
        System.out.println("Azul Metalico");
    }

    @Override
    public void pneu() {
        System.out.println("Pirelli 16 polegadas");
    }
}
