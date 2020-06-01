package strategy.solution;

public class PngCompressor implements Compressor{
	/*
	 * 'concrete strategy' in uml
	 * */
	@Override
	public void compress(String fileName) {
		System.out.println("Compressing using jpeg");
		
	}

}
