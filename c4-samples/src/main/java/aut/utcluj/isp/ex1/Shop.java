package aut.utcluj.isp.ex1;

/**
 * @author stefan
 */
public class Shop {
    private String name;
    private String city;

    public Shop(String name, String city) {
        this.name=name;
        this.city=city;
        
    }

    public Shop(String name) {
        this.name=name;
        this.city="";
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
    
    public boolean equals(Shop secondObject) {
		if(secondObject instanceof Shop){
			Shop o = (Shop)secondObject;
			return true;
		}
		return false;
	}
   @Override
    public String toString (){
        return "Shop: eMag City: Cluj";
    }
}
