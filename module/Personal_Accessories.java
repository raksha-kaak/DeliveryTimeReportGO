package cpg.greatoutdoors.deliveryreport.module;

import java.time.LocalDate;

public class Personal_Accessories {
	
	public LocalDate WatchesDispatchTime = LocalDate.of(2020, 02, 20), WatchesReceiveTime = LocalDate.of(2020, 03, 21);
	public LocalDate WalletsDispatchTime = LocalDate.of(2020, 01, 21), WalletsReceiveTime = LocalDate.of(2020, 02, 3);
	
	
	public LocalDate getWatchesDispatchTime() {
		return WatchesDispatchTime;
	}
	public void setWatchesDispatchTime(LocalDate watchesDispatchTime) {
		WatchesDispatchTime = watchesDispatchTime;
	}
	public LocalDate getWatchesReceiveTime() {
		return WatchesReceiveTime;
	}
	public void setWatchesReceiveTime(LocalDate watchesReceiveTime) {
		WatchesReceiveTime = watchesReceiveTime;
	}
	public LocalDate getWalletsDispatchTime() {
		return WalletsDispatchTime;
	}
	public void setWalletsDispatchTime(LocalDate walletsDispatchTime) {
		WalletsDispatchTime = walletsDispatchTime;
	}
	public LocalDate getWalletsReceiveTime() {
		return WalletsReceiveTime;
	}
	public void setWalletsReceiveTime(LocalDate walletsReceiveTime) {
		WalletsReceiveTime = walletsReceiveTime;
	}

	
   
}
