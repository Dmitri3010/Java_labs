import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;


public class Lastname extends TagSupport {
	static String in="<label>Lastname&nbsp &nbsp</label>"+"<input name =\"lastname\" type= \"text\"width= \"15-	\""+"maxlength=\"30\" ";
	public String value="";
	public String getValue(){
	return value;
}
public void setValue(String value){
	this.value=value;
}
public int doStartTag() throws JspException {
	JspWriter out=pageContext.getOut();
	try{
		out.print(in+(this.value.equals("") ?" " : "value=\""+this.value+"\" />"));
	}
	catch (IOException e){
	}
return SKIP_BODY;
}
}
