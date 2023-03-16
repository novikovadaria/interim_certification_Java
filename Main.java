public class Main {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        // add some toys
        store.addToy(1, "Toy 1", 10, 20);
        store.addToy(2, "Toy 2", 5, 10);
        store.addToy(3, "Toy 3", 20, 70);

        // set the weight of a toy
        store.setToyWeight(2, 30);

        // play the game
        store.play();

        // get the prize toy
        try {
            store.getPrizeToy();
        }