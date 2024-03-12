package ch09.sec06.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();

        class Oklistner implements Button.CliListener {
            @Override
            public void onClick() {
                System.out.println("Ok버튼을 클릭했습니다");
            }
        }

        btnOk.setClickListener(new Oklistner());

        btnOk.click();

        Button btnCancle = new Button();

        class CancelListener implements Button.CliListener {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭했습니다.");
            }
        }

        btnCancle.setClickListener(new CancelListener());
        btnCancle.click();
    }
}
