package decorator;

public abstract class OmamentTreeDecorator implements TreeComponent {
	TreeComponent treeComponent;
	
	

	public OmamentTreeDecorator(TreeComponent treeComponent) {
		this.treeComponent = treeComponent;
	}



	@Override
	public abstract String show();

}
