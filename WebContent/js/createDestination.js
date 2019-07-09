function GOtoCompleteAction(){	//完了画面に行く
	//idで指定したとこのformのaction名を書き換える(もともとaction名入っていない)
	document.getElementById("destinationInfo").action="CreateDestinationCompleteAction";
}
function BACKtoAction(){	//戻る
	document.getElementById("backFlg").value="1";	//idを1に
	document.getElementById("destinationInfo").action="CreateDestinationAction";
}