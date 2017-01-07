package spring.form.echo;

import java.io.Serializable;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class EchoForm implements Serializable {
	
	@NotEmpty( message= "{echo.text.empty}")
	@Size(max = 100, message= "{echo.text.max}")
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
