package cpg.greatoutdoors.deliveryreport.dao;

import java.time.*;
import java.util.*;

import cpg.greatoutdoors.deliveryreport.module.*;

public class DeliveryTimeReportDaoImpl implements DeliveryTimeReportDaoIntf {

	String id;
	int choice=0,choice1=0,diff=0,sum=0,avg=0,ch=0;
	List<String> li = new ArrayList<String>();
	List<Integer> pList = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	private LocalDate DispatchTime;
	private LocalDate RecieveTime;
	
	
public DeliveryTimeReportDaoImpl(LocalDate DispatchTime, LocalDate RecieveTime) {
		super();
		this.DispatchTime =DispatchTime;
		this.RecieveTime = RecieveTime;
		
	}
	

public DeliveryTimeReportDaoImpl() {
	}
	
		
    @Override	
	public void getInput() throws Exception {
		DeliveryTimeReportDaoImpl mc;
		Camping_Equipment a;
		Golf_Equipment b;
		Mountaineering_Equipment c;
		Outdoor_Protection d;
		Personal_Accessories e;
		li.add("RID_1");
		li.add("RID_2");
		li.add("RID_3");
		li.add("RID_4");
		li.add("RID_5");
		
		System.out.println("Select Retailer ID:");
		System.out.println(li);
		String i = sc.next();
	      if (li.contains(i)) {
			System.out.println("Choose Report Type: Press 1 for Delivery time report");
			int j = sc.nextInt();
			if (j == 1) {
				System.out.println("Delivery Time Report \n");
				do {
				    System.out.println("Select any one:\n1.Item Wise DTR \n2.Product Category Wise DTR");
					ch = sc.nextInt();
					
					switch (ch) {
					case 1:
						System.out.println("Enter between 1 to 9 to check different items delivery report");
						System.out.println("\n1.Tent 2.Sleeping Bag \n3.Golf Club 4.Golf Ball \n5.Rope 6.Helmet \n7.Sunscream 8.Cap \n9.Watches 10.Wallets");
						  do {
						  choice = sc.nextInt();
						 	
					      switch (choice) {
						      case 1:
							      a = new Camping_Equipment();
							      mc = new DeliveryTimeReportDaoImpl(a.getTentDispatchTime(), a.getTentRecieveTime());
							      mc.getItemWiseDeliveryTimeReport();
							      break;
						      case 2:
							      a = new Camping_Equipment();
							      mc = new DeliveryTimeReportDaoImpl(a.getSleepingbagDispatchTime(), a.getSleepingbagRecieveTime());
							      mc.getItemWiseDeliveryTimeReport();
							      break;
						      case 3:
							      b = new Golf_Equipment();
							      mc = new DeliveryTimeReportDaoImpl(b.getGolfclubDispatchTime(),b.getGolfclubReceiveTime());
							      mc.getItemWiseDeliveryTimeReport();
							      break;	
						      case 4:
							      b = new Golf_Equipment();
							      mc = new DeliveryTimeReportDaoImpl(b.getGolfballDispatchTime(),b.getGolfballReceiveTime());
							      mc.getItemWiseDeliveryTimeReport();
							      break;						     
						      case 5:
						    	  c = new Mountaineering_Equipment();
						    	  mc = new DeliveryTimeReportDaoImpl(c.getRopeDispatchTime(),c.getRopeReceiveTime());
							      mc.getItemWiseDeliveryTimeReport();
							      break;						      
						      case 6:
						    	  c = new Mountaineering_Equipment();
						    	  mc = new DeliveryTimeReportDaoImpl(c.getHelmetDispatchTime(),c.getHelmetReceiveTime());
							      mc.getItemWiseDeliveryTimeReport();
							      break;
						      case 7:
						    	  d = new Outdoor_Protection();
						    	  mc = new DeliveryTimeReportDaoImpl(d.getSunscreamDispatchTime(),d.getSunscreamRecieveTime());
							      mc.getItemWiseDeliveryTimeReport();
							      break;
						      case 8:
						    	  d = new Outdoor_Protection();
						    	  mc = new DeliveryTimeReportDaoImpl(d.getCapDispatchTime(),d.getCapRecieveTime());
							      mc.getItemWiseDeliveryTimeReport();
							      break;
						      case 9:
						    	  e = new Personal_Accessories();
						    	  mc = new DeliveryTimeReportDaoImpl(e.getWatchesDispatchTime(),e.getWatchesReceiveTime());
							      mc.getItemWiseDeliveryTimeReport();
							      break;
						      case 10:	
						    	  e = new Personal_Accessories();
						    	  mc = new DeliveryTimeReportDaoImpl(e.getWalletsDispatchTime(),e.getWalletsReceiveTime());
							      mc.getItemWiseDeliveryTimeReport();
							      break;
							      
						      default:
							      System.out.println("Wrong InNput");
							      break;
					      }
						    }while(choice<11);
						     break;
						
					case 2:
						System.out.println("Enter between 1 to 5 to check different product delivery report");
						System.out.println("\n1.Camping Equipment \n2.Golf Equipment \n3.Mountaineering Equipment \n4.Outside Protection \n5.Personal Accessories");
						do {
						  choice1 = sc.nextInt();
						
						  switch (choice1) {
						      case 1:
						      
							      a = new Camping_Equipment();
							      
							      mc = new DeliveryTimeReportDaoImpl(a.getTentDispatchTime(), a.getTentRecieveTime());
							      mc.getProductCategoryWiseDeliveryTimeReport();				
							      pList.add(mc.getProductCategoryWiseDeliveryTimeReport());
							     
							      mc = new DeliveryTimeReportDaoImpl(a.getSleepingbagDispatchTime(), a.getSleepingbagRecieveTime());
							      mc.getProductCategoryWiseDeliveryTimeReport();
							      pList.add(mc.getProductCategoryWiseDeliveryTimeReport());
							      

							      for(int z=0;z<pList.size();z++) {
								         sum+=pList.get(z);
								       avg=sum/pList.size();							      
							      }sum=0;
							      pList.clear();							      
							      System.out.println(avg+" Days");												  
						          break;
							      
						      case 2:
						    	  
						    	  b = new Golf_Equipment();
						    	  
						    	  mc = new DeliveryTimeReportDaoImpl(b.getGolfclubDispatchTime(),b.getGolfclubReceiveTime());
						    	  mc.getProductCategoryWiseDeliveryTimeReport();				
							      pList.add(mc.getProductCategoryWiseDeliveryTimeReport());
						    	  
							      mc = new DeliveryTimeReportDaoImpl(b.getGolfballDispatchTime(),b.getGolfballReceiveTime());
						    	  mc.getProductCategoryWiseDeliveryTimeReport();				
							      pList.add(mc.getProductCategoryWiseDeliveryTimeReport());
							      
							      
							      for(int z=0;z<pList.size();z++) {
								         sum+=pList.get(z);
								       avg=sum/pList.size();
							      }sum=0;
							      pList.clear();
							      System.out.println(avg+" Days");
							      break;
							      
							          
							  case 3:
								  
								  c = new Mountaineering_Equipment();
								  
								  mc = new DeliveryTimeReportDaoImpl(c.getRopeDispatchTime(),c.getRopeReceiveTime());
						    	  mc.getProductCategoryWiseDeliveryTimeReport();				
							      pList.add(mc.getProductCategoryWiseDeliveryTimeReport());						      
							      
							      mc = new DeliveryTimeReportDaoImpl(c.getHelmetDispatchTime(),c.getHelmetReceiveTime());
						    	  mc.getProductCategoryWiseDeliveryTimeReport();				
							      pList.add(mc.getProductCategoryWiseDeliveryTimeReport());
							      
							      for(int z=0;z<pList.size();z++) {
								         sum+=pList.get(z);
								       avg=sum/pList.size();
							      }sum=0;
							      pList.clear();
							      System.out.println(avg+" Days");
							      break;
							      
							      
							  case 4:
								  d = new Outdoor_Protection();
								  
						    	  mc = new DeliveryTimeReportDaoImpl(d.getSunscreamDispatchTime(),d.getSunscreamRecieveTime());
						    	  mc.getProductCategoryWiseDeliveryTimeReport();				
							      pList.add(mc.getProductCategoryWiseDeliveryTimeReport());	
							      
							      mc = new DeliveryTimeReportDaoImpl(d.getCapDispatchTime(),d.getCapRecieveTime());
							      mc.getProductCategoryWiseDeliveryTimeReport();				
							      pList.add(mc.getProductCategoryWiseDeliveryTimeReport());	
							      
							      for(int z=0;z<pList.size();z++) {
								         sum+=pList.get(z);
								       avg=sum/pList.size();
							      }sum=0;
							      pList.clear();
							      System.out.println(avg+" Days");
							      break;
							      
							  case 5:
                                  e = new Personal_Accessories();
								  
						    	  mc = new DeliveryTimeReportDaoImpl(e.getWatchesDispatchTime(),e.getWatchesReceiveTime());
						    	  mc.getProductCategoryWiseDeliveryTimeReport();				
							      pList.add(mc.getProductCategoryWiseDeliveryTimeReport());	
							      
							      mc = new DeliveryTimeReportDaoImpl(e.getWalletsDispatchTime(),e.getWalletsReceiveTime());
							      mc.getProductCategoryWiseDeliveryTimeReport();				
							      pList.add(mc.getProductCategoryWiseDeliveryTimeReport());	
							      
							      for(int z=0;z<pList.size();z++) {
								         sum+=pList.get(z);
								       avg=sum/pList.size();
							      }sum=0;
							      pList.clear();
							      System.out.println(avg+" Days");
							      break;
							      					  
						  }
					     }while(choice1<6);
						
						
					default:
						System.out.println("Wrong Input;");
						break;
					}
				
				}while(ch<3);
				 
				
			} else
				System.out.println("EXIT");
			
		} else {
			System.out.println("RID not exist");
	        li.clear();
            System.out.println("1 to continue:");
            int x=sc.nextInt();
            if(x==1)
            	getInput();
            else
            	System.out.println("EXIT");}
	}
	
	
	@Override
	public int getItemWiseDeliveryTimeReport() throws Exception {
		Period period = Period.between(DispatchTime, RecieveTime);
		int diff=period.getDays();
		int diff1=period.getMonths();
		System.out.println(diff1+" Months"+diff+" Days");
		return (diff1+diff);
	}

	@Override
	public int getProductCategoryWiseDeliveryTimeReport() throws Exception {
		Period period = Period.between(DispatchTime, RecieveTime);
		int diff=period.getDays();
		return diff;
    
	}
	
}
