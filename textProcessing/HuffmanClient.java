package textProcessing;

public class HuffmanClient {

	public static void main(String[] args) {
		String str = "abbccda";
		HuffmanEncoding hf = new HuffmanEncoding(str);
		String encoded =hf.ENCODED(str);
		System.out.println(encoded);
		System.out.println(hf.DECODED(encoded));
	}

}
