package cpg.greatoutdoors.deliveryreport.service;

public interface DeliveryTimeReportServiceIntf {
	
	public void getInput() throws Exception;
	public int getItemWiseDeliveryTimeReport() throws Exception ;
	public int getProductCategoryWiseDeliveryTimeReport() throws Exception ;
}
