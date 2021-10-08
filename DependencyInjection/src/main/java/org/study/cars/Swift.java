package org.study.cars;

import org.springframework.stereotype.Component;
import org.study.interfaces.Car;


@Component("swift")
public class Swift implements Car {

	@Override
	public String specs() {
		// TODO Auto-generated method stub
		return "From Swift";
	}

}
