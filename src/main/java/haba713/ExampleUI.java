package haba713;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;


@SuppressWarnings("serial")
public class ExampleUI extends UI {
    
    @Override
    protected void init(VaadinRequest request) {
	setContent(new Label("A B C Å Ä Ö"));
    }

}