package billing.service;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import billing.entity.Billing;
import billing.entity.BillingItem;

@RestController
public class BillingService {
	
	@Autowired
	private Billing billing;
	
	@RequestMapping(method = RequestMethod.GET, value = "/GetBilling")
	public Billing getBilling() {
		populateBilling();
		return billing;
	}
	
	@PostMapping( "/PostBilling")
	public ResponseEntity<Billing> postBilling(@RequestBody String billing) {
		
		Billing billing1 = new Billing();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		billing1 = gson.fromJson(billing, Billing.class);
		
		List<BillingItem> item1 = new ArrayList<BillingItem>();
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(billing1.getId()).toUri();
		
		System.out.println(billing.toString());
		return ResponseEntity.created(location).build();
	}
	
	public void populateBilling() {
		billing.setId(1);
		billing.setName("TestYoussef");
		List<BillingItem> listItem1 = new ArrayList<BillingItem>();
		listItem1.add(new BillingItem(1, "Sara"));
		listItem1.add(new BillingItem(2, "Imane"));
		//billing.getListItems().add(new BillingItem(1, "Sara"));
		//billing.getListItems().add(new BillingItem(2, "Imane"));
		billing.setListItems(listItem1);
	}
}