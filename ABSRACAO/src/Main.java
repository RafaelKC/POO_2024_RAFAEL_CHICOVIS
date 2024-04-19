// Classe abstrata Veiculo
public abstract class Veiculo {
    public abstract void acelerar();
    public abstract void frear();
}

// Classe concreta Carro
public class Carro extends Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Carro acelerando");
    }

    @Override
    public void frear() {
        System.out.println("Carro freando");
    }
}

// Classe concreta Moto
public class Moto extends Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Moto acelerando");
    }

    @Override
    public void frear() {
        System.out.println("Moto freando");
    }
}