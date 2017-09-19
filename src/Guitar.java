public class Guitar {

  private String serialNumber, builder, model, type, backWood, topWood;
  private double price;
/**
 * The following constructor is used to save the characteristics of the guitars
 * @param serialNumber 
 * @param price 
 * @param builder 
 * @param model 
 * @param type
 * @param backwood
 * @param topwood
 * */
  public Guitar(String serialNumber, double price,
                String builder, String model, String type,
                String backWood, String topWood) {
    this.serialNumber = serialNumber;
    this.price = price;
    this.builder = builder;
    this.model = model;
    this.type = type;
    this.backWood = backWood;
    this.topWood = topWood;
  }
  

  public String getSerialNumber() {
	  /** 
	   * this method retrieves the serial number of the guitar
	   * @return serial number of the guitar that is searched for  
	   * */
    return serialNumber;
  }
  
  public double getPrice() {
	  /** 
	   * this method retrieves the price of the guitar
	   * @return price  
	   * */
    return price;
  }
  
  public void setPrice(float newPrice) {
	  /** 
	   * this method sets new price of the guitar
	   * @param newPrice   
	   * */
    this.price = newPrice;
  }
  
  public String getBuilder() {
	  /** 
	   * this method retrieves the builder of the guitar
	   * @return builder
	   * */
    return builder;
  }
  public String getModel() {
	  /** 
	   * this method retrieves the model of the guitar
	   * @return model
	   * */
    return model;
  }
  public String getType() {
	  /** 
	   * this method retrieves the type of the guitar
	   * @return type
	   * */
    return type;
  }
  public String getBackWood() {
	  /** 
	   * @return backWood 
	   * */
    return backWood;
  }
  public String getTopWood() {
	  /** 
	   * @return topWood
	   * */
    return topWood;
  }
}
