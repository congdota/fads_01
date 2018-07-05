<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<div class="row">
	<s:form action="addNews" enctype="multipart/form-data" method="post">
		<div class="form-group" >
			<s:textfield name="news.id" type="hidden" class="form-control"></s:textfield>
		</div>
		<div class="form-group" >
			<s:textfield name="news.tittle" placeholder="Tittle..." class="form-control" />
			<s:fielderror fieldName="" />
		</div>
		<div class="form-group" >
			<s:textarea name="news.content" placeholder="Content..." class="form-control" />
			<s:fielderror fieldName="" />
		</div>
		<div class="form-group" >
			<s:textfield name="news.address" placeholder="Address..." class="form-control" />
			<s:fielderror fieldName="" />
		</div>
		<div class="form-group" >
			<s:textfield name="news.phoneNumber" placeholder="Phone Number..." class="form-control" />
			<s:fielderror fieldName="" />
		</div>
		<div class="form-group" >
			<s:textfield name="news.status" placeholder="status" class="form-control" />
			<s:fielderror fieldName="" />
		</div>
		<div class="form-group" >
			<sx:datetimepicker name="news.startDate" displayFormat="dd-MMM-yyyy" />
			<s:fielderror fieldName="" />
		</div>
		<div class="form-group" >
			<sx:datetimepicker name="news.endDate"  displayFormat="dd-MMM-yyyy" />
			<s:fielderror fieldName="" />
		</div>
		<div class="form-group" >
			<s:textfield name="news.price" placeholder="Price..." class="form-control" />
			<s:fielderror fieldName="" />
		</div>
		<div class="form-group" >
			<s:select li placeholder="Category..." class="form-control" />
		</div>
		<div class="form-group" >
			<s:textfield name="news.newsImages.id" type="hidden" class="form-control"></s:textfield>
			<s:fielderror fieldName="" />
		</div>
		<div class="form-group">
			<label>Choose images</label>
			<s:file name="fileUploaNamed" size="40" />
			<s:file name="fileUploaNamed" size="40" />
			<s:file name="fileUploaNamed" size="40" />
			<s:fielderror fieldName="" />
		</div>
	</s:form>
	<s:submit value="Submit" class="btn btn-default"></s:submit>
</div>