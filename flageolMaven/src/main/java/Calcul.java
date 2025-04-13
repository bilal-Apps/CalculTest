

public class Calcul {
	
	IResolution res;
	public double addition(double a, double b){
		return res.add( a, b);
	}
	
	// public IResolution getRes() {
	// 	return res;
	// }

	public void setRes(IResolution res) {
		this.res = res;
	}

	public double soustraction(double a, double b){
		return res.sub(a, b);
	}
	
	public double multiplication(double a, double b){
		return res.multy(a, b);
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
        return res.square(value1);
    }

    public  double squareRoot(double value1) {
        /**
         * This method should provide the square root of a value (double).
         */
        return Math.sqrt(value1);
    }

    public  double variableExponentiation(double value1, double value2) {
        /**
         * This method should evaluate value1 (double) to the power of value2 (double).
         */
        return Math.pow(value1, value2);
    }

    public  double invertPositiveAndNegative(double value1) {
        /**
         * This method will invert the sign of the number
         */
        return value1 *= -1;
    }

    public  double sine(double value1) {
        /**
         * This method will evaluate to an answer that is equal to the ratio
         * of the side opposite a given angle (in a right triangle) to the hypotenuse.
         */
        return Math.sin(value1);
    }

    public  double cosine(double value1) {
        /**
         * This method will evaluate to an answer that is equal to the ratio
         * of the side adjacent to an acute angle (in a right-angled triangle) to the hypotenuse.
         */
        return Math.cos(value1);
    }

    public  double tangent(double value1) {
        /**
         * This method will evaluate a tangent line
         */
        return Math.tan(value1);
    }
    public boolean compa(double value1,double value2) {
    	return value1==value2;
    }

   }
