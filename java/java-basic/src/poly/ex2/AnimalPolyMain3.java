package poly.ex2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {
        Animal[] animalArr = {new Dog(), new Cat(), new Cow(), new Duck()};
        
        //변하지 않는 부분
        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }
    
    //변하지 않는 부분
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
