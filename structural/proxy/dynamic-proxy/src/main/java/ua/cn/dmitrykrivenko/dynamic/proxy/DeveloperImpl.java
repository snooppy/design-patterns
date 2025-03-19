package ua.cn.dmitrykrivenko.dynamic.proxy;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class DeveloperImpl implements Developer {

    String name;
    String salary;
    int rating;
    String role;

	@Override
    public String getName() {
        return name;
    }

	@Override
    public String getSalary() {
        return salary;
    }

	@Override
    public String getRole() {
        return role;
    }

	@Override
    public int getRating() {
        return rating;
    }

	@Override
    public void setName(String name) {
        this.name = name;
    }

	@Override
    public void setSalary(String salary) {
        this.salary = salary;
    }

	@Override
    public void setRole(String role) {
        this.role = role;
    }

	@Override
    public void setRating(int rating) {
        this.rating = rating;
    }
}
