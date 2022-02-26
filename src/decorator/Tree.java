package decorator;

public class Tree implements TreeComponent {
	
	
	@Override
	public String show() {
		
	
		return "";
	}
	public static void main(String[] args) {
//		
		TreeComponent treeComponent =  new Tree();
		
		treeComponent = new Omament(treeComponent, "1", "Candy", 15000, "keo trang tri");
		treeComponent = new Omament(treeComponent, "1", "Candy", 15000, "keo trang tri");
		System.out.println(treeComponent.show());
		treeComponent = new Omament(treeComponent, "2", "rice", 16000, "rice trang tri");
		treeComponent = new Omament(treeComponent, "4", "rice", 16000, "rice trang tri");
		System.out.println(treeComponent.show());;
		
	}
	

}
