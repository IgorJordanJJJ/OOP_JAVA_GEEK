package personal.model;

public class UserMapper {
    private String sign;
    public String map(User user,String sign) {
        this.sign = sign;
        return String.format("%s%s%s%s%s%s%s", user.getId(),sign, user.getFirstName(),sign, user.getLastName(),sign, user.getPhone());
    }

    public User map(String line) {
        String[] lines = line.split(sign);
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }
}
