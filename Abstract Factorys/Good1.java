
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

/**
 * Good example of the abstract factory.
 * see: https://brizeno.wordpress.com/category/padroes-de-projeto/abstract-factory/
 */
class Good1 {
  interface FabricaDeCarro {
    CarroSedan criarCarroSedan();

    CarroPopular criarCarroPopular();
  }

  class FabricaFord implements FabricaDeCarro {

    @Override
    public CarroSedan criarCarroSedan() {
      // TODO Auto-generated method stub
      return new Fusion();
    }

    @Override
    public CarroPopular criarCarroPopular() {
      // TODO Auto-generated method stub
      return new Focus();
    }

  }

  class FabricaFiat implements FabricaDeCarro {

    @Override
    public CarroSedan criarCarroSedan() {
      return new Siena();
    }

    @Override
    public CarroPopular criarCarroPopular() {
      return new Palio();
    }
  }

  interface CarroPopular {
    void exibirInfoPopular();
  }

  interface CarroSedan {
    void exibirInfoSedan();
  }

  class Fusion implements CarroSedan {

    @Override
    public void exibirInfoSedan() {
      System.out.println("Ford Fusion SE 2.5 FLEX - 2017");
    }

  }

  class Focus implements CarroPopular {

    @Override
    public void exibirInfoPopular() {
      System.out.println("Modelo: Ford Focus SE 1.6 2017");
    }

  }

  class Palio implements CarroPopular {

    @Override
    public void exibirInfoPopular() {
      System.out.println("Modelo: Palio\nFábrica: Fiat\nCategoria:Popular");
    }
  }

  class Siena implements CarroSedan {

    @Override
    public void exibirInfoSedan() {
      System.out.println("Modelo: Siena\nFábrica: Fiat\nCategoria:Sedan");
    }
  }

  public static void main(String[] args) {
    Good1 g1 = new Good1();
    FabricaDeCarro fabrica = g1.new FabricaFiat();
    CarroSedan sedan = fabrica.criarCarroSedan();
    CarroPopular popular = fabrica.criarCarroPopular();
    sedan.exibirInfoSedan();
    System.out.println();
    popular.exibirInfoPopular();
    System.out.println();

    fabrica = g1.new FabricaFord();
    sedan = fabrica.criarCarroSedan();
    popular = fabrica.criarCarroPopular();
    sedan.exibirInfoSedan();
    System.out.println();
    popular.exibirInfoPopular();
  }
}