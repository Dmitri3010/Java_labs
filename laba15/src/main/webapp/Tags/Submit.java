import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class Submit extends TagSupport {

	String value;
	
	public void setValue(String value)
	{
		this.value = value;
	}
	
	public String getValue()
	{
		return this.value;
	}
	
	public int doStartTag()
	{
		JspWriter out = pageContext.getOut();
		try {
			out.println("<input type=\"submit\" name=\"button\" value=\""+value+"\"/>");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
	
}
