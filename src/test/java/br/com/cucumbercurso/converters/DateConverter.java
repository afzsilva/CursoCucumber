package br.com.cucumbercurso.converters;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import cucumber.api.Transformer;

public class DateConverter extends Transformer<Date>{

	@Override
	public Date transform(String arg0) {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date dateRetornado = format.parse(arg0);
			return dateRetornado;
		} catch (ParseException e) {			
			e.printStackTrace();
			return null;
		}
	}

}
