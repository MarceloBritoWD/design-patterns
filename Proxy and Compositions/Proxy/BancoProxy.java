package br.padroes.proxy;

public class BancoProxy implements BancoUsuarios {
  private int quantidadeDeUsuarios;
  private int usuariosConectados;
	protected String usuario, senha;

	public BancoProxy(String usuario, String senha) {
		this.quantidadeDeUsuarios = (int) (Math.random() * 100);
		this.usuariosConectados = (int) (Math.random() * 10);
		this.usuario = usuario;
		this.senha = senha;
	}

	public String getNumeroDeUsuariosReal() {
		if (temPermissaoDeAcesso()) {
			return getNumeroDeUsuarios();
		}
		return null;
	}

  public String getUsuariosConectadosReal() {
		if (temPermissaoDeAcesso()) {
			return getUsuariosConectados();
		}
		return null;
	}

	private boolean temPermissaoDeAcesso() {
		return usuario == "admin" && senha == "admin";
	}

	@Override
	public String getNumeroDeUsuarios() {
		return new String("Total de usuários: " + quantidadeDeUsuarios);
	}

  @Override
	public String getUsuariosConectados() {
		return new String("Usuários conectados: " + usuariosConectados);
	}
}