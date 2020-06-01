package strategy.exercise;

public class Des implements EncryptionAlgorithm{

	@Override
	public void encrypt() {
		System.out.println("Encrypting message using DES");
	}

}
