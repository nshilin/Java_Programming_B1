package day36_inheritance.app;

public class AppStore {

    public static void main(String[] args) {
        Instagram insta1 = new Instagram(3.4);
        Instagram insta2 = new Instagram(3.7);
        insta1.download();

        Youtube yt1 = new Youtube(5.7);
        Youtube yt2 = new Youtube(5.9);
        yt1.download();
    }
}
