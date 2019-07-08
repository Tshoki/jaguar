<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/css/style.css">
<title>SettlementConfirm画面</title>
</head>
<body>
<jsp:include page="header.jsp">
<script type="text/javascript" src="/js/settlementConfirm.js"></script>
<div id="main">
  <h1>決済確認</h1>

  <s:if test="destinationInfoDTO!=null && destinationInfoDTO.size()>0">
  <div class="info">
    <p>宛先情報を選択してください。</p>
  </div>
  <s:form id="settlementConfirmForm">
  <table>
  <tr>
    <th>#</th>
    <th>姓</th>
    <th>名</th>
    <th>ふりがな(姓)</th>
    <th>ふりがな(名)</th>
    <th>住所</th>
    <th>電話番号</th>
    <th>メールアドレス</th>
  </tr>
  <s:iterator value="destinationInfoDTO" status="st">
  <tr>
    <!-- statusはList内の要素を指す。宛先Listのインデックス番号0番にはデフォルトでcheckをつけた状態にしておく。 -->
    <td>
      <s:if test="#st.index==0">
        <input type="radio" name="id" checked="checked" value="<s:property value="id"/>"/>
      </s:if>
      <s:else>
        <input type="radio" name="id" value="<s:property value="id"/>"/>
      </s:else>
    </td>
    <td><s:property value="fimilyName"/></td>
    <td><s:property value="firstName"/></td>
    <td><s:property value="familyNameKana"/></td>
    <td><s:property value="firstNameKana"/></td>
    <td><s:property value="userAddress"/></td>
    <td><s:property value="telNumber"/></td>
    <td><s:property value="email"/></td>
  </tr>
  </s:iterator>
  </table>
  <div class="submit_button_box">
    <s:submit value="決済" class="submit_button" onClick="goSettlementCompleteAction()"/>
  </div>
  <div class="submit_button_box">
    <s:submit value="削除" class="submit_button" onClick="goDeleteDestinationAction()"/>
  </div>
  </s:form>
  </s:if>

  <s:else>
    <p>宛先情報がありません。</p>
  </s:else>

  <div class="submit_button_box">
    <s:form action="CreateDestinationAction">
      <s:submit value="新規宛先登録" class="submit_button"/>
    </s:form>
  </div>
  </div>
</body>
</html>