//          Engenharia de software III - Design Patterns Facade
//                            Kauã Asher Ribeiro da Silva

public class Combo{

    Burguer bu1 = new Bruguer();
    Sobremesa so1 = new Sobremesa();
    Bebida be1 = new Bebida();

    //Métodos
    public void NovoCombo(int tipo){
        
        if (tipo == 1) {

            bu1.setDescricao("Big Mac");
            bu1.setGrama(300);
            bu1.setPreco(20);

            so1.setDescricao("McFlurry");
            so1.setTamanho("Médio");
            so1.setPreco(7);

            be1.setDescricao("Coca-Cola");
            be1.setMl(700);
            be1.setPreco(10);
        
        } else if (tipo == 2) {

            bu1.setDescricao("Whopper");
            bu1.setGrama(250);
            bu1.setPreco(15);

            so1.setDescricao("BK Waffle");
            so1.setTamanho("pequeno");
            so1.setPreco(5);

            be1.setDescricao("Coca-Cola");
            be1.setMl(600);
            be1.setPreco(12);
        }

    }
    public void MostraCombo(){
        
        if (tipo == 1) {
            
            System.out.println("Super Combo");
            System.out.println(bu1);
            System.out.println(so1);
            System.out.println(be1);
            
            public double total = bu1.setPreco() + so1.setPreco() + be1.setPreco();
            System.out.println("Total:" + total);
        
        } else if (tipo == 2) {

            System.out.println("Combo Master");
            System.out.println(bu1);
            System.out.println(so1);
            System.out.println(be1);
            
            public double total = bu1.setPreco() + so1.setPreco() + be1.setPreco();
            System.out.println("Total:" + total);
        }
    }
}