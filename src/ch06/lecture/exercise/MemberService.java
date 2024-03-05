package ch06.lecture.exercise;

public class MemberService {

    boolean login(String id, String password) {
        if (id.equals("hong") && password.equals("12345")) {
            return true;
        }
        return false;
    }

    void logout(String id) {


    }


}
