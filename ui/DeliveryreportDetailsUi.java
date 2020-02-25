package cpg.greatoutdoors.deliveryreport.ui;
import cpg.greatoutdoors.deliveryreport.service.*;

public class DeliveryreportDetailsUi {
	
public static void main(String[] args) throws Exception {
	
 DeliveryTimeReportServiceIntf deliverytimereportservice = new DeliveryTimeReportServiceImpl();
 deliverytimereportservice.getInput();
 deliverytimereportservice.getItemWiseDeliveryTimeReport();
 deliverytimereportservice.getProductCategoryWiseDeliveryTimeReport();
}
}
