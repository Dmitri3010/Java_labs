<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style type="text/css">
    .h1 {visibility: visible; color: red}
    .h2 {visibility: hidden }
</style>
<head>
    <script type="text/javascript" src="Xml.js"></script>
    <script type="text/javascript" src="Json.js"></script>
    <script type="text/javascript" src="crReq.js"></script>
    <script type="text/javascript" src="Header.js"></script>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>My AJAX</title>
</head>
<body>


<fieldset>
    <legend>AJAX Example (Header)</legend>
    <form name="FHeader" action="#" method="POST">
        <label><strong>x:</strong><input name="x" type="text" value="0" size="5" maxlength="5"/></label>
        <br /><label><strong>y:</strong><input name="y" type="text" value="0" size="5" maxlength="5"/></label>
        <br /><input name="BAdd" value="Add" type="button" onclick="OnClick_Header(this.form.x, this.form.y, this.form.z)"/>
        <br /><label><strong>z:</strong><input 	name="z" id="z" type="text" value="0"/></label>
    </form>
</fieldset>

<fieldset>
    <legend>AJAX Example (XML)</legend>
    <form name="FXML" action="#" method="POST">
        <label><strong>n:</strong><input name="n" type="text" value="0" size="2" maxlength="2" /></label>
        <br /><input name="BRand" value="Rand" type="button" size="10" maxlength="10" onclick="OnClick_XML(n,  document.getElementById('xml'));" />
        <br /><span id="xml" class="h2">.....</span>
    </form>
</fieldset>

<fieldset>
    <legend>AJAX Example (JSON)</legend>
    <form name="FJSON" action="#" method="POST">
        <label><strong>n:</strong><input name="n" type="text" value="0" size="2" maxlength="2" /></label>
        <br /><input name="BRand" value="Rand" type="button" size="10" maxlength="10" onclick="OnClick_JSON(n,  document.getElementById('json'));" />
        <br /><span id="json" class="h2">.....</span>
    </form>
</fieldset>
</body>
</html>