package cpg.greatoutdoors.deliveryreport.module;

import java.time.LocalDate;

public class Outdoor_Protection {
	
	public LocalDate SunscreamDispatchTime = LocalDate.of(2020, 02, 15),SunscreamRecieveTime = LocalDate.of(2020, 02, 25);
	public LocalDate CapDispatchTime = LocalDate.of(2019, 12, 29), CapRecieveTime = LocalDate.of(2020, 01, 05);
	
	
	public LocalDate getSunscreamDispatchTime() {
		return SunscreamDispatchTime;
	}
	public void setSunscreamDispatchTime(LocalDate sunscreamDispatchTime) {
		SunscreamDispatchTime = sunscreamDispatchTime;
	}
	public LocalDate getSunscreamRecieveTime() {
		return SunscreamRecieveTime;
	}
	public void setSunscreamRecieveTime(LocalDate sunscreamRecieveTime) {
		SunscreamRecieveTime = sunscreamRecieveTime;
	}
	public LocalDate getCapDispatchTime() {
		return CapDispatchTime;
	}
	public void setCapDispatchTime(LocalDate capDispatchTime) {
		CapDispatchTime = capDispatchTime;
	}
	public LocalDate getCapRecieveTime() {
		return CapRecieveTime;
	}
	public void setCapRecieveTime(LocalDate capRecieveTime) {
		CapRecieveTime = capRecieveTime;
	}

    


}