package oop2;

public class MusicPlayer {
    //캡슐화: 속성과 기능을 하나로 묶어서 필요한 기능을 메서드를 통해 외부에 제공하는 것.
    //속성과 기능이 하나의 클래스에 묶여서 캡슐화 되어 있는 것이 객체 지향 프로그래밍
    int volume = 0;
    boolean isOn = false;

    //자기 자신의 데이터를 쓰기 때문에 외부에서 데이터를 받을 필요가 없다.
    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumeUp() {
        volume++;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }

    void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
