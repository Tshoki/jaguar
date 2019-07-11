<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="./js/createDestination.js"></script>
<title>宛先入力確認画面</title>
</head>
<body>
<jsp:include page="header.jsp" />
<h1>宛先入力確認画面</h1>
<s:form id="destinationInfo">
    <table>
        <tr>
            <th>姓</th>
            <td>
                <s:property value="familyName" />
            </td>
        </tr>
        <tr>
            <th>名</th>
            <td>
                <s:property value="firstName" />
            </td>
        </tr>
        <tr>
            <th>姓ふりがな</th>
            <td>
                <s:property value="familyNameKana" />
            </td>
        </tr>
        <tr>
            <th>名ふりがな</th>
            <td>
                <s:property value="firstNameKana" />
            </td>
        </tr>
        <tr>
            <th>住所</th>
            <td>
                <s:property value="userAddress" />
            </td>
        </tr>
        <tr>
            <th>電話番号</th>
            <td>
                <s:property value="telNumber" />
            </td>
        </tr>
        <tr>
            <th>メールアドレス</th>
            <td>
                <s:property value="email" />
            </td>
        </tr>
    </table>
    <s:submit value="登録" onclick="GOtoCompleteAction()" />
    <s:submit value="戻る" onclick="BACKtoAction()" />
    <s:hidden id="backFlg" name="backFlg" value="" />
</s:form>

</body>
</html>