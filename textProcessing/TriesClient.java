package textProcessing;

public class TriesClient {

	public static void main(String[] args) {
		Tries trie = new Tries();
		trie.AddWord("art");
		trie.AddWord("arts");
		trie.AddWord("amit");
		trie.AddWord("sea");
		trie.AddWord("see");
		trie.AddWord("seen");
		trie.AddWord("nah");
		trie.AddWord("nahi");
		trie.display();
		System.out.println("&&&&&&&&******");
	 System.out.println(trie.Search("art"));
	 System.out.println(trie.Search("artssss"));
		System.out.println("@@@@@@@@@@@@@@******");
		trie.remove("arts");
		trie.remove("art");
		trie.display();
	     System.out.println(trie.Numwords());
	}
	

}
