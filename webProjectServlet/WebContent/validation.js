	function cheack() {
		if (document.form.fname.value=="") {
			document.getElementById("FNameMsg").innerHTML = "*Required";
			return false;
		}
		 if (document.form.lname.value == "") {
			document.getElementById("lastName1").innerHTML = "*Required";
			return false;
		}  if (document.form.username.value == "") {
			document.getElementById("username1").innerHTML = "*Required";
			return false;
		}  if (document.form.password1.value == "") {
			document.getElementById("password2").innerHTML = "*Required";
			return false;
		}  if (document.form.month.value == "") {
			document.getElementById("month1").innerHTML = "*Required";
			return false;
		}  if (document.form.Date.value == "") {
			document.getElementById("Date1").innerHTML = "*Required";
			return false;
		}  if (document.form.YEAR.value == "") {
			document.getElementById("YEAR1").innerHTML = "*Required";
			return false;
		}  if (document.form.ambox1.value == "") {
			document.getElementById("ambox2").innerHTML = "*Required";
			return false;text/javascript
		}  if (document.form.number.value == "") {
			document.getElementById("number").innerHTML = "*Required";
		}
				return true;
	}
	