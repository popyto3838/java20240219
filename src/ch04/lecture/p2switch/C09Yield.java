package ch04.lecture.p2switch;

public class C09Yield {


    public static void main(String[] args) {

        String city ="seoul";
        String area = switch(city){
            case "seoul", "tokyo"->  "asia";
            case "paris", "london"-> {

                yield "europe";
            }
            default -> "etc.";

        };

        int length = 5;
        String shape = "원";

        double result = switch(shape){
            case "원"->{
                double calc = 3.14 *length*length;
                yield calc;

            }
            case "정사각형"-> length*length;
            default -> 0.0;


        }


    }

}