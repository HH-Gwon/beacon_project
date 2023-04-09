function add() {
	if (frm.rmonth.value.length == 0) {
		alert("수강월이 입력되지 않았습니다.");
		frm.rmonth.focus();
		return false;
	}

	else if (frm.cname.value == 0) {
		alert("회원명이 선택되지 않았습니다.");
		frm.cname.focus();
		return false;
	}

	else if (frm.clarea.value == 0) {
		alert("강의장소가 선택되지 않았습니다.");
		frm.clarea.focus();
		return false;
	}

	else if (frm.clname.value == 0) {
		alert("강의명이 선택되지 않았습니다.");
		frm.clname.focus();
		return false;
	} else
		alert("수강신청이 완료되었습니다.");
	document.frm.submit();
	return true;

}
function res() {
	alert("정보를 지우고 처음부터 다시 입력합니다!");
	document.frm.reset();
}

function getvalue(cno) {
	document.getElementById("cno").value = cno;
	cno2 = cno;
}

function getvalue2(tuition) {
	document.getElementById("tuition").value = tuition;
	if (cno2 >= 20000) {
		document.getElementById("tuition").value = tuition / 2;
	} 

}