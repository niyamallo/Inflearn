package oop2;

public class MusicPlayerMain4 {

    //객체 지향 프로그래미을 할 때는 각 클래스를 다른 개발자가 각자 만든다고 생각하자.
    public static void main(String[] args) {
        //MusicPlayer를 사용하는 개발자 입장에서는 내부에 어떤 속성(데이터)이 있는지 몰라도 된다.
        //단순히 MusicPlayer가 제공하는 기능 중에 필요한 기능을 호출해서 사용하기만 하면 된다.
        MusicPlayer player = new MusicPlayer();
        //음악 플레이어 켜기
        player.on();
        //볼륨 증가
        player.volumeUp();
        //볼륨 증가
        player.volumeUp();
        //볼륨 감소
        player.volumeDown();
        //음악 플레이어 상태
        player.showStatus();
        //음악 플레이어 끄기
        player.off();
    }
}
