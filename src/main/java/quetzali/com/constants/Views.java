package quetzali.com.constants;

/**
 * Definición de nombres de vistas 
 */
public enum Views {
	USUARIOS("all_users");
	
	private String view;
	private Views(String view) {
		this.view=view;
	}
	public String getView() {
		return view;
	}

}
