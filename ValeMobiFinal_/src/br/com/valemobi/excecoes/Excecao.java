package br.com.valemobi.excecoes;

public class Excecao extends Exception{
	
	private static final long serialVersionUID = 1L;

	public Excecao(String msg) {
		super(msg);
	}
	
	public Excecao(String msg, Exception e) {
		super (msg, e);
		print(e);
	}
	
	private void print(Exception e) {
		System.out.println("===== Tratando o erro =====");
		
		switch (e.getClass().getName()) {
		case "NullPointerException":
			System.out.println("Exceção de nulo encontrada!");
			break;
		case "NumberFormatException":
			System.out.println("Exceção formato numérico encontrada!");
			break;
		default:
			System.out.println("Exceção padrão encontrada!");
		}
	}

}
