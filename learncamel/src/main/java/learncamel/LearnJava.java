package learncamel;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class LearnJava {

	public static void main(String[] args) {
		CamelContext context = new DefaultCamelContext();
		
		try {
			context.addRoutes(new RouteBuilder() {
				
				@Override
				public void configure() throws Exception {
					// TODO Auto-generated method stub
					from("file:data/input") //?noop=true
                    .to("file:data/output");
				}
			});
			context.start();
			Thread.sleep(5000);
			context.stop();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}