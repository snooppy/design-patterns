package ua.cn.dmitrykrivenko.dynamic.proxy;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public interface Developer {

    String getName();

    String getSalary();

    String getRole();

    int getRating();

    void setName(String name);

    void setSalary(String salary);

    void setRole(String role);

    void setRating(int rating);
}
