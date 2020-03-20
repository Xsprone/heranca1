
public class Principal {
	Cliente c1, c2;
	Fornecedor f1, f2;
	public static void main (String args[]) {
		Principal p = new Principal();
		p.entraDados();
		p.mostraDados();
	}
	public void entraDados() {
		c1=new Cliente();
		c1.setCpf("9999");
		c1.setNome("Euzebio Mendes");
		c1.setEmail("euzebio.mendes@uol.com.br");
		c1.setSaldo(9999.99);
		c2=new Cliente();
		c2.setCpf("0001");
		c2.setNome("Noctis Lucis");
		c2.setEmail("noctis.lucis@yahoo.com");
		c2.setSaldo(860.00);
		f1=new Fornecedor();
		f1.setCpf("3333");
		f1.setNome("Cindy");
		f1.setGerente("Cid");
		f1.setSite("www.hammerhead.com");
		f2=new Fornecedor();
		f2.setCpf("74895");
		f2.setNome("Ignis");
		f2.setGerente("Gladio");
		f2.setSite("www.insommia.com");
	}
	public void mostraDados(){
		System.out.println("Clientes");
		System.out.println("CPF: "+c1.getCpf());
		System.out.println("Nome "+c1.getNome());
		System.out.println("Email "+c1.getEmail());
		System.out.println("Saldo "+c1.getSaldo());
		System.out.println("CPF: "+c2.getCpf());
		System.out.println("Nome "+c2.getNome());
		System.out.println("Gerente "+c2.getEmail());
		System.out.println("Saldo "+c2.getSaldo());
		System.out.println("Fornecedores");
		System.out.println("CPF: "+f1.getCpf());
		System.out.println("Nome "+f1.getNome());
		System.out.println("Gerente "+f1.getGerente());
		System.out.println("Site "+f1.getSite());
		System.out.println("CPF: "+f2.getCpf());
		System.out.println("Nome "+f2.getNome());
		System.out.println("Gerente "+f2.getGerente());
		System.out.println("Site "+f2.getSite());
	}
}
