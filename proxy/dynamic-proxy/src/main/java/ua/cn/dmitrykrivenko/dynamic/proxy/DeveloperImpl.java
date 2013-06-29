package ua.cn.dmitrykrivenko.dynamic.proxy;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class DeveloperImpl implements Developer {

    String name;
    String salary;
    int rating;
    String role;

    public String getName() {
        return name;
    }

    public String getSalary() {
        return salary;
    }

    public String getRole() {
        return role;
    }

    public int getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
