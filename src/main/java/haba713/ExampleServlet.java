package haba713;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

import com.vaadin.server.VaadinServlet;

@WebServlet(
	asyncSupported=false,
	urlPatterns={"/*","/VAADIN/*"},
	initParams={
		@WebInitParam(name="ui", value="haba713.ExampleUI")
	})
public class ExampleServlet extends VaadinServlet {

    private static final long serialVersionUID = 1L;

}
