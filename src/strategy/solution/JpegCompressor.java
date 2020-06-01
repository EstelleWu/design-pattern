package strategy.solution;

public class JpegCompressor implements Compressor{
	/* 'concrete strategy' in uml
	 * */
	@Override
	public void compress(String fileName) {
		System.out.println("Compressing using jpeg");
		
	}
	
}
