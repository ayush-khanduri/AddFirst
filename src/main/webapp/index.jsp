<html>
<body>
<h2>Enter two numbers to add</h2>
<script>
	function check()
	{
	  var x=document.forms["form"]["num1"].value;
	  var y=document.forms["form"]["num2"].value;
	  if (isNaN(x) || isNaN(y) || x=='' || y=='') 
	  {
	    alert("Input Valid Number dude");
	    return false;
	  }
	}
</script>
<body>
        <form name="form" action="./addition.jsp" onsubmit="return check()">
            <input type="text" name="num1"/>
            + <input type="text" name="num2"/>       <input type="submit" value="ADD"/>
        </form>
        
</body>

</body>
</html>
