public class Principal {
    NYPizzaFactory nyFactory = new NYFactory();
		PizzaStore nyStore = new PizzaStore(nyFactory);
        nyStore.order ("Veggie");
}
