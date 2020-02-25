package cpg.greatoutdoors.deliveryreport.module;

import java.time.LocalDate;

public class Golf_Equipment {
	
	public LocalDate GolfclubDispatchTime = LocalDate.of(2020, 02, 20), GolfclubReceiveTime = LocalDate.of(2020, 03, 21);
	public LocalDate GolfballDispatchTime = LocalDate.of(2020, 01, 21), GolfballReceiveTime = LocalDate.of(2020, 02, 3);


	public LocalDate getGolfclubDispatchTime() {
		return GolfclubDispatchTime;
	}

	public void setGolfclubDispatchTime(LocalDate golfclubDispatchTime) {
		GolfclubDispatchTime = golfclubDispatchTime;
	}

	public LocalDate getGolfclubReceiveTime() {
		return GolfclubReceiveTime;
	}

	public void setGolfclubReceiveTime(LocalDate golfclubReceiveTime) {
		GolfclubReceiveTime = golfclubReceiveTime;
	}

	public LocalDate getGolfballDispatchTime() {
		return GolfballDispatchTime;
	}

	public void setGolfballDispatchTime(LocalDate golfballDispatchTime) {
		GolfballDispatchTime = golfballDispatchTime;
	}

	public LocalDate getGolfballReceiveTime() {
		return GolfballReceiveTime;
	}

	public void setGolfballReceiveTime(LocalDate golfballReceiveTime) {
		GolfballReceiveTime = golfballReceiveTime;
	}

    
}
