package permissoesUsuario;

public enum Permissao {
	
	ESTAGIO(1),
	PADRAO(2),
	SUPERVISOR(3),
	ADM(4);
	
	private long val;
	
	Permissao(long val){
		this.val = val;
	}
	
	public long getPermissao() {
		return val;
	}
	
	public boolean LerPerm(Permissao perm) {
		return perm.val >= 1 ? true : false;
	}
	
	public boolean InserirPerm(Permissao perm) {
		return perm.val >= 2 ? true : false;
	}
	
	public boolean AlterarPerm(Permissao perm) {
		return perm.val >= 3 ? true : false;
	}

	public boolean ExcluirPerm(Permissao perm) {
		return perm.val >= 4 ? true : false;
	}
}
