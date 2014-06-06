<%@page import="java.util.Date"%>
<h1>First function</h1>
<p><%= new Date() %></p>
<br />
<form action="inserisciNota" method="post">
	
	<table>	
		<tr><td>
			<label>Titolo</label>
			<input type="text" name="titolo">
		</td></tr>
		<tr><td>
			<label>Contenuto</label>
			<input type="textarea" name="contenuto" height="10" width="30">
		</td></tr>
		<tr><td>
			<input type="hidden" name="utente" value="test-user">
		</td></tr>	
		<tr><td>
			<input type="submit" value="aggiungi nota..." >
		</td></tr>
		<tr><td>
			<input type="reset" value="annulla" >
		</td></tr>
	</table>
		
</form>

<br /> 