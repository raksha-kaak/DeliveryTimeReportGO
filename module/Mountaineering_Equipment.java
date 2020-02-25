package cpg.greatoutdoors.deliveryreport.module;

import java.time.LocalDate;

public class Mountaineering_Equipment {
	
	public LocalDate RopeDispatchTime = LocalDate.of(2020, 02, 20), RopeReceiveTime = LocalDate.of(2020, 02, 29);
	public LocalDate HelmetDispatchTime = LocalDate.of(2020, 01, 21), HelmetReceiveTime = LocalDate.of(2020, 03, 4);
	
	
	public LocalDate getRopeDispatchTime() {
		return RopeDispatchTime;
	}
	public void setRopeDispatchTime(LocalDate ropeDispatchTime) {
		RopeDispatchTime = ropeDispatchTime;
	}
	public LocalDate getRopeReceiveTime() {
		return RopeReceiveTime;
	}
	public void setRopeReceiveTime(LocalDate ropeReceiveTime) {
		RopeReceiveTime = ropeReceiveTime;
	}
	public LocalDate getHelmetDispatchTime() {
		return HelmetDispatchTime;
	}
	public void setHelmetDispatchTime(LocalDate helmetDispatchTime) {
		HelmetDispatchTime = helmetDispatchTime;
	}
	public LocalDate getHelmetReceiveTime() {
		return HelmetReceiveTime;
	}
	public void setHelmetReceiveTime(LocalDate helmetReceiveTime) {
		HelmetReceiveTime = helmetReceiveTime;
	}


    

}
