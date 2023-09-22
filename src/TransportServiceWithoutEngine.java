public interface TransportServiceWithoutEngine {
    default void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
