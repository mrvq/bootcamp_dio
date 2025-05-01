import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import strategy.Comportamento;
import strategy.Robo;

public class App {
    public static void main(String[] args) throws Exception {

        // Singleton

        // SingletonLazy lazy1 = SingletonLazy.getInstancia();
        // System.out.println(lazy1);
        // lazy1 = SingletonLazy.getInstancia();
        // System.out.println(lazy1);

        // SingletonEager lazy2 = SingletonEager.getInstancia();
        // System.out.println(lazy2);
        // lazy2 = SingletonEager.getInstancia();
        // System.out.println(lazy2);

        // SingletonLazyHolder lazy3 = SingletonLazyHolder.getInstancia();
        // System.out.println(lazy3);
        // lazy3 = SingletonLazyHolder.getInstancia();
        // System.out.println(lazy3);

        // Strategy
        Comportamento normal = new strategy.ComportamentoNormal();
        Comportamento defensivo = new strategy.ComportamentoDefensivo();
        Comportamento agressivo = new strategy.ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();

    }
}
