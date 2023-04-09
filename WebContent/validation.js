function validation() {
	if (document.frm.V_JUMIN.value.length == "") {
		alert("주민번호가 입력되지 않았습니다!");
		frm.V_JUMIN.focus();
		return false;
	}
	if (document.frm.V_NAME.value.length == "") {
		alert("성명이 입력되지 않았습니다!");
		frm.V_NAME.focus();
		return false;
	}
	if (document.frm.M_NO.value.length == "") {
		alert("후보번호가 입력되지 않았습니다!");
		frm.M_NO.focus();
		return false;
	}
	if (document.frm.V_TIME.value.length == "") {
		alert("투표시간이 입력되지 않았습니다!");
		frm.V_TIME.focus();
		return false;
	}
	if (document.frm.V_AREA.value.length == "") {
		alert("투표장소가 입력되지 않았습니다!");
		frm.V_AREA.focus();
		return false;
	}
	if (document.frm.V_CONFIRM.value == "") {
		alert("유권자확인이 선택되지 않았습니다!");
		return false;
	}
	success();
	return true;
}
function success() {
	alert("투표하기 정보가 정상적으로 등록 되었습니다!");
}