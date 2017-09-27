
public class Cliente {

	public static void main(String[] args) {
		ImagemTarget imagem = new ImagemAdapter();
		
		Imagem jpeg = new ImagemJpeg();
		Imagem png = new ImagemPNG();
		Imagem bmp = new ImagemBMP();
		
		imagem.carregarImagem(jpeg);
		imagem.desenharImagem(jpeg);
		
		imagem.carregarImagem(png);
		imagem.desenharImagem(png);
		
		imagem.carregarImagem(bmp);
		imagem.desenharImagem(bmp);
	}

}
