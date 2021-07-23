package mai.composite;

public class main {

    public static void main(String[] args) {
        pocket phone1 = new Phone();
        pocket wallet1 = new Wallet();
        pocket gum1 = new Gum();

        Composite pocket1 = new Composite();
        Composite pocket2 = new Composite();
        Composite pocket3 = new Composite();

        pocket1.addComponent(phone1);
        pocket1.addComponent(wallet1);
        pocket1.addComponent(gum1);

        pocket3.addComponent(pocket1);
        pocket3.addComponent(pocket2);

        pocket3.review();
    }
}