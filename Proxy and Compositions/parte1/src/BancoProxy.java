package br.padroes.proxy;

public class BancoProxy implements BancoUsuarios {
  private int quantidadeDeUsuarios;
  private int usuariosConectados;
	protected String usuario, senha;

	public BancoProxy(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

  @Override
	public String getNumeroDeUsuarios() {
		if (temPermissaoDeAcesso()) {
			return getNumeroDeUsuarios();
		}
		return null;
	}

  @Override
  public String getUsuariosConectados() {
		if (temPermissaoDeAcesso()) {
			return getUsuariosConectados();
		}
		return null;
	}

  @Override
	private boolean temPermissaoDeAcesso() {
		return usuario == "admin" && senha == "admin";
	}
}