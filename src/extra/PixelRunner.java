package extra;

public class PixelRunner {
	public static void main(String[] args) {
		PixelParty pixelparty = new PixelParty();
		pixelparty.getRandomColor();
		pixelparty.drawCircle(100, 100, 30);
		pixelparty.getRandomColor();
		pixelparty.drawRectangle(500, 100, 20, 30);
		pixelparty.getRandomColor();
		pixelparty.drawTriangle(100, 500, 500, 500, 750, 250);
		pixelparty.saveImage();
		pixelparty.displayImage();
	}
}
