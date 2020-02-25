package cpg.greatoutdoors.deliveryreport.dao;

public interface DeliveryTimeReportDaoIntf {

	public void getInput() throws Exception;
	public int getItemWiseDeliveryTimeReport() throws Exception ;
	public int getProductCategoryWiseDeliveryTimeReport() throws Exception ;
}
