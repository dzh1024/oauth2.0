<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<title>列表显示</title>
		<#include "/common/meta.ftl"/>

		<script type="text/javascript">
		</script>
	</head>
	
	<body>
	
	<div>  
  	<form action="${ctx}/book/save" method="GET">
			<input type="hidden" name="bookId" value="${(entity.bookId)!''}" />
			<div>
				<table width="60%" border="0" cellpadding="3" cellspacing="1">
				    <tr>
					
					<td>书名</td>
					<td>出版商</td>
					<td>类型</td>
					<td>价格</td>
					<td>作者</td>
				</tr>
					<tr>
						
						<td><input type="text" name="bookName" value="${(entity.bookName)!''}" /></td>
						<td><input type="text" name="mfrName" value="${(entity.mfrName)!''}" /></td>
						<td><input type="text" name="bookSort" value="${(entity.bookSort)!''}" /></td>
						<td><input type="text" name="costPrice" value="${(entity.costPrice)!''}" /></td>
						<td><input type="text" name="bookAuthor" value="${(entity.bookAuthor)!''}" /></td>
					</tr>
				</table>
			</div>
			<div>
				<h3><input type="submit" value="保存" /><a href="${ctx}/book/list">返回</a></h3>
			</div>
		</form>	

	</body>
	
</html>