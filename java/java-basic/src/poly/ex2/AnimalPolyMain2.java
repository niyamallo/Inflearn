package poly.ex2;

public class AnimalPolyMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Duck duck = new Duck();
        Animal[] animalArr = {dog, cat, cow, duck};
        
        //변하지 않는 부분
        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }
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
    동물 소리 테스트 시작
    꽉꽉
    동물 소리 테스트 종료
     */
}
