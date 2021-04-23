package permissoesUsuario;

public class Main {
 
	public static void main(String[] args) {
		Usuario usu1 = new Usuario(1, "Jose", Permissao.ESTAGIO);
		Usuario usu2 = new Usuario(2, "Maria", Permissao.PADRAO);
		Usuario usu3 = new Usuario(3, "Jair", Permissao.SUPERVISOR);
		Usuario usu4 = new Usuario(4, "Janna", Permissao.ADM);
		
		usu1.LerInfo(usu1.getPerm());
		usu1.Inserir(usu1.getPerm());
		usu1.Alterar(usu1.getPerm());
		usu1.Excluir(usu1.getPerm());
		System.out.println();
		
		usu2.LerInfo(usu2.getPerm());
		usu2.Inserir(usu2.getPerm());
		usu2.Alterar(usu2.getPerm());
		usu2.Excluir(usu2.getPerm());
		System.out.println();
		
		usu3.LerInfo(usu3.getPerm());
		usu3.Inserir(usu3.getPerm());
		usu3.Alterar(usu3.getPerm());
		usu3.Excluir(usu3.getPerm());
		System.out.println();
		
		usu4.LerInfo(usu4.getPerm());
		usu4.Inserir(usu4.getPerm());
		usu4.Alterar(usu4.getPerm());
		usu4.Excluir(usu4.getPerm());
		System.out.println();
		
	}
}
