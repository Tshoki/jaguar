function goSettlementCompleteAction(){
	document.getElementById("settlementConfirmForm").action="SettlementCompleteAction";
}

function goDeleteDestinationAction(){
	//書き換わりを確認する際には、var id = 等に代入して簡略化してconsole.logで出力すると良い。
	document.getElementById("settlementConfirmForm").action="DestinationDeleteAction"
}
