function GOtoCompleteAction(){
	document.getElementById("destinationInfo").action("CreateDestionationCompleteAction");	//idで指定したとこのformのaction名を書き換える(もともとaction名入っていない)
}
function BACKtoAction(){
	document.getElementById("backFlg").value="1";	//idを1に
	var id=document.getElementById("destinationInfo").action("CreateDestionationAction");
}