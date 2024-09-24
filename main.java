public class MaquinaRefrigerante {
	
    // Atributos.
    private int preco;
    private int balanco;
    private int total;

    // MÃ©todo construtor para inicializar os atributos
    public MaquinaRefrigerante(int valor) {
        preco = valor;
        balanco = 0;
        total = 0;
    }

    // Retorna o preÃ§o
    public int getPreco(){
        return preco;
    }

    // Retorna o balanÃ§o corrente
    public int getBalanco(){
        return balanco;
    }

    // Recebe um valor em dinheiro
    public void inserirDinheiro(int valor){
        balanco += valor;
		System.out.println("Valor inserido com sucesso!!!!");
    }

    // Imprimir o preÃ§o do refrigerante
    public void imprimirPreco(){
        System.out.println("##################");
        System.out.println("# Preco ##########");
        System.out.println("# Refrigerante");
        System.out.println("# R$ " + preco + ",00");
        System.out.println("##################");
    }
		
}


public class MaquinaRefrigeranteView{
  public static void main(String args[]){
    //
    MaquinaRefrigerante maquina = new MaquinaRefrigerante(5);

    maquina.imprimirPreco();
    
  }
}
