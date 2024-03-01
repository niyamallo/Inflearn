package access;

public class SpeakerMain2 {
    public static void main(String[] args) {
        Speaker2 speaker = new Speaker2(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        //필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
        //speaker.volume = 200; Speaker2에서 volume을 private를 사용해 접근 불가. 컴파일 에러
        speaker.showVolume();
    }
}
