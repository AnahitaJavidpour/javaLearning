package lambda;

public class Main {
    public static void main(String[] args) {

//        Music music = new Music() {
//            @Override
//            public void play() {
//                System.out.println("music is playing");
//            }
//        };
//        music.play();

//       --------------------------------------------------------

        Music music = (String i , int n) -> System.out.printf("music No.\"%s\" :\"%s\"is playing", n, i);

        music.play("dance the night", 48);

    }
}