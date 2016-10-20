<html>
<head>
<title>
Aadhar Page
</title>
<style>
	.box{
		border: 1px solid #000000;
    	margin: 25px auto;
    	padding: 25px;
    	width: 500px;
	}

	.box>div{
		padding: 10px;
	}

</style>
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>
<script>
  $(function() {
    $( "#datepicker" ).datepicker({changeYear: true,yearRange: "-100:+0",dateFormat: "dd/mm/yy"});
    $("#pageTwo").hide();
    $("#pageOne").show();
    //document.getElementById("maleChecked").checked = true;
  });

function checkForPageOneValid(){
	var aadharNumber = $("#aadharNo").val();
	if(isNaN(aadharNumber) || aadharNumber.length != 12){
		$("#errorText1").html("Please Enter a Valid Aadhar Number");
		return false;
	}
	return true;
}  
function pageOneDone(){
	if(checkForPageOneValid()){
		$("#errorText1").html("");
		var data = {};
		data.adharNumber = $("#aadharNo").val();
		$.ajax({
            type: "POST",
            contentType: "application/json",
            url: "adhar",
            dataType:"json",
            data: data
        }).done(function(response){
            $("#pageTwo").show();
    		$("#pageOne").hide();
        }).fail(function(error){

        });
	}
}
function checkForPageTwoValid(){
	return true;
}  
function pageTwoDone(){
	if(checkForPageOneValid()){
		$.ajax({
            type: "POST",
            contentType: "application/json; charset=utf-8",
            url: "/Dictionary/adharDetail",
            dataType:"json",
            data: {
                "adharNumber":"366803671285",
             	"pincode":"244001",
                "fullName":"vishwajeet singh",
                "gender" :"male",
             	"dob":"10061985",
                "phoneNo":"9911543453", 
                "otp":"634583"
            }
        }).done(function(response){
            
        }).fail(function(error){

        });
	}
}
</script>
</head>
<body>
	<div id="pageOne" class="box">
		<div>
			Aadhar Number : <input type="text" id="aadharNo" size="40"/>
		</div>

		<div style="text-align:center">
			<div id="errorText1" style="color:red;text-align:center"></div>
			<input type="button" value="Submit" onclick="pageOneDone()">
		</div> 
	</div>
	<div id="pageTwo" class="box">
		<div>	
			Name (As on Aadhar) : <input type="text" id="name" size="50" />
		</div>
		<div>	
			Pin code : <input type="text" id="pinCode"/>
		</div>
		<div>
			DOB : <input type="text" id="datepicker"/>
		</div>	
		<div>	
			Gender : <input type="radio" name="gender" value="male" id="maleChecked"> Male <input type="radio" name="gender" value="female" id="femaleChecked"> Female
		</div>
		<div>
			Mobile : <input type="text" id="mobile" />
		</div>
		<div>
			OTP : <input type="text" id="otp" />
		</div>	
		<div style="text-align:center">
			<input type="button" value="Submit" onclick="pageOneDone()">
		</div>
	</div>	
</body>

</html>