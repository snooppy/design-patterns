package ua.cn.dmitrykrivenko.dynamic.proxy;

import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class DynamicProxyTest {

	private Developer developer;
	private Developer developerProxy;
	private Developer managerProxy;

	@Before
	public void setUp() {
		developer = new DeveloperImpl();
		developer.setName("Dmytro Kryvenko");
		developer.setSalary("3500");
		developer.setRating(8);
		developer.setRole("Java Developer");

		developerProxy = getDeveloperProxy(developer);
		managerProxy = getManagerProxy(developer);
	}

//------------------------Testing Developer Proxy-------------------------------
	@Test
	public void setName_shouldAllowDeveloperToSetName() {
		developerProxy.setName("Dmitry Ivanenko");
		Assert.assertEquals("Dmitry Ivanenko", developer.getName());
	}

	@Test(expected = UndeclaredThrowableException.class)
	public void setSalary_shouldNotAllowDeveloperToSetSalary() {
		developerProxy.setSalary("4000");
	}

	@Test(expected = UndeclaredThrowableException.class)
	public void setRating_shouldNotAllowDeveloperToSetRating() {
		developerProxy.setRating(9);
	}

	@Test(expected = UndeclaredThrowableException.class)
	public void setRole_shouldNotAllowDeveloperToSetRole() {
		developerProxy.setRole("Manager");
	}

//------------------------Testing Manager Proxy---------------------------------
	@Test(expected = UndeclaredThrowableException.class)
	public void setRating_shouldNotAllowManagerToSetName() {
		managerProxy.setName("Ivan Petrenko");
	}

	@Test
	public void setSalary_shouldAllowManagerToSetSalary() {
		managerProxy.setSalary("5000");
		Assert.assertEquals("5000", developer.getSalary());
	}

	@Test
	public void setSalary_shouldAllowManagerToSetRating() {
		managerProxy.setRating(10);
		Assert.assertEquals(10, developer.getRating());
	}

	@Test
	public void setSalary_shouldAllowManagerToSetRole() {
		managerProxy.setRole("Manager");
		Assert.assertEquals("Manager", developer.getRole());
	}

	private Developer getDeveloperProxy(Developer employee) {
		return (Developer) Proxy.newProxyInstance(
				employee.getClass().getClassLoader(),
				employee.getClass().getInterfaces(),
				new DeveloperHandling(employee));
	}

	private Developer getManagerProxy(Developer employee) {
		return (Developer) Proxy.newProxyInstance(
				employee.getClass().getClassLoader(),
				employee.getClass().getInterfaces(),
				new ManagersHandling(employee));
	}
}
