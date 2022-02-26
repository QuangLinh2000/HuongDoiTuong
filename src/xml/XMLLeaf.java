package xml;

import java.util.ArrayList;
import java.util.List;

public class XMLLeaf implements XMLComponent {
	private String tagName;
	private String tagValue;
	private List<Actibute> listActibute = new ArrayList<Actibute>();
	
	

	public XMLLeaf(String tagName, String tagValue) {
		this.tagName = tagName;
		this.tagValue = tagValue;
	}
	public void addActibute(Actibute actibute) {
		listActibute.add(actibute);
	}
	



	@Override
	public void generateHtml() {
		String actibuteS = "";
		for (int i = 0; i < listActibute.size(); i++) {
			Actibute actibute = listActibute.get(i);
			actibuteS += actibute.getActibuteName() +" = "+"'"+actibute.getActibuteValue()+"'";
		}
		System.out.println("  <"+tagName+ actibuteS+">"+ tagValue + "</"+tagName+">");
		
	}

}
