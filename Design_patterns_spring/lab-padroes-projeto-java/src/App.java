public class App {
    public static void main(String[] args) throws Exception {

        SingletonLazy lazy1 = SingletonLazy.getInstancia();
        System.out.println(lazy1);
        lazy1 = SingletonLazy.getInstancia();
        System.out.println(lazy1);

        SingletonEager lazy2 = SingletonEager.getInstancia();
        System.out.println(lazy2);
        lazy2 = SingletonEager.getInstancia();
        System.out.println(lazy2);

        SingletonLazyHolder lazy3 = SingletonLazyHolder.getInstancia();
        System.out.println(lazy3);
        lazy3 = SingletonLazyHolder.getInstancia();
        System.out.println(lazy3);

    }
}
