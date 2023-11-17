package mvc.jtree;

public class ParoleMVC {
	public static void main(String[] args) {
		ParoleModel pm = new ParoleModel();
		pm.add("pippo");
		ParoleView pv = new ParoleView(pm);
		new ParoleController(pv,pm);
	}

	
}

