package pkg;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class PrintMapTag extends SimpleTagSupport {

	Map<String, Integer> map;

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	public void doTag() throws JspException, IOException {
		if(map != null){
			JspWriter out = getJspContext().getOut();
			Iterator it = map.entrySet().iterator();
        	while(it.hasNext()){
        		Map.Entry pair = (Map.Entry)it.next();
        		out.print("<li class='collection-item'><div>"+pair.getKey()+"<a href='#!' class='secondary-content'><i class='material-icons'>"+pair.getValue()+"</i></a></div></li>");
        		it.remove();
        	} 
		}

	}
}
