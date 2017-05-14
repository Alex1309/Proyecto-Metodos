import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;

public class imagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			InputStream input = new FileInputStream("src/j/00120.png");
			
			ImageInputStream ImageInput = ImageIO.createImageInputStream(input);
			BufferedImage imagenL = ImageIO.read(ImageInput);
			
			int alto = imagenL.getHeight();
			int ancho = imagenL.getWidth();
			
			
			System.out.println("alto "+alto+" ancho "+ancho );
			
			
			for(int y=0;y<imagenL.getHeight();y++){
				for(int x=0;x<imagenL.getWidth();x++){
					
					int srcPixel = imagenL.getRGB(x, y);
					
					Color c= new Color(srcPixel);
					
					int valR =c.getRed();
					int valG =c.getGreen();
					int valB = c.getBlue();

					int valRGB = (valR+valG+valB)/3;
					if(valRGB<255/2){
						System.out.print("1");
					}else{
						System.out.print("0");
					}
					
					//System.out.print("  "+valR+"  "+ valG+ "  "+valB);
					
				}
				System.out.println("");
			}
			
		} catch (Exception e){
			System.out.println("error");

		}
		
		
		
		
	}

}
		