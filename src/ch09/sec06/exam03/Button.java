package ch09.sec06.exam03;

public class Button {

    public static interface CliListener {
        void onClick();
    }


    private CliListener cliListener;

    public void setClickListener(CliListener cliListener) {
        this.cliListener = cliListener;

    }

    public void click() {
        this.cliListener.onClick();
    }

}
