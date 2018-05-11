package math;

public class Calculadora {
	// Atributos
	private Double resultado = 0d;

	// Metodos
	public void inserirValorInicial(Double valor) {
		resultado = valor;
	}

	public Double obterResultado() {
		return resultado;
	}

	public void somar(Double valor) {
		resultado = resultado + valor;
	}

	public void subtrair(Double valor) {
		resultado = resultado - valor;
	}

	public void multiplicar(Double valor) {
		resultado = resultado * valor;
	}

	public void dividir(Double valor) {
		resultado = resultado / valor;
	}

	public void inverterSinal() {
		resultado = resultado * -1;
	}

	public void potencia(int potencia) {
		for (int i = 1; i < potencia; i++)
			resultado = resultado * resultado;
	}

	public void limpar() {
		resultado = 0d;
	}
}
