package br.padroes.proxy;

public class RealBancoUsuarios implements BancoUsuarios {
	private int quantidadeDeUsuarios;
	private int usuariosConectados;

	public BancoUsuarios() {
		quantidadeDeUsuarios = (int) (Math.random() * 100);
		usuariosConectados = (int) (Math.random() * 10);
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