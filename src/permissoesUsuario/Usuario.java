package permissoesUsuario;

public class Usuario {

	private long id;
	private String nome;
	private Permissao perm;
	
	public Usuario(long id, String nome, Permissao perm) {
		this.id = id;
		this.nome = nome;
		this.perm = perm;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Permissao getPerm() {
		return perm;
	}
	public void setPerm(Permissao perm) {
		this.perm = perm;
	}
	
	public void LerInfo(Permissao perm) {
		if(perm.LerPerm(perm)) {
			System.out.println("Lendo info como um " + perm.getPermissao());
			}else {
			System.out.println("Usu�rio n�o possui permiss�o!");
			}
	}
	
	public void Inserir(Permissao perm) {
		
		if(perm.InserirPerm(perm)) {
			System.out.println("Inserindo informa��es");
			}else {
			System.out.println("Usu�rio n�o possui permiss�o!");
			}
	}
	
	public void Alterar(Permissao perm) {
		
		if(perm.AlterarPerm(perm)) {
			System.out.println("Alterando informa��es ");
			}else {
			System.out.println("Usu�rio n�o possui permiss�o!");
			}
		
	}
	
	public void Excluir(Permissao perm) {
		
		if(perm.ExcluirPerm(perm)) {
			System.out.println("Excluindo informa��es");
			}else {
			System.out.println("Usu�rio n�o possui permiss�o!");
			}
	}
	
}
