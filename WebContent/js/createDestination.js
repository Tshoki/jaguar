function GOtoCompleteAction(){	//完了画面に行く
	document.getElementById("destinationInfo").action("CreateDestionationCompleteAction");	//idで指定したとこのformのaction名を書き換える(もともとaction名入っていない)
}
function BACKtoAction(){	//戻る
	document.getElementById("backFlg").value="1";	//idを1に
	document.getElementById("destinationInfo").action="CreateDestionationAction";
}