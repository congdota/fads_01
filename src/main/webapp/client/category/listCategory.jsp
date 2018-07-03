<%@ taglib prefix="s" uri="/struts-tags"%>
<<<<<<< 514284cb26c19d394885cbc3abe80cedf157f916
<h2>
	<s:text name="client.list.category" />
</h2>
	<s:iterator value="categories">
		<div class="col-md-3 categories">
			<s:url action="news-list" var="news-list">
				<s:param name="id">${id}</s:param>
			</s:url>
			<s:a href="%{news-list}">${name}</s:a>
		</div>
	</s:iterator>
=======
<h2><s:text name="client.list.category" /></h2>
<s:iterator value="categories">
	<s:url action="detail-news" var="detail">
		<s:param name="id">${id}</s:param>
	</s:url>
	<s:a href="%{detail}">${name}</s:a>
</s:iterator>
>>>>>>> Get list News follow Category
