<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function list_go(f) {
		f.action = "emp_list.do";
		f.submit();
	}	
	function serch_go(f) {
		f.action = "emp_search.do";
		f.submit();
	}	
	function search_dynamic(f) {
		f.action = "emp_dynamic_search.do";
		f.submit();
	}	


</script>
</head>
<body>
		<form method="post">
		<p><input type="button" value="전체보기" onclick="list_go(this.form)"></p>
		<p>부서번호 : <input type="text" name="department_id">
					<input type="button" value="부서번호" onclick="serch_go(this.form)"></p>
		<p>
			<select	name = "idx">
					<option value="1">사원</option>
					<option value="2">이름</option>
					<option value="3">직종</option>
					<option value="4">부서</option>
			</select>
			<input type="text" name="keyword">
			<input type="button" value="동적검색" onclick="search_dynamic(this.form)">
			
		</p>
			
		</form>

</body>
</html>