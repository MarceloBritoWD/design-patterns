
public class ImagemJpeg implements Imagem {

	@Override
	public void carregar() {
		System.out.println("Carregando JPEG");
	}

	@Override
	public void desenhar() {
		System.out.println("Desenhando JPEG");
	}
}
