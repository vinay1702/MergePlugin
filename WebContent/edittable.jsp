<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="http://192.168.1.7:8080/PracticeProject/assets/css/jquery-ui.css">
<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" />
<link rel="stylesheet" type="text/css" href="http://192.168.1.7:8080/PracticeProject/assets/css/default.css" />
<title>Insert title here</title>
</head>
<body>
    <div class='editor' contenteditable='true'>
    
    
    </div>
    <p class="editable_textarea" id="paragraph_1">aaaaa</p>



<script src="http://192.168.1.7:8080/PracticeProject/assets/js/jquery-3.2.1.min.js"></script>

<script src="http://192.168.1.7:8080/PracticeProject/assets/js/jquery.jeditable.js"></script>
<script type="text/javascript" src="http://192.168.1.7:8080/PracticeProject/assets/js/jquery.popline.min.js"></script>
<script type="text/javascript" src="http://192.168.1.7:8080/PracticeProject/assets/js/plugins/jquery.popline.link.js"></script>
<script type="text/javascript" src="http://192.168.1.7:8080/PracticeProject/assets/js/plugins/jquery.popline.decoration.js"></script>
<script>
$(document).ready(function(){
	$(".editable_textarea").editable("/PracticeProject/updatecontent", { 
		indicator : "<img src='/jquery/jeditable/indicator.gif'>",
		type   : 'textarea',
		select : true,
		submit : 'OK',
		cancel : 'cancel',
		cssclass : "editable",
		tooltip   : 'Click to edit...',
		submitdata: { },
		callback:function(value, settings) {
		       	console.log(value);
	            return(value);
	            
	       }
	});
	$(".editor").popline();
	
	
	
});
</script>
</body>
</html>