package class1.ex;

//title과 review를 멤버 변수로 가지는 MovieReview 클래스를 생성하고,
//MovieReviewMain 클래스 안에 main() 메서드를 포함하여, 영화 리뷰 정보를 선언하고 출력하자.
public class MovieReviewMain {

    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화!";

        MovieReview[] movieReviews = {
                inception, aboutTime
        };

        for (MovieReview m : movieReviews) {
            System.out.println("영화 제목: \"" + m.title + "\", 리뷰: \"" + m.review + "\"");
        }
    }
}
