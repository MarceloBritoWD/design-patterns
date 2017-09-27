
public class ImagemAdapter implements ImagemTarget {
	Imagem img;

	@Override
	public void carregarImagem(Imagem img) {
		img.carregar();
	}

	@Override
	public void desenharImagem(Imagem img) {
		img.desenhar();		
	}

}
