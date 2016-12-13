package exceptions;

public class NoSuchRow extends Exception{
	private static final long serialVersionUID = -8651787701033100248L;
	
	private String managerClass;

	public NoSuchRow(String managerClass) {
		super();
		this.managerClass = managerClass;
	}

	public String getManagerClass() {
		return managerClass;
	}

	public void setManagerClass(String managerClass) {
		this.managerClass = managerClass;
	}
}
