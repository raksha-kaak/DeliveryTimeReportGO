package cpg.greatoutdoors.deliveryreport.service;

import cpg.greatoutdoors.deliveryreport.dao.DeliveryTimeReportDaoImpl;
import cpg.greatoutdoors.deliveryreport.dao.DeliveryTimeReportDaoIntf;

public class DeliveryTimeReportServiceImpl implements DeliveryTimeReportServiceIntf {

	public static DeliveryTimeReportDaoIntf deliverytimereportdao;
	
	public DeliveryTimeReportServiceImpl() {
		deliverytimereportdao  = new DeliveryTimeReportDaoImpl();
	}

	@Override
	public void getInput() throws Exception {
		  deliverytimereportdao.getInput();
		
	}

	@Override
	public int getItemWiseDeliveryTimeReport() throws Exception {
		deliverytimereportdao.getItemWiseDeliveryTimeReport();
		return 0;
	}

	@Override
	public int getProductCategoryWiseDeliveryTimeReport() throws Exception {
		deliverytimereportdao.getProductCategoryWiseDeliveryTimeReport();
		return 0;
	}
}
