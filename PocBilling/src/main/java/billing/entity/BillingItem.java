package billing.entity;

public class BillingItem {
	
	long id;
	String name;
	
	public BillingItem() {
		
	}

	public BillingItem(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("BillingItem [id=%s, name=%s]", id, name);
	}
	
	
}
