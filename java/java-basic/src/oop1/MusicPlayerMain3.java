package oop1;

public class MusicPlayerMain3 {

    public static void main(String[] args) {
        //절차 지향 프로그래밍3
        //모듈화: 음악 플레이어 켜고 끄기, 볼륨 조절, 플레이어 상태 출력을 메서드로 구현해보자.
        MusicPlayerData data = new MusicPlayerData();

        //음악 플레이어 켜기
        on(data);
        //볼륨 증가
        volumeUp(data);
        //볼륨 증가
        volumeUp(data);
        //볼륨 감소
        volumeDown(data);
        //음악 플레이어 상태
        showStatus(data);
        //음악 플레이어 끄기
        off(data);
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
    //절차 지향 프로그래밍의 한계
    /*
    데이터와 기능이 분리되어있다. 데이터는 MusicPlayerData에 있고,
    기능은 MusicPlayerMain3의 메서드에 있다.
    데이터들과 그 데이터를 쓰는 기능은 매우 밀접하게 연관되어 있다.
    따라서, 데이터가 변경되면 메서드들도 함께 변경해야 한다.
    이렇게 유지보수 해야하는 관리 포인트가 2곳으로 늘어난다.
    객체 지향 프로그래밍을 쓰면 데이터와 기능을 온전히 하나로 묶어서 사용할 수 있다!!
     */
}
