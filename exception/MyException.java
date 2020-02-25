package cpg.greatoutdoors.deliveryreport.exception;

public class MyException extends Exception{
  String s;
  
  public MyException(String s) {
	  super();
	  this.s=s;
  }
  
  public String Message() {
	  return s;
  }
}
