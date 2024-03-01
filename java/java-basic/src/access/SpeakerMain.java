package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        //필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
        speaker.volume = 200;
        speaker.showVolume(); //200
        //volumeUp을 만들어서 최대 볼륨을 100으로 제한했음에도
        //직접 필드에 접근해서 값을 바꿀 수 있기 때문에 소용이 없게 된다.
        //따라서 volume 필드로의 접근을 제한해 줄 필요성이 있음 -> 접근 제어자
    }
}
