package word;

public class Oak extends Plant {

	public Oak() {

		// This works --- size is protected , Oak is subclass of plant
		this.size = "large";

		// No access specifier; works beacuse Oak and Plants are in the same
		// package;
		this.height = 10;
	}

}
