package com.addcode.nissan;
//import java.math.BigDecimal;
public class addcode {

	public static String func( String num1, String num2 ) {
		//System.out.println(num1+num2);
		double n1=0.0,n2=0.0;
		//n1 = Integer.parseInt(num1);
		//n2 = Integer.parseInt(num2);
		try{
			n1 = Double.valueOf(num1);
			System.out.println("Num 1: "+n1);
		}
		catch (Exception e) {
			System.out.println(e);
			return "InvalidInput";
		}
		try{
			n2 = Double.valueOf(num2);
			System.out.println("Num 2: "+n2);
		}
		catch (Exception e) {
			System.out.println(e);
			return "InvalidInput";
		}
		//ans = n1.add(n2);
		double ans = 0.0;
		ans = n1 + n2;
		//BigDecimal ans = new BigDecimal(0);
		//ans = ans.add(new BigDecimal(n1));
		//ans = ans.add(new BigDecimal(n2));
		String str ;
		//System.out.println("Sum : "+(ans));
		if ((ans == Math.floor(ans)) && !Double.isInfinite(ans)) {
		    int ret = (int)ans;
		    str = String.valueOf(ret);
		}
		else
			str = String.valueOf(ans);
		System.out.println("Return : "+str);
		return str;
	}

}
