//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        int amount = 5;
        Fork[] forks = new Fork[amount];
        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Fork();
        }

        PhilosopherAsymmetric[] philosophers = new PhilosopherAsymmetric[amount];
        for (int i = 0; i < philosophers.length; i++) {
            philosophers[i] = new PhilosopherAsymmetric(i, forks[i], forks[((i + 1) % philosophers.length)]);
            System.out.println(forks[i].id + " " + forks[((i + 1) % philosophers.length)].id);

        }

        for (PhilosopherAsymmetric p : philosophers) {
            p.start();
        }
    }
}