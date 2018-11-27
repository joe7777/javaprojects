package billing.entity;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Billing {

	long id;
	String name;
	List<BillingItem> listItems;
	
	public Billing() {
		
	}

	public Billing(long id, String name, List<BillingItem> listItems) {
		super();
		this.id = id;
		this.name = name;
		this.listItems = listItems;
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

	public List<BillingItem> getListItems() {
		return listItems;
	}

	public void setListItems(List<BillingItem> listItems) {
		this.listItems = listItems;
	}

	@Override
	public String toString() {
		return String.format("Billing [id=%s, name=%s, listItems=%s]", id, name, listItems);
	}
	
	
	
}
