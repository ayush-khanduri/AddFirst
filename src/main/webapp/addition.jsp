<jsp:useBean id="addition" scope="page" class="com.addcode.nissan.addcode"/>
<%	
	String first_num = request.getParameter("num1");
	String second_num = request.getParameter("num2");
	/*
	try{
		int num1 = Integer.parseInt(first_num);
	}
	catch (Exception e) {
		System.out.println(e);
	}
	try{
		int num2 = Integer.parseInt(second_num);
	}
	catch (Exception e) {
		System.out.println(e);			
	}
	*/
	String ans = addition.func(first_num,second_num);
	//System.out.println(ans);
	out.print("The sum of the number is: "+ans);
%>	
