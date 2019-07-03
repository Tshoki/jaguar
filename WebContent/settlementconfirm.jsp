<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>settlement.jsp</title>
</head>
<body>

<h1 class="settlementconfirm_title">決済確認</h1>

<s:if test="宛先情報が存在する場合">
  <p>宛先情報を選択してください。</p>
<s:form>
<table>
<tr>
  <th>#</th>
  <th>姓</th>
  <th>名</th>
  <th>ふりがな</th>
  <th>住所</th>
  <th>電話番号</th>
  <th>メールアドレス</th>
</tr>

<s:iterator value="宛先情報List">
<tr>
  <td>
    <input type="radio" name="" value=""/>
  </td>
  <td><s:property value="fimilyName"/></td>
  <td><s:property value="firstName"/></td>
  <td><s:property value="familyNameKana"/></td>
  <td><s:property value="destination"/></td>
  <td><s:property value="phoneNumber"/></td>
  <td><s:property value="emailAddress"/></td>
</tr>
</s:iterator>
</table>
<div class="submit_button">
  <s:submit value="決済"/>
</div>
<div class="submit_button">
  <s:submit value="削除"/>
</div>
</s:form>
</s:if>
<s:else>
  <p>宛先情報がありません。</p>
</s:else>

<div class="submit_button">
  <s:form action="CreateDestinationAction">
    <s:submit value="新規宛先登録"/>
  </s:form>
</div>
</body>
</html>