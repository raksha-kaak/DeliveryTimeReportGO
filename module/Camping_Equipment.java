package cpg.greatoutdoors.deliveryreport.module;

import java.time.LocalDate;

public class Camping_Equipment {

	public LocalDate TentDispatchTime = LocalDate.of(2020, 02, 15), TentRecieveTime = LocalDate.of(2020, 02, 25);
	public LocalDate SleepingbagDispatchTime = LocalDate.of(2020, 01, 29),SleepingbagRecieveTime = LocalDate.of(2020, 02, 05);

	

	public LocalDate getTentDispatchTime() {
		return TentDispatchTime;
	}

	public void setTentDispatchTime(LocalDate tentDispatchTime) {
		TentDispatchTime = tentDispatchTime;
	}

	public LocalDate getTentRecieveTime() {
		return TentRecieveTime;
	}

	public void setTentRecieveTime(LocalDate tentRecieveTime) {
		TentRecieveTime = tentRecieveTime;
	}

	public LocalDate getSleepingbagDispatchTime() {
		return SleepingbagDispatchTime;
	}

	public void setSleepingbagDispatchTime(LocalDate sleepingbagDispatchTime) {
		SleepingbagDispatchTime = sleepingbagDispatchTime;
	}

	public LocalDate getSleepingbagRecieveTime() {
		return SleepingbagRecieveTime;
	}

	public void setSleepingbagRecieveTime(LocalDate sleepingbagRecieveTime) {
		SleepingbagRecieveTime = sleepingbagRecieveTime;
	}

	
}
