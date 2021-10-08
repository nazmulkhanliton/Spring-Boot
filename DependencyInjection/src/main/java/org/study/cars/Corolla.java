package org.study.cars;

import org.springframework.stereotype.Component;
import org.study.interfaces.Car;

@Component("corolla")
public class Corolla implements Car {

	@Override
	public String specs() {
		// TODO Auto-generated method stub
		return "from Corolla";
	}

}
