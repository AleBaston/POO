import Modelo.MotorDeAvion;

public class App {
    public static void main(String[] args) throws Exception {
        
        MotorDeAvion motor1 = new MotorDeAvion("Lycoming", 180,450.0 );
        MotorDeAvion motor2 = new MotorDeAvion("Pratt & Whitney", 1200,2500.5 );
        MotorDeAvion motor3 = new MotorDeAvion("General Electric", 95000,115000.0 );

        System.out.println("Marcas de los motores: \n -Modelo1: "+motor1.getMarca()+"\n -Modelo2: "+motor2.getMarca()+"\n -Modelo3: "+motor3.getMarca());
        System.out.println("Potencia (HP) de los motores: \n -Modelo1: "+motor1.getHp()+"\n -Modelo2: "+motor2.getHp()+"\n -Modelo3: "+motor3.getHp());
    }
}
