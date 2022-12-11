package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;
import factory.FinancingFactory;

public class FinancingTest {

	@Test
	public void shouldTestWhetherTheConstructorSucess() {

		Financing financing = FinancingFactory.createFinancingCorrect();

		Assertions.assertEquals(100000.0, financing.getTotalAmount());
		Assertions.assertEquals(2000.0, financing.getIncome());
		Assertions.assertEquals(80, financing.getMonths());

	}

	@Test
	public void shouldTestWhetherTheConstructorFail() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			Financing fin = FinancingFactory.createFinancingIncorrect();

		});

	}
	
	
	@Test
	public void shouldTestWhetherTheMethodSetAmountSucess() {

		Financing financing = FinancingFactory.createFinancingCorrect();
		financing.setTotalAmount(90000.0);

		Assertions.assertEquals(90000.0, financing.getTotalAmount());
		Assertions.assertEquals(2000.0, financing.getIncome());
		Assertions.assertEquals(80, financing.getMonths());

	}
	
	@Test
	public void shouldTestWhetherTheSetAmountFail() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			Financing fin = FinancingFactory.createFinancingIncorrect();
			fin.setTotalAmount(200000.0);

		});

	}
	
	@Test
	public void shouldTestWhetherTheMethodSetIncomeSucess() {

		Financing financing = FinancingFactory.createFinancingCorrect();
		financing.setIncome(2500.0);

		Assertions.assertEquals(100000.0, financing.getTotalAmount());
		Assertions.assertEquals(2500.0, financing.getIncome());
		Assertions.assertEquals(80, financing.getMonths());

	}
	
	@Test
	public void shouldTestWhetherTheSetIncomeFail() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			Financing fin = FinancingFactory.createFinancingCorrect();
			fin.setIncome(1000.0);

		});

	}
	
	@Test
	public void shouldTestWhetherTheMethodSetMonthSucess() {

		Financing financing = FinancingFactory.createFinancingCorrect();
		financing.setMonths(81);

		Assertions.assertEquals(100000.0, financing.getTotalAmount());
		Assertions.assertEquals(2000.0, financing.getIncome());
		Assertions.assertEquals(81, financing.getMonths());

	}
	
	@Test
	public void shouldTestWhetherTheMethodEntry() {

		Financing financing = FinancingFactory.createFinancingCorrect();

		Assertions.assertEquals(20000.0, financing.entry());

	}
	
	@Test
	public void shouldTestWhetherTheMethodQuota() {

		Financing financing = FinancingFactory.createFinancingCorrect();

		Assertions.assertEquals(1000.0, financing.quota());

	}

}
