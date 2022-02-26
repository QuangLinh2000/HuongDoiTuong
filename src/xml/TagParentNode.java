package xml;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TagParentNode implements XMLComponent{
	private String tagName;
	private List<Actibute> listActibute = new ArrayList<Actibute>();
    List<XMLComponent> listLeaf = new ArrayList<XMLComponent>();
    


	public TagParentNode(String tagName, List<XMLComponent> listLeaf) {
		this.tagName = tagName;
		this.listLeaf = listLeaf;
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
		
		System.out.println("<"+tagName+ actibuteS+">" );
		for (XMLComponent xmlLeaf : listLeaf) {
			xmlLeaf.generateHtml();
		}
		System.out.println("</"+tagName+">");
		
	}
	public static void main(String[] args) {
		XMLLeaf xmlLeaf1 = new XMLLeaf("item", "Dog House");
     	xmlLeaf1.addActibute(new Actibute("number", "12660"));
     	xmlLeaf1.addActibute(new Actibute("quantity", "1"));
     	
		XMLLeaf xmlLeaf2 = new XMLLeaf("item", "Bird Feeder");
		xmlLeaf2.addActibute(new Actibute("number", "12660"));
     	xmlLeaf2.addActibute(new Actibute("quantity", "2"));
        
     	List<XMLComponent> liComponents = Arrays.asList(xmlLeaf1,xmlLeaf2);
		
		TagParentNode xmlLeafC1 = new TagParentNode("Order", liComponents);
		TagParentNode xmlLeafC2 = new TagParentNode("Order", liComponents);
		
		  List<XMLComponent> listLeaf = Arrays.asList(xmlLeafC1,xmlLeafC2);
		TagParentNode tagParentNode = new TagParentNode("Orders",listLeaf);
		tagParentNode.generateHtml();
	}

}
