package poly.ex2;

public class AnimalPolyMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        //타입을 맞췄기 때문에 새로운 동물을 추가해도 코드를 재사용 할 수 있다.
        Duck duck = new Duck();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
        soundAnimal(duck);
    }

    //다형성 + 메서드 오버라이딩 사용
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    /*
    동물 소리 테스트 시작
    멍멍
    동물 소리 테스트 종료
    동물 소리 테스트 시작
    야옹
    동물 소리 테스트 종료
    동물 소리 테스트 시작
    음메
    동물 소리 테스트 종료
     */
}
