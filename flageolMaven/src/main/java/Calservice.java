
public class Calservice {
	IResolution cal;
	public IResolution getIr() {
		return cal;
	}
	public void setIr(IResolution ir) {
		this.cal = ir;
	}
	
	public double addition(double a, double b){
		return cal.add( a, b);
	}
	
	public IResolution getRes() {
		return cal;
	}

	public void setRes(IResolution res) {
		this.cal = res;
	}

	public double soustraction(double a, double b){
		return cal.sub(a, b);
	}
	
	public double multiplication(double a, double b){
		return cal.multy(a, b);
	}
	
	public double division(double a, double b){
		if(b==0){
			return 0;
			
		}else{
			
			return a/b;
		}
	}
	
	public  double square(double value1) {
        /**
         * This method should square a value (double) provided by the user.
         */
        return cal.square(value1);
    }


}
