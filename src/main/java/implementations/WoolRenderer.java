package implementations;
import interfaces.HairTypeRenderer;
import interfaces.HairyAnimal;

public class WoolRenderer extends HairTypeRenderer<HairTypeWool> {
	
	public final static WoolRenderer INSTANCE = new WoolRenderer();
	
	private WoolRenderer() {
		//I'm a singleton
	}
	
	@Override
	public void renderHair(HairTypeWool type, HairyAnimal animal) {
		//... snip ...
	}
	
}